package com.example.bla.pessoa;

import com.example.bla.aplicacao.Passagem;

public class Fiscal extends Funcionario {

    /** Relatório de fiscalização da viagem */
    public String relatorioFiscalizacao;

    /**
     * Método responsável pela fiscalização de uma passagem
     * 
     * @param passagem passagem a ser fiscalizada
     */
    public void fiscalizar(Passagem passagem) {
        setRelatorioFiscalizacao("ok");
    }

    public String getRelatorioFiscalizacao() {
        return relatorioFiscalizacao;
    }

    public void setRelatorioFiscalizacao(String relatorioFiscalizacao) {
        this.relatorioFiscalizacao = relatorioFiscalizacao;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((relatorioFiscalizacao == null) ? 0 : relatorioFiscalizacao.hashCode());
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
        Fiscal other = (Fiscal) obj;
        if (relatorioFiscalizacao == null) {
            if (other.relatorioFiscalizacao != null)
                return false;
        } else if (!relatorioFiscalizacao.equals(other.relatorioFiscalizacao))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Fiscal [relatorioFiscalizacao=" + relatorioFiscalizacao + "]";
    }

}
