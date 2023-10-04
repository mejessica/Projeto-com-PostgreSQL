
import dao.VendaDAO;
import model.Venda;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 08050451
 */
public class TestaPesquisarVenda {
    public static void main(String[] args) {
        
        VendaDAO vdao = new VendaDAO();
        Venda v= (Venda) vdao.pesquisar(212);
        System.out.println("Encontrado = "+v);
    }
}
