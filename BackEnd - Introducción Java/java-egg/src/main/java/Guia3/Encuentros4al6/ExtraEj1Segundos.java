/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * 
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo,
 * si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class ExtraEj1Segundos {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int dias=0, horas=0, minutos=0;
        try (Scanner leer = new Scanner (System.in)) {
            System.out.print("Ingresar cantidad de minutos: ");
            int min= leer.nextInt();
            while (min>= 1440){
                min= min -1440;
                dias++;
            }
            while (min>=60){
                min= min -60;
                horas++;
            }
            while (min >0){
                min= min -1;
                minutos++;
            }
            
             System.out.println(dias + " dias " + horas + " horas " + minutos + " minutos.");
        }
    }
    
}
