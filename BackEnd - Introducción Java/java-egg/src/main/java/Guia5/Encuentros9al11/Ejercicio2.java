/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5.Encuentros9al11;

import java.util.Scanner;

/**
 *
 * @author PabloBnv
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int num1, cont;
        int[] vector = new int[20];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
            System.out.print(" " + vector[i]);
        }
        System.out.println(" ");
        System.out.println("ingrese un numero para buscarlo en el vector: ");
        num1 = leer.nextInt();
        cont=0;
        for (int i = 0; i < vector.length; i++) {
           if (vector[i]==num1){
              cont++; 
               System.out.println("Su numero "+num1 +" se encuentra en la posicion; "+(i+1));
               
           } 
            
            
        }
        System.out.println("Su numero esta repetido " +cont+ " veces. ");
    }
    
}
