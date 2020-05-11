/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

/**
 *
 * @author darlo
 */
public class Player implements java.io.Serializable{
    private int id;
    private String name;
    private float score;
    
    public Player(){}
    public Player(int id, String name, float score){
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
    
    public String toString(){
        return id + ";" + name + ";" + score;
    }
    
    public String showInfo(){
        return "Player("+id+","+name+"," + score+")";
    }
}
