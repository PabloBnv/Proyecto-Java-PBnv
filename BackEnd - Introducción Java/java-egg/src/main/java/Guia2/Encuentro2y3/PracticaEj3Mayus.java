/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * 
 * Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
 * 
 */
package Guia2.Encuentro2y3;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class PracticaEj3Mayus {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try (Scanner reader = new Scanner(System.in);){
            String palabra;
            System.out.print("Ingrese una Frase: ");
            palabra=reader.next();
            System.out.println("La frase que ha ingresado en Mayusculas: " + palabra.toUpperCase());
            System.out.println("La frase que ha ingresado en Minúsculas: " + palabra.toLowerCase());
        }
    }
}
