/*
 * 
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
 * A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome 
 * el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los
 * valores finales de cada variable. Utilizar sólo una variable auxiliar.
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class Extra_Ej_02_CambioVariables {
  public static void main(String[] args) {
        
      
      try (Scanner leer = new Scanner (System.in)) {
        int a=1, b=2, c=3, d=4, aux=0 ;
        System.out.print("Los valores iniciales son: ");
        System.out.println("A: " + a + " B: " + b + " C: " + c + " D: " + d);
      
        aux= aux + b;
        b=c;
        c=a;
        d=b;
        System.out.print("Los valores finales son: ");
        System.out.println("A: " + a + " B: " + b + " C: " + c + " D: " + d);
      
      }  
    } 
}
