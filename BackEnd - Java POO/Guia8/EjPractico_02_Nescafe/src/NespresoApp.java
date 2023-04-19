import java.util.Scanner;

import srv.ServicioCafetera;

/*
 * Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos
 * capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual
 * (la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros
 * así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
    -Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    -Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de 
    la taza y simula la acción de servir la taza con la capacidad indicada. Si la cantidad actual 
    de café “no alcanza” para llenar la taza, se sirve lo que quede. El método le informará al 
    usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
    -Método vaciarCafetera(): pone la cantidad de café actual en cero. 
    -Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe
     y se añade a la cafetera la cantidad de café indicada.

 */

public class NespresoApp {
    public static void main(String[] args) {

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*              Nespreso APP          *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Bienvenido al portal NespresoAPP");

            System.out.println("********* CREACION DE CAFETERA *********");
            ServicioCafetera sc = new ServicioCafetera();

            sc.crearCafetera();

            System.out.println("**************************************");
            int opcion;
            do {

                System.out.println("*****************MENU******************");
                System.out.println("1- Llenar Cafeera");
                System.out.println("2- Servir Cafetera");
                System.out.println("3- Vaciar Cafetera");
                System.out.println("4- Agregar Cafetera");
                System.out.println("5- Salir");
                System.out.println("**************************************");
                System.out.print("Ingrese una opción: ");
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        sc.llenarCafetera();
                        break;

                    case 2:

                        System.out.println("Ingrese el tamaño de la taza en ml: > ");
                        int taza = leer.nextInt();
                        sc.servirTaza(taza);
                        break;

                    case 3:
                    System.out.println("La cafetera se vaciará.");
                    sc.vaciarCafetera();
                        break;

                    case 4:
                    System.out.println("Ingrese la cantidad de café en ml: > ");
                    int cafe = leer.nextInt();
                    sc.agregarCafe(cafe);
                        break;

                    case 5:

                        break;

                   

                }
            } while (opcion != 5);
        }

    }
}
