package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("ALL")
public class Desafio04 {

    /*
    * Desafio 4 - Remover todos os valores ímpares:
    * List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.

    * */

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> usarFiltro = numeros.stream()
                .filter(numero -> numero % 2 == 0) // pegar os pares
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        for (Integer numero : usarFiltro) {
            System.out.println(numero);
            
        }

    }

}
