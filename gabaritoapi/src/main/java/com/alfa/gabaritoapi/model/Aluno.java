package com.alfa.gabaritoapi.model;

import jakarta.persistence.*;

/**
 * Representa um aluno matriculado em uma turma.
 */
@Entity
@Table(name = "aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Registro acadêmico (RA) do aluno
     */
    @Column(nullable = false, unique = true)
    private String ra;

    /**
     * Nome completo do aluno
     */
    @Column(nullable = false)
    private String nome;

    /**
     * Turma em que o aluno está matriculado
     */
    @ManyToOne
    @JoinColumn(name = "turma_id", nullable = false)
    private Turma turma;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}

