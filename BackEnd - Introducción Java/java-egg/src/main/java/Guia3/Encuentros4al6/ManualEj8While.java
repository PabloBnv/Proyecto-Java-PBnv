/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class ManualEj8While {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int respuesta = 0;
 	
            System.out.println("Ingrese la nota: ");
            respuesta = leer.nextInt();
      
            while ((respuesta < 0) || (respuesta >10)) {
                System.out.println("Ingrese la nota: ");
                respuesta = leer.nextInt();
  	        }
        }
    }
    
}
