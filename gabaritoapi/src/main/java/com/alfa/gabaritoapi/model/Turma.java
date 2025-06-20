package com.alfa.gabaritoapi.model;


import jakarta.persistence.*;

/**
 * Representa uma turma no sistema, com nome e ano letivo.
 */
@Entity
@Table(name = "turma")
public class Turma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nome identificador da turma, como "5º A" ou "TI Noturno"
     */
    @Column(nullable = false)
    private String nome;

    /**
     * Ano letivo da turma
     */
    @Column(nullable = false)
    private Integer ano;

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

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

}
