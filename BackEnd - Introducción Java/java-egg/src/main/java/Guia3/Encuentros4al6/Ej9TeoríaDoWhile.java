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
public class Ej9TeoríaDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
        int num, intentos= 0, suma= 0;
        do{
            System.out.println("Ingresar un numero: ");
            num= leer.nextInt();
            if (num >= 0){
                suma= suma + num;
            }
            intentos++;
        }while (intentos != 20 && num != 0);
        if (num == 0){
            System.out.println("Se capturó el numero cero.");
        }
        System.out.println("La suma de todos los numeros es " + suma);
    }
    
}
