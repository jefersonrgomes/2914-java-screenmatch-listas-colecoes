import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.*;


import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro Filme: " + listaDeFilmes.get(0));
        System.out.println(listaDeFilmes);


        Pessoa pessoa1 = new Pessoa("João", 14);
        Pessoa pessoa2 = new Pessoa("Marcela", 24);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);

        System.out.println("Tamanho da Lista de Pessoas: " + listaDePessoas.size());
        System.out.println("Pessoa 1: " + listaDePessoas.get(0));
        System.out.println("Pessoa 2: " + listaDePessoas.get(1));
        System.out.println("primeiro: " + listaDePessoas.stream().findFirst());
        System.out.println(listaDePessoas);

        //Produto Instance
        ArrayList<ProdutoPerecivel> listaProdutosPereciveis = new ArrayList<>();

        listaProdutosPereciveis.add(new ProdutoPerecivel("CocaCola", 3.50, 2, "05/06/2024"));
        listaProdutosPereciveis.add(new ProdutoPerecivel("Hamburguer", 7.50, 2, "05/09/2025"));

        for(ProdutoPerecivel produtoPerecivel: listaProdutosPereciveis){
            System.out.println(produtoPerecivel);
        }
    }
}

