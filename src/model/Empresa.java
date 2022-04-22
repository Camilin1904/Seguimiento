package model;
import java.util.*;

public class Empresa{
    public static final int NUM_TELEPHONE_LINES = 5;
	private LineaTelefonica[] lineas;
	
	public Empresa(){
		lineas = new LineaTelefonica[NUM_TELEPHONE_LINES];
		//LineaCelular(int numeroDeLlamadas, int minutosLocal(35), int minutosCelular(10))
		lineas[0] = new LineaCelular(20,450,250); //450*35+250*10
		lineas[1] = new LineaCelular(25, 200,1200); //200*35+1200*10
        lineas[2] = new LineaCelular(35, 100, 30); //100*35+30*10
		//LineaVozIP(int numeroDeLlamadas, int minutosLocal, int minutosCelular(7), int minutosLargaDistancia(80))
        lineas[3] = new LineaVoIP(12, 600,450,150); //600*35+450*7+150*80
        lineas[4] = new LineaVoIP(20, 165, 65,100); //165*35+65*7+100*80

	}
	
	public double darCostoTotalLineas(){
		double costo= 0;
		for(int i=0; i< NUM_TELEPHONE_LINES; i++)
			costo += lineas[i].calcularCostoLlamadas();
		return costo;
	}
	
	public int totalMinutosLineasCelular(){
		int tm = 0;
		if(lineas != null){
			for(int i=0; i< NUM_TELEPHONE_LINES; i++){
				if (lineas[i] instanceof LineaCelular){
					tm += ((LineaCelular)lineas[i]).calcularMinutos();
                }
			}
		}
		return tm;
	}
	
	public int totalMinutosLineasVoIP(){
		int tm = 0;
		if(lineas != null){
			for(int i=0; i< NUM_TELEPHONE_LINES; i++){
				if (lineas[i] instanceof LineaVoIP){
					tm += ((LineaVoIP)lineas[i]).calcularMinutos();
                }
			}
		}
		return tm;
	}

}
