package ent;

public class Perro {

    private String nombre;
    private String raza;
    private int edad;
    private String tam;

    public Perro() {

    }

    public Perro(String nombre, String raza, int edad, String tam) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tam = tam;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + " Raza: " + raza
                + " Edad: " + edad 
                + " Tamaño: " + tam ;
    }

}
