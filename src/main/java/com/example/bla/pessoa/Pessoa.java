package com.example.bla.pessoa;

import br.com.caelum.stella.validation.CPFValidator;

public class Pessoa {

    protected String nome;
    private String sobrenome;
    public String cpf;

    /**
     * setter de nome
     * função responsável por modificar o nome da pessoa
     */

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * setter de sobrenome
     * função responsável por modificar o sobrenome da pessoa
     */

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    /**
     * getter de CPF
     * 
     * @return retorna o cpf da pessoa
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * setter de CPF
     * responsável por modificar o atributo cpf
     */

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Pessoa() {
    }

    /**
     * Construtor de pessoa
     *
     * @param nome      nome da pessoa
     * @param sobrenome sobrenome da pessoa
     * @param cpf       cpf da pessoa
     */

    public Pessoa(String nome, String sobrenome, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    };

    /**
     * método toString da classe pessoa
     */
    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }

    /**
     * Função para validar se o cpf é válido
     *
     * @param cpf recebe um cpf para validar
     * @return retorna true se o cpf for válido e false caso contrário
     */

    public static boolean validaCPF(String cpf) {
        CPFValidator cpfValidator = new CPFValidator();
        try {
            cpfValidator.assertValid(cpf);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * getter de nome
     * 
     * @retun nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * getter de sobrenome
     * 
     * @retun sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     *
     * @retun nome + sobrenome
     */
    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

}
