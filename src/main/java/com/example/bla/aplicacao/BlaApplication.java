package com.example.bla.aplicacao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe da aplicação Bla
 * Representa a interface com o usuário onde ele primeiramente deve fazer o
 * login
 */

public class BlaApplication {

	public static void main(String[] args) {
		InterfacePassageiro sistema = new InterfacePassageiro();
		sistema.login();
		if (sistema.lerInt() == 1) {
			sistema.login();
		}
	}
}
