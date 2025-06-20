package com.alfa.gabaritoapi.controller;


import com.alfa.gabaritoapi.model.Disciplina;
import com.alfa.gabaritoapi.repository.DisciplinaRepository;
import com.alfa.gabaritoapi.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller REST para gerenciar disciplinas.
 */
@RestController
@RequestMapping("/api/disciplina")
public class DisciplinaController {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Autowired
    private TurmaRepository turmaRepository;

    /**
     * Lista todas as disciplinas cadastradas.
     */
    @GetMapping
    public List<Disciplina> listarDisciplinas() {
        return disciplinaRepository.findAll();
    }

    /**
     * Cadastra uma nova disciplina associada a uma turma.
     */
    @PostMapping("/{idTurma}")
    public Disciplina cadastrar(@PathVariable Long idTurma, @RequestBody Disciplina disciplina) {
        disciplina.setTurma(turmaRepository.findById(idTurma).orElseThrow());
        return disciplinaRepository.save(disciplina);
    }
}
