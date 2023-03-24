/*
 * 
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
 * 
 */
package Guia2.Encuentro2y3;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_03_Mayus {
    public static void main(String[] args) {
       try (Scanner reader = new Scanner(System.in);){
            String palabra;
            System.out.print("Ingrese una Frase: ");
            palabra=reader.next();
            System.out.println("La frase que ha ingresado en Mayusculas: " + palabra.toUpperCase());
            System.out.println("La frase que ha ingresado en Minúsculas: " + palabra.toLowerCase());
        }
    }
}
