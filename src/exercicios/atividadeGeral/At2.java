package exercicios.atividadeGeral;

import java.util.Optional;

//Implemente um metodo que recebe um número inteiro dentro de um Optional.
// Se o número estiver presente e for positivo, calcule seu quadrado.
// Caso contrário, retorne Optional.empty.
public class At2 {
    public static void main(String[] args) {
        System.out.println(processaNumero(Optional.of(5))); // Saída: Optional[25]
        System.out.println(processaNumero(Optional.of(-3))); // Saída: Optional.empty
        System.out.println(processaNumero(Optional.empty())); // Saída: Optional.empty


    }
    public static Optional<Integer> processaNumero(Optional<Integer> numero) {
        return numero.filter(n -> n > 0).map(n -> n * n);
    }
}
