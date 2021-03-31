package GUIA3;

import java.util.Scanner;

public class caso6 {

	public static void main(String[] args) {
		//Lea los siguientes datos: nombre y edad, luego: 
		//▪ Muestre un mensaje si es “Apto para votar” o “Menor de edad”. 
		//▪ Al finalizar el ingreso de los datos, se debe solicitar si se continúa con otro registro. 
		//▪ Si no se continua, muestre un resumen como se muestra en el modelo.
		Scanner sc = new Scanner(System.in);
		String name = "", estado = "", continuar = "S"  ;
		int edad = 0, num = 0, vota = 0;
		//  |  -> ALT  124
		while (continuar.equals("S") || continuar.equals("s") ){ 
			num ++;
			System.out.println("*************");
			System.out.println("**REGISTRO[ "+ num + " ]***");
			System.out.println("*************");
			System.out.print("Nombre del participante: ");
			name = sc.nextLine();
			System.out.print("edad del participate: ");
			edad = sc.nextInt();
			if (edad >= 18) {
				estado = "Apto para votar" ;
				vota ++;
			}
			else 
				estado = "Menor de edad";
			
		System.out.println("Estado del participante: "+ estado);

			//Reiniciar la parte de lectura
			sc.nextLine();
			System.out.print("Desea continuar con otro participante < S/N >: ");
			continuar = sc.nextLine();
			}
		
		System.out.println("RESUMEN");
		System.out.println("--------------");
		System.out.println("Participantes registrados: "+ num);
		System.out.println("Cantidad de participantes aptos para votar: "+ vota);
	}	
}



	


