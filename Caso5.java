package com.senati.eti;
import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = 1, num_menor = 0, n = 0;
		
		while (i <= 4) {
			System.out.print("Ingrese número " + i + " : ");
			n = sc.nextInt();
			
			if (i == 1)
				num_menor = n;
			
			if (n < num_menor)
				num_menor = n;
			
			i++;
		}
		
		System.out.println("------------------------");
		System.out.println("RESULTADO");
		System.out.println("------------------------");
		System.out.println("El número menor es: "+ num_menor);
	}

}
