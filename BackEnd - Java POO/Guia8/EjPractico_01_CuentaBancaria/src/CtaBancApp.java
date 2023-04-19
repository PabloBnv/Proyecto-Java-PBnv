
/*
 * Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos:
 *  numeroCuenta(entero), dniCliente(entero largo), saldoActual. 
 * Agregar constructor vacío, con parámetros, getters y setters.
 * Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
 * -Método para crear cuenta pidiéndole los datos al usuario.
 * -Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
 * -Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
 *  Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar
 *  la cuenta en 0.
 * -Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
 * -Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
 * -Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 *
 */

import java.util.Scanner;


import servicios.CuentaBancariaServicio;

public class CtaBancApp {
    public static void main(String[] args) {

        int opcion;

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*           Cuenta Bancaria APP      *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        System.out.println("Bienvenido al portal BancoAPP");

        try (Scanner leer = new Scanner(System.in)) {

            System.out.println("********* CREACION DE CUENTA *********");
            CuentaBancariaServicio cs = new CuentaBancariaServicio();

            cs.crearCuenta();
            

            // CuentaBancaria c1 = cs.crearCuenta();
            System.out.println(cs.toString());
            System.out.println("**************************************");

            
            do {
                System.out.println("*****************MENU******************");
                System.out.println("1- Ingresar dinero a la cuenta");
                System.out.println("2- Retirar dinero de la cuenta");
                System.out.println("3- Extracción rápida");
                System.out.println("4- Consultar Saldo");
                System.out.println("5- Consultar Cuenta");
                System.out.println("6- Salir");
                System.out.println("**************************************");
                System.out.print("Ingrese una opción: ");
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        cs.ingresar();
                        break;

                    case 2:
                        cs.retirar();
                        break;

                    case 3:
                        cs.extraccionRapida();
                        break;

                    case 4:
                        System.out.println(""+cs.consultarSaldo());
                        break;

                    case 5:
                        System.out.println(""+cs.consultarDatos());
                        break;

                    case 6:

                        break;

                }
            } while (opcion != 6);
        }

        

    }
}
