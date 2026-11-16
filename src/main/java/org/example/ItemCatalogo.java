package org.example;

public abstract class ItemCatalogo {

    private String descricao;

    public ItemCatalogo(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract String getDetalhes();
}