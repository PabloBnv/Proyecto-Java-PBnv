/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia5.Encuentros9al11;

/**
 *
 * @author PabloBnv
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
              
        
        int [] vector = new int[5];
        
        for (int i=0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*10000);
            System.out.println(" "+vector[i]);
            if (vector[i]<10){
                cont1++;
            }
             if (vector[i]<100&& vector[i]>=10){
                cont2++;
            }
            if (vector[i]<1000&& vector[i]>=100){
                cont3++;
            }
            if (vector[i]<10000&& vector[i]>=1000){
                cont4++;
            }
            if (vector[i]>=10000){
                cont5++;
            }

        }
        System.out.println(" ");
        System.out.println("numeros de 1 digito: " +cont1);
        System.out.println("numeros de 2 digitos: " +cont2);
        System.out.println("numeros de 3 digitos: " +cont3);
        System.out.println("numeros de 4 digitos: " +cont4);
        System.out.println("numeros de 5 digitos: " +cont5);
                   
       }
          
}
    

