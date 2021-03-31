package GUIA3;

import java.util.Iterator;
import java.util.Scanner;

public class caso8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su numero: ");
		int n = sc.nextInt();
		
		System.out.println("tabla de multiplicar "+n);
		
		
		for (int i = 1; i <=15; i++) {
			System.out.println(n+" x "+i+" = "+(n*i));
		}
	}

}
