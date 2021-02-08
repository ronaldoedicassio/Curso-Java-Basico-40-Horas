package cadastro.dal;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModuloConexao {

    //metodo responsavel por estabelecar a conexão
    public static Connection conector() throws SQLException {

        Connection conexao = null;

        // linha abaixo chama o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        // Armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/cadastro?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "1203";

        try {
            //Estabelencendo a conexão com o banco de dados

            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            System.out.println(conexao);
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException("Erro na conexão com o Banco de Dados: " + e);
            //return null;
        }

    }
}
