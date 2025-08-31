package exercicios.atividadeGeral;

public enum Moeda {
    REAL,
    DOLAR,
    EURO;

    public double converterPara(double valorEmReais){
        switch (this){
            case REAL:
                return valorEmReais;
            case DOLAR:
                return valorEmReais * 0.20;
            case EURO:
                return valorEmReais * 0.18;
                default:
                    throw new IllegalArgumentException("Moeda inválida");
        }
    }
}
