package exercicios.atividadeGeral;
//Implemente um metodo que verifica se uma frase é um palíndromo.
//Um palíndromo é uma palavra/frase que, quando lida de tras pra frente,
//é igual a leitura normal. Um exemplo:
public class Atv4 {
    public static void main(String[] args) {
        System.out.println(ehPalindromo("socorram me subi no onibus em marrocos")); // Saída: true
        System.out.println(ehPalindromo("Java")); // Saída: false

    }
    public static boolean ehPalindromo(String palavra) {
        String semEspacos = palavra.replaceAll("\\s", "").toLowerCase();
        return new StringBuilder (semEspacos).reverse().toString().equals(semEspacos);
    }
}
