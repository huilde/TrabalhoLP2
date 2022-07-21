package com.example.bla.aplicacao;

public class Passagem {

    private Linha linha;
    private double valor;

    /**
     * Construtor vazio de Passagem
     */
    public Passagem() {
    }

    /**
     * Construtor de Passagem
     * 
     * @param linha linha que o onibus possui
     * @param valor valor da passagem do onibus
     */
    public Passagem(Linha linha, double valor) {
        this.linha = linha;
        this.valor = valor;
    }

    /**
     * getter de linha
     * 
     * @return linha responsável pelo ônibus
     */

    public Linha getLinha() {
        return linha;
    };

    /**
     * getter de valor
     * 
     * @return valor que o passageiro pagará pela passagem
     */
    public double getValor() {
        return valor;
    }

    /**
     * setter de valor
     * função responsável por alterar o valor da passagem
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * setter de linha
     * função responsável por alterar o nome da linha
     */

    public void setLinha(Linha linha) {
        this.linha = linha;
    }

    /**
     * 
     * função responsável por aumentar o valor da passagem
     * 
     * @param aumento representa o valor do aumento da pssagem
     */

    public void aumentarValor(double aumento) {
        setValor(valor + aumento);
    }

}
