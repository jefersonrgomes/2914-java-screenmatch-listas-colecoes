package br.com.alura.screenmatch.modelos;

public class Pessoa {

    private int idadePessoa;
    private String nomePessoa;

    public Pessoa(String nomePessoa, int idadePessoa){
        this.nomePessoa = nomePessoa;
        this.idadePessoa = idadePessoa;
    }

    @Override
    public String toString() {
        return  "nome = '" + nomePessoa + '\'' +
                ", idade = " + idadePessoa;
    }
}