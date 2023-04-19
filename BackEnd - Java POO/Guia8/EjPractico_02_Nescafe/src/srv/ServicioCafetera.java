/* 
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
-Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
-Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de 
la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual 
de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al 
usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
-Método vaciarCafetera(): pone la cantidad de café actual en cero. 
-Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe
y se añade a la cafetera la cantidad de café indicada.

*/
package srv;

import java.util.Scanner;

import ent.Cafetera;

public class ServicioCafetera {

    private Scanner leer = new Scanner(System.in);

    Cafetera c1 = new Cafetera();

    // Metodo para Crear la cafetera
    public void crearCafetera() {

        System.out.print("Ingrese el tamaño de la cefetera en mililitros: >");
        c1.setCapacidadMáxima(leer.nextInt());
        System.out.println("La capacidad máxima de la cafetera es " + c1.getCapacidadMáxima() + "ml");

    }

    // -Método llenarCafetera(): hace que la cantidad actual sea igual a la
    // capacidad máxima.
    public void llenarCafetera() {
        System.out.println("La cafetera se lleno a su máxma capacidad " + c1.getCapacidadMáxima() + "ml");
        c1.setCantidadActual(c1.getCapacidadMáxima());
    }

    /*
     * Método servirTaza(int):
     * -pide el tamaño de una taza vacía
     * -recibe el tamaño de la taza y simula la acción de servir la taza con la
     * capacidad indicada
     * -Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo
     * que quede.
     * -El método le informará al usuario si se llenó o no la taza, y de no haberse
     * llenado en cuanto quedó la taza.
     */

    public void servirTaza(int taza) {

        if (c1.getCantidadActual() > 0) {
            if (c1.getCantidadActual() >= taza) {
                c1.setCantidadActual(c1.getCantidadActual() - taza);
                System.out.println("La taza se llenó completamente.");

            } else {
                System.out
                        .println("La taza no se pudo llenar correctamente. Quedó con " + c1.getCantidadActual() + "ml");
                c1.setCantidadActual(0);
                ;
            }

        } else {
            System.out.println("No hay suficiente café para servir. Cantidad Actual: " + c1.getCantidadActual());

        }

    }

    // -Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    public void vaciarCafetera(){

        c1.setCantidadActual(0);
        System.out.println("La Capacidad Máxima es: "+c1.getCantidadActual());

    }

    //-Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe
    //y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(int cafe){

        c1.setCantidadActual(c1.getCantidadActual() + cafe);
        System.out.println("La catidad actual de café es: "+c1.getCantidadActual()+"ml");

    }

    
}
