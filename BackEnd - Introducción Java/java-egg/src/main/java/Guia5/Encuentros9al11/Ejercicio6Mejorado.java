/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5.Encuentros9al11;

/**
 *
 * @author PabloBnv
 */
public class Ejercicio6Mejorado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] M = new int[3][3];
        
        LlenarcuadradoMagico(M);
      
        
        
        
        
        }
        
        
        
         
    
    public static void LlenarcuadradoMagico(int[][] matriz) { 
    
      for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 9+1);
                System.out.print("| "+matriz[i][j]+" ");

            }  
            System.out.println("|");
        }   
        
        
    
    }
     
    
    
    
    
    public static void validarCuadrado(int[][] A) {
    
    
    
    }
    
    
    
    public static void mostrarMatriz(int[][] A) {
    
  /*  for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print("| "+A[i][j]);
            }
            System.out.println("|");
        }
    */
    }
}
