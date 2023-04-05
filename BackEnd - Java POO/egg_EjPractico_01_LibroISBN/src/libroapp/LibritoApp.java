package libroapp;
/* 
* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
* Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro
* y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario
* y luego informar mediante otro método el número de ISBN, el título, el autor del libro y 
* el número de páginas. 
*
*/

import ent.libro;

public class LibritoApp {

    public static void main(String[] args) {

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*              Librito ISBN          *");
        System.out.println("*                                    *");
        System.out.println("**************************************");
        System.out.println("");

        libro l1 = new libro();

        l1.crearLibro();

        System.out.println("");
        System.out.println("**************************************");
        System.out.println("");
        l1.mostrarLibro();
        System.out.println("");
        System.out.println("************FIN APP*******************");

    }

}
