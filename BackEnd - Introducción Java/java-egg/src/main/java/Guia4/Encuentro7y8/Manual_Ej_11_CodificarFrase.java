/*
 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado 
 * y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente 
 * manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto
 *  de los caracteres (incluyendo a las vocales acentuadas) se mantienen sin cambios.
 * a e i o u
 * @ # $ % *
 * Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación 
 * correspondiente. Utilice la estructura “según” para la transformación. Por ejemplo, 
 * si el usuario ingresa:     Ayer, lunes, salimos a las once y 10. La salida del programa
 *  debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
package Guia4.Encuentro7y8;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class Manual_Ej_11_CodificarFrase {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ingrese una frase. Debe finalizar con .");
        try (Scanner leer = new Scanner(System.in)) {
            String frase=leer.nextLine();
            frase=frase.toLowerCase();
            
      String nuevaFrase= codificarFrase(frase);
      System.out.println(nuevaFrase);
        }
    }
    public static String codificarFrase(String frase){
        int largo=frase.length();
        String frase1="";
        String frase2="";
        
        for (int i=0; i<largo; i++){
            String letra=frase.substring(i,i+1);
        
        
              
        switch (letra){
            case "a":
                frase2="@";
                frase1=frase1.concat(frase2);
            break;
            case"e":
                frase2="#";
                 frase1=frase1.concat(frase2);
                break;
            case "i":
                frase2="$";
                 frase1=frase1.concat(frase2);
                      break;
            case "o":
                frase2="%";
                 frase1=frase1.concat(frase2);
                break;
            case "u":
                frase2="*";
                 frase1=frase1.concat(frase2);
                break;
                default:
                    frase1=frase1.concat(letra);
        }  
        }
     return frase1;
    }
}
