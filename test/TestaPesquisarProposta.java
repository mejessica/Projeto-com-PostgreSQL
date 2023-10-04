
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
public class TestaPesquisarProposta {
    public static void main(String[] args) {
           
        PropostaDAO pdao = new PropostaDAO();
        Proposta p = (Proposta) pdao.pesquisar(315);
        System.out.println("Encontrado = "+p);
        
    }
}
