package exercicios.atividadeLambdas;
//4 - Crie uma expressão lambda que verifique se uma string é um palíndromo.
// A expressão deve ser implementada dentro de uma interface funcional com o metodo boolean
// verificarPalindromo(String str).
// Dica: utilize o metodo reverse da classe StringBuilder.
public class At4 {
    public static void main(String[] args) {
        IStringPalindromo palindromo = p -> {
            return new StringBuilder(p).reverse().toString().equalsIgnoreCase(p);

//          StringBuilder sb = new StringBuilder(p);
//          if (sb.reverse().toString().equalsIgnoreCase(p)) {
//              return true;
//          } else {
//              return false;
//          }
        };
        var resultado = palindromo.verificarPalindromo("mirim");
        System.out.println("É palíndromo? " + resultado);

        var resultado2 = palindromo.verificarPalindromo("teste");
        System.out.println("É palíndromo? " + resultado2);

        var resultado3 = palindromo.verificarPalindromo("Ana");
        System.out.println("É palíndromo? " + resultado3);
    }
}
