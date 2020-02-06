/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author darlo
 */
public class ExemploLinkedHashSet {
    public static void main(String[] args){
        Set<Integer> sequencia = new LinkedHashSet<>();
        
        //adicionando elementos
        sequencia.add(1);
        sequencia.add(3);
        sequencia.add(5);
        sequencia.add(8);
        sequencia.add(10);
        
        System.out.println(sequencia);
        
        //remover elemento
        sequencia.remove(3);
        System.out.println(sequencia);
        
        //retorna a quantidade de elementos no set
        System.out.println("A sequencia tem " +sequencia.size()+" elementos");
        
        //Navega por todos os elementos do iterator
        Iterator iterator = sequencia.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("----------------------------------------");
        //Navegando pelos elementos do set com o for each
        for(int numero : sequencia){
            System.out.println(numero);
        }
        
        //verificando se o set esta vazio
        System.out.println("O set está vazio? : "+sequencia.isEmpty());
    }
}
