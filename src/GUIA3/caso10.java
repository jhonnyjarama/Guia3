package GUIA3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
		//Caso 10: Lea los siguientes datos: 
		//empleado, horas trabajadas, tarifa por hora y el número de minutos de tardanza, se pide calcular: 
		//▪ Sueldo bruto: Es el producto de las horas trabajadas y la tarifa por hora. 
		//▪ Bonificación: Calcule según la cantidad de horas trabajadas: 
		//o Hasta 50 horas, será 0. 
		//o Más de 50 y hasta 60 horas, será 2% del sueldo bruto. 
		//o Más de 60 y hasta 70 horas, se aplica 8% del sueldo bruto 
		//o Más de 70 y hasta 80 horas, se aplica 13% del sueldo bruto. 
		//o Más de 80 horas, se aplica 15% del sueldo bruto. 
		//▪ Descuento: Calcule según los minutos de tardanza: 
		//o Hasta 15 minutos, será 0. 
		//o Más de 15 y hasta 30 minutos, se aplica 0.3% del sueldo bruto por minuto. 
		//o Más de 30 minutos, se aplica 0.5% del sueldo bruto por minuto. 
		//▪ Sueldo neto: Sume el sueldo bruto y la bonificación, luego reste el descuento. 
		//▪ % Alcanzado: Se considera como meta alcanzar un total de 80 horas trabajadas. 
		//Al finalizar el ingreso de los datos, se debe solicitar si se continúa con otro registro
		//Crear la instancia sc para crear el objeto Scanner
        Scanner sc = new Scanner(System.in);
        //Crear la instancia df para crear el objeto DecimalFormat
        DecimalFormat df = new DecimalFormat("#.00");
        //Cree la variable pregunta para usar en el while
        String pregunta = "S";
        //varibles contadores
        int i = 1, si = 0;
        //variables iniciales
        String empleado,mayor=" ",menor=" ";
        int horast,mintar,por_asist=0;  
        float tarifah ,mayo = 0, men = 0,mayo1=0,porcal;
        while ( pregunta.equals("S") || pregunta.equals("s")) {
            System.out.println("\n------------------------------");
            System.out.println("Registro "+ (i) + ":");
            System.out.println("\n------------------------------");
            System.out.print("Ingrese nombre: ");
            empleado = sc.nextLine();
            System.out.print("horas trabajadas: ");
            horast= sc.nextInt();
            System.out.print("tarifa por hora: ");
            tarifah= sc.nextFloat();
            System.out.print("minutos de tardanza: ");
            mintar= sc.nextInt();
          //Reinicie la lectura
            sc.nextLine();
          //sueldo bruto 
			float sueldob=horast*tarifah;
			
			//bonificacion
			float boni=0,desc=0,sueldon=0,porc=0;
			if (horast>0&&horast<=50) {
				boni=sueldob;	
			}
			
			else if (horast>50 && horast<=60) {
				boni=sueldob*(float)0.02;
				
			}
			else if (horast>60&&horast<=70) {
				boni=sueldob*(float)0.08;
				
			}
			else if (horast>70&&horast<=80) {
				boni=sueldob*(float)0.13;
				
			}
			else if (horast>80) {
				boni=sueldob*(float)0.15;
			}
			
			//descuento
			if (mintar>=0 && mintar<=15) {
				desc=(float)0.0;
				
			}
			else if (mintar>15 && mintar<=30) {
				desc=(float)0.03;
				
			}
			else if (mintar>30) {
				desc=(float)0.05;
				
			}
			//sueldo neto
			sueldon=(sueldob+boni)-desc;
			//creamos un array  arrnombre para empleado
			 String[] arrnombre = new String[i];
	         //Coloque dentro cada nombre en orden
	          arrnombre[i - 1] = empleado; 
			//Cree el array sueldon1 para el sueldo netos
			float [] sueldon1 = new float[i];
            //Asignamos los promedios de acuerdo a especificaciones
            sueldon1[i-1] =sueldon;
          //Cree el array mintarda para el mintar
			float [] mintarda = new float[i];
            //Asignamos los promedios de acuerdo a especificaciones
			mintarda[i-1] =mintar;
            
            //Utilizamos la condicios sagasmente para que los valores mayo,men,menor y mayor tomen las asignaciones convenientes
            if ( (i - 1) == 0 ) {
                mayo= sueldon1[i -1];
                men= sueldon1[i -1];
                mayor = arrnombre[i-1];
                menor = arrnombre[i-1];
                mayo1=mintarda[i-1];
            }
            //Analizamos si se dan las siguientes condiciones
            if ( sueldon1[i -1] > mayo) {
                mayo = sueldon1[i -1];
                mayor = arrnombre[i-1];
                
            }
            if ( sueldon1[i -1] < men) {
                men = sueldon1[i -1];
                menor = arrnombre[i-1];
            }
            if (mintarda[i-1]>mayo1) {
            	mayo1 = mintarda[i -1];
                mayor = arrnombre[i-1];
				
			}
        
		
			
			//%alcansado
			porcal=(horast/80f)*100;
			//Utilizamos el contador para poder saber cuantas personas superaron o igualaron el 90 %
            if ( porcal >= 90) {
            	si ++;
            }		
			System.out.println("\nResultados ");
			System.out.println("------------ ");
			System.out.println("empleado: "+empleado);
			System.out.println("Sueldo bruto: " + df.format(sueldob));
			System.out.println("Bonificacion: " + df.format(boni));
			System.out.println("Descuento: " + df.format(desc));
			System.out.println("Sueldo neto: " +df.format(sueldon));
			System.out.println("porcentaje alcanzado: " +df.format(porcal)+" %");
			
			System.out.println("*************************");
			System.out.println("¿Registrar otro <S/N>?: ");
		    pregunta = sc.nextLine();
		    i++;
        
        
        
        
        }	
        
        System.out.println("**resumen**");
		System.out.println("numero de empleados registrados: "+(i-1));
		System.out.println("Sueldo neto mayor:"+df.format(mayo)+" pertenece a: "+mayor);
		System.out.println("Sueldo neto menor:"+df.format(men)+" pertenece a: "+menor);
		System.out.println("numero de alumnos con mayor cantidad de tardansas: "+df.format(mayo1)+"min pertenece a: "+mayor);
		System.out.println("cantidad de empleados con mas del 90% de la meta: "+si);
	}	
	


}	




