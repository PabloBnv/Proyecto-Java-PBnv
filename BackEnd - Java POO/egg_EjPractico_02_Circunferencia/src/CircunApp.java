import java.util.Scanner;

import entidades.Circulo;
/* Declarar una clase llamada Circunferencia que tenga como atributo 
*  privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
* -Método constructor que inicialice el radio pasado como parámetro.
* -Métodos get y set para el atributo radio de la clase Circunferencia.
* -Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
* -Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
* -Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio)
 */
public class CircunApp {
    
    private static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*            CircunApp               *");
        System.out.println("*                                    *");
        System.out.println("**************************************");
        
        System.out.println("-Bienvenido al sistema de cálculo de circunferencia-");

        Circulo c1 = new Circulo();
        System.out.println("**************************************");
        System.out.println("A continuación ingrese en radio para poder generar el cálculo.");
        System.out.print(" >");
        c1.crearCincurferencia(leer.nextDouble());
        System.out.println("**************************************");
        System.out.println("Circulo 1:");
        System.out.println("Diametro: "+c1.getDiametro());
        System.out.println("Area: "+c1.getArea());
        System.out.println("Perimetro: "+c1.getPerimetro());
        System.out.println("**************************************");
    }
}
