package com.example.bla.aplicacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class BlaApplication {

	public static void main(String[] args) {
		InterfacePassageiro sistema = new InterfacePassageiro();
		sistema.login();
		if(sistema.lerInt()==1 ){
			sistema.login();
		}
		else{
			System.err.println("Funcionalidade ainda não implementada");
		}
	}

}
