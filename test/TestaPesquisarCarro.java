

import dao.CarroDAO;

import model.Carro;


/**
 *
 * @author 08050451
 */
public class TestaPesquisarCarro {
    
    public static void main(String[] args) {
        
        CarroDAO cardao= new CarroDAO();
        Carro car = (Carro) cardao.pesquisar(98);
        System.out.println("Dados no banco = " +car);
  
        
    }
}
