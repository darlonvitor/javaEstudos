/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturas;

/**
 *
 * @author darlo
 */
public class ConversorBinario {
    public static void main(String[] args) {
        
        int numero = 172;
        Pilha p = new Pilha();
        
        int resto;
        
        while(numero!=0){
            resto = numero%2;   //  pega o resto da div do numero por dois
            p.push(resto);      //  armazena na pilha
            numero /= 2;        //  gera um novo numero, resulado de sua div por 2
        }
        
        //exibição dos restos
        while(!p.isEmpty()){
            resto = p.pop();    //  remove o elemento do topo
            System.out.print(resto);
        }
        
        System.out.println("\nFim");
    }
}
