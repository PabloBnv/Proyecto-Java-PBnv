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
public class EjVideo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        Scanner leer = new Scanner(System.in);
        
        
        do {
            System.out.println("Ingrese un número entero positivo:");
            num = leer.nextInt();
            if (num > 1000){
                System.out.print("Este programa podría tardar, ¿Está seguro? (s/n): ");
                String confirma = leer.next();
                if (confirma.equals("S")){
                    break;
                }
            }
        }while (num <= 0 || num > 1000);
        
        
        int j, suma;
        
        for (int i = 0; i <= num ; i++){
        
            if (i % 2 != 0)
                continue;
                suma = 0;
                j = 1;
                
                while (j <= i){
                    suma += j;
                    j++;
                    
                }
            
            
            
        
        }
        
        
        
        
    }
}
