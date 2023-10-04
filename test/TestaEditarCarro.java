
import dao.CarroDAO;
import model.Carro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author G-Fire
 */
public class TestaEditarCarro {
    public static void main(String[] args) {

        Carro car98 = new Carro("gol", "quadrado" ,8000, 2001, 98);
        new CarroDAO().editar(car98);
        System.out.println(car98);
        
    }
}
