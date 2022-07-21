package com.example.bla.pessoa;

public abstract class Funcionario extends Pessoa {
    private double salario;
    
     /**
     * Construtor do Funcionario
     *
     * @param nome  nome do funcionário
     * @param sobrenome   sobrenome do funcionário
     * @param cpf cpf do funcionário
     *  @param salario salario do funcionário
     */
    public Funcionario(String nome, String sobrenome, String cpf, double salario) {
        super(nome, sobrenome, cpf);
        this.salario = salario;
    }

    /**
     * getter de salario
     *  @returns salario do funcionário
     */

    public double getSalario() {
        return salario;
    }

    /**
     * setter de salario
     */

    public void setSalario(double salario) {
        this.salario = salario;
    }

/**
     * função respomsável por fazer o funcionario tomar café
     */
    public void tomarCafe() {
        System.out.println("quem recusa um bom cafe?");
    }

}
