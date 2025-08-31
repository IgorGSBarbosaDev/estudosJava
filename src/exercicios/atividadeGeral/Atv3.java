package exercicios.atividadeGeral;
//Implemente um metodo que recebe uma String representando um
//nome completo separado por espaços. O metodo deve retornar
//o primeiro e o último nome apos remover os espaços desnecessarios.
public class Atv3 {
    public static void main(String[] args) {
    System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   ")); // Saída: "João Silva"
    System.out.println(obterPrimeiroEUltimoNome("Maria   ")); // Saída: "Maria"
}

    public static String obterPrimeiroEUltimoNome(String nomeCompleto) {
        String[] nomes = nomeCompleto.trim().split("\\s+");
        if (nomes.length == 1) {
            return nomes[0];
        }
        return nomes[0] + " " + nomes[nomes.length - 1];
    }

}