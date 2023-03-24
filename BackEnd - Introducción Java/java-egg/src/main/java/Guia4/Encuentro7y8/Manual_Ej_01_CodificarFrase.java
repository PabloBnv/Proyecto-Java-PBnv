/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia4.Encuentro7y8;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class Manual_Ej_01_CodificarFrase {

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
