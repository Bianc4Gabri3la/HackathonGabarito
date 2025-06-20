package com.alfa.gabaritoapi.controller;

import com.alfa.gabaritoapi.model.Professor;
import com.alfa.gabaritoapi.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller REST para cadastro e listagem de professores.
 */
@RestController
@RequestMapping("/api/professor")
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    /**
     * Lista todos os professores cadastrados.
     */
    @GetMapping
    public List<Professor> listar() {
        return professorRepository.findAll();
    }

    /**
     * Cadastra um novo professor.
     */
    @PostMapping
    public Professor cadastrar(@RequestBody Professor professor) {
        return professorRepository.save(professor);
    }
}
