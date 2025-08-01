package exercicios.atividadeLambdas;

import java.util.ArrayList;
import java.util.List;

//5 - Implemente uma expressão lambda que recebe uma lista de inteiros
// e retorna uma nova lista onde cada número foi multiplicado por 3.
// Dica: a função replaceAll, das Collections, recebe uma interface funcional
// como parâmetro, assim como vimos na função forEach.
public class At5 {
    public static void main(String[] args) {
        List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(1);
        listaInteiros.add(2);
        listaInteiros.add(3);
        listaInteiros.add(4);
        System.out.println("Lista original: " + listaInteiros);

        listaInteiros.replaceAll(l -> l * 3);

        System.out.println("Lista multiplicada: " + listaInteiros);

    }

}
