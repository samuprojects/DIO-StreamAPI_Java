package stream_api;

/*
*Desafio 18 - Verificar se todos os números da lista são iguais:

Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.

*
* */

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class Desafio18 {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean checkEqualNumbers = numeros.stream().allMatch(numero -> numero.equals(numeros.get(0)));

        if (checkEqualNumbers){
            System.out.println("Os números da lista são iguais!");
        } else {
            System.out.println("Os números não são iguais!");
        }
    }
}
