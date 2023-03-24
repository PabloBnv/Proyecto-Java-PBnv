/*
 * 
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo y 
 * el promedio de n números (n>0). El valor de n se solicitará al principio del programa 
 * y los números serán introducidos por el usuario. Realice dos versiones del programa,
 *  una usando el bucle “while” y otra con el bucle “do - while”.
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class Extra_Ej_07_PromMinMax {

    public static void main(String[] args) {

            System.out.println("**************************************");
            System.out.println("*                                    *");
            System.out.println("*       Promedio de ValorMAx/Min     *");
            System.out.println("*                                    *");
            System.out.println("**************************************");

            

        try (Scanner leer = new Scanner(System.in)) {
            int n, num, vMax = -1, vMin = 99999, i = 0;
            double prom = 0;
            System.out.print("Ingrese la cantidad de numeros que desea promediar: ");
            n = leer.nextInt();
            
            while (i != n) {
                System.out.print("Ingresar un valor numerico: ");
                num = leer.nextInt();
                i++;
                if (num > vMax) {
                    vMax = num;
                }
                if (num < vMin) {
                    vMin = num;
                }
                prom = prom + num;
            }
            prom = prom / n;
            System.out.println("Valor minimo: " + vMin + " Valor Maximo: " + vMax + " Promedio: " + prom);
            vMax = -1;
            vMin = 99999;
            prom = 0;
            i = 0;
            do {
                System.out.print("Ingresar un valor numerico: ");
                num = leer.nextInt();
                i++;
                if (num > vMax) {
                    vMax = num;
                }
                if (num < vMin) {
                    vMin = num;
                }
                prom = prom + num;
            } while (i != n);
            prom = prom / n;
            System.out.println("Valor minimo: " + vMin + " Valor Maximo: " + vMax + " Promedio: " + prom);
        } 
    } 

}
