/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author darlo
 */
public class TesteInsere {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //Preparando usuario para gravar
        Contato c = new Contato();
        String resposta;
        
        System.out.println("Qual o seu nome?");
        resposta = teclado.nextLine();
        c.setNome(resposta);
                
        System.out.println("Seu endereço:");
        resposta = teclado.nextLine();
        c.setEndereco(resposta);
        
        //configurando data
        Calendar aux = Calendar.getInstance();
        aux.set(1994, Calendar.AUGUST, 2);
        c.setDataNascimento(aux);
        
        //grave os dados nessa ocnexao
        ContatoDAO dao = new ContatoDAO();
        
        //metodo eleganto
        dao.adiciona(c);
        
        System.out.println("Seus dados foram salvos com sucesso!");
    }
}
