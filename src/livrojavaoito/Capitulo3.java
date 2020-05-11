/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livrojavaoito;

/**
 *
 * @author darlo
 */
public class Capitulo3 {
    public static void main(String[] args){
        //funçao lambda que corresponde à chamada de uma classe anonima que implementa a interface funcional Validador
        Validador<String> validaCEP = valor -> valor.matches("[0-9]{5}-[0-9]{3}");
        Validador<String> validaCPF = v -> v.matches("[0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2}");
        
        System.out.println("CEP valido: " + validaCEP.valida("63190-000"));
        System.out.println("CPF valido: " + validaCPF.valida("062.965.823-90"));
        
        
        Runnable r = ()->System.out.println("Ola mundo!");
        System.out.println(r + "\n" + r.getClass() );
    }
    
    
}
