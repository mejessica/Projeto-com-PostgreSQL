package dao.view;

import persist.*;
import java.sql.*;
import java.util.ArrayList;

public class RelatorioClienteDAO {
    
    public static ArrayList emitirRelatorio() {
        Connection con = Conexao.getConexao();
        ArrayList lista = new ArrayList();
        try {
            String sql = "SELECT * FROM cliente_compras";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                DadosViewTO dvt = new DadosViewTO();
                dvt.setCodCliente(rs.getInt("codCliente"));
                dvt.setNome(rs.getString("nome"));
                dvt.setCodVenda(rs.getInt("compras"));
                dvt.setValorVenda(rs.getFloat("valorVenda"));
                
                lista.add(dvt);
            }
            return lista;
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return null;
    }
    
}

