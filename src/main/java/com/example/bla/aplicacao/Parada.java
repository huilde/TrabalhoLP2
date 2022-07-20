package com.example.bla.aplicacao;

public class Parada {

    public String endereco;
    public String pontoReferencia;
    public Cidade cidade;

    public Parada(String endereco, String pontoReferencia, Cidade cidade) {
        this.endereco = endereco;
        this.pontoReferencia = pontoReferencia;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}