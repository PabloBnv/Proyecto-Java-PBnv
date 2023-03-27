/*
 * Diseñe una función que pida el nombre y la edad de N personas
 * e imprima los datos de las personas ingresadas por teclado e 
 * indique si son mayores o menores de edad. Después de cada persona,
 * el programa debe preguntarle al usuario si quiere seguir mostrando
 * personas y frenar cuando el usuario ingrese la palabra “No”
 * 
 */
package Guia4.Encuentro7y8;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_02_MayoriaEdad {

   public static void main(String[] args) {
        
        String clave="si", nombre="";
        int edad=0;
        try (Scanner leer = new Scanner (System.in)) {
           
            System.out.println("**************************************");
            System.out.println("*                                    *");
            System.out.println("*          Mayoría de Edad           *");
            System.out.println("*                                    *");
            System.out.println("**************************************"); 

           
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
