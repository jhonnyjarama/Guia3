package GUIA3;

import java.util.Scanner;

public class caso2 {

	public static void main(String[] args) {
		//Lea un número y calcule la sumatoria desde 1 hasta el número ingresado.
		//varibles
		//Lea un número y calcule la sumatoria desde 1 hasta el número ingresado.
		//varibles
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese número:  ");
		int n = sc.nextInt();
		int sumatoria = 0 ;
		int i = 1;
		String signo=" + ";
		while (i <= n) {
			sumatoria += i;
			System.out.print(i +  signo);
			i++;
			if (i==n) {
				signo=" = ";
			}
		}
		
			
			
		
		System.out.println( + sumatoria);
		System.out.println("\nLa sumatoria es : "+ sumatoria);
			
		
		}
	
	}
