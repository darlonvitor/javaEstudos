/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livrojavaoito;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 *
 * @author darlo
 */
public class Capitulo6 {
    public static void main(String[] args) {
        Usuario renato = new Usuario("Renato Figueiredo",130);
        
        //Criando method reference com runnable
        Runnable bloc = renato::tornarModerador;
        
        //Criando method reference com Consumer
        Consumer<Usuario> consumer = Usuario::tornarModerador;
        
        System.out.println("Sem o method reference: " + renato.isModerador());
        //bloc.run();
        //System.out.println("Com o Runnable: " + renato.isModerador());
        consumer.accept(renato);
        System.out.println("Com o Consumer:: " + renato.isModerador());
        
        ArrayList<Usuario> usuarios = new ArrayList<>();
    
        usuarios.add(new Usuario("Timao Tenorio",120));
        usuarios.add(new Usuario("Simao Denorio",190));
        usuarios.add(new Usuario("Mario Tedorio",150));
        usuarios.add(new Usuario("Vitor Afonso",150));
        usuarios.forEach(System.out::println);
    }
}
