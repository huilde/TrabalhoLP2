package com.example.bla.aplicacao;

/**
 * Classe que representa o ponto de parada do ônibus
*/

public class Parada {

    public String endereco;
    public String pontoReferencia;
    public Cidade cidade;
    
/**
 * Construtor Parada
 *
 * @param endereco  endereço da parada
 * @param pontoReferencia   ponto de referência da parada
 * @param cidade    cidade onde a parada está localizada
*/
    
    public Parada(String endereco, String pontoReferencia, Cidade cidade) {
        this.endereco = endereco;
        this.pontoReferencia = pontoReferencia;
    }
    
/**
* Obtém o endereço da parada
*
* @return endereco
*/
    public String getEndereco() {
        return endereco;
    }
    
/**
* Obtém o ponto de referência
*
* @return pontoReferencia
*/
    public String getPontoReferencia() {
        return pontoReferencia;
    }
    
/**
* Determina o endereço do ponto de parada
*/
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
