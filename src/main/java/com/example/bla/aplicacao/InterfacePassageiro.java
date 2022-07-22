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

    private void interacaoPassageiro(int acaoUsuario, Passageiro passageiro){
        if(acaoUsuario==1){

            System.out.println(passageiro.getSaldo())
        }
        else{
            System.out.println("digite um comando válido");
        }

    }

/**
 * Iniciar a aplicação com as seguintes opções de usuário:
 * 1 - passageiro
 * 2 - cobrador 
 * 3 - motorista
 */
    static int iniciar() {
        System.out.println("Bem-vindo ao sistema, por favor digite qual tipo de usuário você é:");
        System.out.println("1- Passageiro");

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
                int acaoUsuario = lerInt();
                interacaoPassageiro(acaoUsuario,passageiro);

            } else {
                System.out.println("Você não está cadastrado, gostaria de se cadastrar?");
                System.out.println("1 - sim");
                System.out.println("2 - Não");
                int escolha = lerInt();
                if(escolha == 1){
                    System.out.println("digite seus dados"):
                    System.out.println("cpf");
                    String cpfnovo = lerString();
                    System.out.println("nome")
                    String nomeNovo = lerString();
                    System.out.println("sobrenome")
                    String sobrenomeNovo = lerString();
                    passageiros.add(new Passageiro(nomeNovo, sobrenomeNovo, cpfnovo, 100));
                    sytem.out.println("usuário adicionado");
                    login();
                }
            }
        }
    }


}
