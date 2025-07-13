package Ordenacao;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    //atributo

    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPornome = new TreeSet<>(produtoSet);
        return produtosPornome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorpreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorpreco.addAll(produtoSet);
        return produtosPorpreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto(1L, "Produto 2", 5d, 5);
        cadastroProduto.adicionarProduto(2L, "Produto 3", 15d, 2);
        cadastroProduto.adicionarProduto(3L, "Produto 4", 20d, 4);
        cadastroProduto.adicionarProduto(4L, "Produto 5", 10d, 1);

        System.out.println(cadastroProduto.produtoSet);

        System.out.println(cadastroProduto.exibirProdutosPorNome());

        System.out.println(cadastroProduto.exibirProdutosPorPreco());

    }
}
