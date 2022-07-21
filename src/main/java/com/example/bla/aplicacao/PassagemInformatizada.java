package com.example.bla.aplicacao;

public class PassagemInformatizada extends Passagem {
    private Object identificadorDigital;

    public PassagemInformatizada(Linha linha, double valor) {
        super(linha, valor);
    }

    public Object getIdentificadorDigital() {
        return identificadorDigital;
    }

    public void setIdentificadorDigital(Object identificadorDigital) {
        this.identificadorDigital = identificadorDigital;
    }
}
