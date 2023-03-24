/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * 
 * Realizar un programa que pida dos números enteros positivos por teclado y muestre 
 * por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa
 * deberá mostrar el resultado por pantalla y luego volver al menú. El programa deberá
 * ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona
 * la opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente
 * mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)? Si el usuario
 * selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class PracticaEj6Calculadora {

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
                System.out.println(" --- CALCULADORA --- ");
                System.out.println(" ");
                System.out.println("Seleccione su tipo de motor: ");
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
                    System.out.println("La suma de "+num1+" + "+num2+" es: "+(num1+num2));
                    break;
                    
            	case 2:
                    System.out.println("La resta de "+num1+" - "+num2+" es: "+(num1-num2));
                    break;
                
                    case 3:
                    System.out.println("La multiplicación de "+num1+" * "+num2+" es: "+(num1*num2));
                    break;

                    case 4:
                    System.out.println("La división de "+num1+" / "+num2+" es: "+(num1/num2));
                    break;
                    
                    case 5:
                    System.out.print("¿Está seguro de que desea salir del programa: (s/n)");
                    String confirma;
                    confirma = leer.next();
                    confirma = confirma.toUpperCase();
                    if (confirma.equalsIgnoreCase("S")){ 
                        opcion=5;
                    }else if (confirma.equalsIgnoreCase("N")){
                        opcion=0;
                    }
                    break;
                }
            }while (opcion !=5);
        }    
    }
}
