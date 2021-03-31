package GUIA3;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;

public class caso9 {
	public static void main(String[] args) {
		//Crear la instancia sc para crear el objeto Scanner
        Scanner sc = new Scanner(System.in);
        //Crear la instancia df para crear el objeto DecimalFormat
        DecimalFormat df = new DecimalFormat("#.00");
        //Cree la variable pregunta para usar en el while
        String pregunta = "S";
        //Asigne valores a mi contador  y demás valores necesarion
        int i = 1, si = 0, no = 0;
        float n1 =0 , n2 = 0, n3 = 0, mayo = 0, men = 0 ;
        String mayor = "", menor = "";
        while ( pregunta.equals("S") || pregunta.equals("s")) {
            System.out.println("\n------------------------------");
            System.out.println("Registro "+ (i) + ":");
            System.out.println("\n------------------------------");
            System.out.print("Ingrese nombre: ");
            String name = sc.nextLine();
            System.out.print("Ingrese nota 1: ");
             n1 = sc.nextFloat();
            System.out.print("Ingrese nota 2: ");
            n2 = sc.nextFloat();
            System.out.print("Ingrese nota 3: ");
            n3 = sc.nextFloat();
            System.out.print("Ingrese asistencia [1-12]: ");
            int asis = sc.nextInt();
            //Reinicie la lectura
            sc.nextLine();
            //Cree el array string para agregar los nombres
            String[] arrnombre = new String[i];
            //Coloque dentro cada nombre en orden
            arrnombre[i - 1] = name; 
            //Cree el array promedio para los promedios
            float [] promedio = new float[i];
            //Asignamos los promedios de acuerdo a especificaciones
            promedio[i-1] = n1 *0.2f+ n2*0.3f + n3*0.5f;
            //Utilizamos la regla de 3 simples para poner hallar el porcentaje de asistencia
            float por_asis = (asis/12f)* 100f;
            //Utilizamos la condicios sagasmente para que los valores mayo,men,menor y mayor tomen las asignaciones convenientes
            if ( (i - 1) == 0 ) {
                mayo= promedio[i -1];
                men= promedio[i -1];
                mayor = arrnombre[i-1];
                menor = arrnombre[i-1];
            }
            //Analizamos si se dan las siguientes condiciones
            if ( promedio[i -1] > mayo) {
                mayo = promedio[i -1];
                mayor = arrnombre[i-1];
                
            }
            if ( promedio[i -1] < men) {
                men = promedio[i -1];
                menor = arrnombre[i-1];
            }
            //Analizamos el estado de acuerdo a las siguientes condiciones
            String estado = " ";
            if ( promedio[i - 1] >= 13 && por_asis>= 70) {
                estado = "Obtiene Certificado";
                //Contador para saber quienes obtuvieron certificado
                si = si + 1;
            }
            else {
                estado = " No obtiene Certificado";
                //Contador para saber quienes  no obtuvieron certificado
                no = no + 1;
            }
            //Expresamos el resultado
            System.out.println("\n-------------");
            System.out.println("Resultados");
            System.out.println("\n-------------");
            System.out.println("Promedio  : "+df.format(promedio[i-1]));
            System.out.println("Asistencia  : "+df.format(por_asis) + "%");
            System.out.println("Estado  : "+ estado );
            i++;//Se aumenta en uno el contador
            System.out.println("\n-------------");
            System.out.print("\n¿Registrar otro? [ S/N ] : ");
            pregunta = sc.nextLine();
        }
        //Expresamos el resumen
        System.out.println("\n-------------");
        System.out.println("---RESUMEN---");
        System.out.println("\n-------------");
        System.out.println("Número de alumnos: "+(i-1) );
        System.out.println("Mayor promedio : "+ mayo + " pertenece a: " + mayor);
        System.out.println("Menor promedio : "+ men + " pertenece a: " + menor);
        System.out.println("Número de alumnos con certificado: "+ si );
        System.out.println("Número de alumnos sin certificado: "+ no );
    
	
	}

}

		
	


