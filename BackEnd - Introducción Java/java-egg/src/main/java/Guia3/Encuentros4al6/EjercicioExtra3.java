/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/**
 *
 * @author ViejoHucha
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String vocal;
        System.out.print("Ingresar una letra: ");
        vocal= leer.next();
        vocal= vocal.toUpperCase();
        
        if (vocal.equalsIgnoreCase("A")||vocal.equalsIgnoreCase("E")||vocal.equalsIgnoreCase("I")||vocal.equalsIgnoreCase("O")||vocal.equalsIgnoreCase("U")){
        
            System.out.println("Es una vocal");
        
        }else {
            System.out.println("No es una vocal");
                    }
        
        
    }
    
}
