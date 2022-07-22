package com.example.bla.pessoa;

import java.util.ArrayList;

import com.example.bla.aplicacao.Passagem;

public class Passageiro extends Pessoa {

    private double saldo;

    private ArrayList<Passagem> passagens = new ArrayList<>();

    Passageiro(String nome, String sobrenome,String cpf , double saldo) {
        super(nome, sobrenome,cpf);
        this.saldo = saldo;
    }

    public void fazerRecarga(double valor) {
        saldo = saldo + valor;
    }

    public void comprarPassagem(Passagem passagem) {
        if (saldo < passagem.getValor()) {
            System.out.println("Você não possui saldo suficiente para comprar essa passagem");
        } else {

            passagens.add(passagem);
            System.out.print("Passagem comprada");
        }
    }
}