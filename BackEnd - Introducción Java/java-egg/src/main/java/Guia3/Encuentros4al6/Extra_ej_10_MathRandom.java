/*
 * 
 * Realice un programa para que el usuario adivine el resultado de una
 * multiplicación entre dos números generados aleatoriamente entre 0 y 10.
 * El programa debe indicar al usuario si su respuesta es o no correcta.
 * En caso que la respuesta sea incorrecta se debe permitir al usuario 
 * ingresar su respuesta nuevamente. Para realizar este ejercicio investigue
 * como utilizar la función Math.random() de Java.
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 * 
 * @autor Pablo Bnv
 */

public class Extra_ej_10_MathRandom {
    public static void main(String[] args) {
       
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*         Multiplicaciones           *");
        System.out.println("*                                    *");
        System.out.println("**************************************"); 

        try(Scanner leer=new Scanner(System.in)){
            int num1=(int)(Math.random()*(10-1));
            int num2=(int)(Math.random()*(10-1));
        

            System.out.println("Responda el resultado de la Multiplicación: ");
            System.out.print(""+num1+" * "+num2+" = ");
            int res=leer.nextInt();

            if (res == (num1*num2)){

                System.out.println("CORRECTO");
            } else {

                System.out.println("INCORRECTO");
            }

        }
    }
}
