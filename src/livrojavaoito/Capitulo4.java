/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livrojavaoito;

/**
 *
 * @author darlo
 */

import java.util.ArrayList;
import java.util.function.Consumer;

public class Capitulo4 {
    
    public static void main(String[] args){
        ArrayList<Usuario> usuarios = new ArrayList<>();
    
        usuarios.add(new Usuario("Timao Tenorio",120));
        usuarios.add(new Usuario("Simao Denorio",190));
        usuarios.add(new Usuario("Mario Tedorio",150));
        
        //criando consumers para utilização em sequencia
        Consumer<Usuario> mostraMensagem = u -> System.out.println("Antes de imprimir");
        Consumer<Usuario> imprimeNome = u ->System.out.println(u.getNome());
        
        usuarios.forEach(mostraMensagem.andThen(imprimeNome));
        
        //removendo usuarios com pontuaçao maior que 160
        usuarios.removeIf(u->u.getPontos()>160);
        System.out.println("-------------------------------");
        usuarios.forEach(u -> System.out.println(u.getNome()));
    }
   
}
