package com.example.servicos.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//Recebe as requisições do usuário

//ESTAVA APENAS DANDO ERRO COPIE DO CHAT NÃO SEI AINDA O QUE SIGFIFICA MAS DEPOIS VOU REVISAR
public class Metodos_User {
    private final Usuario_Repository usuarioRepository;

    @Autowired
    public Metodos_User(Usuario_Repository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario_Model CriarUsuario(Usuario_Model new_User){
            Tabela_Banco tabelaBanco=Usuario_mapper.map(new_User);
            Tabela_Banco salvartabelabanco=usuarioRepository.save(tabelaBanco);
            return Usuario_mapper.map(salvartabelabanco);

}

}
