package com.alfa.gabaritoapi.model;

import jakarta.persistence.*;

/**
 * Representa um professor da instituição.
 */
@Entity
@Table(name = "professor")
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nome completo do professor
     */
    @Column(nullable = false)
    private String nome;

    /**
     * Login para o professor acessar o sistema
     */
    @Column(nullable = false, unique = true)
    private String login;

    /**
     * Senha do professor (pode ser criptografada futuramente)
     */
    @Column(nullable = false)
    private String senha;

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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
