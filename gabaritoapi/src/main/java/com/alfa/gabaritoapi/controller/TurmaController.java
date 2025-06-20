package com.alfa.gabaritoapi.controller;

import com.alfa.gabaritoapi.model.Turma;
import com.alfa.gabaritoapi.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller REST responsável por gerenciar turmas.
 */
@RestController
@RequestMapping("/api/turma")
public class TurmaController {

    @Autowired
    private TurmaRepository turmaRepository;

    /**
     * Lista todas as turmas cadastradas no sistema.
     * @return lista de turmas
     */
    @GetMapping
    public List<Turma> listarTurmas() {
        return turmaRepository.findAll();
    }

    /**
     * Cadastra uma nova turma no sistema.
     * @param turma os dados da nova turma
     * @return a turma salva
     */
    @PostMapping
    public Turma cadastrarTurma(@RequestBody Turma turma) {
        return turmaRepository.save(turma);
    }

}
