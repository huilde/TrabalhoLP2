package com.example.bla.pessoa;

import br.com.caelum.stella.validation.CPFValidator;

public class Pessoa {

    private String nome;
    private String sobrenome;

    Pessoa(String nome, String sobrenome ){
        this.nome = nome;
        this.sobrenome = sobrenome;
    };
    @Override
    public String toString() {
        
        return nome+" "+sobrenome ;
    }

    public static boolean validaCPF(String cpf) { 
        CPFValidator cpfValidator = new CPFValidator(); 
        try{ cpfValidator.assertValid(cpf); 
        return true; 
        }catch(Exception e){ 
            e.printStackTrace(); 
            return false; 
            } 
        }
    public  String getNome(){
        return nome;
    }

    public  String getSobrenome(){
        return sobrenome;
    }

    public String getNomeCompleto(){
        return nome+ " " + sobrenome;
    }
}
