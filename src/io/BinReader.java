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

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.EOFException;

public class BinReader {
    public static void main(String[] args) {
        try {
            
            File tmpArq = new File("arquivo.bin");//apontando arquivo
            FileInputStream fiArq = new FileInputStream(tmpArq);//abrindo arqiuvo
            ObjectInputStream obj = new ObjectInputStream(fiArq);//abrindo leitor de objetos
                        
            Player p;
            
            do{
                 p = (Player)obj.readObject();
                if(p!= null)
                    System.out.println("Lido: " + p.showInfo());
            }while(p != null);
            
            obj.close();
            fiArq.close();
            
        }catch(EOFException e){
            System.out.println("Fim do arquivo");
        }catch (Exception e) {
            e.printStackTrace();//exibe os passos do 
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
