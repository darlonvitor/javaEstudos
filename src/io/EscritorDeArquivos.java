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
public class EscritorDeArquivos {
    public static void main(String[] args) {
        try{
            Scanner teclado = new Scanner(System.in);//recebe entrada do teclado 
            File tmpArquivo = new File("arquivo.txt");//nome do arquivo
            FileWriter wtArquivo = new FileWriter(tmpArquivo);
            
            String texto;
            
            do{
                System.out.println("Digite algo (Fim para sair):");
                texto = teclado.nextLine();
                
                if(texto.equalsIgnoreCase("fim"))//se o usuario nao digitou fim
                    wtArquivo.write( texto + "\n");//escreve o texto informado com uma quebra para a proxima linha
                
            }while(!texto.equalsIgnoreCase("FIM"));
            wtArquivo.close();//fechando o arquivo
                        
        }catch(Exception ex){
            System.out.println("Erro: " + ex.getMessage());
        }
    }
}
