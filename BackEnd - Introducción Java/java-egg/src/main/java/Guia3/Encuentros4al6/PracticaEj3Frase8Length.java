/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * 
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. 
 * Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
 * por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
 * Nota: investigar la función Lenght() en Java.
 * 
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class PracticaEj3Frase8Length {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try (Scanner leer = new Scanner(System.in)) {
            String frase;
            System.out.print("Ingrese una frase:");
            frase = leer.nextLine();
      
            if (frase.length()<= 8){
                System.out.print("Correcto");
            } else {
                System.out.print("Incorrecto");
            }
        } 
    }
}
