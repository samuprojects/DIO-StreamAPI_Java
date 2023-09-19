package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class Desafio16 {

    /*
    *Desafio 16 - Agrupar os números em pares e ímpares:

Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.

    *
    * */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> pairNumbersList = numeros.stream()
                .filter(n-> n % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> oddNumbersList = numeros.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());

        System.out.println("Números da Lista Par encontrados: " + pairNumbersList);
        System.out.println("Números da Lista Ímpar encontrados: " + oddNumbersList);
    }
}
