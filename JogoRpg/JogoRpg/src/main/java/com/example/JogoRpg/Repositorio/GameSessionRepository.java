package com.example.JogoRpg.Repositorio;

import com.example.JogoRpg.Entities.GameSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameSessionRepository extends JpaRepository<GameSession, String> {
}