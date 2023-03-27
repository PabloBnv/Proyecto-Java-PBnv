/*
 * 
 * Crea una aplicación que nos pida un número por teclado y con una función
 * se lo pasamos por parámetro para que nos indique si es o no un número primo,
 * debe devolver true si es primo, sino false. Un número primo es aquel que solo
 * puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es
 * divisible entre 5, sin embargo, 17 si es primo.
 * 
 * 
 */

 package Guia4.Encuentro7y8;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_04_NumerosPrimos {

    public static void main(String[] args) {

        try (Scanner leer = new Scanner (System.in)) {
           
            System.out.println("**************************************");
            System.out.println("*                                    *");
            System.out.println("*            Números Primos          *");
            System.out.println("*                                    *");
            System.out.println("**************************************"); 

            //Ingresa un número
            System.out.print(" > Ingrese un número: ");
            int num = leer.nextInt();

            //Llama a una función y resuelve el calculo luego determina si es Verdadero es Primo
            if (primos(num)==true){

                System.out.println("El Numero "+num+" es primo.");
            } else{
                System.out.println("El Numero "+num+" no es primo.");
            }
            

        }

    }

    public static boolean primos(int num){
        boolean res=false;
        
        if (num % 5==0 && num % 2 == 0){
            res=true;
            
        }

        return res;

    }



}
