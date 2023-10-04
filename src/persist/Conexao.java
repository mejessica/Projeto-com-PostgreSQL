
package persist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection getConexao(){ 
        
        //connection classe do pacote na biblitoeca que representa a conexao com o banco 
//metodo statico pra nao criar um instancia 
//        Connection conexao = null;
//        try {
//            Class.forName("org.apache.derby.jdbc.ClientDriver");//nome do drive do banco 
//            String serverName = "localhost";
//            String mydatabase = "unicornio";
//            String url = "jdbc:derby://localhost:1527/unicornio";
//            String username = "jeje"; //nome de um usuário do BD 
//            String password = "monica"; // senha de acesso 
//            conexao = DriverManager.getConnection(url, username, password); //driver manager estabele a conexao 
//        } catch (ClassNotFoundException e) {
//            System.out.println("Driver não encontrado!" + e);
//        } catch (SQLException e2) {
//            System.out.println("Não foi possível conectar ao BD");
//        }

        
        Connection conexao = null;
        try {
            Class.forName("org.postgresql.Driver");
            String username = "postgres";
            String password = "postgres";
            String url = "jdbc:postgresql://localhost:5432/concessionaria";
            conexao = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado!" + e);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("-------------- CONEXÃO CRIADA ! -------------------");
    
        return conexao;

    }
}
