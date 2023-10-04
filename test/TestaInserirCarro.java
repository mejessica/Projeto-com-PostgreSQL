
import dao.CarroDAO;
import model.Carro;

/**
 *
 * @author 08050451
 */
public class TestaInserirCarro {
    
    public static void main(String[] args){
        
    
        Carro car98 = new Carro("gol", "quadrado" ,9800, 2001, 98);
        new CarroDAO(). inserir(car98);
        System.out.println(car98);
        
        
    }
    
}
