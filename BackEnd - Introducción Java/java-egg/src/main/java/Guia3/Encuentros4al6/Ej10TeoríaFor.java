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
public class Ej10TeoríaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        
        int num = 0;
        
        
        for (int i = 0; i < 4; i++) {
        
            System.out.print("Ingrese un numero:");
            num = leer.nextInt();
            System.out.print(num + " ");
            for (int j= 0; j!= num; j++){
                System.out.print("*");
            }
            System.out.println();
    	
        
    	}
    }
}

