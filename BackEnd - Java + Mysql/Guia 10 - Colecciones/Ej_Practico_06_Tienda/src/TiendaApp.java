/* Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas. */

import java.util.*;

import srv.TiendaSrv;

public class TiendaApp {
    public static void main(String[] args) throws Exception {
        System.out.println("************************************** \n"
                + "*                                    * \n"
                + "*                TiendaAPP           * \n"
                + "*                                    * \n"
                + "************************************** \n");

        System.out.println("    Bienvenido al portal TiendaAPP ");

        try (Scanner leer = new Scanner(System.in)) {

            TiendaSrv ts = new TiendaSrv();
            HashMap<String, Double> productos = new HashMap<String, Double>();

            int op = 0;

            do {
                System.out.println("\n ------ Menú -------- \n"
                        + "[+] 1- Agregar producto\n"
                        + "[+] 2- Modificar producto\n"
                        + "[+] 3- Eliminar producto\n"
                        + "[+] 4- Mostrar productos\n"
                        + "[+] 5- Promedio productos\n"
                        + "[+] 6- Salir");
                System.out.print("Seleccione un número del Menú --> ");
                op = leer.nextInt();
                switch (op) {
                    case 1:
                        ts.agregarProducto(productos);
                        break;
                    case 2:
                        ts.modificarProducto(productos);
                        break;
                    case 3:
                        ts.eliminarProducto(productos);
                        break;
                    case 4:
                        ts.mostrarProductos(productos);
                        break;
                    case 5:
                        ts.promedioProductos(productos);
                        break;
                    case 6:
                        System.out.println("Saliendo del menú...");
                        break;

                    default:
                        System.out.println("No exíste esta opción, vuelva a intentarlo.");
                        break;
                }

            } while (op != 6);

        }

    }
}
