package xEvaluacion407_Modelo;

import xEvaluacion407_Interface.CocinaInterface;

public class Cocina extends Producto implements CocinaInterface {
	protected int cantidadQuemadores;
	protected boolean incluyeGas;

	public Cocina(int precio, int cantidad, int cantidadQuemadores) {
		super(precio, cantidad);
		this.cantidadQuemadores = cantidadQuemadores;
	}

	
	/* Getters */
	public int getPrecio() { return precio; }
	public int getCantidad() { return cantidad; }
	public int getCantidadQuemadores() { return cantidadQuemadores; }
	
	/* Setters */
	public void setPrecio(int precio) { this.precio = precio; }
	public void setCantidad(int cantidad) { this.cantidad = cantidad; }
	public void setCantidadQuemadores (int cantidadQuemadores) { this.cantidadQuemadores = cantidadQuemadores; } 
	
	@Override
	public void cambiarPrecio(int nuevoPrecio) {
		this.setPrecio(nuevoPrecio);	
	}

	@Override
	public int cantidadDisponible() {
		return this.getCantidad();
	}

	@Override
	public boolean incluyeGas() {
		return incluyeGas;
	}

	@Override
	public void setIncluyeGas(boolean incluyeGas) {
		this.incluyeGas = incluyeGas;
		
		if (this.incluyeGas) {
			this.cambiarPrecio(precio + 5000);
		}	
	}
	
	@Override
	public String toString() {
		return "Cocina [Cantidad de Quemadores: " + cantidadQuemadores + ", precio: " + precio + ", cantidadDisponible: " + cantidad;
	}

}
