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

import java.util.Optional;
public class OptionalExemplo {
    public static void main(String[] args){
        //primeira forma de inicializaçao de um Optional
        Optional<String> optional = Optional.of("Valor presente");
        
        System.out.println("Valor opcional que está presente:");
        
        //se o valor estiver presente o primeiro argumento será executado, senão o segundo argumento o será
        //a expressao do primeiro argumento pode ser reescrita como:
        //------>       '(valor)->System.out.println(valor)'
        optional.ifPresentOrElse(System.out::println,()->System.out.println("O valor não está presente."));
        
        //Segunda forma de inicializaçao de um Optional
        System.out.println("Valor opcional que não está presente:");
        Optional<String> optionalNull = Optional.ofNullable(null);
        optionalNull.ifPresentOrElse(System.out::println,()->System.out.println("null == não está presente."));
        
        //terceiro metodo de criaçao de um Optinal
        System.out.println("Valor opcional que não está presente:");
        Optional<String> emptyOptional = Optional.empty();
        emptyOptional.ifPresentOrElse(System.out::println,()->System.out.println("empty === não está presente."));
        
        System.out.println("##############################################");
        System.out.println("O valor está presente: " + optional.isPresent());
        System.out.println("O valor está presente: " + optionalNull.isEmpty());
        System.out.println("O valor está presente: " + emptyOptional.isPresent());
        
        //Obtendo o valor caso ele exista
        if(optional.isPresent()){
            String s = optional.get();
            System.out.println(s);
        }
        //usando mapping
        optional.map((valor)->valor.concat(" és tu?")).ifPresent(System.out::println);
        
        //lança uma exceçao caso o valor nao esteja presente
        optional.orElseThrow(IllegalStateException::new);
    }
}
