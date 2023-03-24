/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * 
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
 * 
 * 
 */
package Guia2.Encuentro2y3;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class PracticaEj2MostrarString {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner reader = new Scanner(System.in)) {
            String palabra;
            System.out.print("Ingrese una Palabra: ");
            palabra=reader.next();
            System.out.println("La Palabra que ha ingresado es: " + palabra);
        }
    }
    
}
