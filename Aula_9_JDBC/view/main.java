package Aula_9_JDBC.view;

import Aula_9_JDBC.dao.ContatoDAO;
import Aula_9_JDBC.dao.ProdutoDAO;
import Aula_9_JDBC.dao.EnderecoDAO;
import Aula_9_JDBC.dao.TipoDAO;
import Aula_9_JDBC.dao.UsuariosDAO;
import Aula_9_JDBC.entity.Contato;
import Aula_9_JDBC.entity.Produtos;
import Aula_9_JDBC.entity.Endereco;
import Aula_9_JDBC.entity.Tipo;
import Aula_9_JDBC.entity.Usuarios;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Contato contato = new Contato(
                0, // ID (geralmente gerado pelo banco)
                "João Silva",
                "joao.silva@email.com",
                "(11) 91234-5678"
        );
        Endereco endereco = new Endereco(
                "Rua das Flores", // logradouro
                "123", // número
                "Apto 45", // complemento
                "Jardim Primavera", // bairro
                "Sorocaba", // cidade
                "SP", // estado
                "18000-000" // CEP
        );

        Produtos produto = new Produtos(
                0, // ID (gerado pelo banco)
                "Mouse Gamer", // nome_prod
                50, // qtd_estoque
                "Mouse com LED RGB e 6 botões programáveis", // descrição
                129.90 // valor
        );
        Tipo tipo = new Tipo(
                0, // ID
                "Administrador" // descrição do tipo
        );
        Usuarios usuario1 = new Usuarios("Penes de borracha", contato.getContato_id(), endereco.getEndereco_id(), produto.getProd_id(), tipo.getTipo_id());
      

        ContatoDAO contatodao = new ContatoDAO();
        EnderecoDAO enderecodao = new EnderecoDAO();
        ProdutoDAO produtodao = new ProdutoDAO();
        TipoDAO tipodao = new TipoDAO();
        UsuariosDAO usuariodao = new UsuariosDAO();
        
        contatodao.inserir(contato);
        enderecodao.inserir(endereco);
        produtodao.inserir(produto);
        tipodao.inserir(tipo);
        
        usuariodao.inserir(usuario1);
        
   

    }
}
