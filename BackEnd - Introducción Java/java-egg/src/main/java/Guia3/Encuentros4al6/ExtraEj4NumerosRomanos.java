/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * 
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10
 * y se muestre su equivalente en romano.
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 *
 * @author ViejoHucha
 */
public class ExtraEj4NumerosRomanos {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      try (Scanner sc = new Scanner(System.in)) {
          int N;
           do {
                  System.out.print("Introduce un número entre 1 y 10: ");
                  N = sc.nextInt();
           } while (N < 1 || N > 10);
           System.out.println(N + " en numeros romanos -> " + convertirANumerosRomanos(N));
     }                            
  }

  //método para pasar a números romanos
  public static String convertirANumerosRomanos(int numero) {
      int i, unidades;
      String romano = "";
      
      
      unidades = numero % 10;

      //unidades
      if (unidades == 9) {
          romano = romano + "IX";
      } else if (unidades >= 5) {
                 romano = romano + "V";
                 for (i = 6; i <= unidades; i++) {                                                           
                      romano = romano + "I";
                 }
      } else if (unidades == 4) {
                 romano = romano + "IV";
      } else {
                 for (i = 1; i <= unidades; i++) {
                      romano = romano + "I";
                 }
      }
      return romano;
  }
}
