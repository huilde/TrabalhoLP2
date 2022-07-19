package com.example.bla.aplicacao;

public class Passagem {
    Linha linha;
    private double valor;

    Passagem(Linha linha, double valor ){
        this.linha = linha;
        this.valor = valor;
    }

    public Linha getLinha(){
       return linha; 
    };
    public  double getValor(){
        return valor;
    }
    public void setValor(double valor){
        this.valor = valor;
    }
    public void setLinha(Linha linha){
        this.linha = linha;
    }

    public void aumentarValor(double aumento){
        setValor(valor + aumento);
    }
}