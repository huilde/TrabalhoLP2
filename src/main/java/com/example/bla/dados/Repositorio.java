package com.example.bla.dados;

import java.util.List;

public interface Repositorio {

    public void salvar(Entidade e);

    public List<? extends Entidade> buscar(Entidade e);

    public void alterar(Entidade e);

    public void deletar(Entidade e);

}
