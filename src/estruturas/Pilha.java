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
public class Pilha {
    private int valores[];
    private int topo;
    
    public Pilha(){
        valores = new int[10];
        topo = -1;
    }
    
    public void push(int elemento){
        ++topo;
        valores[topo] = elemento;
    }
    
    public boolean isEmpty(){
        return (topo==-1);
    }
    
    public boolean isFull(){
        return (topo==1);
    }
    
    public int pop(){
        int tmp = valores[topo];
        --topo;
        return tmp; 
    }
}
