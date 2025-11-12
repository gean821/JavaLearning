package com.example.JogoRpg.Entities;

import com.example.JogoRpg.Enums.ActionType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class TurnAction {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String actor;

    @Enumerated(EnumType.STRING)
    private ActionType actionType;


    private int amount;


    private boolean success;


    private LocalDateTime timestamp = LocalDateTime.now();
}

