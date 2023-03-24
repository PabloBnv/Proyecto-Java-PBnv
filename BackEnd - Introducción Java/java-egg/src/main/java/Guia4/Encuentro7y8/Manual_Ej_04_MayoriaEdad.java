/*
 *
 * 
 * 
 */
package Guia4.Encuentro7y8;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class Manual_Ej_04_MayoriaEdad {

   public static void main(String[] args) {
        
        String clave="si", nombre="";
        int edad=0;
        try (Scanner leer = new Scanner (System.in)) {
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
    }
   public static void Nombre(String nombre, int edad){
       if (edad>=18){
           System.out.println(nombre + "Es mayor de edad" + (edad));
       } else
           System.out.println(nombre + "Es menor de edad" + (edad));
       
   } 
}
