package com.example.bla.aplicacao;

public class Parada {
    public String endereco;
    public String pontoReferencia;
    public Cidade cidade;

    public Parada(String end, String pontoRef, Cidade cidade) {
        endereco = end;
        pontoReferencia = pontoRef;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setEndereco(String _endereco) {
        endereco = _endereco;
    }

    public void setPontoReferencia(String _pontoReferencia) {
        pontoReferencia = _pontoReferencia;
    }

    public String toString() {
        String resultado;

        resultado = "Parada de ônibus: "+
                "\n\t\tEndereco : "+endereco+
                "\n\t\tPonto de referencia: "+pontoReferencia;

        return resultado;
    }
}
