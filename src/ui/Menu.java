package ui;
import model.Empresa;

public class Menu{
	private Empresa e;

	public Menu(){
		e = new Empresa();
		System.out.println("El costo total de las lineas es: "+ e.darCostoTotalLineas());
		System.out.println("El total de minutos de las lineas de Celular es: "+ e.totalMinutosLineasCelular());
        System.out.println("El total de minutos de las lineas de VoIP es: "+ e.totalMinutosLineasVoIP());

	}
	public static void main(String[] args){
		Menu m= new Menu();
	}
}
