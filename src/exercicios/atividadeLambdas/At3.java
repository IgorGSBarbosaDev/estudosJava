package exercicios.atividadeLambdas;
//3 - Crie uma função lambda que receba uma string e a converta para letras maiúsculas.
public class At3 {
    public static void main(String[] args) {

        IStringUpperCase maiusculo = m -> m.toUpperCase();
        String resultado = maiusculo.transforma("olá mundo");
        System.out.println(resultado);
    }
}
