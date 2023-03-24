/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia3.Encuentros4al6;
import java.util.Scanner;
/*
 *
 * @author PabloBnv
 */
public class Manual_Ej_07_Switch {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         

    	try (Scanner leer = new Scanner(System.in)) {
            int opcion;

            
            System.out.println(" --- TIPO DE BOMBA DE FLUIDOS --- ");
            System.out.println(" ");
            System.out.println("Seleccione su tipo de motor: ");
            System.out.println("************* ");
            System.out.println("1- Motor 1 : ");
            System.out.println("2- Motor 2 : ");
            System.out.println("3- Motor 3 : ");
            System.out.println("4- Motor 4 : ");
            System.out.println("************* ");
            System.out.print("Ingrese una opción: ");
            
            opcion = leer.nextInt();

            switch (opcion) {
            	case 1:
                    System.out.println("La bomba es una bomba de agua");
                    break;
                    
            	case 2:
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                
                    case 3:
                    System.out.println("La bomba es una bomba de hormigón");
                    break;

                    case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
                
                default:
               System.out.println("No existe un valor válido para tipo de bomba");
            }
        }
    }
    
}
