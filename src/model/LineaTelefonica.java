package model;

public class LineaTelefonica {
    private static final int VALOR_MINUTO_LOCAL = 35;
    private int numeroDeLlamadas;
    private int minutosLocal;

    public LineaTelefonica(int numeroDeLlamadas, int minutosLocal){
        this.numeroDeLlamadas = numeroDeLlamadas;
        this.minutosLocal = minutosLocal;   
    }
    public int getMinutosLocal(){
        return minutosLocal;
    }
    public double calcularCostoLlamadas(){
        return minutosLocal*VALOR_MINUTO_LOCAL;
    }
}
