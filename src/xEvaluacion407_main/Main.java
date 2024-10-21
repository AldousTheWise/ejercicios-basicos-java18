package xEvaluacion407_main;

import java.util.Scanner;

import xEvaluacion407_Modelo.Cocina;
import xEvaluacion407_Modelo.Refrigerador;

public class Main {
	
	public static void mostrarDetallesProducto(int precio, String caracteristicas, int cantidadDisponible) {
		System.out.println("Valor: " + precio + " pesos.");
		System.out.println("Cuenta con: " + caracteristicas);
		System.out.println("Artículos disponibles: " + cantidadDisponible + ".");
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cocina nuevaCocina = new Cocina(120000, 4, 4);
		Refrigerador nuevoRefrigerador = new Refrigerador(55000, 10, 'A', 2);
		
		
		System.out.println("Seleccione el producto a comprar: ");
		System.out.println("1. Cocina.");
		System.out.println("2. Refrigerador.");
		int opcion = sc.nextInt();
		sc.nextLine();
		
		switch (opcion) {
		case 1:
			mostrarDetallesProducto(nuevaCocina.getPrecio(), nuevaCocina.getCantidadQuemadores() + " quemadores.", nuevaCocina.getCantidad());
			System.out.println("Presione Y para continuar, N para cancelar.");
			
			String continuarCocina = sc.nextLine().toLowerCase().trim();
			if(continuarCocina.equals("y")) {
				System.out.println("Desea incluir un gas por $5000? si/no");
				String respuestaGas = sc.nextLine().toLowerCase().trim();
				
				nuevaCocina.setIncluyeGas(respuestaGas.equals("si"));
				
				nuevaCocina.setCantidad(nuevaCocina.getCantidad()-1);
				System.out.println("Felicidades! Ha comprado una cocina" + (nuevaCocina.incluyeGas() ? " incluyendo un gas.": "."));
				System.out.println("Nueva cantidad de artículos disponibles: " + nuevaCocina.getCantidad() + " .");
				
			} else {
				System.out.println("Compra cancelada.");
			}
			break;
		case 2:
			mostrarDetallesProducto(nuevoRefrigerador.getPrecio(), nuevoRefrigerador.getNumeroPuertas() + " puertas.", nuevoRefrigerador.getCantidad());
			System.out.println("Presione Y para continuar, N para cancelar.");
			String continuarRefri = sc.nextLine().toLowerCase().trim();
			if(continuarRefri.equals("y")) {
				nuevoRefrigerador.setCantidad(nuevoRefrigerador.getCantidad()-1);
				System.out.println("Felicidades! Ha comprado su nuevo refrigerador.");
				System.out.println("Nueva cantidad de artículos disponibles: " + nuevoRefrigerador.getCantidad() + ".");
			} else {
			 System.out.println("Compra cancelada.");
			}
			break;
		default:
			System.out.println("Ingrese una opción válida");
			break;
		}
		
		
		

		sc.close();

	}

}
