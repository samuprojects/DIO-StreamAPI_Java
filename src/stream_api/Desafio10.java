package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class Desafio10 {

    /*
    * Desafio 10 - Agrupar os valores ímpares múltiplos de 3 ou de 5:

Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.

    *
    * */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> numeroAgrupados = numeros.stream()
                .filter(numero -> numero % 2 != 0 && (numero % 3 == 0 || numero % 5 == 0))
                .collect(Collectors.partitioningBy(numero -> numero % 3 == 0));

        System.out.println("múltiplos de 3 da lista: ");
        numeroAgrupados.get(true).forEach(System.out::println);

        System.out.println("múltiplos de 5 da lista: ");
        numeroAgrupados.get(false).forEach(System.out::println);

    }
}
