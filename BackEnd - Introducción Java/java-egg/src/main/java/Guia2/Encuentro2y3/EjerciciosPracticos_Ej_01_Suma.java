/*
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos.
 * El programa deberá después mostrar el resultado de la suma
 *
 *
 */
package Guia2.Encuentro2y3;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_01_Suma {
  public static void main(String[] args) {
      try (Scanner reader = new Scanner(System.in)) {
        int numero1 = 0;
        int numero2 = 0;
        System.out.print("Introduce el primer número: ");
        numero1 = reader.nextInt();
        System.out.print("Introduce el segundo número:");
        numero2 = reader.nextInt();
        int resultado = numero1+numero2;
        System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado);
      }
    }
    
}
