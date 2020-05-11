/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author darlo
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ExemploComparators {
     public static void main(String[] args){
         ArrayList<Estudante> classe = new ArrayList<>();
         
         classe.add(new Estudante("Maria",12));
         classe.add(new Estudante("João",11));
         classe.add(new Estudante("Michael",13));
         classe.add(new Estudante("Marcos",12));
         classe.add(new Estudante("Larissa",11));
         classe.add(new Estudante("Pedor",13));
         classe.add(new Estudante("Roberta",13));
              
         System.out.println("----------Ordem de inserção----------");
         System.out.println(classe);
         
         //cenario de ordenaçao com uma função de ordenaçao simples
         classe.sort((first,second)->first.getAge()-second.getAge());
         System.out.println("----------Ordem crescente de idade----------");
         System.out.println(classe);
         
         classe.sort((first,second)-> second.getAge()-first.getAge());
         System.out.println("----------Ordem decrescente de idade----------");
         System.out.println(classe);
         
         //sort utilizando metodos nativos do Comparator
         classe.sort(Comparator.comparingInt(Estudante::getAge));
         System.out.println("----------Ordem crescente de idade (Method Reference)----------");
         System.out.println(classe);
         
         classe.sort(Comparator.comparingInt(Estudante::getAge).reversed());
         System.out.println("----------Ordem decrescente de idade (Method Reference)----------");
         System.out.println(classe);
         
         //Utilizando a interface comparable
         Collections.sort(classe);
         System.out.println("----------Ordem crescente de idade (Interface Comparable)----------");
         System.out.println(classe);
         
         //Utilizando a interface comparable
         Collections.sort(classe,new EstudanteOrdemInversa());
         System.out.println("----------Ordem decrescente de idade (Interface Comparator)----------");
         System.out.println(classe);
     }
}
