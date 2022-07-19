package com.example.bla.pessoa;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {

    public PessoaFisica(String _nome, String _sobrenome) {
        super(String _nome, String _sobrenome);
    }
    public String cpf;
    public LocalDate dataNascimento;
}
