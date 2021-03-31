package GUIA3;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class caso11 {

	public static void main(String[] args) {
		//Crear la instancia sc para crear el objeto Scanner
        Scanner sc = new Scanner(System.in);
        //Crear la instancia df para crear el objeto DecimalFormat
        DecimalFormat df = new DecimalFormat("#.00");
        //Cree la variable pregunta para usar en el while
        String pregunta = "S";
        //Asignamos valores al contador y demás
        int i = 1, si = 0;
        float ht =0 , tp = 0,bruto = 0, dsc = 0, min = 0, bon = 0, por_asist = 0, men = 0 , mayo = 0;
        String mayor = "", menor = "", cm = "";
        //Utilizamos el metodo toUpperCase() para convertir  un String  en mayuscula
        String pre = pregunta.toUpperCase();
        //Utilizamos el bucle while para poder ingresar indeterminados bucles
        while ( pre.equals("S")) {
            //Ingresamos los datos necesarios
            System.out.println("\n------------------------------");
            System.out.println("Registro de empleado ("+ (i) + "):");
            System.out.println("\n------------------------------");
            System.out.print("Empleado: ");
            String name = sc.nextLine();
            System.out.print("Horas trabajadas: ");
             ht = sc.nextFloat();
             System.out.print("Tarifa por hora :  ");
             tp = sc.nextFloat();
             //Creamos elarray arrmin para colocar los minutos
             Float [] arrmin = new Float[i];
             //Asignamos los valores correspondientes
             System.out.print("Minutos de tardanza :  ");
             arrmin[i-1] = sc.nextFloat();
            //Reinicie la lectura
            sc.nextLine();
            //Operamos el sueldo bruto
             bruto = ht * tp;
             //Analizamos las condiciones para hallar el bono
             if ( ht > 80) bon = bruto *0.15f;
             else if ( ht > 70 && ht <= 80) bon = bruto * 0.13f;
             else if ( ht > 60 && ht <= 70) bon = bruto * 0.08f;
             else if ( ht > 50 && ht <= 60) bon = bruto * 0.02f;
             else bon = 0;
             //De igual manera el descuento
             if (arrmin[i-1] <= 15) dsc = 0;
             else if ( arrmin[i-1]  > 15 && arrmin[i-1]  <=  30) dsc = arrmin[i-1] * (bruto*0.03f);
             else if ( arrmin[i-1]  > 30) dsc = arrmin[i-1] * (bruto*0.05f);
             //Creamos el arrays para el sueldo neto
             Float [] arrneto = new Float[i];
             //Asignamos los valores el neto en cada caso
             arrneto [i-1] = bruto + bon - dsc;
             //Hallamos el porcentaje de asistencia de acuerdo a la regla de 3 simples
             por_asist = (ht * 100f)/80f;
             //Acordamos en la primera vuelta igualar todos los valores cambiantes para las condiciones siguientes
             if ( (i-1) == 0) {
                    mayo = arrneto[i-1];
                    men = arrneto[i-1];
                    min = arrmin[i-1];
                    mayor = name;
                    menor = name;
                    cm = name;
                }
             //Las condiciones para hallar los netos mayoresa,menores y minutos mayores con sus respectivos nombres
             if (arrneto[i-1] < men) {
                 men = arrneto[ i-1];
                 menor = name;
             }
             if (arrneto[i-1] > mayo) {
                 mayo = arrneto[ i-1];
                 mayor = name;
             }
             if (arrmin[i-1] > min) {
                 min = arrmin[ i-1];
                 cm = name;
             }
             //Utilizamos el contador para poder saber cuantas personas superaron o igualaron el 90 %
             if ( por_asist >= 90) si = si +1;
            //Expresamos el resultado
                System.out.println("\n-------------");
                System.out.println("Resultados");
                System.out.println("\n-------------");
                System.out.println("Sueldo bruto: "+df.format(bruto));
                System.out.println("Bonificacion : "+df.format(bon));
                System.out.println("Descuento : "+df.format(dsc));
                System.out.println("Suelto neto : "+df.format(arrneto[i-1]));
                System.out.println("Asistencia  : "+df.format(por_asist) + "%");
                System.out.println("***********");
                i++;//Se aumenta en uno el contador
                System.out.println("\n-------------");
                System.out.print("\n¿Nuevo empleado? [ S/N ] : ");
                pregunta = sc.nextLine();
                //Utilizamos el metodo toUpperCase() para convertir  un String  en mayuscula
                pre = pregunta.toUpperCase();
        }
        //Expresamos el resumen
        System.out.println("\n-------------");
        System.out.println("---RESUMEN---");
        System.out.println("\n-------------");
        System.out.println("Número de empleados: "+(i-1) );
        System.out.println("Sueldo neto mayor : "+ df.format(mayo) + " pertenece a: " + mayor);
        System.out.println("Sueldo neto menor: "+ df.format(men) + " pertenece a: " + menor);
        System.out.println("Empleado con la mayor cantidad de minutos de tandanza : "+ cm + "( " + df.format(min)+ " min.)" );
        System.out.println("Cantidad de empleados con más del 90% de la meta: "+ si );



}



}

