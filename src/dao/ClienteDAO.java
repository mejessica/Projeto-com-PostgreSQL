package dao;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import model.*;
import persist.Conexao;


public class ClienteDAO implements OperacoesDAO{

    public static Connection con = Conexao.getConexao();
    
    
    @Override
    public boolean inserir(Object obj) {
    if (obj instanceof Cliente) {
        Cliente cli = (Cliente)obj; 
        int codCliente = cli.getCodCliente();
        String nome = cli.getNome();
        String cpf = cli.getCpf();
        String dataNascimento = cli.getDataNascimento();
        int telefone = cli.getTelefone();
        String endereco = cli.getEndereco();
        String email = cli.getEmail();
        String status = cli.getStatus();
        
    String sql = "INSERT INTO CLIENTE (CODCLIENTE, NOME, CPF, DATANASCIMENTO, TELEFONE, ENDERECO, EMAIL, STATUS) VALUES (?,?,?,?,?,?,?,?)";
    try {
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, codCliente);
        pstmt.setString(2, nome);
        pstmt.setString(3, cpf);
        pstmt.setString(4, dataNascimento);
        pstmt.setInt(5, telefone);
        pstmt.setString(6, endereco);
        pstmt.setString(7, email);
        pstmt.setString(8, status);
            int res = pstmt.executeUpdate();
                if (res == 1) {
                    return true;
                }
            } catch (SQLException ex){
                System.out.println(ex);
            }
    }
     return false;
    }


    @Override
    public boolean excluir(Object obj) {
        if (obj instanceof Cliente) {
        Cliente cli = (Cliente)obj; 
        int codCliente = cli.getCodCliente();
        String nome = cli.getNome();
        String cpf = cli.getCpf();
        String dataNascimento = cli.getDataNascimento();
        int telefone = cli.getTelefone();
        String endereco = cli.getEndereco();
        String email = cli.getEmail();
        String status = cli.getStatus();
      
        
    String sql = "UPDATE CLIENTE set NOME = ?, CPF = ?, DATANASCIMENTO = ?, TELEFONE = ?, ENDERECO = ?, EMAIL = ?, STATUS= ? WHERE codcliente = ?";
    try {
        PreparedStatement pstmt = con.prepareStatement(sql);
        
        pstmt.setString(1, nome);
        pstmt.setString(2, cpf);
        pstmt.setString(3, dataNascimento);
        pstmt.setInt(4, telefone);
        pstmt.setString(5, endereco);
        pstmt.setString(6, email);
        pstmt.setString(7, status);
        pstmt.setInt(8, codCliente);
            int res = pstmt.executeUpdate();
                if (res == 1) {
                    return true;
                }
            } catch (SQLException ex){
                System.out.println(ex);
            }
    }
     return false;
     
    }

    @Override
    public boolean editar(Object obj) {
        if (obj instanceof Cliente) {
        Cliente cli = (Cliente)obj; 
        int codCliente = cli.getCodCliente();
        String nome = cli.getNome();
        String cpf = cli.getCpf();
        String dataNascimento = cli.getDataNascimento();
        int telefone = cli.getTelefone();
        String endereco = cli.getEndereco();
        String email = cli.getEmail();
        
    String sql = "UPDATE CLIENTE set NOME = ?, CPF = ?, DATANASCIMENTO = ?, TELEFONE = ?, ENDERECO = ?, EMAIL = ? WHERE CODCLIENTE =  ?";
    try {
        PreparedStatement pstmt = con.prepareStatement(sql);
       
        pstmt.setString(1, nome);
        pstmt.setString(2, cpf);
        pstmt.setString(3, dataNascimento);
        pstmt.setInt(4, telefone);
        pstmt.setString(5, endereco);
        pstmt.setString(6, email);
         pstmt.setInt(7, codCliente);
         
            int res = pstmt.executeUpdate();
                if (res == 1) {
                    return true;
                }
            } catch (SQLException ex){
                System.out.println(ex);
            }
    }
     return false;
    }
    

    public Object pesquisarTudo(){
        ArrayList lista = new ArrayList();
        String sql ="SELECT * FROM CLIENTE ";
        try{
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
              
                String nome = rs.getString("nome");
                  int codCliente = rs.getInt("codcliente");
                String cpf = rs.getString("cpf");
                  String dataNascimento = rs.getString("dataNascimento");
                int telefone = rs.getInt("telefone");
                String endereco = rs.getString("endereco");
                String email = rs.getString("email");
                String status = rs.getString("status");
                lista.add(new Cliente( codCliente, nome, cpf,dataNascimento,telefone, endereco, email, status));
                
            }
        }catch(SQLException ex){
            System.out.println(ex);
        }
          return false;
    }
   
    @Override
    public Object pesquisar(Object obj) {
        String cpf = (String)obj;
        try{
            String sql ="SELECT * FROM CLIENTE WHERE CPF='"+cpf+"'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            int codcliente = rs.getInt("codcliente");
            String nome = rs.getString("nome");
            String dataNascimento = rs.getString("dataNascimento");
            int telefone = rs.getInt("telefone");
            String endereco = rs.getString("endereco");
            String email = rs.getString("email");
            String status = rs.getString("status");
            
            Cliente c = new Cliente(codcliente, nome, cpf,dataNascimento,telefone, endereco, email, status);
            return c;
        }catch(SQLException sqe){
            sqe.printStackTrace();
        }
          return null;
    }
      
   
    public Object pesquisarInt(Object obj) {
        int codCliente = (int)obj;
        try{
            String sql ="SELECT * FROM CLIENTE WHERE CODCLIENTE='"+codCliente+"'";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            String cpf = rs.getString("cpf");
            String nome = rs.getString("nome");
            String dataNascimento = rs.getString("dataNascimento");
            int telefone = rs.getInt("telefone");
            String endereco = rs.getString("endereco");
            String email = rs.getString("email");
            String status = rs.getString("status");
            
            Cliente c = new Cliente( codCliente,nome, cpf, dataNascimento, telefone, endereco, email, status);
            return c;
        }catch(SQLException sqe){
            sqe.printStackTrace();
        }
          return null;
    }
      
}
