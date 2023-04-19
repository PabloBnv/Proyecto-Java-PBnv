package entidades;

import java.util.Scanner;

//Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
public class Cuenta {

    private int saldo;
    private String titular;
    private Scanner leer = new Scanner(System.in);
    // Constructors

    public Cuenta() {

    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    // GET Y SET
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Luego, crea un método "retirar_dinero" que permita retirar una cantidad
    // de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
    // negativo
    // después de realizar una transacción de retiro.
    public void retirar_dinero() {

        System.out.print("Ingrese nombre del Titular:> ");
        titular = leer.next();
        System.out.print("Ingrese el saldo:>");
        saldo = leer.nextInt();

        System.out.println("¿Cuanto efectivo desea RETIRAR?");
        System.out.print("> ");
        int retiro = leer.nextInt();

        if (retiro <= saldo) {
            saldo -= retiro;
            System.out.println("El monto a retirar es de: " + retiro);
            System.out.println("El saldo restante es: " + saldo);
        } else {
            System.out.println("Lo sentimos su saldo restante es inferior a 0.");
        }

    }

}
