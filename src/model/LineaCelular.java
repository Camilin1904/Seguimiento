package model;

public class LineaCelular extends LineaTelefonica {
    private static final int VALOR_MINUTO_CELULAR = 10;
    private int minutosCelular;

    public LineaCelular(int numeroDeLlamadas, int minutosLocal,  int minutosCelular){
        super(numeroDeLlamadas, minutosLocal);
        this.minutosCelular = minutosCelular;
    }

    @Override
    public double calcularCostoLlamadas(){
        return super.calcularCostoLlamadas()+minutosCelular*VALOR_MINUTO_CELULAR;
    }

    public int calcularMinutos(){
        return getMinutosLocal() + minutosCelular;
    }
}
