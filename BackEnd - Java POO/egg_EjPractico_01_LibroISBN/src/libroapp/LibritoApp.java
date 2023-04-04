package libroapp;
/* 
* Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
* Autor, Número de páginas, y un constructor con todos los atributos pasados por parámetro
* y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario
* y luego informar mediante otro método el número de ISBN, el título, el autor del libro y 
* el número de páginas. 
*/


import ent.libro;
import srv.ServicioLibro;

public class LibritoApp {
   
    public static void main(String[] args) {


        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*              Librito ISBN          *");
        System.out.println("*                                    *");
        System.out.println("**************************************");


        

            ServicioLibro sl = new ServicioLibro();

            libro l1 = sl.crearLibro();


            System.out.println(" "+l1+"");


        

    }
}
