/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author darlo
 */
public class ExemploMaps {
    public static void main(String[] args){
        
        //===================HashMap===================//
        
        //instaciando hashMap
        Map<String,Double> boletim = new HashMap<>();
        
        //adicionando chaves e seus valores
        boletim.put("Portugues",9.3);
        boletim.put("Matematica",9.8);
        boletim.put("Historia",8.3);
        boletim.put("Geografia",7.6);
        boletim.put("Ciencias",8.9);
        
        System.out.println(boletim);
        
        //atualizando valor de uma chave existente
        boletim.put("Matematica",9.5);
        System.out.println(boletim);
        
        //buscando valor associado a uma chave
        System.out.println("Sua nota de portugeus é igual a "+boletim.get("Portugues"));
        
        //verificando a existencia de uma chave com o containsKey()
        String materia = "Geografia";
        String msg = (boletim.containsKey(materia)?"Sua nota em "+materia+" é "+boletim.get(materia):"Você não está cursando "+materia);
        System.out.println(msg);
        
        //removendo elemento
        boletim.put("Filosofia",6.0);
        System.out.println(boletim);
        boletim.remove("Filosofia");
        System.out.println("-----------------------------------\n"+boletim);
        
        System.out.println(boletim.containsValue(8.9));
        
        System.out.println("Atualmente você está cursando " + boletim.size()+" matérias.");
        
        //navegando pelos registros do mapa
        for(Map.Entry<String,Double> entry:boletim.entrySet()){
            System.out.println("Sua nota em "+entry.getKey()+" é "+entry.getValue());
        }
        
        //navegando pelos registroos do mapa ----> menos eficiente
        for(String key : boletim.keySet()){
            System.out.println("Em "+key+" sua nota final foi "+boletim.get(key));
        }
        
        System.out.println(boletim.get(3));
    }
    
}
