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

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public LocalDate getProximaManutencao() {
        return proximaManutencao;
    }

    public void setProximaManutencao(LocalDate proximaManutencao) {
        this.proximaManutencao = proximaManutencao;
    }

    public Period getFrequenciaManutencao() {
        return frequenciaManutencao;
    }

    public void setFrequenciaManutencao(Period frequenciaManutencao) {
        this.frequenciaManutencao = frequenciaManutencao;
    }

    public Linha getLinha() {
        return linha;
    }

    public void setLinha(Linha linha) {
        this.linha = linha;
    }

}
