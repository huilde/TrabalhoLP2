package com.example.bla.pessoa;

import java.util.List;

import br.com.caelum.stella.validation.CNPJValidator;

public class PessoaJuridica extends Pessoa {

    /** CNPJ da pessoa jurídica */
    public String cpnj;

    /** Lista de funcionários desta pessoa jurídica */
    List<Funcionario> funcionarios;

    /**
     * Valida se CNPJ é válido
     * 
     * @param cnpj CNPJ a ser validado
     */
    public static boolean validaCNPJ(String cnpj) {
        CNPJValidator cnpjValidator = new CNPJValidator();
        try {
            cnpjValidator.assertValid(cnpj);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((cpnj == null) ? 0 : cpnj.hashCode());
        result = prime * result + ((funcionarios == null) ? 0 : funcionarios.hashCode());
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
        PessoaJuridica other = (PessoaJuridica) obj;
        if (cpnj == null) {
            if (other.cpnj != null)
                return false;
        } else if (!cpnj.equals(other.cpnj))
            return false;
        if (funcionarios == null) {
            if (other.funcionarios != null)
                return false;
        } else if (!funcionarios.equals(other.funcionarios))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "PessoaJuridica [cpnj=" + cpnj + ", funcionarios=" + funcionarios + "]";
    }

}
