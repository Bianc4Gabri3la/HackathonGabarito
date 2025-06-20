package com.alfa.gabaritoapi.controller;

import com.alfa.gabaritoapi.model.Aluno;
import com.alfa.gabaritoapi.repository.AlunoRepository;
import com.alfa.gabaritoapi.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller REST para operações com alunos.
 */
@RestController
@RequestMapping("/api/aluno")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @Autowired
    private TurmaRepository turmaRepository;

    /**
     * Lista todos os alunos cadastrados.
     */
    @GetMapping
    public List<Aluno> listar() {
        return alunoRepository.findAll();
    }

    /**
     * Cadastra um novo aluno em uma turma específica.
     * @param idTurma ID da turma
     * @param aluno Objeto aluno com nome e RA
     */
    @PostMapping("/{idTurma}")
    public Aluno cadastrar(@PathVariable Long idTurma, @RequestBody Aluno aluno) {
        aluno.setTurma(turmaRepository.findById(idTurma).orElseThrow());
        return alunoRepository.save(aluno);
    }
}
