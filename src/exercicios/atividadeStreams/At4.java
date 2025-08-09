package exercicios.atividadeStreams;

import java.util.Arrays;
import java.util.List;

public class At4 {
        public static void main(String[] args) {
            List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
            palavras.stream()
                    .distinct()
                    .forEach(System.out::println);
        }
    }

