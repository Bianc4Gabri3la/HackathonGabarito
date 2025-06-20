package com.alfa.gabaritoapi.service;

import com.alfa.gabaritoapi.model.Usuario;
import com.alfa.gabaritoapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * Classe que fornece os dados de autenticação para o Spring Security.
 */
@Service
public class UsuarioDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByLogin(login);

        if (usuario == null) {
            throw new UsernameNotFoundException("Usuário não encontrado: " + login);
        }

        // Retorna um objeto do Spring com login, senha e perfil do usuário
        return new User(
            usuario.getLogin(),
            usuario.getSenha(),
            Collections.singletonList(new SimpleGrantedAuthority("ROLE_" + usuario.getPerfil()))
        );
    }
}
