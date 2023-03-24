/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia4.Encuentro7y8;

import java.util.Scanner;

/**
 *
 * @author PabloBnv
 */
public class Ej2Teoría {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer= new Scanner (System.in);
        int num,num2;
        System.out.println("Ingrese un numero");
        num=leer.nextInt();
        System.out.println("Ingrese un numero");
        num2=leer.nextInt();
        esMultiplo(num,num2);
    }
    public static void esMultiplo( int num, int num2){
        
        if (num2%num==0){
            System.out.println("Es multiplo");
        } else
            System.out.println("No es multiplo");
        
        
    }
}
