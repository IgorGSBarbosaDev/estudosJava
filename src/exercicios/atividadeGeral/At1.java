package exercicios.atividadeGeral;

import java.util.Arrays;
import java.util.List;

//Imagine que você tem uma lista de strings. Algumas das strings
//são números, mas outras não. Queremos converter a lista de
//strings para uma lista de números. Se a conversão falhar, você deve
//ignorar o valor. Por exemplo, na lista a seguir, a saída deve
//ser [10, 20]:
// List<String> input = Arrays.asList("10", "abc", "20", "30x");
public class At1 {
    public static void main(String[] args) {
        List<String> listaStrings = Arrays.asList("1", "abc", "20", "30x", "40", "def", "50");
        listaStrings.stream().filter(l -> {
        try {
            Integer.parseInt(l);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
        }).map(Integer::parseInt)
                .forEach(System.out::println);
    }

}
