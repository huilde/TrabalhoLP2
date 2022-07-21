package com.example.bla.aplicacao;

public class Cidade {

    private String nome;
    private String cep;
    private UF uf;

    /**
     * Construtor da cidade
     *
     * @param nome nome da cidade
     * @param cep  cep da cidade
     * @param uf   unidade federativa da qual a cidade pertence
     */

    public Cidade(String nome, String cep, UF uf) {
        this.nome = nome;
        this.cep = cep;
        this.uf = uf;
    }

    /**
     * getter de nome
     * 
     * @return nome da cidade
     */

    public String getNome() {
        return nome;
    }

    /**
     * setter de nome
     * modifica o nome da cidade
     */

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * getter de cep
     * 
     * @return cep da cidade
     */

    public String getCep() {
        return cep;
    }

    /**
     * setter de cpf
     * modifica o cpf da cidade
     */

    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * getter de uf
     * 
     * @return uf da cidade
     */

    public UF getUf() {
        return uf;
    }

    /**
     * setter de uf
     * modifica a uf da cidade
     */

    public void setUf(UF uf) {
        this.uf = uf;
    }

}
