/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author darlo
 */
public class GravarObjeto {
    public static void main(String [] args){
        try{
            Scanner teclado = new Scanner(System.in);                   //recebe entrada do teclado 
            File tmpArquivo = new File("players.csv");                  //nome do arquivo
            FileWriter wtArquivo = new FileWriter(tmpArquivo,true);     //indica que a escrita do arquivo deve continuar a partir do fim,
                                                                        //no lugar de acontecer do inicio do arquivo 
            
            int inicio,fim;
            System.out.println("Digite o id inicial: ");
            inicio = teclado.nextInt();
            System.out.println("Digite o id final: ");
            fim = teclado.nextInt();
            
            for(int tmp = inicio; tmp<=fim;tmp++){
                Player p = new Player(tmp,"Player_"+tmp,tmp);
                wtArquivo.write(p+"\n");
            }
            
            wtArquivo.close();                                          //fechando o arquivo
                        
        }catch(Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
