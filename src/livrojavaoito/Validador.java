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

//interface funcional para validar dados

@FunctionalInterface
public interface Validador<T>{
    boolean valida(T t);
    //boolean outroMetodo(T t);
}
