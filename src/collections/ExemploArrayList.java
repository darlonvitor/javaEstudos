/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;
import java.util.ArrayList;
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
        nomes.add("joao");
        nomes.add("Pedro");
        nomes.add("Sandra");
        nomes.add("Maria");
        
        System.out.println(nomes);
    }
}
