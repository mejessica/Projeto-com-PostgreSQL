
import dao.ClienteDAO;
import model.Cliente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 08050451
 */
public class TestaPesquisarCliente {
    public static void main(String[] args) {
           ClienteDAO cdao = new ClienteDAO();       
        Cliente c = (Cliente) cdao.pesquisar("92751401031");
        System.out.println("Dados no banco = "+c);
    }
}
