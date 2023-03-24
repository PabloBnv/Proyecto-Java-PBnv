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
public class Ejercicio8Diferente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
                        
        System.out.print("Ingrese el largo del lado:");
        int lado = leer.nextInt();
        
        for (int i = 1; i < lado; i++) {
            
            if (i==1 || i==lado){
                for (int j = 0; j < lado;) {
                    System.out.print("* ");
                }
                System.out.println("");
            }else {
                System.out.print("* ");
                for (int j = 0; j < lado-2;){
                  System.out.print("  ");
                }
            }     
        }
       System.out.println("");
    }
}
    

