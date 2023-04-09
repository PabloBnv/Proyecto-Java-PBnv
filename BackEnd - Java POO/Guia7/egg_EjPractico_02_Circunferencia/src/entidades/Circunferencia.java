package entidades;

import java.util.Scanner;
// Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
public class Circunferencia {
    
    private double radio;
    private static Scanner leer = new Scanner(System.in);
    
    // -Método constructor que inicialice el radio pasado como parámetro.
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
               
    }
    
    // -Métodos get y set para el atributo radio de la clase Circunferencia.
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // -Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
    public void crearCincurferencia() {
        System.out.println("**************************************");
        System.out.println("A continuación ingrese en radio para poder generar el cálculo.");
        System.out.print(" >");
        this.radio = leer.nextDouble();
    }
   
    // Agregue este método diametro(): Calcula el diametro.
    public double diametro() {
        double diametro = 2 * radio;
        diametro = Math.round(diametro*100.0)/100.0; // Le agregué un redondeo
        return diametro;

    }
    
    // -Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
    public double area() {
        double area = Math.PI * Math.pow(radio,2); // Mucho mejor este cálculo que el sugerido
        area = Math.round(area*100.0)/100.0; // Le agregué un redondeo
        return area;
    }
    // -Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio)
    public double perimetro() {
        double perimetro = 2 * Math.PI * radio; // Mucho mejor este cálculo que el sugerido
        perimetro = Math.round(perimetro*100.0)/100.0; // Le agregué un redondeo
        return perimetro;
    }

    



    
    
    
    


}
