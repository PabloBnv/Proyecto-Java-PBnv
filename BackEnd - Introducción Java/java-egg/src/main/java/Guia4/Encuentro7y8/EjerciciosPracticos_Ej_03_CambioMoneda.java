/*
 * 
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
 *  introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. 
 * La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que 
 * será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
 * El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es 
 */


package Guia4.Encuentro7y8;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_03_CambioMoneda {
    
    public static void main(String[] args) {


        try (Scanner leer = new Scanner (System.in)) {
           
            System.out.println("**************************************");
            System.out.println("*                                    *");
            System.out.println("*            Cambio Moneda           *");
            System.out.println("*                                    *");
            System.out.println("**************************************"); 
            
            System.out.print("*   > Ingrese el monto en Euros a Cambiar:");
            int euros = leer.nextInt();
            
            System.out.println("*************************************************");
            System.out.println("* Seleccione la moneda a la que desea cambiar:  *");
            System.out.println("*************************************************");
            System.out.println("* 1- Libras (Cambio a 0.86) :                   *");
            System.out.println("* 2- Dólares (Cambio a 1.28611) :               *");
            System.out.println("* 3- Yenes (Cambio a 129.852) :                 *");
            System.out.println("*************************************************");
            System.out.print("*   > Ingrese la opción del menú: ");
            int opcion = leer.nextInt();

            switch(opcion){
                    case 1:
                            System.out.println("*************************************************");
                            System.out.println("*    El ambio de "+euros+" Euros son "+(euros*0.86)+" Libras.");
                            System.out.println("*************************************************");
                    break;
                    
                    case 2:
                            System.out.println("*************************************************");
                            System.out.println("*    Cambio de "+euros+"Euros son "+(euros*1.28611)+" Dólares.");
                            System.out.println("*************************************************");
                    break;
                            
                    case 3:
                            System.out.println("*************************************************");
                            System.out.println("*    Cambio de "+euros+"Euros son "+(euros*129.852)+" Yenes.");
                            System.out.println("*************************************************");
                    break;


            }
        }
    }
}
