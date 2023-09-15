package stream_api;

import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class Desafio13 {

    /*
    * Desafio 13 - Filtrar os números que estão dentro de um intervalo:

Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.

    * */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int menorIntervalo = 5;
        int maiorIntervalo = 10;

        List<Integer> parametrosIntervalo = numeros.stream()
                .filter(numero -> numero >= menorIntervalo && numero <= maiorIntervalo)
                .toList(); // IDE sugeriu essa redução ao invés de .collect(Collectors.toList());

        parametrosIntervalo.forEach(System.out::println);

        // abaixo inclui uma versão comentada do mesmo programa que solicita ao usuário as informações do intervalo menor e maior.

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Digite o intervalo mínimo: ");
//        int menorIntervalo = scanner.nextInt();
//
//        System.out.print("Digite o intervalo máximo: ");
//        int maiorIntervalo = scanner.nextInt();
//
//        List<Integer> parametrosIntervalo = numeros.stream()
//                .filter(numero -> numero >= menorIntervalo && numero <= maiorIntervalo)
//                .toList(); // IDE sugeriu essa redução ao invés de .collect(Collectors.toList());
//
//        parametrosIntervalo.forEach(System.out::println);
//
//        scanner.close();

    }
}
