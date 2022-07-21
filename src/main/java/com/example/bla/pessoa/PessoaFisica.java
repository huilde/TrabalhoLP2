package com.example.bla.pessoa;

import java.time.LocalDate;

/**
 * Classe de Pessoa Física
 *
 * Herda da classe Pessoa
 * Representa a pessoa do tipo pessoa física
*/

public class PessoaFisica extends Pessoa {

    public String cpf;
    public LocalDate dataNascimento;
    
/**
 * Construtor Pessoa Física
 *
 * @param nome      nome da pessoa física
 * @param sobrenome     sobrenome da pessoa física
 * @param cpf       cpf da pessoa física
  * @param dataNascimento       data de nascimento da pessoa física
*/

    PessoaFisica(String nome , String sobrenome , String cpf, LocalDate dataNascimento){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

}
