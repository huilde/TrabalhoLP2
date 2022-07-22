package com.example.bla.aplicacao;

import java.time.LocalDate;
import java.time.Period;

import com.example.bla.pessoa.Motorista;

/**
 * Classe do ônibus
 * @param motorista     motorista responsável pelo ônibus
 * @param id     identificador do ônibus
 * @param situacao      status do ônibus
 * @param proximaManutencao     próxima manutenção do ônibus
 * @param frequenciaManutencao     frequência da manutenção
 * @param linha     linha a qual o ônibus pertence
 */

public class Onibus {

/**
 *Enum com todas as situações possíveis de um ônibus
*/
    private enum Situacao {
        FUNCIONANDO, EM_MANUTENCAO, QUEBRADO;
    }

    private Motorista motorista;
    private Integer id;
    private Situacao situacao;
    private LocalDate proximaManutencao;
    private Period frequenciaManutencao;
    private Linha linha;

 /**
 *Construtor do ônibus
 */
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
