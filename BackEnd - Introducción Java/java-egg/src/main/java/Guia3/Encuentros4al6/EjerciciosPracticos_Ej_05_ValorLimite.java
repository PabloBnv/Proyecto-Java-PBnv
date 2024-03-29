/*
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
 * solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_05_ValorLimite {

    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int lim, num, suma= 0;
            System.out.print("Ingresar un valor límite: ");
            lim= leer.nextInt();
            while (suma <= lim) {
                System.out.print("Ingresar un número: ");
                num= leer.nextInt();
                suma= suma + num;
            }
            System.out.print("La suma de los valores es: "+suma+ " Supera el valor límite: "+lim);
        }
    }
}
