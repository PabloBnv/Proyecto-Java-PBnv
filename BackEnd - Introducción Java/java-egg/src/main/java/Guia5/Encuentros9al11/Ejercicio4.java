/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5.Encuentros9al11;

/**
 *
 * @author ViejoHucha
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[][] matriz = new int[4][4];
        System.out.println("Matriz:");
        System.out.println(" Capa 1:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 9+1);
                System.out.print("| "+matriz[i][j]+" ");

            }  
            System.out.println("|");
        }
        
        System.out.println(" Transpuesta:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
             
                System.out.print("| "+matriz[j][i]+" ");

            }  
            System.out.println("|");
        }
    }
    
}
