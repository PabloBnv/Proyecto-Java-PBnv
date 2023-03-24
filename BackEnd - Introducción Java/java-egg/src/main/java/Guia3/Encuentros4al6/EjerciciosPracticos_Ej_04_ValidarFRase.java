/*
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de 
 * esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje 
 * por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
 * Nota: investigar la función Substring y equals() de Java.
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_04_ValidarFRase {

    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            String frase, aux;            
            System.out.print("Ingrese una Frase o Palabra:");
            frase = leer.nextLine();
            aux = frase.substring(0,1);
                
            aux = aux.toUpperCase();
            if (aux.equals("A")){
                System.out.print("Correcto");
            } else {
                System.out.print("Incorrecto");
            } 
        }
    }
    
}
