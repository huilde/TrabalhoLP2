package com.example.bla.pessoa;

// dar informacao, tomarCafe
public class Funcionario extends Pessoa {

    private String cargo;

    private double salario;

    Funcionario(String nome, String sobrenome, String cargo, double salario){
        super(nome, sobrenome);
        this.salario = salario;
        this.cargo = cargo;
    }

    public void darInformacao(){

    }
    public String getCargo(){
        return cargo;
    }
    public double getSalario(){
        return salario;
    }

    public void tomarCafe(){
        System.out.println("Quem recusa um bom café?");
    }

    public void pedirDemissão(){
        this.cargo = "usuário desabilitado";
        this.salario = 0;
    }
    public void receberAumento(double aumento){
        salario = salario + aumento;
    }

}
