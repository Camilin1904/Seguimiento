package model;

public class LineaVoIP extends LineaTelefonica {
    private static final int VALOR_MINUTO_LARGA_DISTANCIA = 80;
    private static final int VALOR_MINUTO_CELULAR = 7;
    private int minutosLargaDistancia;
    private int minutosCelular;

    public LineaVoIP(int numeroDeLlamadas, int minutosLocal, int minutosCelular, int minutosLargaDistancia){
        super(numeroDeLlamadas, minutosLocal);
        this.minutosLargaDistancia = minutosLargaDistancia;
        this.minutosCelular = minutosCelular;
    }

    @Override
    public double calcularCostoLlamadas(){
        return super.calcularCostoLlamadas() + minutosCelular*VALOR_MINUTO_CELULAR + minutosLargaDistancia*VALOR_MINUTO_LARGA_DISTANCIA;
    }
    
    public int calcularMinutos(){
        return getMinutosLocal() + minutosCelular + minutosLargaDistancia;
    }

}
