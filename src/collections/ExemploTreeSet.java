/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.TreeSet;

/**
 *
 * @author darlo
 */
public class ExemploTreeSet {
    
    public static void main(String[] args){
        TreeSet<String> capitais = new TreeSet<>();
        
        capitais.add("Fortaleza");
        capitais.add("Salvador");
        capitais.add("Belem");
        capitais.add("Sao Paulo");
        capitais.add("Macapa");
        capitais.add("Natal");
        
        System.out.println(capitais);
        
        //retorna o primeiro elemento no topo da arvore
        System.out.println(capitais.first());
        
        //retorna o elemento no final da arvore
        System.out.println(capitais.last());
        
        //retorna o primeiro elemento acima do elemento parametrizado
        System.out.println(capitais.higher("Belem"));
        
        //retorna o primeiro elemento abaixo do elemento parametrizado
        System.out.println(capitais.lower("Sao Paulo"));
        
        //retorna primeiro elemento do topo da arvore, removendo do set
        System.out.println(capitais.pollFirst());
        
         //retorna ultimo elemento do fim da arvore, removendo do set
        System.out.println(capitais.pollLast());
        
        System.out.println(capitais);
        
        //Iterator e for each funcionam como nos demais
    }
    
}
