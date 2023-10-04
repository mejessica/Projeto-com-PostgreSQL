
import dao.view.RelatorioClienteDAO;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mk
 */
public class TestaEmitirRelatorio {
    
    public static void main(String[] args) {
        ArrayList dados = RelatorioClienteDAO.emitirRelatorio();
        Iterator it = dados.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }
}

