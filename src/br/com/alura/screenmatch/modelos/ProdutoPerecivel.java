package br.com.alura.screenmatch.modelos;

public class ProdutoPerecivel extends Produto {

    private String dataValidade;

    public ProdutoPerecivel(String nomeProduto, double precoProduto, int quantidadeProduto, String dataValidade) {
        super(nomeProduto, precoProduto, quantidadeProduto);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "ProdutoPerecivel{" +
                "nome Produto = " + super.getNomeProduto() + '\'' +
                "preço Produto = " + super.getPrecoProduto() + '\'' +
                "quantidade Produto = " + super.getQuantidadeProduto() + '\'' +
                "dataValidade='" + dataValidade + '}';
    }
}
