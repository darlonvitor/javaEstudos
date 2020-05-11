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

import java.util.Comparator;

public class EstudanteOrdemInversa implements Comparator<Estudante> {

    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o2.getAge() - o1.getAge();//retorna a ordem decrescente da idade
    }
    
}
