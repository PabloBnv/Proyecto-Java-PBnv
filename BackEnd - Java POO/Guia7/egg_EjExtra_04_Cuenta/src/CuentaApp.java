import entidades.Cuenta;

/*
 * Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
 * Luego, crea un método "retirar_dinero" que permita retirar una cantidad
 * de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
 * negativo después de realizar una transacción de retiro.
 */
public class CuentaApp {
    public static void main(String[] args) throws Exception {
        
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*           Cuenta Bancaria APP      *");
        System.out.println("*                 Retiro             *");
        System.out.println("**************************************");

        Cuenta c1 = new Cuenta();

        c1.retirar_dinero();

    }
}
