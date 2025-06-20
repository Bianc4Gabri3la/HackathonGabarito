package com.alfa.gabaritoapi.repository;

import com.alfa.gabaritoapi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório responsável por acessar dados da entidade Usuario no banco.
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Usuario findByLogin(String login);

}
