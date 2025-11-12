package com.example.JogoRpg.Service;

import com.example.JogoRpg.Entities.GameSession;
import com.example.JogoRpg.Entities.TurnAction;
import com.example.JogoRpg.Enums.ActionType;
import com.example.JogoRpg.Enums.CharacterClass;
import com.example.JogoRpg.Repositorio.GameSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameSessionRepository repo;
    private final Random rnd = new Random();

    public GameStateResponse startGame(GameRequest req) {
        if (req.getPlayerClass() == null) {
            throw new IllegalArgumentException("playerClass é obrigatório para iniciar uma nova partida.");
        }

        CharacterClass playerClass = req.getPlayerClass();
        CharacterClass enemyClass = pickRandomEnemy(playerClass);

        GameSession session = GameSession.builder()
                .playerName(req.getPlayerName() != null ? req.getPlayerName() : "Player")
                .playerClass(playerClass)
                .enemyClass(enemyClass)
                .playerLife(playerClass.getMaxLife())
                .enemyLife(enemyClass.getMaxLife())
                .finished(false)
                .build();

        repo.save(session);

        return toResponse(session);
    }

    public GameStateResponse playTurn(GameRequest req) {
        if (req.getGameId() == null) {
            throw new IllegalArgumentException("gameId é obrigatório para jogar um turno.");
        }

        GameSession session = repo.findById(req.getGameId())
                .orElseThrow(() -> new IllegalArgumentException("Partida não encontrada."));

        if (session.isFinished()) {
            throw new IllegalStateException("Essa partida já terminou.");
        }

        processTurn(session, true, req.getAction());


        if (!session.isFinished()) {
            ActionType enemyAction = pickEnemyAction(session);
            processTurn(session, false, enemyAction);
        }

        repo.save(session);
        return toResponse(session);
    }

    public GameStateResponse getGameState(String id) {
        GameSession session = repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Jogo não encontrado."));
        return toResponse(session);
    }

    public List<GameStateResponse> listAll() {
        return repo.findAll()
                .stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    public void reset() {
        repo.deleteAll();
    }

    private CharacterClass pickRandomEnemy(CharacterClass notThis) {
        CharacterClass[] classes = CharacterClass.values();
        CharacterClass chosen;
        do {
            chosen = classes[rnd.nextInt(classes.length)];
        } while (chosen == notThis && classes.length > 1);
        return chosen;
    }

    private ActionType pickEnemyAction(GameSession session) {
        boolean lastWasHeal = "HEAL".equals(session.getLastEnemyAction());
        if (lastWasHeal) return ActionType.ATTACK;

        int enemyLife = session.getEnemyLife();
        int maxLife = session.getEnemyClass().getMaxLife();

        double healChance = (enemyLife < maxLife * 0.35) ? 0.5 : 0.15;
        return rnd.nextDouble() < healChance ? ActionType.HEAL : ActionType.ATTACK;
    }

    private void processTurn(GameSession session, boolean isPlayer, ActionType action) {
        CharacterClass actor = isPlayer ? session.getPlayerClass() : session.getEnemyClass();
        CharacterClass target = isPlayer ? session.getEnemyClass() : session.getPlayerClass();

        int actorLife = isPlayer ? session.getPlayerLife() : session.getEnemyLife();
        int targetLife = isPlayer ? session.getEnemyLife() : session.getPlayerLife();

        String lastAction = isPlayer ? session.getLastPlayerAction() : session.getLastEnemyAction();

        // Impede cura duas vezes seguidas
        if (action == ActionType.HEAL && "HEAL".equals(lastAction)) {
            action = ActionType.ATTACK;
        }

        TurnAction turn = TurnAction.builder()
                .actor(isPlayer ? "PLAYER" : "ENEMY")
                .actionType(action)
                .build();

        boolean success = rnd.nextDouble() <= actor.getSuccessRate();
        turn.setSuccess(success);

        if (action == ActionType.ATTACK) {
            if (success) {
                int damage = Math.max(0, actor.getAttack() - target.getDefense());
                targetLife -= damage;
                turn.setAmount(damage);
            } else {
                turn.setAmount(0);
            }
        } else {
            if (success) {
                int heal = actor.getHealAmount();
                actorLife = Math.min(actorLife + heal, actor.getMaxLife());
                turn.setAmount(heal);
            } else {
                turn.setAmount(0);
            }
        }

        if (isPlayer) {
            session.setPlayerLife(actorLife);
            session.setEnemyLife(targetLife);
            session.setLastPlayerAction(action.name());
        } else {
            session.setEnemyLife(actorLife);
            session.setPlayerLife(targetLife);
            session.setLastEnemyAction(action.name());
        }

        session.getActions().add(turn);

        if (session.getPlayerLife() <= 0 || session.getEnemyLife() <= 0) {
            session.setFinished(true);
            if (session.getPlayerLife() <= 0 && session.getEnemyLife() <= 0) {
                session.setWinner("DRAW");
            } else if (session.getEnemyLife() <= 0) {
                session.setWinner("PLAYER");
            } else {
                session.setWinner("ENEMY");
            }
        }
    }

    private GameStateResponse toResponse(GameSession session) {
        return GameStateResponse.builder()
                .sessionId(session.getId())
                .playerName(session.getPlayerName())
                .playerLife(session.getPlayerLife())
                .enemyLife(session.getEnemyLife())
                .finished(session.isFinished())
                .winner(session.getWinner())
                .playerClass(session.getPlayerClass())
                .enemyClass(session.getEnemyClass())
                .actions(session.getActions())
                .build();
    }
}
