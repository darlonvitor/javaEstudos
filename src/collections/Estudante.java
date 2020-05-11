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
public class Estudante implements Comparable<Estudante>{
    private final String name;
    private final int age;
    
    public Estudante(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return age;
    }
    
    @Override
    public String toString(){
        return name+"-"+age;
    } 
    
    @Override
    public int compareTo(Estudante o) {
        return this.getAge() - o.getAge();//resulta em um ordenamento decrescente
    }
    
}
