package ent;

import java.util.Scanner;

// Crea una clase  "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
public class Empleado {
    
    private String nombre;
    private int edad, salario;
    private Scanner leer = new Scanner(System.in);
    
    //Constructor
    public Empleado() {

    
    }


    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    //GET Y SET
    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public int getSalario() {
        return salario;
    }


    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    
    //Crea un método "calcular_aumento" que calcule el aumento salarial 
    //de un empleado en función de su edad y salario actual.
    public int calcular_aumento(){

        System.out.print("Ingrese su nombre: >");
        nombre= leer.next();
        System.out.print("Ingrese su edad: >");
        edad= leer.nextInt();
        System.out.print("Ingrese su salario actual: >");
        salario= leer.nextInt();

        System.out.println("Procesando...");

        // El aumento salarial debe ser del 10% si el empleado 
        // tiene más de 30 años o del 5% si tiene menos de 30 años.

        if (edad>30){
            int aum10= (10*salario) /100;
            System.out.print("Nombre: "+nombre);
            System.out.println(" Edad: "+edad);
            System.out.print("Salario: "+salario);
            System.out.println(" Aumento: "+aum10);
            System.out.println("El aumento salarial es de un 10% en total de "+salario+" + "+aum10+" : > "+(salario+aum10));

        }else {
            int aum5=(5*salario)/100;
            System.out.print("Nombre: "+nombre);
            System.out.println(" Edad: "+edad);
            System.out.print("Salario: "+salario);
            System.out.println(" Aumento 5%: "+aum5);
            System.out.println("El aumento salarial es de un 5% de "+salario+" + "+aum5+" en total: >"+(salario+aum5));


        }








        return 0;
    }



    
    
}
