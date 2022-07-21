package com.example.bla.aplicacao;

/**
 * Classe que herda da classe Passagem. 
 * Representa a versão digital da passsagem,
 * cujo atributo específico é o identificador ditigal
 */

public class PassagemInformatizada extends Passagem {
    private Object identificadorDigital;

    public PassagemInformatizada(Linha linha, double valor) {
        super(linha, valor);
    }
}
