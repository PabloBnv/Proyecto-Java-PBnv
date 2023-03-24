/*
 * 
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
 * debajo de 1.60 mts. y el promedio de estaturas en general.
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

 /*
 *
 * @author PabloBnv
 */
public class Extra_Ej_06_PromedioEstatura {

    public static void main(String[] args) {

            double estat, promedioB = 0, promedioT = 0;
            int bajos = 0, N;
            
            System.out.println("**************************************");
            System.out.println("*                                    *");
            System.out.println("*            Promedio Estatura       *");
            System.out.println("*                                    *");
            System.out.println("**************************************"); 
            
            try (Scanner leer = new Scanner(System.in)) {
                System.out.print("Ingresar valor N: ");
                N = leer.nextInt();
                
                for (int i = 0; i < N; i++) {
                    System.out.print("Ingresar estatura: ");
                    estat = leer.nextDouble();
                        if (estat <= 1.6) {
                            bajos++;
                            promedioB = promedioB + estat;
                            promedioT = promedioT + estat;
                        } else {
                            promedioT = promedioT + estat;
                        }
                }
        
                promedioT = promedioT / N;
                promedioB = promedioB / bajos;
                System.out.println("Promedio de estatura total: " + promedioT + " promedio de estatura menor: " + promedioB);
            }
    }

}
