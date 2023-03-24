/*
 * Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, 
 * el triple y la raíz cuadrada de ese número. 
 * Nota: investigar la función Math.sqrt().
 * 
 */
package Guia2.Encuentro2y3;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_05_Math {
  public static void main(String[] args) {
      try (Scanner reader = new Scanner(System.in)) {
        int num1 = 0;
        System.out.print("Introduce un número: ");
        num1 = reader.nextInt();
        System.out.println("El número ingresado es: " + num1);
        System.out.println(" El doble sería: " + (num1*2));
        System.out.println(" El triple sería: " + (num1*3));
        System.out.println(" La Raíz Cuadrada sería:  " + Math.sqrt(num1));
      }
    }
}
