package com.example.bla.aplicacao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Talao {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDataImpressao() {
        return dataImpressao;
    }

    public void setDataImpressao(LocalDate dataImpressao) {
        this.dataImpressao = dataImpressao;
    }

    public List<String> getPassagens() {
        return passagens;
    }

    public void setPassagens(List<String> passagens) {
        this.passagens = passagens;
    }

    private String id;
    private LocalDate dataImpressao;
    private List<String> passagens = new ArrayList<>();

    Talao(String id, LocalDate dataImpressao) {
        this.id = id;
        this.dataImpressao = dataImpressao;
    }

}
