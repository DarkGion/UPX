package Aula_9_JDBC.entity;


public class Produtos {

    // Atributos
    private String nome_prod;
    private int qtd_estoque;
    private String descricao;
    private double valor;

    // Construtor
    public Produtos(String nome_prod, int qtd_estoque, String descricao, double valor) {
        this.nome_prod = nome_prod;
        this.qtd_estoque = qtd_estoque;
        this.descricao = descricao;
        this.valor = valor;
    }

    // Getters e Setters
    public String getNome_prod() {
        return nome_prod;
    }

    public void setNome_prod(String nome_prod) {
        this.nome_prod = nome_prod;
    }

    public int getQtd_estoque() {
        return qtd_estoque;
    }

    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método toString()
    @Override
    public String toString() {
        return "\nProduto{" +
               "nome_prod='" + nome_prod + '\'' +
               ", qtd_estoque=" + qtd_estoque +
               ", descricao='" + descricao + '\'' +
               ", valor=" + valor +
               '}';
    }
}