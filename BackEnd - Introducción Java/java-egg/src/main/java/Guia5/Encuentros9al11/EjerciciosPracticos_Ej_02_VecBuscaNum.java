/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores
 * aleatorios y le pida al usuario un número a buscar en el vector. 
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
package Guia5.Encuentros9al11;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_02_VecBuscaNum {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*              Vector Busca Num      *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        //try para cerrar el Scanner
        try (Scanner leer = new Scanner(System.in)) {
            //defino las variables y el vector
            int num1, cont;
            int[] vector = new int[20];
            //Bucle para llenar el vector con números random
            for (int i = 0; i < vector.length; i++) {
                vector[i] = (int) (Math.random() * 10 + 1);
                System.out.print(" " + vector[i]);
            }

            //El usuiario ingresa un número 
            System.out.println(" ");
            System.out.println("ingrese un numero para buscarlo en el vector: ");
            num1 = leer.nextInt();
            //Inicio contador
            cont=0;
            //Bucle para buscar dentro del vector
            for (int i = 0; i < vector.length; i++) {
                //Condicional para validar si es el mismo número ingresado por el usuario
               if (vector[i]==num1){
                  cont++; 
                  //Muestra las posiciones donde encontro el número
                   System.out.println("Su numero "+num1 +" se encuentra en la posicion; "+(i+1));
                   
               } 
                
                
            }
        
            //Muestra la cantidad de veces que encontró el número.
            System.out.println("Su numero esta repetido " +cont+ " veces. ");
        }
    }
    
}
