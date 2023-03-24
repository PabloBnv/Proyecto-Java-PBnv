/*
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 * 
 * 
 */
package Guia2.Encuentro2y3;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_02_LecturaFrase {

    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            String palabra;
            System.out.print("Ingrese una Palabra: ");
            palabra=reader.next();
            System.out.println("La Palabra que ha ingresado es: " + palabra);
        }
    }
    
}
