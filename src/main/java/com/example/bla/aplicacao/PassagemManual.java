package com.example.bla.aplicacao;

public class PassagemManual extends Passagem {
    private Long numeracao;

    public PassagemManual(Linha linha, double valor) {
        super(linha, valor);
    }

    public Long getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(Long numeracao) {
        this.numeracao = numeracao;
    }

}
