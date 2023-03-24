/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia4.Encuentro7y8;

import java.util.Scanner;

/**
 *
 * @author PabloBnv
 */
public class Ej4Teoría {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        String clave="si", nombre="";
        int edad=0;
        Scanner leer= new Scanner (System.in);
        do{
          
            System.out.println("Ingrese nombre");
            nombre=leer.nextLine();
            System.out.println("Ingrese edad");
            edad=leer.nextInt();
            Nombre(nombre,edad);
            System.out.println("¿Desea ingresar otro nombre?: (si/no)");
            clave=leer.next();
            
        }while (clave.equalsIgnoreCase("si"));
    }
   public static void Nombre(String nombre, int edad){
       if (edad>=18){
           System.out.println(nombre + "Es mayor de edad" + (edad));
       } else
           System.out.println(nombre + "Es menor de edad" + (edad));
       
   } 
}
