
/*
 * 
 * Necesitamos mostrar un contador con 3 dígitos (X-X-X), 
 * que muestre los números del 0-0-0 al 9-9-9, con la particularidad
 * que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
 * 0-0-0
 * 0-0-1
 * 0-0-2
 * 0-0-E
 * 0-0-4
 * 0-1-2
 * 0-1-E
 * 
 * 
 */
package Guia3.Encuentros4al6;

/*
 * 
 * @autor Pablo Bnv
 */

public class Extra_Ej_12_Contador3Cifras {

    public static void main(String[] args){

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*           Contador 3 Digitos       *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        //Contador de 3 Cifras
        for(int i=0; i<10;i++){
            for(int j=0; j<10;j++){
                for(int k=0; k<10;k++){
                    //Cambio int a String y lo agrego a un auxiliar
                    String aux = ""+Integer.toString(i);
                    String aux2 = ""+Integer.toString(j);
                    String aux3 = ""+Integer.toString(k);
                    //Condicional para buscar 3 y cambiarlo por E
                    if (aux.equals("3")){
                        aux= "E";
                    } 
                    if (aux2.equals("3")){
                        aux2="E";
                    } 
                    if (aux3.equals("3")){
                        aux3="E";
                    }
                    System.out.println(aux+" "+aux2+" "+aux3);
                    
                    //En 1 sola sentencia se pueden resumir los condicionales
                    /*       
                    Más fácil.            
                    System.out.print(i != 3 ? i : "E");
                    System.out.print(" ");
                    System.out.print(j != 3 ? j : "E");
                    System.out.print(" ");
                    System.out.print(k != 3 ? k : "E");
                    System.out.println(" ");
                     */
                }
                
            }
        }
    }
}
