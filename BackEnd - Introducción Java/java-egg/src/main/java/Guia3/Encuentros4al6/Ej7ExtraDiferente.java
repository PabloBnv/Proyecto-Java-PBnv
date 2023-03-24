/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/**
 *
 * @author PabloBnv
 */
public class Ej7ExtraDiferente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (Scanner leer = new Scanner(System.in)) {
            int n, num, vMax = -1, vMin = 99999, i = 0;
            double prom = 0;
            System.out.print("Ingresar cantidad de numeros: ");
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
