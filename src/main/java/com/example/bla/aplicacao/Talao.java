package com.example.bla.aplicacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um talão de controle das passagens de ônibus
 */

public class Talao {

    private String id;
    private LocalDate dataImpressao;
    private List<String> passagens = new ArrayList<>();
    
/**
 * Construtor do Talao
 * @param id    identificador do talão
 * @param dataImpressao     data da impressão do talão
*/
    Talao(String id, LocalDate dataImpressao) {
        this.id = id;
        this.dataImpressao = dataImpressao;
    }

}
