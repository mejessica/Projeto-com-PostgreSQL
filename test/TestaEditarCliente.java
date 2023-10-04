
import dao.ClienteDAO;
import model.Cliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author G-Fire
 */
public class TestaEditarCliente {
    public static void main(String[] args) {
    
  
    Cliente cli = new Cliente ( 112, "Piti Malvado", "92751401031","12/12/1965", 978523464, "mariposa viva", "maverickforte@gmail.com");
    

    new ClienteDAO().editar(cli);
        System.out.println(cli);
 }    

}
