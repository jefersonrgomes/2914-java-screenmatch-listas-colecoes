package br.com.alura.screenmatch.modelos;

public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;

    public Produto(String nomeProduto, double precoProduto, int quantidadeProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    @Override
    public String toString() {
        return "Produto: {" +
                "nomeProduto = '" + nomeProduto + '\'' +
                ", precoProduto = " + precoProduto +
                ", quantidadeProduto = " + quantidadeProduto +
                '}';
    }
}
