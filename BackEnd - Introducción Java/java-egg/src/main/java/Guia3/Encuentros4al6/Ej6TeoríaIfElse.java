/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/**
 *
 * @author PabloBnv
 */
public class Ej6TeoríaIfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
      int numero1 = 0;
      int numero2 = 0;
      System.out.print("Introduce el primer número: ");
      numero1 = reader.nextInt();
      System.out.print("Introduce el segundo número:");
      numero2 = reader.nextInt();
     
      if (numero1 > 25 || numero2 > 25){
      
          System.out.println("Uno de los números ingresados es mayor a 25.");
      
      }
          
          
      
      
      
    }
    
}
