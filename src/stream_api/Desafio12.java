package stream_api;

import java.util.Arrays;
import java.util.List;


@SuppressWarnings("ALL")
public class Desafio12 {

    /*
    * Desafio 12 - Encontrar o produto de todos os números da lista:

Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.

    * */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int produtoDosNumeros = numeros.stream()
                .reduce(1 , (a, b) -> a * b);

        System.out.println("O resultado da multiplicação é -> " + produtoDosNumeros);

        // algumas pesquisas indicam que acrescentar uma conversão para long, antes do cálculo, pode evitar que o limite numérico
        // do tipo primitivo int não seja ultrapassado e cause uma Exceção em tempo de execução do tipo ArithmeticException
        // ainda assim dependendo dos valores calculados poderia ocorrer o mesmo problema com o long se os números ultrapassassem o limite do tipo de dado long
        // abaixo segue código comentado com a conversão antes da multiplicação
//        int produtoDosNumeros = numeros.stream()
//                .mapToLong(Integer::longValue)
//                .reduce(1 , (a, b) -> a * b);

    }
}
