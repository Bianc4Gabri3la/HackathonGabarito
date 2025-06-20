package com.alfa.gabaritoapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller de teste que retorna uma mensagem para validar a API.
 */
@RestController
public class HelloController {

    /**
     * Endpoint GET simples em /api/hello
     * @return Uma mensagem de confirmação
     */
    @GetMapping("/api/hello")
    public String hello() {
        return "API funcionando corretamente!";
    }

}
