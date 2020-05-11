/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livrojavaoito;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author darlo
 */
public class Capitulo7 {
    public static void main(String[] args) {
        List<Usuario> usuarios = new ArrayList<>();
    
        usuarios.add(new Usuario("Timao Tenorio",120));
        usuarios.add(new Usuario("Simao Denorio",190));
        usuarios.add(new Usuario("Mario Tedorio",150));
        usuarios.add(new Usuario("Vitor Afonso",50));
        //usuarios.forEach(System.out::println);
        
        usuarios.stream()
                .filter(u->u.getPontos()>100)
                .forEach(Usuario::tornarModerador);
        System.out.println(usuarios);
        
        //criando lista com usuarios que sao moderadores 
        List<Usuario> moderadores = usuarios.stream()
                .filter(Usuario::isModerador)
                .collect(Collectors.toList());
        
        //criando lista com a pontuaçao dos usuarios
        List<Integer> pontos = usuarios.stream()
                .map(Usuario::getPontos)
                .collect(Collectors.toList());
        System.out.println(pontos);
        
        //obtendo a media das pontuaçoes
        double mediaPontuacao = usuarios.stream()
                .mapToInt(Usuario::getPontos)
                .average()
                .getAsDouble();
        
        //outra versao desse codigo, utilizando um orElse do optionalDouble para
        //atribuir o valor 0.0 à media caso a lista esteja vazia
        double mediaPontuacao2 = usuarios.stream()
                .mapToInt(Usuario::getPontos)
                .average()
                .orElse(0.0);
        
        System.out.println("Pontuação média: " + mediaPontuacao);
        
        //obtendo nome do usuario com maior pontuaçao
        Optional<String> chefao = usuarios
                .stream()
                .max(Comparator.comparingInt(Usuario::getPontos))
                .map(Usuario::getNome);
        
        //obtendo maior pontuaçao
        Optional<Usuario> maiorPontuacao = usuarios
                .stream()
                .max(Comparator.comparingInt(Usuario::getPontos));
                
        System.out.println("Usuario com maior pontuação: " + chefao.orElse("Não encontrado"));
        
        //obtendo lista ordenada por nome com as maiores pontuações
        List<Usuario> maioresPontuacoes = usuarios
                .stream()
                .filter(u -> u.getPontos()>100)//filtrando maiores pontuaçoes
                //.sorted(Comparator.comparing(Usuario::getNome))//ordenando por nome
                .sorted(Comparator.comparingInt(Usuario::getPontos))//ou ordenando por pontuaçao
                .collect(Collectors.toList());//retornando uma lista
        
        System.out.println("Usuarios mais bem pontuados:\n" + maioresPontuacoes);
    }
}
