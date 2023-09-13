package stream_api;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class Desafio07 {

    /*
    *Desafio 7 - Encontrar o segundo número maior da lista:

Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.

    *
    * */


    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int segundoMaior = numeros.stream()
                .distinct() // excluiu numero duplicado
                .sorted((a, b) -> b.compareTo(a)) // colocar do maior para o menor
                .skip(1) // pula o primeiro maior
                .findFirst() // se concentra em localizar o segundo
                .orElseThrow(()-> new IllegalArgumentException("Não achei nada importante"));

        System.out.println("Depois do primeiro o segundo maior número é o " + segundoMaior);
    }
}
