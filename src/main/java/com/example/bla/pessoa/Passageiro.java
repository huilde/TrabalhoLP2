package com.example.bla.pessoa;

import java.util.ArrayList;

import com.example.bla.aplicacao.Passagem;

/**
 * Classe Passageiro que herda da classe Pessoa
 * Representa o passageiro do ônibus
 * 
 * @param saldo     saldo do passageiro
 * @param passagens lista de passagens de ônibus
 */

public class Passageiro extends Pessoa {

    private double saldo;

    private ArrayList<Passagem> passagens = new ArrayList<>();

    /**
     * Construtor do passageiro
     */
    public Passageiro(String nome, String sobrenome, String cpf, double saldo) {
        super(nome, sobrenome, cpf);
        this.saldo = saldo;
    }

    /**
     * Recarrega do saldo do passageiro
     */
    public void fazerRecarga(double valor) {
        saldo = saldo + valor;
    }

    /**
     * getter de saldo
     * 
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
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
