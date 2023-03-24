/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

Realice un programa que calcule y visualice el valor máximo, el valor mínimo y
el promedio de n números (n>0). El valor de n se solicitará al principio del
programa y los números serán introducidos por el usuario. Realice dos versiones 
del programa, una usando el bucle “while” y otra con el bucle “do - while”.

*/
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class EjercicioExtra7 {

    /*
     * @param args the command line arguments
     * 
     * @param nextInt
     */
    public static void main(String[] args, int nextInt) {
        try (Scanner leer = new Scanner(System.in)) {
            int n, i = 0, altura;

            System.out.println("**************************************");
            System.out.println("*                                    *");
            System.out.println("*       Promedio de Estaturas        *");
            System.out.println("*                                    *");
            System.out.println("**************************************");

            System.out.print("Ingrese la cantidad de estaturas que desea promediar: ");
            n = nextInt;

            System.out.println("**************************************");
            while (i != n) {

                System.out.print("Ingrese la altura n°" + i + ": ");
                altura = leer.nextInt();
                i++;
                if (n < 0) {

                }

            }
        }

    }

}
