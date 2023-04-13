package com.ricardo.pocquerymethodsandorderby.controller;

import com.ricardo.pocquerymethodsandorderby.models.Livro;
import com.ricardo.pocquerymethodsandorderby.repositories.LivroRepository;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/livros")
@RestController
public class LivroController {

    private final LivroRepository livroRepository;

    public LivroController(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    @GetMapping
    public ResponseEntity<List<Livro>> listarTodosLivros(){
        return ResponseEntity.ok(livroRepository.findAll());
    }

    @GetMapping(value = "/orderByPublicacao")
    public ResponseEntity<List<Livro>> listarTodosLivrosordenandoPorPublicacao(){
        return ResponseEntity.ok(livroRepository.findByOrderByPublicacao());
    }
    // outro modo de trazer a informação ordenada
    @GetMapping(value = "/orderByPublicacao2")
    public ResponseEntity<List<Livro>> listarTodosLivrosordenandoPorPublicacao2(){
        return ResponseEntity.ok(livroRepository.findAll(Sort.by(Sort.Direction.ASC,"publicacao")));
    }

    @GetMapping(value = "/orderByNomeAscAndPublicacaoAsc")
    public ResponseEntity<List<Livro>> listarTodosLivrosordenandoPorPublicacaoAndNome(){
        return ResponseEntity.ok(livroRepository.findByOrderByNomeAscPublicacaoAsc());
    }
}
