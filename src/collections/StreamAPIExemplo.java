/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 *
 * @author darlo
 */
public class StreamAPIExemplo {
    public static void main(String[] args){
        //cria coleçao de estudantes
        ArrayList<String> turma = new ArrayList<>();

        turma.add("Maria");
        turma.add("João");
        turma.add("Pedro");
        turma.add("Deborah");
        turma.add("Marie");
        turma.add("Mauricio");
        turma.add("Marlon");
        turma.add("Mauro");
        turma.add("Matheus");
        
        //retorna a contagem de elementos
        System.out.println("Contagem: " + turma.stream().count());
    
        //retornando o elemento com maior numero de letras
        System.out.println("Mais letras: " + turma.stream().max(Comparator.comparingInt(String::length)));
        
        //retornando o elemento com menor numero de letras
        System.out.println("Menos letras: " + turma.stream().min(Comparator.comparingInt(String::length)));
        
        //retornando lista com todos os elementos que contem a letra 'r'
        System.out.println("Alunos que possuem a letra r no nome: " + turma.stream().filter((estudante)->
                estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
        
        //retornando uma lista com os nomes concatenados à quantidade de letras
        System.out.println("Tamanho de cada nome: " + turma.stream().map((estudante)->
                estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
        
        //retorna somente  os 3 primeiros elementos
        System.out.println("3 primeiros: " + turma.stream().limit(3).collect(Collectors.toList()));
        
        //exibe cada elemento no console e retorna a mesma coleçao
        System.out.println("Retorna os elementos: " + turma.stream().peek(System.out::println).collect(Collectors.toList()));
        
        //exibe cada elemento sem retornar outra coleçao
        System.out.println("Retorna os elementos novamente: ");
        turma.stream().forEach(System.out::println);
        
        //retorna true se todos os elementos possuirem a letra 'M'
        System.out.println("Todos os nomes possuem a letra 'M'?: " + turma.stream().allMatch((estudante) -> estudante.contains("W")));
        
        //retorna true se algum elemento contem a letra 'a'
        System.out.println("Algum nome possue a letra 'a'?: " + turma.stream().anyMatch(estudante -> estudante.contains("a")));
        
        //retorna true se nenhum elemento possui a letra i 
        System.out.println("Nenhum nome possui a letra 'i'?: " + turma.stream().noneMatch(estudante -> estudante.contains("i")));
        
        //retorna o primeiro elemento da coleçao, e se ele existir ira exibi-lo no console
        System.out.println("Primeiro aluno da lista:");
        turma.stream().findFirst().ifPresent(System.out::println);
        
        //operadores encadeados
        System.out.println("Operações encadeadas: ");
        System.out.println(turma.stream()
                .peek(System.out::println)
                .map((estudante)->estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter(estudante -> estudante.toUpperCase().contains("R"))
//              .collect(Collectors.toList())
//              .collect(Collectors.joining(";"))
//              .collect(Collectors.toSet())
                .collect(Collectors.groupingBy(estudante -> estudante.substring(estudante.indexOf("-")+1)))
        );
    }
    
}
