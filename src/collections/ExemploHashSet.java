/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author darlo
 */
public class ExemploHashSet {
    
    public static void main(String[] args){
        Set<Double> notas = new HashSet<>();
    
        //adicionando notas no set
        notas.add(6.7);
        notas.add(4.3);
        notas.add(8.5);
        notas.add(5.2);
        notas.add(6.4);
        notas.add(2.9);
        notas.add(3.1);
        
        System.out.println(notas);
        
        //eliminando elemento
        notas.remove(6.4);
        System.out.println(notas);
        
        System.out.println("Existem " + notas.size() + " notas cadastradas.");
        
        //Navegando em todos os itens do Iterator
        Iterator iterator =  notas.iterator();
        
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("-------------------------------------");
        //Navegando pelos elementos com o foreach
        for(double nota:notas){
            System.out.println(nota);
        }
        
        //limpando set
        notas.clear();
        
        System.out.println("O banco de notas está vazio? : "+notas.isEmpty());
    }

}
