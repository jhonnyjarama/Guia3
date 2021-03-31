package GUIA3;

import java.util.Scanner;

public class caso3 {

	public static void main(String[] args) {
		//Lea número y calcule el factorial desde 1 hasta el número ingresado, solo considere realizar 
		//la operación para números hasta 7, sino muestre un mensaje apropiado.
		//VARIABLES
		int n1;
		//entrada de datos
		Scanner sc=new Scanner(System.in);
		System.out.print("ingresa un numero: ");
		n1=sc.nextInt();
		//while
		int i=1;
		int fac=1;
		String signo=" * ";
		if (n1<=7) {
			while (i<=n1) {
				fac*=i;
				System.out.print(i+signo);
				i++;
				if (n1<=7) {
					if (i==n1) {
						signo=" = ";
				}
					
				
				}
				
				
			}
			System.out.println(" " + fac);
			
		}
		else {
			System.out.println("el numero es mayor que 7");
		}
		}
		
		
	}


