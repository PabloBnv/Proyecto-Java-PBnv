package ent;
/* clase Pelicula con el título, director y duración de la película (en horas). */
public class Pelicula {
    private String titulo;
    private String director;
    private float duracion;
    
    public Pelicula() {}

    public Pelicula(String titulo, String director, float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula : " 
        + " Título: " + titulo +", "
        + " Director:" + director +", "
        + " Duracion: " + duracion ;
    }

    


    
}
