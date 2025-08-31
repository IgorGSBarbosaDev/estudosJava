package exercicios.atividadeGeral;

public enum Mes {
    JANEIRO,
    FEVEREIRO,
    MARCO,
    ABRIL,
    MAIO,
    JUNHO,
    JULHO,
    AGOSTO,
    SETEMBRO,
    OUTUBRO,
    NOVEMBRO,
    DEZEMBRO;

    public int getNumeroDias(){
        switch (this){
            case JANEIRO, MARCO, MAIO, JULHO, AGOSTO, OUTUBRO, DEZEMBRO:
                return 31;
            case ABRIL, JUNHO, SETEMBRO, NOVEMBRO:
                return 30;
            case FEVEREIRO:
                return 28;
            default:
                throw new IllegalArgumentException("Mês inválido");
        }
    }
}
