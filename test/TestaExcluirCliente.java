
import dao.ClienteDAO;
import model.Cliente;


public class TestaExcluirCliente {
    public static void main(String[] args) {
       
    ClienteDAO cli = new ClienteDAO();
     Cliente c = (Cliente) cli.pesquisar("92751401031");
     c.setStatus("inativo");
        System.out.println(c);
    }
}
