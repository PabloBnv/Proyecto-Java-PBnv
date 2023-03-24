/*
 * 
 * Crear un programa que dado un número determine si es par o impar.
 * 
 */
package Guia3.Encuentros4al6;
import java.util.Scanner;
/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_01_parOimpar {

    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int num = 0;
            
            System.out.print("Ingrese un numero:");
            num = leer.nextInt();
            
            if (num % 2 ==0){
                System.out.print("Es Par");
            } else {
                System.out.print("Es Impar");
            }
        }        
    }        
}
