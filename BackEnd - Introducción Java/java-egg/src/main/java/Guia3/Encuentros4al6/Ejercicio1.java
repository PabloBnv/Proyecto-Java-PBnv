/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

Crear un programa que dado un número determine si es par o impar.

*/
package Guia3.Encuentros4al6;
import java.util.Scanner;
/**
 *
 * @author PabloBnv
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num = 0;
        
        System.out.print("Ingrese un numero:");
        num = leer.nextInt();
        
        if (num % 2 ==0){
            System.out.print("Es Par");
        } else {
            System.out.print("Es Impar");
        }        
    }        
}
