package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Carro;
import persist.Conexao;


public class CarroDAO implements OperacoesDAO{
    

    static final Connection con = Conexao.getConexao();
    
    @Override
    public boolean inserir(Object obj) {
        if (obj instanceof Carro){
            Carro car = (Carro) obj;
            int codCarro = car.getCodCarro();
            String modelo = car.getModelo();
            String marca = car.getMarca();
            double valor = car.getValor();
            int anoFabricacao = car.getAnoFabricacao();
        
            String sql = "INSERT INTO CARRO (CODCARRO, MODELO, MARCA, VALOR, ANOFABRICACAO) VALUES (?,?,?,?,?)";
            try{
                PreparedStatement pstmt = con.prepareStatement(sql);
               
                pstmt.setInt(1, codCarro);
                pstmt.setString(2, modelo);
                pstmt.setString(3, marca);
                pstmt.setDouble(4, valor);
                pstmt.setInt(5, anoFabricacao);
               
                
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
      
         int codCarro = (int) obj;
         String sql = "DELETE FROM CARRO WHERE CODCARRO='"+codCarro+"'";
          System.out.println("sql = "+sql);
          try{
              Statement stmt = con.createStatement();
              stmt.executeUpdate(sql);
              return true;
          }catch(SQLException ex){
              System.out.println(ex);
          }
          return false;
      } 
       


    @Override
    public boolean editar(Object O) {
        if (O instanceof Carro){
            Carro car = (Carro) O;
            String modelo = car.getModelo();
            String marca = car.getMarca();
            double valor = car.getValor();
            int anoFabricacao = car.getAnoFabricacao();
            int codCarro = car.getCodCarro();
        
            String sql = "UPDATE CARRO set modelo = ?, marca = ?, valor = ?, anoFabricacao = ? where codcarro = ?";
            try{
                PreparedStatement pstmt = con.prepareStatement(sql);
               
                pstmt.setString(1, modelo);
                pstmt.setString(2, marca);
                pstmt.setDouble(3, valor);
                pstmt.setInt(4, anoFabricacao);
                pstmt.setInt(5, codCarro);
                
                int res = pstmt.executeUpdate();
                if(res==1){
                    return true;
                }
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        } 
        return false;
    }


    @Override
    public Object pesquisar(Object obj) {
        int codCarro =(int)obj;
        try{
            String sql = "SELECT * FROM CARRO WHERE CODCARRO ='"+codCarro+"'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            String marca = rs.getString("marca");
            String modelo = rs.getString("modelo");
            int anoFabricacao= rs.getInt("anoFabricacao");
            double valor = rs.getDouble("valor");
            Carro car = new Carro(marca, modelo, valor, anoFabricacao, codCarro);
            return car;
            
        }catch(SQLException sqe){
            sqe.printStackTrace();
        }
        return null;
    }
    
    
}
