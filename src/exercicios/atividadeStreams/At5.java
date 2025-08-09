package exercicios.atividadeStreams;

import java.util.Arrays;
import java.util.List;

public class At5 {
        public static void main(String[] args) {
            List<List<Integer>> listaDeNumeros = Arrays.asList(
                    Arrays.asList(1, 2, 3, 4),
                    Arrays.asList(5, 6, 7, 8),
                    Arrays.asList(9, 10, 11, 12)
            );

            listaDeNumeros.stream()
                    .flatMap(List::stream)
                    .filter(At5::ehPrimo)
                    .sorted()
                    .forEach(System.out::println);
            //código para filtrar e ordenar números primos
        }

    private static boolean ehPrimo(int numero) {
        if (numero < 2) return false; // Números menores que 2 não são primos
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
            }
                return false; // Divisível por outro número
        }
        return true;
    }
}


