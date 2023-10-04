
import dao.FuncionarioDAO;
import model.Funcionario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author G-Fire
 */
public class TestaInserirFuncionario {
    public static void main(String[] args) {
        
        Funcionario f = new Funcionario("shrek", 12 , "78896783046", "08/07/1997", "lalalu", "cadefiona", 6000, 30, "inativo");
        new FuncionarioDAO(). inserir(f);
        System.out.println(f);
    }
   
}
