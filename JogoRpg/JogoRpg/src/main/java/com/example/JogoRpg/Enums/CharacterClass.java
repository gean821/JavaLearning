package com.example.JogoRpg.Enums;

import lombok.Getter;

@Getter
public enum CharacterClass {
    WARRIOR(120, 18, 8, 14, 0.85),
    MAGE(90, 25, 4, 20, 0.75),
    ROGUE(100, 16, 6, 12, 0.9);


    private final int maxLife;
    private final int attack;
    private final int defense;
    private final int healAmount;
    private final double successRate;

    CharacterClass(int maxLife, int attack, int defense, int healAmount, double successRate) {
        this.maxLife = maxLife;
        this.attack = attack;
        this.defense = defense;
        this.healAmount = healAmount;
        this.successRate = successRate;
    }
}

