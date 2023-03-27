/*
 * 
 * Escribir un programa que lea un número entero y devuelva el número de dígitos 
 * que componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
 * deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando 
 * el operador de división. Nota: recordar que las variables de tipo entero truncan 
 * los números o resultados.
 * 
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 * 
 * @autor Pablo Bnv
 */
public class Extra_Ej_11_CantidadNumeros {
    /*
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*           Cantidad Numeros         *");
        System.out.println("*                                    *");
        System.out.println("**************************************"); 

        try(Scanner leer=new Scanner(System.in)){

            int num=0;
            //Ingresa un número
            System.out.println("Inserte un número: ");
            num=leer.nextInt();
            //Lo convierte en String y mide el Largo, guardandolo en un auxiliar
            String aux = " "+Integer.toString(num).length();
            System.out.println("El número contiene "+aux+" caracteres de largo.");
        }
    }   
}
