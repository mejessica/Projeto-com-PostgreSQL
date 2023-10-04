
import dao.PropostaDAO;
import model.Carro;
import model.Cliente;
import model.Funcionario;
import model.Proposta;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author G-Fire
 */
public class TestaInserirProposta {
    
    public static void main(String[] args) { 
        
        Cliente cli = new Cliente (112, "Piti Malvado", "92751401031","12/12/1965", 978523464, "almedas oliveira, 31, sao contin, sp", "maverickforte@gmail.com", "ativo");
        Carro car = new Carro("gol", "quadrado" ,9800, 2001, 98);
        Funcionario f = new Funcionario("shrek", 12 , "78896783046", "08/07/1997", "lalalu", "cadefiona", 6000, 30, "inativo");
         
        Proposta p = new Proposta(315, car, f, cli, 97990, 95000, "ativo");
        new PropostaDAO().inserir(p);
        System.out.println(p);
    }
}
