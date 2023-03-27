/*
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
 * de equipo y define su tipo de dato de tal manera que te permita alojar sus
 * nombres más adelante.
 * 
 */
package Guia5.Encuentros9al11;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class Manual_Ej_13y14_VecCompañeros {

    public static void main(String[] args) {
        
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*              Compañeros            *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        //try para cerrar el scanner
        try(Scanner leer = new Scanner(System.in)){
            // Ingreso un número de compañeros
            System.out.println("Ingrese la cantidad de compañeros: ");
            int comp= leer.nextInt();
            String[] equipo = new String[comp];
            // Bucle for para llenar el array
            for (int i=0;i<comp;i++){

                System.out.print("Nombre Compañero n°"+(i+1)+": ");
                String nombre = leer.next();

                equipo[i]=nombre;
               }
            System.out.println("Los nombres ingresados son:");
            // Bucle for para Mostrar el array
            for (int i=0;i<comp;i++){

                System.out.println("Nombre Compañero n°"+(i+1)+": "+equipo[i]);
            }
        }
    }
}
