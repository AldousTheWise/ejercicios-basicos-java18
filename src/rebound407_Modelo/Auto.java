package rebound407_Modelo;

import java.util.Scanner;

import rebound407_interfaces.IVehiculo;

public class Auto extends Vehiculo implements IVehiculo{
	private String color, modelo; 
	private String tipoBencina;

	public Auto(int numeroDeRuedas, int cantidadDeVentanas, String color, String modelo) {
		super(numeroDeRuedas, cantidadDeVentanas);
		this.color = color;
		this.modelo = modelo;
	}

	
	/* Getters */
	public int getNumeroRuedas() { return numeroDeRuedas; }
	public int getCantidadVentanas() { return cantidadDeVentanas; }
	public String getColor() { return color; }
	public String getModelo() { return modelo; }
	
	/* Setters */
	public void setNumeroRuedas (int numeroDeRuedas) { this.numeroDeRuedas = numeroDeRuedas;}
	public void setCantidadVentanas (int cantidadDeVentanas) { this.cantidadDeVentanas = cantidadDeVentanas;}
	public void setColor(String color) { this.color = color; }
	public void setModelo(String modelo) { this.modelo = modelo; }
	
	@Override
	public void encender() {
		System.out.println("El auto está encendido");
	}

	@Override
	public void apagar() {
		System.out.println("El auto está apagado");	
	}
	
	@Override
	public String tipoDeBencina(String bencina) {
		this.tipoBencina = bencina;
		return this.tipoBencina;
	}
	
	public void cargarBencina(Scanner sc) {
		System.out.println("Hola! Que bencina vas a cargar?");
		String tipoBencinaIngresada = sc.nextLine();
		this.tipoDeBencina(tipoBencinaIngresada);
		System.out.println("Gracias por preferirnos. Bencina de " + this.tipoBencina + " cargada.");
	}
	
	
	@Override
	public String toString() {
		return "Auto [color = " + color + ", modelo = " + modelo + ", numero de ruedas = " + numeroDeRuedas + ", cantidad de ventanas = " + cantidadDeVentanas + " ]";
	}

}
