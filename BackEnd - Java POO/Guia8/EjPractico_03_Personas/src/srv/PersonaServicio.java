/*
 * En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
-Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.

-Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario 
y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba 
que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje

-Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo
de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20
y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.
 */
package srv;

import java.util.Scanner;

import ent.Persona;

public class PersonaServicio {

    private Scanner leer = new Scanner(System.in);
    // Persona p= new Persona();

    // -Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
    // devuelve un booleano.
    public boolean esMayorDeEdad(Persona p) {
        if (p.getEdad() >= 18) {
            return true;

        } else {
            return false;
        }
    }

    /*-Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
     al usuario y después se le asignan a sus respectivos atributos para llenar el objeto 
     Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O. 
    Si no es correcto se deberá mostrar un mensaje
    */

    public Persona crearPersona() {

        System.out.print("Ingrese el nombre: >");
        String nombre = leer.next();

        System.out.print("Ingrese la edad: >");
        int edad = leer.nextInt();

        System.out.print("Ingrese el Sexo:(H/M/O) >");
        char sexo = leer.next().toUpperCase().charAt(0);
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Ingrese el sexo nuevamente (H - hombre, M - mujer, O - otro):");
            sexo = leer.next().toUpperCase().charAt(0);
        }

        System.out.println("Ingrese el peso (en kg):");
        double peso = leer.nextDouble();

        System.out.println("Ingrese la altura (en metros):");
        double altura = leer.nextDouble();

        return new Persona(nombre, sexo, edad, peso, altura);

    }

    /*-Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
    Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo
    de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20
    y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
    Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene
    sobrepeso, y la función devuelve un 1. */

    public int calcularIMC(Persona p){

        double imc = p.getPeso() / Math.pow(p.getAltura(), 2);

        if (imc < 20) {
            return -1;
        } else  if (imc >= 20 && imc <= 25){
            return 0;
            
        } else {
            return 1;
        }

    }

}
