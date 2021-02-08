/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gafanhotobdmysql;

import cadastro.dal.ModuloConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ronaldo
 */
public class GafanhotoBDMySql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection conexao = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            conexao = ModuloConexao.conector();
        } catch (SQLException ex) {
            Logger.getLogger(GafanhotoBDMySql.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(conexao);
    }

}
