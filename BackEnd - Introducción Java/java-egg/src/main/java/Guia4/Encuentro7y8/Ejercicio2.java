/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia4.Encuentro7y8;

import java.util.Scanner;

/**
 *
 * @author PAbloBnv
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.print("Introduce una frase: ");
        frase= leer.nextLine();
        frase= frase.toUpperCase();
        if (frase.equals("EUREKA")){
            System.out.println("La frase es eureka");
        }
        else {
            System.out.println("La frase no es eureka");
        }
    }
    
}
