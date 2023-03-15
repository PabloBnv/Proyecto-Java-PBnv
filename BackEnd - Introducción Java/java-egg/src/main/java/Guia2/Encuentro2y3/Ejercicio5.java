/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia2.Encuentro2y3;

import java.util.Scanner;

/**
 *
 * @author PabloBnv
 */
public class Ejercicio5 {

   
    public static void main(String[] args) {
      Scanner reader = new Scanner(System.in);
      int num1 = 0;
      System.out.print("Introduce un número: ");
      num1 = reader.nextInt();
     // int res1 = num1 * 2;
      //int res2 = num1 * 3;
      //int res3 = (num1.);
      
      System.out.println("El número ingresado es: " + num1);
      System.out.println(" El doble sería: " + (num1*2));
      System.out.println(" El triple sería: " + (num1*3));
      System.out.println(" La Raíz Cuadrada sería:  " + Math.sqrt(num1));
              
        
    }
    
}
