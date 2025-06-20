package com.alfa.gabaritoapi.repository;

import com.alfa.gabaritoapi.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório para acesso aos dados dos professores.
 */
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}

