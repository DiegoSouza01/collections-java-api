package Pesquisa;

public class Produto {
    //atributos

    private String nome;

    private double preco;

    private int qunatidade;

    public Produto(String nome, double preco, int qunatidade) {
        this.nome = nome;
        this.preco = preco;
        this.qunatidade = qunatidade;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    public int getQunatidade() {
        return qunatidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", qunatidade=" + qunatidade +
                '}';
    }
}
