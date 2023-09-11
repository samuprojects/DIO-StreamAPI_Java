package stream_api;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class Desafio03 {

    /*
    *
    * Desafio 3 - Verificar se todos os números da lista são positivos:
    * List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.

    *
    * */

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean verificarSePositivos = numeros.stream()
                .allMatch(numero -> numero > 0); // para resultado true...
        if (verificarSePositivos){
            System.out.println("ok, todos são positivos");
        } else {
            System.out.println("há ocorrencia de número negativo");
        }
    }
}
