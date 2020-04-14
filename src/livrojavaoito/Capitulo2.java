/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livrojavaoito;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author darlo
 */
public class Capitulo2 {
    public static void main(String[] args){
        List<Usuario> usuarios = new ArrayList<>();
        
        usuarios.add(new Usuario("Tomas Silveira",150));
        usuarios.add(new Usuario("Rodrigo Turini",120));
        usuarios.add(new Usuario("Guilherme Silveira",190));
        
        /*
        for(Usuario u:usuarios){
            System.out.println(u.getNome());
        }
        */
        
        //utilizando o metodo forEach do ArrayList aplicando um Consumer
        
        //usando classe externa
        Mostrador mostrador = new Mostrador();
        usuarios.forEach(mostrador);
        
        System.out.println("-------------------------------------------------");
        //usando classe anonima
        usuarios.forEach(new Consumer<Usuario>(){
            @Override
            public void accept(Usuario u){
                System.out.println(u.getNome());
            }
        });
        
        //usando lambda function
        usuarios.forEach((Usuario u) -> System.out.println(u.getNome()));
        
    }
}
