package com.example.bla.aplicacao;

import java.time.LocalDate;
import java.time.Period;

import com.example.bla.pessoa.Motorista;

public class Onibus {

    private enum Situacao {
        FUNCIONANDO, EM_MANUTENCAO, QUEBRADO;
    }

    private Motorista motorista;
    private Integer id;
    private Situacao situacao;
    private LocalDate proximaManutencao;
    private Period frequenciaManutencao;
    private Linha linha;

    // funcao levar para manutencao, proximaManutencao++

    public Onibus(Linha linha, Motorista motorista) {
        this.linha = linha;
        this.motorista = motorista;
    }

}
