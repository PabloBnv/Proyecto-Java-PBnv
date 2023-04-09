package ent;

import java.util.Scanner;

//Crear una clase Rectángulo que modele rectángulos por medio de un atributo
    // privado base y un atributo privado altura.
public class Rectangulo {

    private int altura;
    private int base;
    private Scanner leer =new Scanner(System.in);
    //Constructor  
    public Rectangulo() {
    }


    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    //Geters y Setters
    public int getAltura() {
        return altura;
    }


    public void setAltura(int altura) {
        this.altura = altura;
    }


    public int getBase() {
        return base;
    }


    public void setBase(int base) {
        this.base = base;
    }

    
    // La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados
    // por el usuario. 
    public void crearRectangulo() {
        System.out.println("**************************************");
        System.out.print("Ingrese la base:");
        System.out.print(" >");
        this.base = leer.nextInt();
        System.out.print("Ingrese la altura:");
        System.out.print(" >");
        this.altura = leer.nextInt();
        System.out.println("**************************************");
    }

    // También incluirá un método para calcular la superficie del rectángulo y 
    // un método para calcular el perímetro del rectángulo.

    public int superficie() {

        int res = base * altura;
        return res;
    }

    public int perimetro() {

        int res = (base * altura)*2;
        return res;
    }

    // Por último, tendremos un  método que dibujará el rectángulo mediante asteriscos 
    // usando la base y la altura.

    public void dibujarRectangulo() {
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i==0 || i==altura-1){
                    System.out.print("* ");
                }else {
                    if (j!=0 && j!=base-1){
                         System.out.print("  ");
                    }else {
                        System.out.print("* ");
                    }
                 }     
            }
           System.out.println("");
        }
        
        
        
    }



}
