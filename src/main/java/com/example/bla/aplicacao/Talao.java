package com.example.bla.aplicacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Talao {

    private String id;
    private LocalDate dataImpressao;
    private List<String> passagens = new ArrayList<>();

    Talao(String id, LocalDate dataImpressao) {
        this.id = id;
        this.dataImpressao = dataImpressao;
    }

}
