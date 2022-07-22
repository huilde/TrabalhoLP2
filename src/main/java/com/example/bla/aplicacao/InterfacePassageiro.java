package com.example.bla.aplicacao;

import java.util.ArrayList;
import java.util.List;

import com.example.bla.pessoa.Passageiro;

/**
 * Classe de MENU de interface do passageiro
 * @param passagens     lista de passagens de ônibus
 * @param passageiros       lista de passageiros do ônibus
 */

public class InterfacePassageiro implements Menu {

    private List<Passagem> passagens = new ArrayList<>();
    private List<Passageiro> passageiros = new ArrayList<>();

/**
 * Iniciar a aplicação com as seguintes opções de usuário:
 * 1 - passageiro
 * 2 - cobrador 
 * 3 - motorista
 */
    static int iniciar() {
        System.out.println("Bem-vindo ao sistema, por favor digite qual tipo de usuário você é:");
        System.out.println("1- Passageiro");
        System.out.println("2- Cobrador");
        System.out.println("3 - Motorista");

        return ler.nextInt();
    }
    
/**
 * Logar
 * Deve verificar se o usuário já possui cadastro
 * Solicitar o CPF
 * Caso o CPF esteja cadastrado no sistema, o usuário pode consultar o seu saldo e/ou comprar passagem
 * Caso contrário, ele pode se cadastrar no sistema
 */
    public void login() {
        System.out.println("Você já possui cadastro no sistema?");
        System.out.println("1- Sim");
        System.out.println("2- Não");
        int controle = lerInt();
        System.out.println("Digite seu CPF:");
        String cpfUsuário = lerString();
        for (Passageiro passageiro : passageiros) {
            if (cpfUsuário == passageiro.getCpf()) {
                System.out.println("você está cadastrado no sistema");
                System.out.println("Selecione uma opção:");
                System.out.println("1- consultar saldo:");
                System.out.println("2- comprar passagem:");
                // InterfacePassageiro.
                // //(salario > 1000 ? 0.10 : 0.15)

            } else {
                System.out.println("Você não está cadastrado, gostaria de se cadastrar?");
                System.out.println("1 - sim");
                System.out.println("2 - Não");
            }
        }
    }

}
