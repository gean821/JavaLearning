Dados do aluno:
nome: Gean Luca Costa Ramos
Ra: 24463804-2
repositório: https://github.com/gean821/JavaLearning/tree/main/JogoRpg

# ⚔️ Jogo RPG por Turnos - Spring Boot

Este projeto é um **jogo de RPG por turnos** desenvolvido em **Spring Boot**, onde o jogador enfrenta inimigos aleatórios realizando ações de **ataque** ou **cura**.  
Cada turno é processado com base em atributos das classes (Guerreiro, Mago ou Ladino), e as ações são salvas no banco de dados **H2 em memória**.

---

## 🧩 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3+**
- **Spring Web**
- **Spring Data JPA**
- **Banco de dados H2 (em memória)**
- **Lombok**

---

## 🚀 Como Rodar o Projeto

### 1️⃣ Clonar o repositório
```bash
git clone a url do projeto.
cd JogoRpg

2️⃣ Executar o projeto

Você pode rodar de duas formas:

✅ Via IDE (IntelliJ / VSCode / Eclipse)

Execute a classe principal:
JogoRpgApplication.java

✅ Via linha de comando (Maven)
./mvnw spring-boot:run

3️⃣ Acessar o jogo

O servidor estará rodando em:

http://localhost:8080





⚔️ Regras do Jogo

Existem 3 classes jogáveis:

🛡️ WARRIOR (Guerreiro) → Alta defesa e ataque moderado.

🔮 MAGE (Mago) → Ataque alto, pouca defesa.

🗡️ ROGUE (Ladino) → Taxa de acerto maior, mas vida menor.

Cada turno o jogador pode:

ATTACK → Ataca o inimigo com base em ataque - defesa.

HEAL → Recupera HP (não pode curar duas vezes seguidas).

O inimigo realiza uma ação automática após o turno do jogador.

O jogo termina quando um dos dois (ou ambos) atingem 0 de vida.

Todos os turnos são registrados na entidade TurnAction.

🧠 Endpoints da API
🎮 1. Iniciar nova partida

POST /api/game/start

{
  "playerName": "Gean",
  "playerClass": "WARRIOR"
}


📘 Resposta

{
  "sessionId": "c2e4d9f7-2b58-4a1d-bb3e-8fdc87ab7f7d",
  "playerName": "Gean",
  "playerClass": "WARRIOR",
  "enemyClass": "MAGE",
  "playerLife": 120,
  "enemyLife": 90,
  "finished": false,
  "winner": null,
  "actions": []
}

⚔️ 2. Jogar um turno

POST /api/game/play

{
  "gameId": "c2e4d9f7-2b58-4a1d-bb3e-8fdc87ab7f7d",
  "action": "ATTACK"
}


📘 Resposta

{
  "sessionId": "c2e4d9f7-2b58-4a1d-bb3e-8fdc87ab7f7d",
  "playerLife": 110,
  "enemyLife": 70,
  "finished": false,
  "winner": null,
  "actions": [
    {
      "actor": "PLAYER",
      "actionType": "ATTACK",
      "amount": 20,
      "success": true
    },
    {
      "actor": "ENEMY",
      "actionType": "ATTACK",
      "amount": 10,
      "success": true
    }
  ]
}

📜 3. Consultar o estado de uma partida

GET /api/game/{id}

📘 Exemplo:

GET http://localhost:8080/api/game/c2e4d9f7-2b58-4a1d-bb3e-8fdc87ab7f7d


📘 Resposta

{
  "sessionId": "c2e4d9f7-2b58-4a1d-bb3e-8fdc87ab7f7d",
  "playerName": "Gean",
  "playerLife": 100,
  "enemyLife": 0,
  "finished": true,
  "winner": "PLAYER"
}

📋 4. Listar todas as partidas

GET /api/game

📘 Resposta

[
  {
    "sessionId": "c2e4d9f7-2b58-4a1d-bb3e-8fdc87ab7f7d",
    "playerName": "Gean",
    "finished": true,
    "winner": "PLAYER"
  }
]

💣 5. Resetar o jogo (apagar tudo)

DELETE /api/game/reset

📘 Resposta:
204 No Content

🧪 Testando no Postman

Você pode importar a seguinte sequência de requisições:

POST /api/game/start → cria a partida.

Copie o sessionId retornado.

POST /api/game/play → use o sessionId e envie ATTACK ou HEAL.

Repita até o jogo terminar (finished: true).

Use GET /api/game/{id} para consultar o estado atual.

🏁 Final do Jogo

Quando a vida do jogador ou do inimigo chega a 0, a resposta indicará o resultado:

{
  "finished": true,
  "winner": "PLAYER"
}


ou

{
  "finished": true,
  "winner": "ENEMY"
}


👨‍💻 Autor: Gean






