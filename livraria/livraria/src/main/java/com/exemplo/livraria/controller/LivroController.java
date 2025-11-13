package com.exemplo.livraria.controller;

import com.exemplo.livraria.modal.Livro;
import com.exemplo.livraria.service.LivroService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/livros")
public class LivroController {

    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @GetMapping
    public List<Livro> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Livro criar(@RequestBody Livro livro) {
        return service.salvar(livro);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
