package entidades;

import java.util.Scanner;

//Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
public class Cuenta {

    private int saldo;
    private int titular;
    private Scanner leer=new Scanner(System.in);
    // Constructors

    public Cuenta() {

    }

    public Cuenta(int saldo, int titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    //GET Y SET
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getTitular() {
        return titular;
    }

    public void setTitular(int titular) {
        this.titular = titular;
    }

    //Luego, crea un método "retirar_dinero" que permita retirar una cantidad 
    //de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo 
    //después de realizar una transacción de retiro.
    public void retirar_dinero(){


        


    }


}
