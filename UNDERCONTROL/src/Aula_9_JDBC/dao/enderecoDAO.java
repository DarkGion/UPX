package Aula_9_JDBC.dao;

import Aula_9_JDBC.entity.endereco;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class enderecoDAO {

    private Connection conn;

    public enderecoDAO() {
        this.conn = new ConnectionFactory().getConnection();
    }

    public void inserir(endereco ender) {
        String sql = "INSERT INTO endereco(logradouro, numero,complemento,bairro,cidade,estado,cep) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, ender.getLogradouro());
            stmt.setString(2, ender.getNumero());
            stmt.setString(3, ender.getComplemento());
            stmt.setString(4, ender.getBairro());
            stmt.setString(5, ender.getCidade());
            stmt.setString(6, ender.getEstado());
            stmt.setString(7, ender.getCep());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir contato: " + e.getMessage(), e);
        }
    }

    public List<endereco> listar() {
        List<endereco> endere = new ArrayList<>();
        String sql = "SELECT * FROM endereco";
        try (PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                endereco ender = new endereco(
                    rs.getString("logradouro"),
                    rs.getString("numero"),
                    rs.getString("complemento"),
                    rs.getString("bairro"),
                    rs.getString("cidade"),
                    rs.getString("estado"),
                    rs.getString("cep")    
                );
                endere.add(ender);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar endereço: " + e.getMessage(), e);
        }
        return endere;
    }

    public void atualizar(endereco endereco, String emailAntigo) {
        String sql = "UPDATE contato SET nome = ?, email = ?, telefone = ? WHERE email = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, endereco.getLogradouro());
            stmt.setString(2, endereco.getNumero());
            stmt.setString(3, endereco.getBairro());
            stmt.setString(4, emailAntigo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar contato: " + e.getMessage(), e);
        }
    }

    public void deletar(int id) {
        String sql = "DELETE FROM endereco WHERE endereco_id = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao deletar contato: " + e.getMessage(), e);
        }
    }
    
    
}
