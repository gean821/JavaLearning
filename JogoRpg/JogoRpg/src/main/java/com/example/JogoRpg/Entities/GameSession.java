package com.example.JogoRpg.Entities;

import com.example.JogoRpg.Enums.CharacterClass;
import jakarta.persistence.*;
import lombok.*;


import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class GameSession {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;


    @Enumerated(EnumType.STRING)
    private CharacterClass playerClass;
    private String playerName;


    @Enumerated(EnumType.STRING)
    private CharacterClass enemyClass;


    private int playerLife;
    private int enemyLife;


    private String lastPlayerAction;
    private String lastEnemyAction;


    @OneToMany(cascade = CascadeType.ALL)
    private List<TurnAction> actions = new ArrayList<>();


    private boolean finished;
    private String winner;
}
