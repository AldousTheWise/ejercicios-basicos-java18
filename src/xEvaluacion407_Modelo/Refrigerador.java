package xEvaluacion407_Modelo;

import xEvaluacion407_Interface.ProductoInterface;

public class Refrigerador extends Producto implements ProductoInterface{
	protected char tipoGastoElectrico;
	protected int numeroPuertas;
	
	public Refrigerador(int precio, int cantidad, char tipoGastoElectrico, int numeroPuertas) {
		super(precio, cantidad);
		this.tipoGastoElectrico = tipoGastoElectrico;
		this.numeroPuertas = numeroPuertas;
	}
	
	/* Getters */
	public int getPrecio() { return precio; }
	public int getCantidad() { return cantidad; }
	public char getTipoGastoElectrico() { return tipoGastoElectrico; }
	public int getNumeroPuertas() { return numeroPuertas; }
	
	/* Setters */
	public void setPrecio(int precio) { this.precio = precio; }
	public void setCantidad (int cantidad) { this.cantidad = cantidad; }
	public void setTipoGastoElectrico (char tipoGastoElectrico) { this.tipoGastoElectrico = tipoGastoElectrico; }
	public void setNumeroPuertas (int numeroPuertas) { this.numeroPuertas = numeroPuertas; }

	@Override
	public void cambiarPrecio(int nuevoPrecio) {
		this.precio = nuevoPrecio;	
	}

	@Override
	public int cantidadDisponible() {
		return this.getCantidad();
	}
	
	@Override
	public String toString() {
		return "Refrigerador " + numeroPuertas + " puerta/s, Gasto Electrico Tipo: " + tipoGastoElectrico + ", precio: " + precio + ", cantidad disponible: " + cantidad;
	}

}
