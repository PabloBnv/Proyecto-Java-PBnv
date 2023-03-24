/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5.Encuentros9al11;

import java.util.Scanner;

/**
 *
 * @author Pablobnv
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] M = new int[3][3];

        //generar cuadrado mágico
        cuadradoMagico(M);

        //mostrar el array 
        mostrarMatriz(M);
    }

    
    public static void cuadradoMagico(int[][] matriz) {                                                           
        int N = matriz.length;
        int i = 0, j = N / 2, cont = 1;
        boolean multiplo = false;
        matriz[i][j] = cont; //se coloca el 1 en el elemento central de la primera fila
        for (cont = 2; cont <= N * N; cont++) { //for para colocar el resto de elementos en la matriz
            if (!multiplo) {        //si el anterior número no es múltiplo de N
                i--;                //fila anterior
                if (i < 0){ 
                    i = N - 1;
                }
                j++;                //columna siguiente
                if (j >= N){ 
                    j = 0; 
                }
            } else {                //si el anterior número es múltiplo de N
                i++;                //fila siguiente, misma columna 
                if (i >= N){
                    i = 0;
                }
            }
            matriz[i][j] = cont;
            if (cont % N == 0){     //comprobamos si número actual es multiplo de N
                multiplo = true;
            } else { 
                multiplo = false;
            }
        }
    }

    //método para mostrar el cuadrado mágico por pantalla
    public static void mostrarMatriz(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("%5d", A[i][j]);
            }
            System.out.println();
        }
    }
}
