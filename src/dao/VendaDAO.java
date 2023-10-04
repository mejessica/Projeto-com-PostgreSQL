package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.*;
import persist.Conexao;

/**
 *
 * @author G-Fire
 */
public class VendaDAO implements OperacoesDAO {

     private static final Connection con = Conexao.getConexao();
     
    @Override
    public boolean inserir(Object obj) {
        if(obj instanceof Venda){
            Venda v = (Venda) obj;
            int codVenda = v.getCodVenda();
            double valorVenda = v.getValorVenda();
            Carro c = v.getCarro();
            Funcionario f = v.getFuncionario();
            Cliente cli = v.getCliente();
                  
            String sql = "INSERT INTO VENDA (CODVENDA, CODCARRO, VALORVENDA, CODFUNCIONARIO, CODCLIENTE) VALUES (?,?,?,?,?)";
            try{
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setInt(1, codVenda);
                pstmt.setInt(2, c.getCodCarro());
                pstmt.setDouble(3, valorVenda);
                pstmt.setInt(4, f.getCodFuncionario());
                pstmt.setInt(5, cli.getCodCliente());
                
                int res = pstmt.executeUpdate();
                if(res==1){
                    return true;
                }
            }catch(SQLException ex){
                System.out.println(ex);
            }
        } 
        return false;
    }
    
  

    @Override
   public boolean editar(Object O) {
         if(O instanceof Venda){
            Venda v = (Venda) O;
            int codVenda = v.getCodVenda();
            double valorVenda = v.getValorVenda();
            Carro c = v.getCarro();
            Funcionario f = v.getFuncionario();
            Cliente cli = v.getCliente();
                  
            String sql = "UPDATE VENDA set codVenda = ?, codCarro = ?, valorVenda = ?, codFuncionario = ?, codCliente = ?";
            try{
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setInt(1, codVenda);
                pstmt.setInt(2, c.getCodCarro());
                pstmt.setDouble(3, valorVenda);
                pstmt.setInt(4, f.getCodFuncionario());
                pstmt.setInt(5, cli.getCodCliente());
                
                int res = pstmt.executeUpdate();
                if(res==1){
                    return true;
                }
            }catch(SQLException ex){
                System.out.println(ex);
            }
        } 
        return false;

        }


    @Override
    public boolean excluir(Object obj) {
      if(obj instanceof Venda){
         int codVenda = (int) obj;
         String sql = "DELETE FROM VENDA WHERE CODVENDA='"+codVenda+"'";
          System.out.println("sql = "+sql);
          try{
              Statement stmt = con.createStatement();
              stmt.executeUpdate(sql);
              return true;
          }catch(SQLException ex){
              System.out.println(ex);
          }
      }
        return false;
    }

   
     @Override
    public Object pesquisar(Object obj) {
        int codVenda=(int)obj;
        try{
            String sql = "SELECT * FROM VENDA WHERE CODVENDA ='"+codVenda+"'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            int codCarro= rs.getInt("codCarro");
            Carro carro = (Carro) new CarroDAO().pesquisar(codCarro);
            double valorVenda = rs.getDouble("valorVenda");
            int codFuncionario = rs.getInt("codFuncionario");
            Funcionario funcionario = (Funcionario) new FuncionarioDAO().pesquisarInt(codFuncionario);
            int codCliente = rs.getInt("codCliente");
            Cliente cliente = (Cliente) new ClienteDAO().pesquisarInt(codCliente);
            Venda v = new Venda(codVenda, carro, valorVenda, funcionario, cliente);
            return v;
            
        }catch(SQLException sqe){
            sqe.printStackTrace();
        }
        return null;
    }
    
    
     }
     
     
    

     



