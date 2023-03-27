/*
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
 * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
 * se denota por B y se obtiene cambiando sus filas por columnas (o viceversa)
 */
package Guia5.Encuentros9al11;

/*
 *
 * @author ViejoHucha
 */
public class EjerciciosPracticos_Ej_04_MatrizTransp {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*          Matriz Transpuesta        *");
        System.out.println("*                                    *");
        System.out.println("**************************************");
  

        int N=3,M=3;
        //Declaramos 2 matrices Matriz Original y la Matriz auxiliar donde vamos a Transponer los datos
        //Por eso la segunda Matriz tiene los datos invertidos, (Aunque en este caso tengan el mismo valor)
        //Más adelante al transponer los datos, en el bucle la matriz se llenará al revés.
        int matrizOrig[][] = new int[M][N];
        int matrizTransp[][] = new int[N][M];

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizOrig[i][j] = (int) (Math.random() * 9+1);
                
            }  

        }

        //Muestra la matriz Original
        System.out.println("Matriz Original:");
        System.out.println("> ");
        imprimeMatriz(matrizOrig);
        //Transpone la matriz original dentro de una matriz nueva
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTransp[j][i]=matrizOrig[i][j];
                
            }  

        }
        System.out.println("");
        System.out.println("Matriz transpuesta:");
        //Muestra la matriz transpuesta
        System.out.println("> ");
        imprimeMatriz(matrizTransp);
        
    }
    
    public static void imprimeMatriz(int matriz[][]){


         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| "+matriz[i][j]+" ");
                
            }  
            System.out.println("|");
        }

    }

}
