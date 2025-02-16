package com.example.servicos.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

// fornece os métodos de acesso ao banco de dados.
//ESSE JPA TEM UM MONTE DE COISA
public interface Usuario_Repository extends JpaRepository<Tabela_Banco, Long> {
}
