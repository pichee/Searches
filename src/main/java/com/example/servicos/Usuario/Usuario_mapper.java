package com.example.servicos.Usuario;

import org.springframework.stereotype.Component;

//PELO que entendi evita o processo manual que facilita bastante
@Component

// O map serve para transnformar em obj tabela
public class Usuario_mapper {
 public static Tabela_Banco map(Usuario_Model usuario_model){
     Tabela_Banco tabelaBanco=new Tabela_Banco();
     tabelaBanco.setId(usuario_model.getId());
     tabelaBanco.setNome(usuario_model.getNome());
     tabelaBanco.setEmail(usuario_model.getEmail());
     tabelaBanco.setSenha(usuario_model.getSenha()); // Completar com os outros campos necessários
     tabelaBanco.setAvaliacao(usuario_model.getAvaliacao());
     tabelaBanco.setTelefone(usuario_model.getTelefone());
     tabelaBanco.setCpfCnpj(usuario_model.getCpfCnpj());
     tabelaBanco.setEndereco(usuario_model.getEndereco());
      return tabelaBanco;
 }
 public  static Usuario_Model map(Tabela_Banco tabela){
     Usuario_Model usuarioModel=new Usuario_Model();
     usuarioModel.setId(tabela.getId());
     usuarioModel.setNome(tabela.getNome());
     usuarioModel.setEmail(tabela.getEmail());
     usuarioModel.setSenha(tabela.getSenha());
     usuarioModel.setAvaliacao(tabela.getAvaliacao());
     usuarioModel.setTelefone(tabela.getTelefone());
     usuarioModel.setCpfCnpj(tabela.getCpfCnpj());
     usuarioModel.setEndereco(tabela.getEndereco());
     return usuarioModel;
 }
}