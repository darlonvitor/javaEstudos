/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author darlo
 */
public class TesteAltera {
    public static void main(String[] args) {
        ContatoDAO dao = new ContatoDAO();
        Contato update = new Contato();
        
        update.setId(new Long(3));
        update.setNome("Antonio Darlon Vitor dos Santos");
        update.setEndereco("Rua aparecida,161,Boa Vista");
        
        Calendar tmp = Calendar.getInstance();
        tmp.set(1994,Calendar.AUGUST,2);
        update.setDataNascimento(tmp);
        
        dao.altera(update);
        System.out.println("Alteraçao realizada com sucesso !");
    }
}
