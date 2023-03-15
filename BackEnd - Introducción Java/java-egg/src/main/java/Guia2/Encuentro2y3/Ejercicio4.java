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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       int tempC = 0;
       System.out.print("Introduce la temperatura en grados Celcios: ");
       tempC = reader.nextInt();
       int resultado = 32 + (9 * tempC /5);
       System.out.println("Los grados Celcios ingresados son " + tempC + "°C en grados Fahrenheit Serían = " + resultado +"°F");
    }
    
}
