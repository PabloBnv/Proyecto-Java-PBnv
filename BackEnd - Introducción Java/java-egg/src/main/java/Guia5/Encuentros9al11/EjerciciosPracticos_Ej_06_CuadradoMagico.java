/*
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.
 */

package Guia5.Encuentros9al11;

/*
 *
 * @author Pablobnv
 */
public class EjerciciosPracticos_Ej_06_CuadradoMagico {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args){

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*            Cuadrado Mágico         *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        
        int matriz[][] = new int[3][3];
        
        //Bucle para llenar la matriz de números random 
        llenarMatriz(matriz);
                

        //Muestra la matriz 
        System.out.println("Matriz:");
        System.out.println("> ");
        imprimeMatriz(matriz);


        cuadradoMagico(matriz);


    }

    private static void cuadradoMagico(int[][] matriz) {

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 9);
                
            }  

        }




    }

    private static void llenarMatriz(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int) (Math.random() * 9);
                
            }  

        }
    }

    private static void imprimeMatriz(int[][] matriz) {
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| "+matriz[i][j]+" ");
                
            }  
            System.out.println("|");
        }
    
    
    
    }


    
}
