/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * 
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232
 *este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
 *deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres 
 *de largo el primer carácter tiene que ser X y el último tiene que ser una O.
 *Las secuencias leídas que respeten el formato se *consideran correctas, la 
 *secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
 *secuencia distinta de FDE, que no respete el formato se considera incorrecta.
 *Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas 
 *correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar
 *cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals()
 *
 */

package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class PracticaEj7DispositivoRS232 {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try (Scanner leer = new Scanner(System.in)) {
            String cad, aux, aux1;
            
            int cant=0, cant2=0;
            
                System.out.println("**************************************");
                System.out.println("*                                    *");
                System.out.println("*  Bienvenidos al dispositivo RS232  *");
                System.out.println("*                                    *");
                System.out.println("**************************************");
                
            do{
                
                System.out.print("    Ingresar una cadena: ");
                cad = leer.next();
                System.out.println("*************************************");
                
                
                
                while (cad.length()!= 5){
                    System.out.print("Ingresar una cadena valida de 5 digitos: ");
                    cad= leer.nextLine();
                }
                aux= cad.substring(0,1);
                aux1= cad.substring(4,5);
                aux= aux.toUpperCase();
                aux1= aux1.toUpperCase();
                if (aux.equals("X") && aux1.equals("O")){
                    cant++;
                }else {
                    cant2++;
                }
                    
            } while (!cad.equals("&&&&&"));
            System.out.println("La cantidad de cadenas correctas es " + cant);
            System.out.println("La cantidad de cadenas incorrectas es " + cant2);
        }
        
    }
    
}
