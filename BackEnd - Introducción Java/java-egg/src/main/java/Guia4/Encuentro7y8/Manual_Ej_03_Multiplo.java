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
public class Manual_Ej_03_Multiplo {

   public static void main(String[] args) {
        
        try (Scanner leer = new Scanner (System.in)) {
            int num,num2;
            System.out.println("Ingrese un numero");
            num=leer.nextInt();
            System.out.println("Ingrese un numero");
            num2=leer.nextInt();
            esMultiplo(num,num2);
        }
    }
    public static void esMultiplo( int num, int num2){
        
        if (num2%num==0){
            System.out.println("Es multiplo");
        } else
            System.out.println("No es multiplo");
        
        
    }
}
