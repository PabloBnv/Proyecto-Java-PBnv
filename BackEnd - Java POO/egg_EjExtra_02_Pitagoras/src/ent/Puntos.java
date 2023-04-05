package ent;

import java.util.Scanner;

//Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
// sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
public class Puntos {
  
    private int x1,y1,x2,y2;
    private Scanner leer=new Scanner(System.in);
    //CONSTRUCTORS
    public Puntos() {

    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //GET Y SET
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    
    // Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos
    // números y los ingresa en los atributos del objeto.
    
    public void crearPuntos(){

        System.out.println("**************************************");
        System.out.println("Ingrese las coordenadas de X:");
        System.out.print("x1 = ");
        this.x1 = leer.nextInt();
        System.out.print("x2 = ");
        this.x2 = leer.nextInt();
        System.out.println("Ingrese las coordenadas de Y:");
        System.out.print("y1 = ");
        this.y1 = leer.nextInt();
        System.out.print("y2 = ");
        this.y2 = leer.nextInt();


    }

    public void calcularDistancia(){

        double distancia = Math.sqrt((Math.pow((this.x2 - this.x1), 2)) + (Math.pow((this.y2 - this.y1), 2)));
        System.out.println("La distancia en " + distancia);


    }

    

}
