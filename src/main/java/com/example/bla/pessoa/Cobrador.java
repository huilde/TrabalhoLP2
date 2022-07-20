package com.example.bla.pessoa;

public class Cobrador extends Funcionario {

    public void cobrarPassagem(Passageiro passageiro) {
        System.out.println("cobrando...");
    }

    public void trocarDinheiro() {
        System.out.println("dinheiro trocado");
    }

}
