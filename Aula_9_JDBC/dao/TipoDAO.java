package Aula_9_JDBC.dao;

import Aula_9_JDBC.entity.Tipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TipoDAO {

    public void inserir(Tipo tipo) {
        String sql = "insert into tipo(tipo,tipo_id) values (?,?)";

        try (Connection conn = ConnectionFactory.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, tipo.getTipo());
            stmt.setInt(2, tipo.getTipo_id());
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            System.out.println("Erro ao inserir usu�rio: " + ex.getMessage());
        }
    }
}
