package Prototipo;

public class Main {

    public static void main(String[] args) {
        Contato c1 = new Contato("Pedro Jorge", "pedrinhopocapica@gmail.com", "(085)1499-3401");
        Endereco e1 = new Endereco("Av. das Indústrias", "Distrito Metalúrgico", "1020", "18100-250", "Nenhum");

        Usuario s1 = new Usuario("Empresa 1", "Ambos", e1, c1);
        Material m2 = new Material(
                "Tinta Acrilica"
        );
        Material m3 = new Material(
                "Chapas de Aço Inoxidável"
        );
         Material m4 = new Material(
                "Penes de borracha"
        );
        s1.addMaterial(m2);
        s1.addMaterial(m3);
        s1.addMaterial(m4);

        s1.imprimir();

    }

}
