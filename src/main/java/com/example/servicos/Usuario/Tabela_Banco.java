package com.example.servicos.Usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //Entende que isso é uma tabela
@Table(name= "tb_Users")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Tabela_Banco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "senha")
    private String senha;

    @Column(name = "email")
    private String email;

    @Column(name = "avaliacao")
    private double avaliacao;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "cpfCnpj")
    private String cpfCnpj;

    @Column(name = "endereco")
    private String endereco;



}
