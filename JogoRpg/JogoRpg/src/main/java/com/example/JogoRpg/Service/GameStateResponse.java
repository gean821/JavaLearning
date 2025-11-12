package com.example.JogoRpg.Service;

import com.example.JogoRpg.Entities.TurnAction;
import com.example.JogoRpg.Enums.CharacterClass;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GameStateResponse {
    private String sessionId;
    private String playerName;
    private CharacterClass playerClass;
    private CharacterClass enemyClass;
    private int playerLife;
    private int enemyLife;
    private boolean finished;
    private String winner;
    private List<TurnAction> actions;
}
