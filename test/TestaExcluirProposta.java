
import dao.PropostaDAO;
import model.Proposta;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 08050451
 */
public class TestaExcluirProposta {
    
    public static void main(String[] args) {
         
        PropostaDAO pdao = new PropostaDAO();
        Proposta p = (Proposta) pdao.pesquisar(315);
        p.setStatus("inativo");
        System.out.println("Dados no banco = "+p);
        
        
        
    }
}
