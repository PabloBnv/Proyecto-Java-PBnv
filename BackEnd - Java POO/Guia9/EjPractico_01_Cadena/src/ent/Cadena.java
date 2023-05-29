/* Realizar una clase llamada Cadena, en el paquete de entidades, que tenga como atributos
una frase (String) y su longitud. Agregar constructor vacío y con atributo frase solamente.
Agregar getters y setters. El constructor con frase como atributo debe setear la longitud 
de la frase de manera automática. */

package ent;

//Realizar una clase llamada Cadena, en el paquete de entidades
public class Cadena {
    // que tenga como atributos una frase (String) y su longitud.
    private String frase;
    private int longitud;

    // Agregar constructor vacío y con atributo frase solamente.
    public Cadena() {

    }
    //El constructor con frase como atributo debe setear la longitud de la frase de manera automática.
    public Cadena(String frase, int longitud) {// Con solo la frase ya tenemos la longitud, no hace falta otro param.
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    // Agregar getters y setters.

}
