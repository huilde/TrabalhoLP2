package com.example.bla.pessoa;

import java.util.ArrayList;

import com.example.bla.aplicacao.Passagem;

/**
 * Classe Passageiro que herda da classe Pessoa
 * Representa o passageiro do ônibus
 * @param saldo     saldo do passageiro
 * @param passagens     lista de passagens de ônibus
 */

public class Passageiro extends Pessoa {

    private double saldo;

    private ArrayList<Passagem> passagens = new ArrayList<>();
    
/**
 * Construtor do passageiro
 */
    Passageiro(String nome, String sobrenome, double saldo) {
        super(nome, sobrenome, "");
        this.saldo = saldo;
    }
/**
 * Recarrega do saldo do passageiro
 */
    public void fazerRecarga(double valor) {
        saldo = saldo + valor;
    }    
/**
 * Compra passagem
 */
    public void comprarPassagem(Passagem passagem) {
        if (saldo < passagem.getValor()) {
            System.out.println("Você não possui saldo suficiente para comprar essa passagem");
        } else {

            passagens.add(passagem);
            System.out.print("Passagem comprada");
        }
    }
}
