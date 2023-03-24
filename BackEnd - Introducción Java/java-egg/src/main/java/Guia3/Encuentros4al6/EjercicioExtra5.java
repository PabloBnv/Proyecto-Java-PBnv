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
public class EjercicioExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer = new Scanner (System.in);
            String opcion;
        
            System.out.println("**************************************");
            System.out.println("*                                    *");
            System.out.println("*     Bienvenidos Seguros EGG        *");
            System.out.println("*                                    *");
            System.out.println("**************************************");
            
           do { 
            System.out.println(" --- TIPO SOCIO --- ");
            System.out.println(" ");
            System.out.println("Seleccione su tipo de socio: ");
            System.out.println("************* ");
            System.out.println("A- Tipo A : ");
            System.out.println("B- Tipo B : ");
            System.out.println("C- Tipo C : ");
            System.out.println("S- Salir : ");
            System.out.println("************* ");
            System.out.print("Ingrese una opción: ");
            
            
            
            opcion= leer.next();
            opcion= opcion.toUpperCase();
            double tratamiento = 10000;
            double desc50 =(tratamiento*50)/100 ;
            
            switch (opcion){
                case "A":
                    System.out.println("-------------Usuarios Tipo A----------");
                    System.out.println("");
                    System.out.println("El costo del tratamiento es de "+tratamiento);
                    System.out.println(" Beneficios: Descuento del 50%        ");
                    System.out.println(" Importe total:                 "+desc50+"$");
                    break;
                case "B":
                    System.out.println("-------------Usuarios Tipo B----------");
                    System.out.println("");
                    System.out.println("El costo del tratamiento es de 10.000$");
                    System.out.println(" Beneficios: Descuento del 35%        ");
                    System.out.println(" Importe total:                 "+(0.35*tratamiento));
                    break;
                case "C":
                   System.out.println("-------------Usuarios Tipo C----------");
                    System.out.println("");
                    System.out.println("El costo del tratamiento es de 10.000$");
                    System.out.println(" Beneficios: No Tiene                 ");
                    System.out.println(" Importe total:                "+tratamiento);
                    break;
            }
        } while (!"S".equals(opcion));
    }
}