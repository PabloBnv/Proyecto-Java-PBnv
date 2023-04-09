package ent;

//Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" 
public class Rectangulo {

    private int lado1;
    private int lado2;
    

    // CONSTRUCT
    public Rectangulo() {

    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // GET Y SET
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

   

    // Método "calcular_area" que calcule y devuelva el área del rectángulo.

    public int calcular_area() {

        int res;
        res = lado1 * lado2;

        return res;

    }



}
