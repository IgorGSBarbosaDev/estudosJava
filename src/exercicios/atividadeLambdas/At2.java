package exercicios.atividadeLambdas;
//2 - Implemente uma expressão lambda que verifique se um número é primo.
public class At2 {
    public static void main(String[] args) {
        INumeroPrimo numero =  n -> {
            if (n <= 1) return false;
            if (n == 2) return true;
            if ((n % 2 == 0)) return false;
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
                if (n % i == 0) return false;
            }
            return true;
        };
        var resultado = numero.verificaPrimo(7);
        System.out.println("É primo? " + resultado);
        var resultado2 = numero.verificaPrimo(10);
        System.out.println("É primo? " + resultado2);

    }
}

