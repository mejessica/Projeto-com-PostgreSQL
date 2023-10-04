package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.*;
import persist.Conexao;

public class FuncionarioDAO implements OperacoesDAO {
    
    private static final Connection con = Conexao.getConexao();

    @Override
    public boolean inserir(Object obj) {
        if (obj instanceof Funcionario){
            Funcionario f = (Funcionario)obj;
            String nome = f.getNome();
            int codFuncionario = f.getCodFuncionario();
            String cpf = f.getCpf();
            String dataNascimento = f.getDataNascimento();
            String login = f.getLogin();
            String senha = f.getSenha();
            double salario = f.getSalario();
            int cargaHoraria = f.getCargaHoraria();
            String status = f.getStatus();
            
            String sql = "INSERT INTO FUNCIONARIO (NOME, CODFUNCIONARIO, CPF, DATANASCIMENTO, LOGIN, SENHA, SALARIO, CARGAHORARIA, STATUS) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
            try {
                 PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, nome);
                pstmt.setInt(2, codFuncionario);
                pstmt.setString(3, cpf);
                pstmt.setString(4, dataNascimento);
                pstmt.setString(5, login);
                pstmt.setString(6, senha);
                pstmt.setDouble(7, salario);
                pstmt.setInt(8, cargaHoraria);
                pstmt.setString(9, status);
                
                int res = pstmt.executeUpdate();
                if (res == 1){
                    return true;
                }
            } catch (SQLException ex){
                System.out.println(ex);
            }
        } return false;
    }

    @Override
    public boolean excluir(Object obj) {
        if (obj instanceof Funcionario){
            Funcionario f = (Funcionario)obj;
            String nome = f.getNome();
            int codFuncionario = f.getCodFuncionario();
            String cpf = f.getCpf();
            String dataNascimento = f.getDataNascimento();
            String login = f.getLogin();
            String senha = f.getSenha();
            double salario = f.getSalario();
            int cargaHoraria = f.getCargaHoraria();
            String status = f.getStatus();
            
            String sql="UPDATE FUNCIONARIO set nome = ?, cpf = ?, dataNascimento = ?, login = ?, senha = ?, salario = ?, cargaHoraria = ?, STATUS = ? where codFuncionario = ?";
            
            try {
                 PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, nome);
                pstmt.setString(2, cpf);
                pstmt.setString(3, dataNascimento);
                pstmt.setString(4, login);
                pstmt.setString(5, senha);
                pstmt.setDouble(6, salario);
                pstmt.setInt(7, cargaHoraria);
                pstmt.setString(8, status);
                pstmt.setInt(9, codFuncionario);
                
                int res = pstmt.executeUpdate();
                
                if (res == 1){
                    return true;
                }
            } catch (SQLException ex){
                System.out.println(ex);
            }
        } return false;
    }
    
    @Override
   public boolean editar(Object obj) {
        if (obj instanceof Funcionario){
            Funcionario f = (Funcionario)obj;
            String nome = f.getNome();
            int codFuncionario = f.getCodFuncionario();
            String cpf = f.getCpf();
            String dataNascimento = f.getDataNascimento();
            String login = f.getLogin();
            String senha = f.getSenha();
            double salario = f.getSalario();
            int cargaHoraria = f.getCargaHoraria();
            
            String sql="UPDATE FUNCIONARIO set nome = ?, cpf = ?, dataNascimento = ?, login = ?, senha = ?, salario = ?, cargaHoraria = ? where codFuncionario = ?";
            
            try {
                 PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, nome);
                pstmt.setString(2, cpf);
                pstmt.setString(3, dataNascimento);
                pstmt.setString(4, login);
                pstmt.setString(5, senha);
                pstmt.setDouble(6, salario);
                pstmt.setInt(7, cargaHoraria);
                pstmt.setInt(8, codFuncionario);
                int res = pstmt.executeUpdate();
                if (res == 1){
                    return true;
                }
            } catch (SQLException ex){
                System.out.println(ex);
            }
        } return false;
    }


    @Override
    public Object pesquisar(Object obj) {
        
        String cpf = (String)obj;
        
        try {
        String sql = "SELECT * FROM FUNCIONARIO WHERE CPF='"+cpf+"'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        int codFuncionario = rs.getInt("codFuncionario");
        String nome = rs.getString("nome");
        String dataNascimento = rs.getString("dataNascimento");
        String login = rs.getString("login");
        String senha = rs.getString("senha");
        double salario = rs.getDouble("salario");
        int cargaHoraria = rs.getInt("cargaHoraria");
        String status = rs.getString("status");
        Funcionario f = new Funcionario(nome, codFuncionario, cpf, dataNascimento, login, senha, salario, cargaHoraria, status);
        return f;
          }catch (SQLException sqe) {
             sqe.printStackTrace();
        }
        return null;
    }
    
    public Object pesquisarInt(Object obj) {
        
        int codFuncionario = (int)obj;
        
        try {
        String sql = "SELECT * FROM FUNCIONARIO WHERE CODFUNCIONARIO='"+codFuncionario+"'";
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        rs.next();
        String cpf = rs.getString("cpf");
        String nome = rs.getString("nome");
        String dataNascimento = rs.getString("dataNascimento");
        String login = rs.getString("login");
        String senha = rs.getString("senha");
        double salario = rs.getDouble("salario");
        int cargaHoraria = rs.getInt("cargaHoraria");
        String status = rs.getString("status");
        Funcionario f = new Funcionario(nome, codFuncionario, cpf, dataNascimento, login, senha, salario, cargaHoraria, status);
        return f;
          }catch (SQLException sqe) {
             sqe.printStackTrace();
        }
        return null;
    }
    
     
    }

  
    

