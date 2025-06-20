package com.alfa.gabaritoapi.repository;

import com.alfa.gabaritoapi.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório responsável por acessar os dados da entidade Turma no banco de dados.
 */
public interface TurmaRepository extends JpaRepository<Turma, Long> {
}
