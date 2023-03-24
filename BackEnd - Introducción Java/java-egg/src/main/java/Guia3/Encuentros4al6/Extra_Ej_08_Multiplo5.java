/*
 * 
 * Escriba un programa que lea números enteros. Si el número es múltiplo 
 * de cinco debe detener la lectura y mostrar la cantidad de números leídos,
 * la cantidad de números pares y la cantidad de números impares. Al igual 
 * que en el ejercicio anterior los números negativos no deben sumarse.
 * Nota: recordar el uso de la sentencia break.
 * 
 */

package Guia3.Encuentros4al6;

import java.util.Scanner;

public class Extra_Ej_08_Multiplo5 {
    
    public static void main(String[] args){

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*            Múltiplos de 5          *");
        System.out.println("*                                    *");
        System.out.println("**************************************"); 

        int n=0, can=0, par=0, imp=0;

        try (Scanner leer= new Scanner(System.in)){


            do{

                System.out.print("Ingrese un número: ");
                n=leer.nextInt();
                can++;
                if (n % 2 == 0){
                    par++;

                }else{
                    imp++;
                }
            } while (n % 5 != 0);
            System.out.println("Números leídos: "+can+" Pares: "+par+" Impares: "+imp);

        }


    }
}
