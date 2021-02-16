/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection.MySql.CursosDAO;

import Connection.banco.Cursos;
import Connection.MySql.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ronaldo
 */
public class CursosDao {

    Connection con = ConnectionFactory.getConnection();
    PreparedStatement stm = null;
    ResultSet rs = null;

    public void criarRegistroBanco(Cursos c) throws SQLException {

        String sql = "insert into cursos (idcurso,nome, descricao, carga, totaulas, ano) values (?,?,?,?,?,?)";

        try {
            stm = con.prepareStatement(sql);
            stm.setInt(1, c.getId());
            stm.setString(2, c.getNomeCurso());
            stm.setString(3, c.getDescricao());
            stm.setInt(4, c.getCarga());
            stm.setInt(5, c.getTotalAulas());
            stm.setInt(6, c.getAno());
            stm.executeUpdate();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com sucesso");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar os dados:\n" + e.toString());
        } finally {
            ConnectionFactory.closeConnection(con, stm);
        }
    }

    /**
     *
     */
    public int retornaMaxId() {

        String sql = "select max(idcurso) from cursos";
        int idMax = 0;
        
        try {
            stm = con.prepareStatement(sql);
            rs = stm.executeQuery();
            idMax = Integer.parseInt(rs.getString(sql).toString());
            System.out.println("id" + idMax);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return idMax;
    }

}
