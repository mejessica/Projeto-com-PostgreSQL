

import dao.FuncionarioDAO;
import model.Funcionario;


public class TestaExcluirFuncionario{
    public static void main(String[] args) {
        
     FuncionarioDAO f1 = new FuncionarioDAO();
     Funcionario f = (Funcionario) f1.pesquisar("78896783046");
     f.setStatus("inativo");
        System.out.println(f);
        
    }
      
        
}
