package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {

    @Test
    void deveRetornarCatalogoDepartamento() {
        Secao secao1 = new Secao("Calçados");

        Secao secao2 = new Secao("Acessórios");
        ProdutoFisico produto21 = new ProdutoFisico("Cinto de Couro", 49.90f);
        secao2.addItem(produto21);

        Secao secao3 = new Secao("Camisas");
        ProdutoFisico produto31 = new ProdutoFisico("Camisa Polo Rosa", 89.90f);
        ProdutoFisico produto32 = new ProdutoFisico("Camisa Gola V", 59.90f);
        secao3.addItem(produto31);
        secao3.addItem(produto32);

        Secao catalogoGeral = new Secao("Catálogo Vestuário");
        catalogoGeral.addItem(secao1);
        catalogoGeral.addItem(secao2);
        catalogoGeral.addItem(secao3);

        Departamento departamento = new Departamento();
        departamento.setCatalogo(catalogoGeral);

        assertEquals("Seção: Catálogo Vestuário\n" +
                "Seção: Calçados\n" +
                "Seção: Acessórios\n" +
                "Produto: Cinto de Couro - preço: R$ 49.9\n" +
                "Seção: Camisas\n" +
                "Produto: Camisa Polo Rosa - preço: R$ 89.9\n" +
                "Produto: Camisa Gola V - preço: R$ 59.9\n", departamento.getCatalogoCompleto());
    }

    @Test
    void deveRetornarExcecaoDepartamentoSemCatalogo() {
        try {
            Departamento departamento = new Departamento();
            departamento.getCatalogoCompleto();
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Departamento sem catálogo", e.getMessage());
        }
    }
}