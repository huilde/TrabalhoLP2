package com.example.bla.dados;

import java.util.List;

/**
 * Interface do repositório
 *
 * O Repositório funciona como um CRUD
 */

public interface Repositorio {

    public void salvar(Entidade e);

    public List<? extends Entidade> buscar(Entidade e);

    public void alterar(Entidade e);

    public void deletar(Entidade e);

}
