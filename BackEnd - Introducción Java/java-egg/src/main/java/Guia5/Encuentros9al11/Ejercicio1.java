/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5.Encuentros9al11;

/**
 *
 * @author PabloBnv
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] vector=new int[100];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i+1;
            
        }
        for (int i = vector.length-1; i >= 0 ; i--) {
            
            System.out.println(vector[i]);
            
        }
    }
    
}
