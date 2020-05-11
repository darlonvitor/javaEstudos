/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livrojavaoito;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import static java.util.Comparator.comparing;

/**
 *
 * @author darlo
 */
public class Capitulo5 {
    public static void main(String[] args){
        
        ArrayList<Usuario> usuarios = new ArrayList<>();
    
        usuarios.add(new Usuario("Timao Tenorio",120));
        usuarios.add(new Usuario("Simao Denorio",190));
        usuarios.add(new Usuario("Mario Tedorio",150));
        usuarios.add(new Usuario("Vitor Afonso",150));
        usuarios.forEach(u -> System.out.println(u.getNome()));
        
        //---------------ordenaçao com comparator--------------------------
        
        /*
        //====Forma "antiga"======
        
        Comparator<Usuario> comparator = new Comparator<Usuario>(){
            
            public int compare(Usuario u1,Usuario u2){
                return u2.getNome().compareTo(u1.getNome());
            }
        };
        
        Collections.sort(usuarios,comparator);

        //==== Com lambda 1ª forma ====
        Comparator<Usuario> comparator = (u1,u2)->u1.getNome().compareTo(u2.getNome());
        Collections.sort(usuarios,comparator);
        */
        
        //==== Com lambda 2ª forma ====
        //por nome
        Collections.sort(usuarios,(u1,u2)->u1.getNome().compareTo(u2.getNome()));
        System.out.println(usuarios);
        
        //por pontuaçao
        Collections.sort(usuarios,(u1,u2)->u1.getPontos()-u2.getPontos());
        System.out.println(usuarios);
        
        //com o ArrayList.sort()
        //usuarios.sort((u1,u2) ->  u2.getPontos() - u1.getPontos());
        //System.out.println(usuarios);
        
        usuarios.sort(Comparator.comparingInt(u ->  u.getPontos()));
        System.out.println(usuarios);
        
        usuarios.sort(comparing(u->u.getNome()));
        System.out.println(usuarios);
        //versao equivalente
        usuarios.sort(comparing(Usuario::getNome));
        System.out.println(usuarios);
        
        //comparando pela pontuaçao e em caso de empate verificar o nome
        usuarios.sort(comparing(Usuario::getPontos).thenComparing(Usuario::getNome));
        System.out.println(usuarios);
        
        //comparando pela pontuaçao e em caso de empate verificar o nome
        usuarios.sort(comparing(Usuario::getPontos).thenComparing(Usuario::getNome).reversed());
        System.out.println(usuarios);
    }
}
