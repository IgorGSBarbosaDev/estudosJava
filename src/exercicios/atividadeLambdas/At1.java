package exercicios.atividadeLambdas;
//1 - Crie uma expressão lambda que multiplique dois números inteiros.
// A expressão deve ser implementada dentro de uma interface funcional com o metodo multiplicacao(int a, int b).
public class At1{
    public static void main(String[] args) {

        InterfaceFuncional1 multiplicacao2 = (a, b) -> a * b;
        double resultado2 = multiplicacao2.multiplicacao(3, 4);
        System.out.println(resultado2);
    }
}
