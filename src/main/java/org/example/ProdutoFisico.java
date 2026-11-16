package org.example;

public class ProdutoFisico extends ItemCatalogo {

    private float preco;

    public ProdutoFisico(String descricao, float preco) {
        super(descricao);
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String getDetalhes() {
        return "Produto: " + this.getDescricao() + " - preço: R$ " + this.preco + "\n";
    }

}