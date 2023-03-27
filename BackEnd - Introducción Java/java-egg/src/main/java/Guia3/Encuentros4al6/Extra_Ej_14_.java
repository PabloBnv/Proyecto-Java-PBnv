/*
 * 
 * Se dispone de un conjunto de N familias, cada una de 
 * las cuales tiene una M cantidad de hijos. Escriba un
 * programa que pida la cantidad de familias y para cada
 * familia la cantidad de hijos para averiguar la media
 * de edad de los hijos de todas las familias.
 * 
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 * 
 * @autor Pablo Bnv
 */
public class Extra_Ej_14_ {

    /*
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*           Prom Hijos x Familia     *");
        System.out.println("*                                    *");
        System.out.println("**************************************"); 

        
        try(Scanner leer = new Scanner(System.in)){

            System.out.print("Ingrese la cantidad de familias:");
            int numF = leer.nextInt();
            int numH=0;
            double prom=0.0;

            for (int i=0;i<numF;i++){

                System.out.println("Familia n°"+i+1+" ");
                System.out.print("Ingrese la cantidad de hijos:");
                prom= numH +leer.nextInt();
                

            }

            System.out.println("El promedio de hijos por familia es de: "+prom);

        }
    }
}
