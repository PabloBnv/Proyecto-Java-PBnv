package ent;

/*Crear una clase NIF que se usará para mantener DNIs con su correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la letra (String o char) que le corresponde. En NIFService se dispondrá de los siguientes métodos:
Métodos getters y setters para el número de DNI y la letra. */
public class NIF {

    private int dni;
    private char letra;

    public NIF() {
        
    }

    public NIF(int dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "NIF [dni=" + dni + ", letra=" + letra + "]";
    }

}
