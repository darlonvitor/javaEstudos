/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.function.Function;

/**
 *
 * @author darlo
 */
public class InterfaceFunction {
    public static void main(String[] args) {
        Function<String,String> retornaNomeAoContrario = nome -> new StringBuilder(nome).reverse().toString();
        
        System.out.println(retornaNomeAoContrario.apply("Darlon"));
    }
}
