/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia4.Encuentro7y8;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class Manual_Ej_02_CalcuSubprogramas {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            int num1,num2;
            
            System.out.print("Ingrese el primer número: ");
            num1 = leer.nextInt();
            System.out.print("Ingrese el segundo número: ");
            num2 = leer.nextInt();
            
            int opcion;

            do {
                
                System.out.println("************* ");
                System.out.println("1- Sumar : ");
                System.out.println("2- Restar : ");
                System.out.println("3- Multiplicar : ");
                System.out.println("4- Dividir : ");
                System.out.println("5- Salir : ");
                System.out.println("************* ");
                System.out.print("Ingrese una opción: ");
            
                opcion = leer.nextInt();
            
                switch (opcion) {
            	case 1:
                    System.out.println("La suma de "+num1+" + "+num2+" es: "+suma(num1,num2));
                    break;
                    
            	case 2:
                    System.out.println("La resta de "+num1+" - "+num2+" es: "+resta(num1,num2));
                    break;
                
                    case 3:
                    System.out.println("La multiplicación de "+num1+" * "+num2+" es: "+mult(num1,num2));
                    break;

                    case 4:
                    System.out.println("La división de "+num1+" / "+num2+" es: "+divi(num1,num2));
                    break;
                    
                    case 5:
                    System.out.print("Hasta luego!");
                    break;
                                    
                }
            }while (opcion !=5);
        }    
    }
    
    public static int suma(int num1,int num2){
    
    
        int res = num1 + num2;
        return res;
        
    
    }
    
    public static int resta(int num1,int num2){
    
    
        int res = num1 - num2;
        return res;
        
    
    }
    
    public static int mult(int num1,int num2){
    
    
        int res = num1 * num2;
        return res;
        
    
    }
    
    public static int divi(int num1,int num2){
    
    
        int res = num1 / num2;
        return res;
        
    
    }
    
}
    

