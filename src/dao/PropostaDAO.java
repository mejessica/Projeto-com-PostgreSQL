package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.*;
import persist.Conexao;
import model.Proposta;

/**
 *
 * @author G-Fire
 */
public class PropostaDAO implements OperacoesDAO{

   private static final Connection con = Conexao.getConexao();
   @Override
    public boolean inserir(Object obj) {
        if(obj instanceof Proposta){
            Proposta p = (Proposta)obj;
            int codProposta = p.getCodProposta();
            Carro c = p.getCarro();
            double valorInicial = p.getValorInicial();
            double valorVenda = p.getValorVenda();
            Funcionario f = p.getFuncionario();
            Cliente cli = p.getCliente();
            String status = p.getStatus();
            
        
            String sql = "INSERT INTO PROPOSTA (CODPROPOSTA, CODCARRO, CODFUNCIONARIO, CODCLIENTE, VALORINICIAL, VALORVENDA, STATUS) VALUES (?,?,?,?,?,?,?)";
            try{
                PreparedStatement pstmt = con.prepareStatement(sql);
                
                pstmt.setInt(1, codProposta);
                pstmt.setInt(2, c.getCodCarro());
                pstmt.setInt(3, f.getCodFuncionario());
                pstmt.setInt(4, cli.getCodCliente());
                 pstmt.setDouble(5, valorInicial);
                pstmt.setDouble(6, valorVenda);
                pstmt.setString(7, status);
                
                
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
       if(obj instanceof Proposta){
            
            Proposta p = (Proposta)obj;
            int codProposta = p.getCodProposta();
            Carro c = p.getCarro();
            double valorInicial = p.getValorInicial();
            double valorFinal = p.getValorVenda();
            Funcionario f = p.getFuncionario();
            Cliente cli = p.getCliente();
            String status = p.getStatus();
        
            String sql = "UPDATE PROPOSTA set codProposta = ?, codCarro = ?, codCliente = ?, codFuncionario = ?, valorInicial = ?, valorVenda = ?, status = ?";
            try{
                PreparedStatement pstmt = con.prepareStatement(sql);
                
                pstmt.setInt(1, codProposta);
                pstmt.setInt(2, c.getCodCarro());
                pstmt.setInt(3, cli.getCodCliente());
                pstmt.setInt(4, f.getCodFuncionario());
                 pstmt.setDouble(5, valorInicial);
                pstmt.setDouble(6, valorFinal);
                pstmt.setString(7, status);
                
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
     public boolean editar(Object obj) {
          if(obj instanceof Proposta){
            Proposta p = (Proposta)obj;
            
            int codProposta = p.getCodProposta();
            Carro c = p.getCarro();
            double valorInicial = p.getValorInicial();
            double valorVenda = p.getValorVenda();
            Funcionario f = p.getFuncionario();
            Cliente cli = p.getCliente();
          
        
            String sql = "UPDATE PROPOSTA set codProposta = ?, codCarro = ?, codCliente = ?, codFuncionario = ?, valorInicial = ?, valorVenda = ?";
            try{
                PreparedStatement pstmt = con.prepareStatement(sql);
                
                pstmt.setInt(1, codProposta);
                pstmt.setInt(2, c.getCodCarro());
                pstmt.setInt(3, cli.getCodCliente());
                pstmt.setInt(4, f.getCodFuncionario());
                 pstmt.setDouble(5, valorInicial);
                pstmt.setDouble(6, valorVenda);
              
                
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
    public Object pesquisar(Object obj) {
        int codProposta=(int)obj;
        
        try{
            String sql = "SELECT * FROM PROPOSTA WHERE CODPROPOSTA ='"+codProposta+"'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            int codCarro = rs.getInt("codCarro");
            Carro carro = (Carro) new CarroDAO().pesquisar(codCarro);
            int codFuncionario = rs.getInt("codFuncionario");
            Funcionario funcionario = (Funcionario) new FuncionarioDAO().pesquisarInt(codFuncionario);
            int codCliente = rs.getInt("codCliente");
            Cliente cliente = (Cliente) new ClienteDAO().pesquisarInt(codCliente);
            double valorInicial = rs.getDouble("valorInicial");
            double valorVenda = rs.getDouble("valorVenda");
            String status = rs.getString("status");
            
            Proposta p = new Proposta(codProposta, carro, funcionario, cliente, valorInicial, valorVenda, status);
            return p;
            
        }catch(SQLException sqe){
           
            sqe.printStackTrace();
        }
        return null;
    }
    
  
    }
    
