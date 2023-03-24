/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/**
 *
 * @author ViejoHucha
 */
public class EjercicioExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      int a=1, b=2, c=3, d=4, aux ;
      Scanner leer= new Scanner (System.in);  
      System.out.print("Los valores iniciales son: ");
      System.out.println("A: " + a + " B: " + b + " C: " + c + " D: " + d);
      
      aux= b;
      
      b=c;
      c=a;
      d=b;
      System.out.print("Los valores finales son: ");
      System.out.println("A: " + a + " B: " + b + " C: " + c + " D: " + d);
      
      
      
      
      
      
    }
    
}
