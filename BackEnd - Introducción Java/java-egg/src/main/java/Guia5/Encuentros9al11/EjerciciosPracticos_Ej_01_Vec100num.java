/*
 * Realizar un algoritmo que llene un vector con los 100 primeros
 * números enteros y los muestre por pantalla en orden descendente
 */
package Guia5.Encuentros9al11;

/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_01_Vec100num {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*              Vector 100 Num        *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        
        //Inicio un vector y le doy una dimensión del 100
        int [] vector=new int[100];
        //Bucle para llenar el vector
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i+1;
            
        }
        //Bucle para mostrar el vector
        for (int i = vector.length-1; i >= 0 ; i--) {
            
            System.out.println(vector[i]);
            
        }
    }
    
}
