
import model.Cliente;
import dao.ClienteDAO;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author G-Fire
 */
public class TestaInserirCliente {
  
    public static void main(String[] args) {
        
       Cliente c = new Cliente ( 112, "Piti Malvado", "92751401031","12/12/1965", 978523464, "almedas oliveira, 31, sao contin, sp", "maverickforte@gmail.com", "ativo");
       new ClienteDAO(). inserir(c);
       System.out.println(c);
       
    }
     
      
}
