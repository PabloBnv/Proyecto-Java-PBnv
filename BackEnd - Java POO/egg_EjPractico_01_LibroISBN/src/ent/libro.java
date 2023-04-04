package ent;

import java.util.Scanner;

// Crear una clase llamada Libro que contenga los siguientes atributos: 
// ISBN, Título, Autor, Número de páginas.
public class libro {

   
    public String ISBN;
    public String titulo;
    public String autor;
    public int numeroPag;
    private Scanner leer = new Scanner(System.in);

    //un constructor con todos los atributos pasados por parámetro 
    public libro( String iSBN, String titulo, String autor, int numeroPag) {
        
        this.ISBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
    }
    // y un constructor vacío.
    public libro() {

    }
    
    // Get y set
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroPag(int numeroPag) {
        this.numeroPag = numeroPag;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPag() {
        return numeroPag;
    }

    //Crear un método para cargar un libro pidiendo los datos al usuario
    public void crearLibro() {
        System.out.print("Ingrese el numero ISBN: >");
        this.ISBN = leer.next();
        leer.nextLine(); // Lo uso para cerrar el Next() y no me genere salto.
        System.out.print("Ingrese el Titulo: >");
        this.titulo = (leer.nextLine());
        System.out.print("Ingrese el Autor: >");
        this.autor = (leer.nextLine());
        System.out.print("Ingrese el número de páginas: >");
        this.numeroPag = leer.nextInt();
        
    }
   
    // informar mediante otro método el número de ISBN, el título, el autor del libro y 
    // el número de páginas. 
    public void mostrarLibro(){

        System.out.println("> Datos ingresados: Libro 1:");
        System.out.println("El número ISBN es: " + this.ISBN);
        System.out.println("El nombre del Autor es: " + this.autor);
        System.out.println("El título es: " + this.titulo);
        System.out.println("La cantudad de páginas es: " + this.numeroPag);


    }


}
