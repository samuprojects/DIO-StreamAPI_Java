package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SuppressWarnings("ALL")
public class Desafio14 {

    /*
    *
    * Desafio 14 - Encontrar o maior número primo da lista:

Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

    * */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Optional<Integer> findLargestPrimeNumber = numeros.stream()
                .filter(numero -> {
                            if (numero <= 1)
                                return false; // numero primo tem que ser maior que 1 e dividido por ele mesmo ou por 1, se der exato não é primo
                            for (int i = 2; i <= Math.sqrt(numero); i++) { // 2 é o único primo par, segundo pesquisa a raiz quadrada ajuda em todos os cenários
                                if (numero % i == 0) return false;
                            }
                            return true;
                        })
                .max(Integer::compareTo);

        findLargestPrimeNumber.ifPresentOrElse(
                numberFound -> System.out.println("O maior número primo encontrado foi: " + numberFound),
                () -> System.out.println("Não há números primos")
        );


    }
}
