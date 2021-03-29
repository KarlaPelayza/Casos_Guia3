package com.senati.eti;
import java.util.Scanner;
public class Caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese número: ");
		int n = sc.nextInt();
		
		int i = 1,factorial= 1;
		
		if (n <= 7){
			while (i <= n){
			factorial *= i;
	        
			if (i < n)
				System.out.print(i + " * ");
			else
				System.out.print(i + " = " + factorial);
			
			i++;
			}
	    System.out.println("\n======== Resultados ========");
		System.out.println("------------------------------");
		System.out.println("El factorial de " + n + " es: "+ factorial);
}
		}

}


