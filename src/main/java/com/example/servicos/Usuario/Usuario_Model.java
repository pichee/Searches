package com.example.servicos.Usuario;

import lombok.AllArgsConstructor;
import lombok.Data;//Importa o lombok(biblioteca para fazer o getter e setter automatico)
import lombok.NoArgsConstructor;

@Data //Getter e setter
@NoArgsConstructor //faz um construtor com todos
@AllArgsConstructor //faz um contrutor com nenhum

public class Usuario_Model {
     private long id;
     private String nome;
     private String senha;
     private String email;
     private double avaliacao;
     private String telefone;
     private String cpfCnpj;
     private String endereco;
}
