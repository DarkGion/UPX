package Aula_9_JDBC.view;

import Aula_9_JDBC.dao.ContatoDAO;
import Aula_9_JDBC.dao.ProdutoDAO;
import Aula_9_JDBC.dao.enderecoDAO;
import Aula_9_JDBC.entity.Contato;
import Aula_9_JDBC.entity.Produtos;
import Aula_9_JDBC.entity.endereco;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContatoDAO dao = new ContatoDAO();
        enderecoDAO dao2  = new enderecoDAO();
        Contato contato = new Contato("Giovanni", "giovanni@email.com", "(15) 99999-9999");
        endereco ender = new endereco("Amor","12312", "tres", "competo", "Sorocaba", "sp", "23");
        ProdutoDAO dao3 = new ProdutoDAO();
        Produtos pro = new Produtos("Giovanii", 1, "Gordinho viado", 19.90);
                
        
        
       dao3.inserir(pro);
                


    }
}



