package com.example.bla.pessoa;

public class Agente extends Funcionario {

    /**
     * Construtor do Funcionario
     * 
     * @param nome      nome do funcionário
     * @param sobrenome sobrenome do funcionário
     * @param cpf       cpf do funcionário
     * @param salario   salario do funcionário
     */
    public Agente(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf, salario);
    }

    /**
     * Método responsável por vender as passagens
     */

    public void venderPassagem() {
        System.out.println("passagem vendida");
    }

}
