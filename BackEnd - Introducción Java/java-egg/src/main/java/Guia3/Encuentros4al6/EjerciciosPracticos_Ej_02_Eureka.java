/*
 * Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
 * pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
 * la función equals() en Java.
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_02_Eureka {

    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            String frase;
            String psw = "EUREKA";
            System.out.print("Ingrese la clave:");
            frase = leer.nextLine();
            frase = frase.toUpperCase();
            if (frase.equals(psw)){
                System.out.print("Correcto");
            } else {
                System.out.print("Incorrecto");
            }
        } 
    }
    
}
