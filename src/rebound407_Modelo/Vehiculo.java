package rebound407_Modelo;

public abstract class Vehiculo {
	
	protected int numeroDeRuedas;
	protected int cantidadDeVentanas;
	
	public Vehiculo(int numeroDeRuedas, int cantidadDeVentanas) {
		this.numeroDeRuedas = numeroDeRuedas;
		this.cantidadDeVentanas = cantidadDeVentanas;
	}
   
	public abstract void encender();
	public abstract void apagar();
	
	public void mostrarInformacion() {
		System.out.println("Numero de ruedas: " + numeroDeRuedas);
		System.out.println("Cantidad de ventanas: " + cantidadDeVentanas);
	}

}
