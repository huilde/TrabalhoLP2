package com.example.bla.aplicacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class BlaApplication {

	public static void main(String[] args) {
		interfacePassageiro.login();
		InterfacePassageiro sitema = new InterfacePassageiro();
		if(sitema.lerInt()==1 ){
			sitema.login();
		}
		else{
			System.err.println("Funcionalidade ainda não implementada");
		}
	}

}
