package servicios;

import java.util.Scanner;

import entidades.CuentaBancaria;

//Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in);

    // Creación de Objeto
    CuentaBancaria c1 = new CuentaBancaria();

    // -Método para crear cuenta pidiéndole los datos al usuario.
    public void crearCuenta() {

        System.out.print("Ingrsar número de Cuenta: >");
        c1.setNumeroCuenta(leer.nextInt());

        System.out.print("Ingrsar Saldo Actual: >");
        c1.setSaldoActual(leer.nextInt());

        System.out.print("Ingrsar DNI: >");
        c1.setDniCliente(leer.nextInt());

    }

    // -Método ingresar(double): recibe una cantidad de dinero a ingresar y se le
    // sumará al saldo actual.
    // No use double, prefiero llamar al objeto
    public void ingresar() {

        System.out.println("*********INGRESO***********");
        System.out.print("Ingrese una cantidad: >");
        double ingreso = leer.nextInt();
        System.out.println("Procesando...");

        double saldoNuevo = c1.getSaldoActual() + ingreso;

        c1.setSaldoActual(saldoNuevo);
        System.out.println("El saldo actual es " + saldoNuevo);
        System.out.println("***************************");

    }

    // -Método retirar(double): recibe una cantidad de dinero a retirar y se le
    // restara al saldo actual.
    // No use double, prefiero llamar al objeto
    public void retirar() {

        System.out.println("*********RETIRO***********");
        System.out.print("Ingrese una cantidad: >");
        int retiro = leer.nextInt();
        System.out.println("Procesando...");

        if (c1.getSaldoActual() - retiro < 0) {
            System.out.println("El retiro es mayor al saldo actual.");
            System.out.println("Su saldo actual es: " + c1.getSaldoActual());
        } else {
            c1.setSaldoActual(c1.getSaldoActual() - retiro);
            System.out.println("El saldo actual es " + c1.getSaldoActual());
        }

        System.out.println("***************************");

    }

    //-Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
    public void extraccionRapida(){

        System.out.println("********EXTRACCIÓN RÁPIDA***********");
        System.out.println("Extrayendo el 20% del saldo...");
        System.out.println("Procesando...");

        

        if (c1.getSaldoActual() < c1.getSaldoActual()*0.2 ) {
            System.out.println("El retiro es mayor al saldo actual.");
            System.out.println("Su saldo actual es: " + c1.getSaldoActual());
        } else {
            c1.setSaldoActual(c1.getSaldoActual() - (c1.getSaldoActual()*0.2));
            System.out.println("El saldo actual es " + c1.getSaldoActual());
        }

        System.out.println("***************************");


    }

    public String consultarSaldo(){
        
        return "El saldo actual es: >"+c1.getSaldoActual();

    }

    public String consultarDatos(){

        return c1.toString();

    }



    public String toString() {
        return "CuentaBancaria [Numero de Cuent: " + c1.getNumeroCuenta() + ", Saldo Actual: " + c1.getSaldoActual()
                + ", DNI: "+ c1.getDniCliente() + "]";
    }

}
