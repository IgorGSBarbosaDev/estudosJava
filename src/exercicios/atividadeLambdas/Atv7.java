package exercicios.atividadeLambdas;
//7 - Crie uma função lambda que recebe dois números e
// divide o primeiro pelo segundo. A função deve lançar uma
// exceção de tipo ArithmeticException se o divisor for zero.
public class Atv7 {
    public static void main(String[] args) {
        IDivisao divisao = (num, div) -> {
            if(div == 0){
                throw new ArithmeticException("Divisão por zero não é permitida");
            } return num / div;
        };
        System.out.println(divisao.dividir(10, 0));
    }
}
