package controle;

import java.util.HashMap;

public class Processador {

    private static final HashMap comandos = new HashMap();
    static {
        comandos.put("0", "view.InterfacePrincipal");
        comandos.put("1", "view.InterfaceCadastrarPessoa");
        comandos.put("2", "view.InterfaceCadastrarDadosDeSaude");
        comandos.put("3", "view.VerHistorico");
    }
    
    public static void direcionar(String cmd) {
        String actionClass = (String) comandos.get(cmd);
        //Cria a instância da classe utilizando introspecção
        
        try {
            Class classe = Class.forName(actionClass);
            Comando comando = (Comando) classe.newInstance();
            comando.executar();

        } catch (ClassNotFoundException ex) {
            System.out.println(ex);

        } catch (InstantiationException iex) {
            System.out.println(iex);

        } catch (IllegalAccessException iaex) {
            System.out.println(iaex);

        }
    }
}
