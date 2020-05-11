/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 *
 * @author darlo
 */
public class LerArquivo {
    public static void main(String[] args) {
        try{
            File tmpArquivo = new File("players.csv");//apontando para o arquivo 
            FileReader rdArquivo = new FileReader(tmpArquivo);//abrindo o arquivo
            
            BufferedReader rd = new BufferedReader(rdArquivo);
            
            String linha;
            
            while((linha = rd.readLine())!=null){
                String[] infos = linha.split(";");
                Player p = new Player(
                        Integer.parseInt(infos[0]),
                        infos[1],
                        Float.parseFloat(infos[2]));
                System.out.println("Lido: " + p.showInfo());
            }
            
            rd.close();//fechando o buffered
            rdArquivo.close();//fechando o arquivo
            
            
        }catch(Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
