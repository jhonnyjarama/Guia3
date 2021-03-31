package GUIA3;

import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		// Caso 4: Lea cuatro números enteros y muestre cuál es el mayor de todos los números ingresados.
		//variables
		int i =1,nmay=0;
		int n=0;
		//entrada de datos con while
		while (i<=5) {
			Scanner sc=new Scanner(System.in);
			System.out.print("ingresa el numero "+i+" : ");
			n=sc.nextInt();
			if (n > nmay) {
				nmay=n;
				
			}
			i++;
			
		}
		System.out.println("**********resultados************");
		System.out.println("el numero mayor es : "+nmay);
		
	}

}
