

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author G-Fire
 */
public class TestaConexao {
    public static void main(String[] args) throws SQLException {
        Connection conexao = null;
        try{
           Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/concessionaria", "postgres", "postgres");
            ResultSet rsCliente = conexao.createStatement().executeQuery("SELECT * FROM cliente");
            while(rsCliente.next()){
                System.out.println("Nome: "+rsCliente.getString("nome"));
            }
        }catch(ClassNotFoundException ex){
            System.out.println("driver do banco de dados nao localizado");            
        }catch(SQLException ex){
            System.out.println("ocorreu um erro ao acessar o banco :"+ex.getMessage());
        }finally{
            if(conexao != null){
                conexao.close();
            }
        }
    }
}
