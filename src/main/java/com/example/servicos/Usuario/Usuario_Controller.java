package com.example.servicos.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("usuario")

public class  Usuario_Controller {
    @Autowired
    private Metodos_User metodosUser;

    @GetMapping("/teste")
    public String teste() {
        return "teste";
    }

    @PostMapping("/add")
        //ResponseEntity=representar a resposta HTTP
        public ResponseEntity<String> criarUsuer(@RequestBody Usuario_Model UsuarioModel){
            Usuario_Model newUser=metodosUser.CriarUsuario(UsuarioModel);
            return  ResponseEntity.status(HttpStatus.CREATED)
                    .body("deu certo :D");
        }
    }