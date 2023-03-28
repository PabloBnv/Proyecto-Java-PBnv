/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5.Encuentros9al11;

import java.util.Scanner;

/**
 *
 * @author PabloBnv
 */
public class Ejercicio6Diferente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try (Scanner leer = new Scanner(System.in)) {
            int[][] matriz = new int[3][3];
            int num1, cont, cont2, cont3;
            cont = 0;
            cont2 = 0;
            cont3 = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    System.out.println("Ingrese el valor del 1 a 9 o no funcionara, en la posicion: " + i + "/" + j);
                    num1 = leer.nextInt();
                    if (num1 < 1 || num1 > 9) {
                        System.out.println("Error: el número debe estar entre 1 y 9.");
                        return;
                    }
                    if (num1 > 0 && num1 < 10) {
                        matriz[i][j] = num1;
                        if (matriz[i][j] == matriz[1][j]) {
                            cont += num1;

                        }
                        if (i == j) {
                            cont2 += num1;

                        }
                        if (matriz[i][j] == matriz[i][0]) {
                            cont3 += num1;

                        }

                    } else {
                        break;
                    }

                }
                System.out.println("");

            }
            System.out.println(cont);
            System.out.println(cont2);
            System.out.println(cont3);

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {

                    System.out.print(" [" + matriz[i][j] + "] ");

                }
                System.out.println("");
            }

            if (cont == cont2 && cont2 == cont3 && cont == cont3) {
                System.out.println("su cuadrado es magico");
            } else {
                System.out.println("su cuadrado no es magico");
            }
        }
    }
}