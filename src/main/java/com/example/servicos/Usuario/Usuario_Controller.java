package com.example.servicos.Usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("usuario")
public class Usuario_Controller {
    @GetMapping("/teste")
    public String teste() {
        return "teste";
    }
}
