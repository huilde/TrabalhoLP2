package com.example.bla.aplicacao;

import java.time.LocalDate;
import java.util.List;

import com.example.bla.pessoa.Cobrador;
import com.example.bla.pessoa.Motorista;

public class Linha {

    /** Data-hora de saída da origem da linha */
    private LocalDate dataHoraSaida;

    /** Data-hora de chegada no destino da linha */
    private LocalDate dataHoraChegada;

    /** Motorista responsável pela linha */
    private Motorista motorista;

    /** Cobrador responsável pela linha */
    private Cobrador cobrador;

    /** Ônibus que percorre a linha */
    private Onibus onibus;

    /** Cidade de origem da linha */
    private Cidade origem;

    /** Cidade de destino da linha */
    private Cidade destino;

    /** Lista de paradas por onde o ônibus */
    private List<Parada> paradas;

    /**
     * Método responsável por fazer o ônibus percorrer as paradas da linha
     */
    public void rodar() {
        if (paradas.size() == 0) {
            origem = destino;
        } else {
            // origem = paradas.get(0).getCidade();
            paradas.remove(0);
        }
    }

    /**
     * Método responsável por adicionar paradas à linha
     */
    public void adicionarParadas(Parada... paradas) {
        for (Parada parada : paradas) {
            this.paradas.add(parada);
        }
    }

    public LocalDate getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(LocalDate dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    public LocalDate getDataHoraChegada() {
        return dataHoraChegada;
    }

    public void setDataHoraChegada(LocalDate dataHoraChegada) {
        this.dataHoraChegada = dataHoraChegada;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Cobrador getCobrador() {
        return cobrador;
    }

    public void setCobrador(Cobrador cobrador) {
        this.cobrador = cobrador;
    }

    public Onibus getOnibus() {
        return onibus;
    }

    public void setOnibus(Onibus onibus) {
        this.onibus = onibus;
    }

    public Cidade getOrigem() {
        return origem;
    }

    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }

    public Cidade getDestino() {
        return destino;
    }

    public void setDestino(Cidade destino) {
        this.destino = destino;
    }

    public List<Parada> getParadas() {
        return paradas;
    }

    public void setParadas(List<Parada> paradas) {
        this.paradas = paradas;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cobrador == null) ? 0 : cobrador.hashCode());
        result = prime * result + ((dataHoraChegada == null) ? 0 : dataHoraChegada.hashCode());
        result = prime * result + ((dataHoraSaida == null) ? 0 : dataHoraSaida.hashCode());
        result = prime * result + ((destino == null) ? 0 : destino.hashCode());
        result = prime * result + ((motorista == null) ? 0 : motorista.hashCode());
        result = prime * result + ((onibus == null) ? 0 : onibus.hashCode());
        result = prime * result + ((origem == null) ? 0 : origem.hashCode());
        result = prime * result + ((paradas == null) ? 0 : paradas.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Linha other = (Linha) obj;
        if (cobrador == null) {
            if (other.cobrador != null)
                return false;
        } else if (!cobrador.equals(other.cobrador))
            return false;
        if (dataHoraChegada == null) {
            if (other.dataHoraChegada != null)
                return false;
        } else if (!dataHoraChegada.equals(other.dataHoraChegada))
            return false;
        if (dataHoraSaida == null) {
            if (other.dataHoraSaida != null)
                return false;
        } else if (!dataHoraSaida.equals(other.dataHoraSaida))
            return false;
        if (destino == null) {
            if (other.destino != null)
                return false;
        } else if (!destino.equals(other.destino))
            return false;
        if (motorista == null) {
            if (other.motorista != null)
                return false;
        } else if (!motorista.equals(other.motorista))
            return false;
        if (onibus == null) {
            if (other.onibus != null)
                return false;
        } else if (!onibus.equals(other.onibus))
            return false;
        if (origem == null) {
            if (other.origem != null)
                return false;
        } else if (!origem.equals(other.origem))
            return false;
        if (paradas == null) {
            if (other.paradas != null)
                return false;
        } else if (!paradas.equals(other.paradas))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Linha [cobrador=" + cobrador + ", dataHoraChegada=" + dataHoraChegada + ", dataHoraSaida="
                + dataHoraSaida + ", destino=" + destino + ", motorista=" + motorista + ", onibus=" + onibus
                + ", origem=" + origem + ", paradas=" + paradas + "]";
    }

}
