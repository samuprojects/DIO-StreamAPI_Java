package stream_api;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class Desafio01 {
    /*
    *
    Desafio 1 - Mostrar a lista na ordem numérica:

Criar um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
*
* utilizem a lista de números inteiros fornecida:

List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
    * */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosEmOrdem = numeros.stream()
                .sorted()
                .toList(); // sugestão oferecida pela IDE ao invés de usar o  .collect(Collectors.toList());

        numerosEmOrdem.forEach(System.out::println);


    }
}
