package org.example;

public class Departamento {

    private ItemCatalogo catalogoRaiz;

    public void setCatalogo(ItemCatalogo catalogoRaiz) {
        this.catalogoRaiz = catalogoRaiz;
    }

    public String getCatalogoCompleto() {
        if (this.catalogoRaiz == null) {
            throw new NullPointerException("Departamento sem catálogo");
        }
        return this.catalogoRaiz.getDetalhes();
    }
}