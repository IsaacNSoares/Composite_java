package org.example;

import java.util.ArrayList;
import java.util.List;

public class Secao extends ItemCatalogo {

    private List<ItemCatalogo> itens;

    public Secao(String descricao) {
        super(descricao);
        this.itens = new ArrayList<ItemCatalogo>();
    }

    public void addItem(ItemCatalogo item) {
        this.itens.add(item);
    }

    @Override
    public String getDetalhes() {
        String saida = "Seção: " + this.getDescricao() + "\n";
        for (ItemCatalogo item : itens) {
            saida += item.getDetalhes();
        }
        return saida;
    }
}