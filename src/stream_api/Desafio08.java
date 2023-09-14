package stream_api;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class Desafio08 {


    /*
    *
    * Desafio 8 - Somar os dígitos de todos os números da lista:

Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.

    * */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream() // o stream() permite executar operações de fluxo nos elementos da lista "numeros"
                .mapToInt(numero -> String.valueOf(numero).chars()
                        //a transformação é aplicada a cada elemento do fluxo. Para cada número na lista, ele é convertido em uma sequência de caracteres usando String.valueOf(numero)
                        //os caracteres são convertidos em seus valores numéricos individuais usando chars() e map(Character::getNumericValue)
                        .map(Character::getNumericValue)
                        .sum()) //é usada para somar todos os valores numéricos obtidos a partir dos dígitos do número
                .sum(); // é chamado novamente para somar todos os valores inteiros que são resultado do comando anterior
        System.out.println(soma); // vai apresentar 58


        // se somar os valores inteiros da lista o resultado será 67
        int sum = numeros.stream().reduce(0, Integer::sum);
        System.out.println(sum);



    }
}
