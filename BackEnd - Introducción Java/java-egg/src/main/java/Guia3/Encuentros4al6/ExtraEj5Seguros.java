/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 * 
 * Una obra social tiene tres clases de socios:
 *  - Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los
 *    tipos de tratamientos. Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de 
 *    descuento para los mismos tratamientos que los socios del tipo A.
 *  - Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
 *  - Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que
 *    represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a
 *     pagar por dicho socio.
 * 
 * 
 */
package Guia3.Encuentros4al6;

import java.util.Scanner;

/*
 *
 * @author PabloBnv
 */
public class ExtraEj5Seguros {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            try (Scanner leer = new Scanner (System.in)) {
                String opcion;
      
                System.out.println("**************************************");
                System.out.println("*                                    *");
                System.out.println("*     Bienvenidos Seguros EGG        *");
                System.out.println("*                                    *");
                System.out.println("**************************************");
                
                do { 
                System.out.println(" --- TIPO SOCIO --- ");
                System.out.println(" ");
                System.out.println("Seleccione su tipo de socio: ");
                System.out.println("************* ");
                System.out.println("A- Tipo A : ");
                System.out.println("B- Tipo B : ");
                System.out.println("C- Tipo C : ");
                System.out.println("S- Salir : ");
                System.out.println("************* ");
                System.out.print("Ingrese una opción: ");
                
                
                
                opcion= leer.next();
                opcion= opcion.toUpperCase();
                double tratamiento = 10000;
                double desc50 =(tratamiento*50)/100 ;
                
                switch (opcion){
                    case "A":
                        System.out.println("-------------Usuarios Tipo A----------");
                        System.out.println("");
                        System.out.println("El costo del tratamiento es de "+tratamiento);
                        System.out.println(" Beneficios: Descuento del 50%        ");
                        System.out.println(" Importe total:                 "+desc50+"$");
                        break;
                    case "B":
                        System.out.println("-------------Usuarios Tipo B----------");
                        System.out.println("");
                        System.out.println("El costo del tratamiento es de 10.000$");
                        System.out.println(" Beneficios: Descuento del 35%        ");
                        System.out.println(" Importe total:                 "+(0.35*tratamiento));
                        break;
                    case "C":
                       System.out.println("-------------Usuarios Tipo C----------");
                        System.out.println("");
                        System.out.println("El costo del tratamiento es de 10.000$");
                        System.out.println(" Beneficios: No Tiene                 ");
                        System.out.println(" Importe total:                "+tratamiento);
                        break;
                    }
                } while (!"S".equals(opcion));
            }
    }
}