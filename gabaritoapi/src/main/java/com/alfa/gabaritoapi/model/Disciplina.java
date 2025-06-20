package com.alfa.gabaritoapi.model;

import jakarta.persistence.*;

/**
 * Representa uma disciplina ministrada em uma turma.
 */
@Entity
@Table(name = "disciplina")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nome da disciplina, ex: "Matemática", "História"
     */
    @Column(nullable = false)
    private String nome;

    /**
     * Turma associada à disciplina (relacionamento muitos-para-um)
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
