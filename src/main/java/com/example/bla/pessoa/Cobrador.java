package com.example.bla.pessoa;

/**
 * Classe Cobrador
 *
 * Herda da classe Funcionario.
 * Representa o funcionário do tipo cobrador
*/

public class Cobrador extends Funcionario {

/**
 * Cobra a passagem do passageiro
 *
 * @return vazio
*/
    public void cobrarPassagem(Passageiro passageiro) {
        System.out.println("cobrando...");
    }
    
/**
 * Troca o dinheiro do passageiro
 *
 * @return vazio
*/
    public void trocarDinheiro() {
        System.out.println("dinheiro trocado");
    }

}
