package com.example.JogoRpg.Api;

import com.example.JogoRpg.Service.GameRequest;
import com.example.JogoRpg.Service.GameService;
import com.example.JogoRpg.Service.GameStateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/game")
@RequiredArgsConstructor
public class GameController {

    private final GameService service;

    @PostMapping("/start")
    public ResponseEntity<GameStateResponse> start(@RequestBody GameRequest req) {
        return ResponseEntity.ok(service.startGame(req));
    }

    @PostMapping("/play")
    public ResponseEntity<GameStateResponse> play(@RequestBody GameRequest req) {
        return ResponseEntity.ok(service.playTurn(req));
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameStateResponse> get(@PathVariable String id) {
        return ResponseEntity.ok(service.getGameState(id));
    }

    @GetMapping
    public ResponseEntity<List<GameStateResponse>> listAll() {
        return ResponseEntity.ok(service.listAll());
    }

    @DeleteMapping("/reset")
    public ResponseEntity<Void> reset() {
        service.reset();
        return ResponseEntity.noContent().build();
    }
}
