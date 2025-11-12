package com.example.JogoRpg.Service;

import com.example.JogoRpg.Enums.ActionType;
import com.example.JogoRpg.Enums.CharacterClass;
import lombok.Data;

@Data
public class GameRequest {
    private String gameId;
    private String playerName;
    private CharacterClass playerClass;
    private ActionType action;
}
