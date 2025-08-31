package exercicios.atividadeGeral;

import java.util.Arrays;
import java.util.List;
//Implemente um metodo que recebe uma lista de e-mails (String)
//e retorna uma nova lista onde cada e-mail está convertido para
// letras minúsculas.
public class Atv5 {
    public static void main(String[] args) {
        List<String> emails = Arrays.asList("TESTE@EXEMPLO.COM", "exemplo@Java.com ", "Usuario@teste.Com");
        System.out.println(converterEmails(emails));
        // Saída: ["teste@exemplo.com", "exemplo@java.com", "usuario@teste.com"]
    }

    public static List<String> converterEmails(List<String> emails) {
        return emails.stream()
                .map(String::toLowerCase)
                .toList();
    }
}
