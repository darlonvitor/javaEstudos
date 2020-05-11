/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livrojavaoito;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author darlo
 */
public class Capitulo8 {
    
    public static void main(String[] args) {
         List<Usuario> usuarios = new ArrayList<>();
    
        usuarios.add(new Usuario("Maria Roberta",20));
        usuarios.add(new Usuario("Antonieta Padilha",90));
        usuarios.add(new Usuario("Timao Tenorio",120));
        usuarios.add(new Usuario("Simao Denorio",190));
        usuarios.add(new Usuario("Mario Tedorio",150));
        usuarios.add(new Usuario("Vitor Afonso",50));
        
        //utilizando o peek para ver os lazys de funçoes intermediarias
        //observe que sao impressos elementos ate a condiçao do filter ser atendida
        usuarios.stream().forEach(System.out::println);
        
        usuarios
                .stream()
                .filter(u->u.getPontos()>100)
                .peek(System.out::println)
                .findAny();
        
        usuarios.stream()
                .sorted(Comparator.comparing(Usuario::getNome))
                .peek(System.out::println)
                .findAny();
        
        //==== Operaçoes de reduçao das Streams ====
        
        //----->Average
        double media = usuarios
                .stream()
                .mapToInt(Usuario::getPontos)//gera um stream de inteiros com as pontuaçoes
                .average()//calcula a media (retorna um optionalDouble)
                .getAsDouble();//retorna um double
        
        //----->Max
        Optional<Usuario> maiorPontuacao = usuarios
                .stream()
                .max(Comparator.comparingInt(Usuario::getPontos));
        
        //----->Min
        Optional<Usuario> menorPontuacao = usuarios
                .stream()
                .min(Comparator.comparingInt(Usuario::getPontos));
        
        //----->count
        long totalUsuarios = usuarios
                .stream()
                .count();
        
        //----->sum
        int pontuacaoTotal = usuarios
                .stream()
                .mapToInt(Usuario::getPontos)//criando um IntStream com as pontuaçoes
                .sum();//somando os elementos do stream formado na linha anterior
        System.out.println("Você possui " + totalUsuarios + " usuarios, somando " 
                + pontuacaoTotal + " pontos e uma pontuaçao media igual a " 
                + media
                + "\nA maior pontuaçao é de " + maiorPontuacao.get()
                + "\nA menor pontuaçoa é de " + menorPontuacao.get());
        
        
        //numero de usuarios com pontuaçao acima de 100 pontos
        //para resolver o problema do consumo das streams
        //utilizei um Spllier
        Supplier<Stream<Usuario>> acimaDeCem = ()->usuarios
                .stream()
                .filter(u->u.getPontos()>100);
        
        System.out.println("Usuarios com mais de 100 pontos: ");
        acimaDeCem.get().forEach(System.out::println);
        
        System.out.println(
                "Numero de usuarios: " + acimaDeCem.get().count() 
                +"\nPontuaçao total: " + acimaDeCem.get()
                                            .mapToInt(Usuario::getPontos)
                                            .sum()//so exite para streams primitivos 
                +"\nMedia: "+ acimaDeCem.get()
                                .mapToInt(Usuario::getPontos)
                                .average()//tambem so existe para streams primitivos
                                .getAsDouble()
                + "\nMenor pontuaçao: " + acimaDeCem.get()
                                            .min(Comparator.comparingInt(Usuario::getPontos))
                                            .get().getPontos()
                +"\nMaior pontuaçao: " + acimaDeCem.get()
                                            .max(Comparator.comparingInt(Usuario::getPontos))
                                            .get().getPontos()
        );
        
        // ==== Utilizando reduce() ====
        
        //->somar numeros
        int soma = usuarios.stream()
                .mapToInt(Usuario::getPontos)
                .reduce(0, (a,b)->a+b);//(0,Integer::sum)->
        
        //->multiplicar numeros
        int multiplicacao = usuarios.stream()
                .filter(u->u.getPontos()<100)
                .mapToInt(Usuario::getPontos)
                .reduce(1,(a,b)->a*b);
        
        //abordagem sem o map
        int soma2 = usuarios.stream()
                .reduce(0,(atual,u)->atual+u.getPontos(), Integer::sum);
        
        System.out.println("Soma: " + soma + "\nMultiplicação: " + multiplicacao + "\nOutra soma: " + soma2);
        
        // ==== Iterators ====
        
        Iterator<Usuario> i = usuarios.stream().iterator();
        i.forEachRemaining(System.out::println);
        
        // ==== Stream infinito ====
        
        //gerando numeros aleatorios
        Random random = new Random(0);
        //Supplier<Integer> supplier = ()->random.nextInt();//essa abordagem gera boxing o tempo todo, abaixo segue 
        //Stream<Integer> stream = Stream.generate(supplier);//uma outra com IntStream e IntSupplier(omitido no codigo para maior legibilidade)
        
        // Forma enxuta
        //Random random = new Random(0);
        IntStream stream = IntStream.generate(()->random.nextInt());
        //nota: operações de curto-circuito são aquelas que nao precisam percorrer todos os elementos de um Stream
        List<Integer> list = stream
                .limit(10)//pega apenas os 100 primeiros elementos do stream
                .boxed()//retorna um Stream<Integer> em vez do IntStream, pssibilitando o uso do collect
                .collect(Collectors.toList());
        
        list.forEach(System.out::println);
        
    }
}
