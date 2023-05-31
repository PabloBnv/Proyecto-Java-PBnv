package ent;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String doc;
    private Perro perro;
    
    public Persona() {
        
    }

    public Persona(String nombre, String apellido, int edad, String doc, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.doc = doc;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre 
            + " Apellido: " + apellido
            + " Edad:" + edad 
            + " ID:" + doc 
            + " Mascota: "+ perro ;
    }



}
