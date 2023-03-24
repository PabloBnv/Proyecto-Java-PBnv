/*
 * 
 *  Simular la división usando solamente restas. Dados dos números enteros mayores que uno,
 *  realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
 *  Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
 *  este resultado es el residuo, y el número de restas realizadas es el cociente. 
 *  Por ejemplo: 50 / 13:
 *  50 – 13 = 37     una resta realizada
 *  37 – 13 = 24     dos restas realizadas
 *  24 – 13 = 11     tres restas realizadas
 *  dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3. 
 *  ¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 *  Nota: recordar el uso de la sentencia break.
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

public class Extra_Ej_09_DivSusesivas {
    /*
     * @param args
     */
    public static void main(String[] args){
    
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*        Divisiones Susecivas        *");
        System.out.println("*                                    *");
        System.out.println("**************************************"); 
    
    
        int num1=0, num2=0,aux=0, resultado, contador=0;


        try(Scanner leer =new Scanner(System.in)){
           

            System.out.print("Ingrese el Dividendo: ");
            num1=leer.nextInt();
            
            System.out.print("Ingrese el Divisor: ");
            num2=leer.nextInt();

            
        
            resultado = (num1-num2);
            System.out.println(" "+num1+"/"+num2+" = "+resultado);
            contador++;
        
            while ( num2 < resultado){
                aux=resultado;
                resultado = resultado-num2;
                System.out.println(" "+aux+"/"+num2+" = "+resultado);
                contador++;
            }

            System.out.println("Resto es: "+resultado);
            System.out.println("El Cosiente: "+contador);


        }
    }
  
}
