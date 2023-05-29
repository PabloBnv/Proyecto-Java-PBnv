package ent;

public class Libros {

    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
   
    public Libros() {

    }

    public Libros(String titulo, String autor, int ejemplares, int prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    @Override
    public String toString() {
        return " Titulo: " + titulo 
            + "\n Autor: " + autor 
            + "\n Ejemplares: " + ejemplares 
            + "\n Prestados: "  + prestados ;
    }

    

    
}
