package com.example.bla.aplicacao;
import java.util.Scanner;

public interface Menu {
    
    Scanner ler = new Scanner(System.in);

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
