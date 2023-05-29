/**
 * Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
 * y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
 * introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
 * programa mostrará por pantalla el número de valores que se han leído, su suma y su
 * media (promedio).
 */
import srv.NumerosSrv;

public class NumerosApp {
    public static void main(String[] args) throws Exception {

        System.out.println("************************************** \n"
                + "*                                    * \n"
                + "*                NumerosApp          * \n"
                + "*                                    * \n"
                + "************************************** \n");

        System.out.println("    Bienvenido al portal NumerosApp ");

        NumerosSrv ns = new NumerosSrv();

        ns.agregarNum();
        ns.mostrarNum();
        ns.mostrarSuma();
        ns.mostrarMedia();
    }
}
