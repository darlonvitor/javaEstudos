/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaestudos;

import heranca.*;


/**
 *
 * @author darlo
 */
public class JavaEstudos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ControleBonificacoes cb = new ControleBonificacoes();
        
        //Funcionario f = new Funcionario("Caio","034.675.123-90",2000.00);
        Gerente g = new Gerente("Pedro","095.435.234.-98",5000.00,1234);
        
        //cb.registra(f);
        cb.registra(g);
        
        g.imprimirPerfil();
        //f.imprimirPerfil();
        
        System.out.println("Total de bonificaçoes: "+cb.getTotalBonificacoes());
        //System.out.println("Bonificaao gerente: R$ " + g.getBonificacao() + "\n" + "Bonificaçao funcionario: R$ " + f.getBonificacao());
        
    }
    
}
