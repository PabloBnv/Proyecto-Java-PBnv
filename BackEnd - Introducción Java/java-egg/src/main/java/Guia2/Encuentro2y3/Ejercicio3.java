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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       String palabra;
       System.out.print("Ingrese una Frase: ");
       palabra=reader.next();
       System.out.println("La frase que ha ingresado en Mayusculas: " + palabra.toUpperCase());
       System.out.println("La frase que ha ingresado en Minúsculas: " + palabra.toLowerCase());
    }
}
