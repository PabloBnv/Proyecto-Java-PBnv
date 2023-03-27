/*
 * Realice un programa que compruebe si una matriz dada es antisimétrica. 
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia 
 * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si 
 * A = -AT. La matriz traspuesta de una matriz A se denota por AT y se obtiene
 * cambiando sus filas por columnas (o viceversa).
 * 
 */
package Guia5.Encuentros9al11;

/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_05_MatrizAsim {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*          Matriz Transpuesta        *");
        System.out.println("*             Asimétrica             *");
        System.out.println("**************************************");
  

        int fil=4,col=3, min=-9,max=9;
        //Declaramos 2 matrices Matriz Original y la Matriz auxiliar donde vamos a Transponer los datos
        //Por eso la segunda Matriz tiene los datos invertidos, (Aunque en este caso tengan el mismo valor)
        //Más adelante al transponer los datos, en el bucle la matriz se llenará al revés.
        int matrizOrig[][] = new int[fil][col];
        int matrizTransp[][] = new int[col][fil];

        //Bucle para llenar la matriz de números random poniendo un rango máximo y mínimo.
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                matrizOrig[i][j] = (int) (Math.random()*(max-min+1)+min);
            }  
        }

        //Muestra la matriz Original
        System.out.println("Matriz Original:");
        System.out.println("> ");
        //Llamo a la función para mostrar la matriz
        imprimeMatriz(matrizOrig,fil,col);
        
        
        
        //Transpone la matriz original dentro de una matriz nueva pero esta vez la vuelve Negativa
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                matrizTransp[j][i]=-matrizOrig[i][j];
                
            }  

        }
        System.out.println("");
        System.out.println("Matriz transpuesta:");
        
        //Muestra la matriz transpuesta
        System.out.println("> ");
        //Envío la información al revés para que me devuelva transpuesta
        //en caso de que las filas y las columnas tengas un número diferente.
        imprimeMatriz(matrizTransp,col,fil);
        
        
    }
    
    //Función que devuelve la impresión matriz
    
    public static void imprimeMatriz(int[][] matriz, int fil, int col){


         for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("| "+matriz[i][j]+" ");
                
            }  
            System.out.println("|");
        }

    }

    
}
