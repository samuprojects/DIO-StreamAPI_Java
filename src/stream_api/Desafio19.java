package stream_api;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class Desafio19 {

    /*
    * Desafio 19 - Encontrar a soma dos números divisíveis por 3 e 5:

Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.

    *
    * */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDosNumeros = numeros.stream()
                .filter(n -> n % 3 == 0  && n % 5 == 0) // nenhum dos números é divisível por 3 e 5 ao mesmo tempo, se mudar a condição para OU aí sim teremos 41 como resultado
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("O resultado do cálculo de soma dos números que são divisíveis por 3 e 5 é -> " + somaDosNumeros);
    }
}
