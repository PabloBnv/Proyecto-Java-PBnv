/* Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con 
    los cuales se realizarán diferentes operaciones matemáticas. La clase debe tener un 
    constructor vacío, getters y setters.  En el constructor vacío se usará el Math.random
    para generar los dos números. Crear una clase ParDeNumerosService, en el paquete Servicios,
    que deberá además implementar los siguientes métodos:
    
    -Método mostrarValores que muestra cuáles son los dos números guardados.
    
    -Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    
    -Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.
    
    -Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */

import ent.ParDeNumeros;
import srv.ParDeNumerosServicio;

public class ParDeNumApp {
    public static void main(String[] args) throws Exception {
       
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*             ParDeNumeros APP       *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        System.out.println("Bienvenido al portal ParDeNumerosAPP");

        ParDeNumerosServicio ps = new ParDeNumerosServicio();

        System.out.println(" >  Creando números  <");
        ParDeNumeros pn = new ParDeNumeros();
        System.out.println("Los números son: ");
        ps.mostrarValores(pn);

        System.out.println("El número mayor es: "+ps.devolverMayor(pn));

        System.out.println("La potencia del mayor valor elevado al menor número es: "+ps.calcularPotencia(pn));

        System.out.println("La raíz cuadrada del menor valor es: "+ps.calcularRaiz(pn));


    }
}
