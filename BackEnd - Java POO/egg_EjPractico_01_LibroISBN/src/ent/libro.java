package ent;


public class libro {

   
    public String ISBN;
    public String titulo;
    public String autor;
    public int numeroPag;

    public libro() {

    }

    public libro( String iSBN, String titulo, String autor, int numeroPag) {
        
        this.ISBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPag = numeroPag;
    }

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

   

    @Override
    public String toString() {
        return "libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPag="
                + numeroPag + "]";
    }

   

    //public int crearLibro(){}




    


}
