package com.alfa.gabaritoapi.repository;

import com.alfa.gabaritoapi.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório de dados para alunos.
 */
public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
