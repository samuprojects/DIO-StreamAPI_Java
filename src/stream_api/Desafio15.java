package stream_api;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class Desafio15 {

    /*
    *
    * Desafio 15 - Verificar se a lista contém pelo menos um número negativo:

Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.

    * */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean findNegativeNumber = numeros.stream().anyMatch(numero -> numero <0);
        if (findNegativeNumber){
            System.out.println("Existem números negativos");
        } else {
            System.out.println("Não existem números negativos");
        }
    }
}
