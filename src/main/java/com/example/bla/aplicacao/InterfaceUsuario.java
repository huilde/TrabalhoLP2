package com.example.bla.aplicacao;
import java.util.Scanner;

public interface InterfaceUsuario {
    
    Scanner ler = new Scanner(System.in);

     default int iniciar(){
        System.out.println("Bem-vindo ao sistema, por favor digite qual tipo de usuário você é:");
        System.out.println("1- Passageiro");
        System.out.println("2- Cobrador");
        System.out.println("3 - Motorista");
        
        return ler.nextInt();

    }

    default String lerString(){
        String texto;
        texto = ler.nextLine();
        return texto;
    }

    default Double lerDouble(){

        double numero;
        numero = ler.nextDouble();
        return numero;
    }

    default int lerInt(){
        int numero;
        numero = ler.nextInt();
        return numero;
    }


}
