package com.alfa.gabaritoapi.repository;

import com.alfa.gabaritoapi.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório para acesso aos dados de disciplinas.
 */
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}
