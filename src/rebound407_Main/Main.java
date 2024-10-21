package rebound407_Main;

import java.util.Scanner;

import rebound407_Modelo.Auto;
import rebound407_Modelo.Bicicleta;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cómo nos movemos hoy? (Auto/Bicicleta)");
		String opcion = sc.nextLine().toLowerCase().trim();		
		
		if (opcion.equals("bicicleta")){
			System.out.println("Cómo es tu bici?");
			String descripcion = sc.nextLine();
			System.out.println(descripcion);
			
			Bicicleta miBici = new Bicicleta(2, 0, descripcion);
			Boolean salir = false;
			
			do {
				System.out.println("Qué haremos hoy?");
				
				System.out.println("1. Mirar la bici.");
				System.out.println("2. Empezar a pedalear.");
				System.out.println("3. Freno de emergencia!");
				System.out.println("4. Frenar.");
				
				
				int opcionBici = sc.nextInt();
				sc.nextLine();
				
				switch (opcionBici) {
				case 1:
					System.out.println(miBici.toString());
					break;
				case 2:
					miBici.encender();
					break;
				case 3:
					miBici.frenarDeEmergencia();
					break;
				case 4:
					miBici.apagar();
					salir = true;
					break;
				default:
					System.out.println("No puedes hacer eso!");
					break;
				}
				
			} while (!salir);
			
		} else if(opcion.equals("auto")) {
			System.out.println("Si pedaleas mejorarás tu salud y te saldrá gratis comenzar an andar!!");
			System.out.println("------------------------------------");
			String modelo = null, color = null;
			Auto miAuto = new Auto(0, 0, modelo, color);
			
			miAuto.setNumeroRuedas(4);
			miAuto.setCantidadVentanas(6);
			System.out.println("¿Cuál es el modelo de tu auto?");
			miAuto.setModelo(sc.nextLine());
			System.out.println("¿Cuál es el color de tu auto?");
			miAuto.setColor(sc.nextLine());
			Boolean salir = false;
			Boolean encendido = false;
			
			do {
				System.out.println("Qué haremos hoy?");
				
				System.out.println("1. Mirar el auto.");
				System.out.println("2. Cargar bencina.");
				System.out.println("3. Poner la llave.");
				System.out.println("4. Pisar el freno.");
				
				
				int opcionAuto = sc.nextInt();
				sc.nextLine();
				
				switch (opcionAuto) {
				case 1:
					System.out.println(miAuto.toString());
					break;
				case 2:
					if (!encendido) {
						miAuto.cargarBencina(sc);
					} else {
						System.out.println("No se puede cargar bencina con el auto encendido");
					}
					break;
				case 3:
					miAuto.encender();
					encendido = true;
					break;
				case 4:
					miAuto.apagar();
					encendido = false;
					salir = true;
					break;
				default:
					System.out.println("No puedes hacer eso!");
					break;
				}
				
			} while (!salir);
			
		} else {
			System.out.println("Aun no tenemos helicoptero");
		}
		
		
		
		
		
		sc.close();

	}

}
