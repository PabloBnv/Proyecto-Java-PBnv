
/*
 * 
 * Crear un programa que dibuje una escalera de números, 
 * donde cada línea de números comience en uno y termine 
 * en el número de la línea. Solicitar la altura de la 
 * escalera al usuario al comenzar. 
 * Ejemplo: si se ingresa el número 3:
 * 1
 * 12
 * 123
 * 
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 * 
 * @autor Pablo Bnv
 */


public class Extra_Ej_13_EscaleraNumeros {

    /*
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*        Escalera de Numeros         *");
        System.out.println("*                                    *");
        System.out.println("**************************************"); 


        try(Scanner leer=new Scanner(System.in)){

            //Ingreso un número y defino una variable int
            System.out.print("Ingrese un número: ");
            int num = leer.nextInt();

            //Secuencia de números i se inicia en 1 para saltar el 0 
            //num se le suma 1 para que cuente hasta el 4
            for (int i=1; i <= num+1; i++){
                //J se inicia en 1 igual para saltar el 0 y cuenta hasta el valor de i
                for (int j=1; j < i; j++){                    
                    System.out.print(""+j);
                 }
                System.out.println(" ");
            }
        }

    }
    
}
