package Aula_9_JDBC.view;

import Aula_9_JDBC.dao.ContatoDAO;
import Aula_9_JDBC.dao.TipoDAO;
import Aula_9_JDBC.entity.Contato;
import Aula_9_JDBC.entity.Tipo;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ContatoDAO dao = new ContatoDAO();
        Contato contato = new Contato("Giovanni", "giovanni@email.com", "(15) 99999-9999");
        
        System.out.println(dao.listar().toString());


    }
}


