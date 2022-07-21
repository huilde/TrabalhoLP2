package com.example.bla.aplicacao;

import java.util.ArrayList;
import java.util.List;

import com.example.bla.pessoa.Passageiro;

public class interfacePassageiro implements Menu {

    private List<Passagem> passagens = new ArrayList<>();
    private List<Passageiro> passageiros = new ArrayList<>();

    static int iniciar(){
        System.out.println("Bem-vindo ao sistema, por favor digite qual tipo de usuário você é:");
        System.out.println("1- Passageiro");
        System.out.println("2- Cobrador");
        System.out.println("3 - Motorista");

        return ler.nextInt();
    }

    public void login(){
        System.out.println("Você já possui cadastro no sistema?");
        System.out.println("1- Sim");
        System.out.println("2- Não");
        int controle = lerInt();
        if(controle == 1){
            System.out.println("Digite seu CPF:");
            String cpfUsuário = lerString();


        }


    }

}