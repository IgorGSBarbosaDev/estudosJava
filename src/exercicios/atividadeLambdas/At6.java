package exercicios.atividadeLambdas;

import java.util.ArrayList;
import java.util.List;

//6 - Crie uma expressão lambda que ordene uma lista
// de strings em ordem alfabética. Dica: a função sort, das Collections,
// recebe uma interface funcional como parâmetro, assim como vimos
// na função forEach.
public class At6 {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Banana");
        listaNomes.add("Analfabeto");
        listaNomes.add("Kiara");
        listaNomes.add("Meteoro");
        listaNomes.add("Zacarias");

        listaNomes.sort((n1, n2) -> n1.compareToIgnoreCase(n2));
        System.out.println(listaNomes);
    }
}
