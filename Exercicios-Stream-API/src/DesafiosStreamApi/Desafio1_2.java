package DesafiosStreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Desafio1_2 {
    static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        //1
        numeros.stream().sorted().forEach(System.out::println);
        System.out.println("---1");
        //2
        numeros.stream().sorted().forEach(p-> {
            if (p%2==0){System.out.println(p);}
        });
        System.out.println("---2");
        //3
        numeros.stream().sorted().forEach(p->{
            if(p>=0){System.out.println(p);}
        });
        System.out.println("---3");
        //4
        List<Integer> numeros2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3));
        numeros2.removeIf(p-> p%2!=0);
        numeros2.forEach(System.out::println);
        System.out.println("---4");
        //5
        double media = numeros.stream().filter(n -> n > 5).mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Média dos números maiores que 5: " + media);
        System.out.println("--5");
        //6
        numeros.stream().filter(n -> n > 10)
                .findAny() // Procura se existe pelo menos um elemento
                .ifPresentOrElse(// ifPresentOrElse(Consumer,Supplier);
                        n -> numeros.stream().filter(x -> x > 10).forEach(System.out::println), // Se existir, imprime os elementos, no Consumer
                        () -> System.out.println("Nenhum número maior que 10 foi encontrado.") // Se NÃO existir, entra aqui, no Supplier
                );
        System.out.println("--6");
        //7
        Integer segundoMaior = numeros.stream()
                .distinct()                          // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
                .sorted(Comparator.reverseOrder())   // [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
                .skip(1)                             // Pula o 10 -> sobram [9, 8, 7...]
                .findFirst()                         // Pega o 9 (retorna Optional)
                .orElse(null);
        System.out.println("O segundo maior número é: " + segundoMaior);
        System.out.println("---7");
        //8
        int somaNumeros= numeros.stream().reduce(0,Integer::sum);
        System.out.println(somaNumeros);
        System.out.println("---8");
        //9
        long elementosDistintos= numeros.stream().distinct().count();
        boolean saoIguais= elementosDistintos!=numeros.size();
        System.out.println("A lista tem repetidos?: "+saoIguais);
        System.out.println("---9");
        //10
        List<Integer> numeros3= numeros.stream().filter(n -> n%5==0 || n%3==0).toList();
        numeros3.stream().sorted().forEach(System.out::println);


    }
}
