package com.example.bla.aplicacao;

/**
 * Classe que herda da classe Passagem.
 * Representa a versão manual da passsagem
 * @param numeracao     numeração da passagem
 * @param valor     dinheiro
 * @param linha     linha de ônibus
 */

public class PassagemManual extends Passagem {

    private Long numeracao;
    
/**
 * Construtor da Passagem Manual
 */
    public PassagemManual(Linha linha, double valor) {
        super(linha, valor);
    }

    public Long getNumeracao() {
        return numeracao;
    }

    public void setNumeracao(Long numeracao) {
        this.numeracao = numeracao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((numeracao == null) ? 0 : numeracao.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PassagemManual other = (PassagemManual) obj;
        if (numeracao == null) {
            if (other.numeracao != null)
                return false;
        } else if (!numeracao.equals(other.numeracao))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PassagemManual [numeracao=" + numeracao + "]";
    }

}
