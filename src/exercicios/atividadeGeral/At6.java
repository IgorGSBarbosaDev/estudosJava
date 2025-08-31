package exercicios.atividadeGeral;
//Crie um enum Mes que represente os meses do ano.
//Adicione um metodo que retorna o número de dias de
// cada mês, considerando anos não bissextos.
public class At6 {
    public static void main(String[] args) {

        System.out.println(Mes.FEVEREIRO.getNumeroDias()); // 28
        System.out.println(Mes.JULHO.getNumeroDias()); // 31
    }
}
