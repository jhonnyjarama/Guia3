package GUIA3;

import java.util.Scanner;
import java.util.*;

public class caso5 {
	

	public static void main(String[] args) {
		//Caso 5: Lea cinco n�meros enteros y muestre cu�l es el menor de todos los n�meros ingresados.
		//variables
		int i =1;
		double nmen=Double.POSITIVE_INFINITY;
		int n=0;
		//entrada de datos multiples con while
		while (i<=5){
			Scanner sc=new Scanner(System.in);
			System.out.print("ingresa el numero "+i+" : ");
			n=sc.nextInt();
			if (n < nmen) {
				nmen=n;
				
			}
			i++;
		}
		System.out.println("el numero menor es : "+(int)nmen);
	}
}



