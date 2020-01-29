/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author darlo
 */
public class ExemploArrayList {
    public static void main(String[] args){
        //instanciando ArrayList
        List<String> nomes = new ArrayList<>();
        
        //adicionando elementos
        nomes.add("Joao");
        nomes.add("Pedro");
        nomes.add("Sandra");
        nomes.add("Maria");
        nomes.add("Josefa");
        nomes.add("Nerculina");
        
        System.out.println(nomes);
        
        //modificando elemento
        nomes.set(2,"Larissa");
        System.out.println(nomes);
        
        //ordenando com Collection
        Collections.sort(nomes);
        System.out.println(nomes);
        
        //removendo elemento por indice
        //nomes.remove(1);
        
        //removendo elemento com objeto
        nomes.remove("Pedro");
        System.out.println(nomes);
        
        //tamanho da lista
        int tamanho = nomes.size();
        System.out.println(tamanho);
        
        //obtendo elemento pelo seu indice
        String pessoa = nomes.get(2);
        System.out.println(pessoa);
        
        //verificando se a lista contem determinado elemento 
        boolean contem = nomes.contains("José");
        System.out.println(contem);
        
        //Verificando se a lista está vazia
        String msg = (nomes.isEmpty()) ? "A lista está vazia" : "A lista não está vazia.";
        System.out.println(msg);
        
        //Obtendo indice de um elemento
        int posicao = nomes.indexOf("Joao");
        System.out.println(nomes.get(posicao) + " está na posição " + posicao);
        
        /*
        //Esvaziando lista
        nomes.clear();
        msg = (nomes.isEmpty()) ? "A lista está vazia" : "A lista não está vazia.";
        System.out.println(msg);
        */
        
        //---------------- Navegação ----------------//
        
        //foreach
        
        for(String nomeItem: nomes){
            System.out.println("-->"+nomeItem);
        }
        
        //utilizando iterator
        Iterator<String> iterator = nomes.iterator();
        //iterator.hasNext retorna true se houver um proximo elemento
        //iterator.next() retorna o prox objeto
        
        while(iterator.hasNext()){
            System.out.println("==>"+iterator.next());
        }
        
        
        
    }
}
