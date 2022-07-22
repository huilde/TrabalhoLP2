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
    
 /**
 * getter de motorista
 * 
 * @return motorista
 */
    public Motorista getMotorista() {
        return motorista;
    }
/**
 * setter de motorista
 * modifica o nome do motorista
 */
    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }
    
 /**
 * getter de id
 * 
 * @return id do ônibus
 */
    public Integer getId() {
        return id;
    }
/**
 * setter de id
 * modifica o id do ônibus
 */
    public void setId(Integer id) {
        this.id = id;
    }
/**
 * getter de situação
 * 
 * @return situação do ônibus
 */
    public Situacao getSituacao() {
        return situacao;
    }
/**
 * setter de situação
 * modifica a situação do ônibus
 */
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
/**
 * getter de próxima manutenção do ônibus
 * 
 * @return próxima manutenção do ônibus
 */
    public LocalDate getProximaManutencao() {
        return proximaManutencao;
    }
/**
 * setter de próxima manutenção do ônibus
 * modifica a próxima manutenção do ônibus
 */
    public void setProximaManutencao(LocalDate proximaManutencao) {
        this.proximaManutencao = proximaManutencao;
    }
/**
 * getter de frequência de manutenção do ônibus
 * 
 * @return frequência de manutenção do ônibus
 */
    public Period getFrequenciaManutencao() {
        return frequenciaManutencao;
    }
/**
 * setter de frequência de manutenção do ônibus
 * modifica a frequência de manutenção do ônibus
 */
    public void setFrequenciaManutencao(Period frequenciaManutencao) {
        this.frequenciaManutencao = frequenciaManutencao;
    }
/**
 * getter de linha
 * 
 * @return linha do ônibus
 */
    public Linha getLinha() {
        return linha;
    }
/**
 * setter de linha
 * modifica a linha do ônibus
 */
    public void setLinha(Linha linha) {
        this.linha = linha;
    }

}
