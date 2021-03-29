package com.senati.eti;
import java.util.Scanner;
public class Caso7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		for (int x = 1; x <= 10; x++)
			System.out.println(x + ". Bienvenido(a) " + nombre + " al curso");
		
		System.out.println("\n");
		
		for (int j = 10; j >= 1; j -= 2)
			System.out.println("Valor " + j);

	}

}