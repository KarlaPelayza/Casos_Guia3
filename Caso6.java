package com.senati.eti;
import java.util.Scanner;
public class Caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int nr =0, edad = 0, num_aptos = 0;
		String nombre = "", estado = "", rpta = "S";
		
		while (rpta.equals("S") || rpta.equals("s")) {
			nr++;
			System.out.println("===========================");
			System.out.println("=== R E G I S T R O [" + nr + "] ===");
			System.out.println("===========================");
			
			System.out.print("Nombre del participante: ");
			nombre = sc.nextLine();
			
			System.out.print("Edad del participante: ");
			edad = sc.nextInt();
			
			if (edad >= 18) {
				estado = "Apto para votar";
				num_aptos ++;
			}
			else
				estado = "No apto para votar";
			
			System.out.println("Estado :" + estado);
			
			sc.nextLine();
			
			System.out.print("\n?Desea registrar otro participante <S/N>: ");
			rpta = sc.nextLine();
		}
		
		System.out.println("=======================");
		System.out.println("==== R E S U M E N ====");
		System.out.println("Participante registrados: " + nr);
		System.out.println("Cantidad de participantes aptos para votar: " + num_aptos);

	}

}
