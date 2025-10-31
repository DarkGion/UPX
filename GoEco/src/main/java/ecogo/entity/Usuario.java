package Prototipo;

import java.util.ArrayList;

public class Usuario {

    private String RazaoSocial;
    private String TipoEmpresa;
    private Endereco endereco;
    private Contato contato;
    private ArrayList<Material> lstMateriais;
    private Material material;

    public Usuario() {

    }

    public Usuario(String RazaoSocial, String TipoEmpresa, Endereco endereco, Contato contato) {
        this.RazaoSocial = RazaoSocial;
        this.TipoEmpresa = TipoEmpresa;
        this.endereco = endereco;
        this.contato = contato;
        lstMateriais = new ArrayList<>();
    }

    public String getRazaoSocial() {
        return RazaoSocial;
    }

    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }

    public String getTipoEmpresa() {
        return TipoEmpresa;
    }

    public void setTipoEmpresa(String TipoEmpresa) {
        this.TipoEmpresa = TipoEmpresa;
    }

    public void addMaterial(Material material) {
        lstMateriais.add(material);
    }

    public void imprimirMaterial() {
        for (Material m : lstMateriais) {
            System.out.println(m.getNome());
        }
    }

    public void imprimir() {

        String msg = "###DADOS DA EMPRESA###"
                + "\nRAZAO SOCIAL: " + getRazaoSocial()
                + "\nTIPO EMPRESA: " + getTipoEmpresa()
                + "\nENDERECO: " + endereco.imprimirEndereco()
                + contato.imprimirContato()
                + "\n\n###LISTA DE MATERIAIS###";

        System.out.println(msg);
        imprimirMaterial();

    }

}
