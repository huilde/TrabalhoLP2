package com.example.bla.aplicacao;

import java.time.LocalDate;
import java.util.List;

import com.example.bla.pessoa.Cobrador;
import com.example.bla.pessoa.Motorista;

public class Linha {

    private LocalDate dataHoraSaida;
    private LocalDate dataHoraChegada;
    private Motorista motorista;
    private Cobrador cobrador;
    private Onibus onibus;
    private Cidade origem;
    private Cidade destino;
    private List<Parada> paradas;

    public void rodar() {
        if (paradas.size() == 0) {
            origem = destino;
        } else {
            // origem = paradas.get(0).getCidade();
            paradas.remove(0);
        }
    }

    public void adicionarParadas(Parada... paradas) {
        for (Parada parada : paradas) {
            this.paradas.add(parada);
        }
    }

}
