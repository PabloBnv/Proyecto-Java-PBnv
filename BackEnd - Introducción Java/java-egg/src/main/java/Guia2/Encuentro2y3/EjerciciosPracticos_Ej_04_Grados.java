/*
 * 
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * 
 */
package Guia2.Encuentro2y3;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_04_Grados {

    public static void main(String[] args) {
       try (Scanner reader = new Scanner(System.in)) {
        int tempC = 0;
           System.out.print("Introduce la temperatura en grados Celcios: ");
           tempC = reader.nextInt();
           int resultado = 32 + (9 * tempC /5);
           System.out.println("Los grados Celcios ingresados son " + tempC + "°C en grados Fahrenheit Serían = " + resultado +"°F");
    }
    }
    
}
