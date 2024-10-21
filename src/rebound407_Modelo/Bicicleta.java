package rebound407_Modelo;

public class Bicicleta extends Vehiculo{
	protected String tipoBicicleta;

	public Bicicleta(int numeroDeRuedas, int cantidadDeVentanas, String tipoBicicleta) {
		super(2, 0);
		this.tipoBicicleta = tipoBicicleta;
	}

	/* Getters */
	public int getNumeroRuedas() { return numeroDeRuedas; }
	public int getCantidadVentanas() { return cantidadDeVentanas; }
	public String tipoBicicleta() { return tipoBicicleta; }
	
	/* Setters */
	public void setNumeroRuedas (int numeroDeRuedas) { this.numeroDeRuedas = numeroDeRuedas;}
	public void setCantidadVentanas (int cantidadDeVentanas) { this.cantidadDeVentanas = cantidadDeVentanas;}
	public void setTipoBicicleta(String tipoBicicleta) { this.tipoBicicleta = tipoBicicleta; }
	
	@Override
	public void encender() {
		System.out.println("Comienza el pedaleo...");
		
	}

	@Override
	public void apagar() {
		System.out.println("Te bajas de la bicicleta.");
		
	}
	
	public void frenarDeEmergencia() {
		System.out.println("Oops... te caiste!");
	}
	
	@Override
	public String toString() {
		return "Bicicleta: " + tipoBicicleta;
	}

}
