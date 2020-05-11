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
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class BinWriter {
    public static void main(String[] args) {
        try{
            File tmpArq = new File("arquivo.bin");                              //apontando arquivo binario
            FileOutputStream fsArq = new FileOutputStream(tmpArq);              //abrindo arquivo bin
            ObjectOutputStream obj = new ObjectOutputStream(fsArq);
            
            Scanner teclado = new Scanner(System.in);
            
            int inicio, fim;
            System.out.println("Informe o id de inicio: ");
            inicio = teclado.nextInt();
            System.out.println("Informe o id final: ");
            fim = teclado.nextInt();
            
            for (int i = inicio; i <= fim; i++) {
                Player p = new Player(i,"Player_" + i,i);
                System.out.println("Gravado: " + p.showInfo());
                obj.writeObject(p);
            }
            //fechando o que tem que fechar
            obj.close();
            fsArq.close();
            
            
        }catch(IOException ex){
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
