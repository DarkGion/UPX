package Prototipo;

public class Material {

    private int id;
    private String nome;
    private String categoria;
    private String descricao;
    private int qtd;
    private String unidadeMedida;
    private int preco;
    private String Imagens;
    private Endereco endereco;

    public Material() {
    }

    public Material(int id, String nome, String categoria, String descricao, int qtd, String unidadeMedida, int preco, String Imagens, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
        this.qtd = qtd;
        this.unidadeMedida = unidadeMedida;
        this.preco = preco;
        this.Imagens = Imagens;
        this.endereco = endereco;
    }

    public Material(String nome) {
        this.nome = nome;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public String getImagens() {
        return Imagens;
    }

    public void setImagens(String Imagens) {
        this.Imagens = Imagens;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    private String ImprimirMaterial() {
        String msg = "###MATERIAIS###"
                + "ID: " + getId()
                + "TITULO" + getNome()
                + "CATEGORIA " + getCategoria()
                + "DESCRICAO: " + getDescricao()
                + "QUANTIDADE: " + getQtd()
                + "UNIDADE DE MEDIDA: " + getUnidadeMedida()
                + "PRECO: " + getPreco()
                + "IMAGENS: " + getImagens()
                + "ENDERECO: " + endereco.imprimirEndereco();
        return msg;
    }

}
