
import dao.FuncionarioDAO;
import model.Funcionario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 08050451
 */
public class TestaPesquisarFuncionario {
    public static void main(String[] args) {
         FuncionarioDAO fdao= new FuncionarioDAO();
        Funcionario f= (Funcionario) fdao.pesquisar("78896783046");
        System.out.println("Dados no banco = " +f);
    }
}
