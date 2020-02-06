/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author darlo
 */
public class ExemploQueue {
    public static void main(String[] args){
        Queue<String> filaBanco = new LinkedList();
        
        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");
        
        System.out.println(filaBanco);
        
        //recuperando elemento com poll
        //retorna null se a lista estiver vazio
        String atendimento = filaBanco.poll();
        System.out.println(atendimento + " está sendo atendido(a)");
        
        //obtendo proximo elemento com peek, tambem retorna null se a lista estiver vazia
        String proximoCliente = filaBanco.peek();
        System.out.println("O próximo cliente será " + proximoCliente);
        System.out.println(filaBanco);
        
         //obtendo proximo elemento com element, dispara uma exceçao se a lista estiver vazia
        proximoCliente = filaBanco.element();
        System.out.println("O próximo cliente será " + proximoCliente);
        System.out.println(filaBanco);
        
        //foreach
        
        for(String cliente : filaBanco){
            System.out.println(cliente);
        }
        
        //iterator
        Iterator iterator = filaBanco.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        //tamanho
        System.out.println(filaBanco.size());
        System.out.println(filaBanco.isEmpty());
    }
}
