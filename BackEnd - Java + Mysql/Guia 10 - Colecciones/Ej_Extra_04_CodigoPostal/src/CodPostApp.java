
/**
 * Almacena en un HashMap los códigos postales de 10 ciudades a elección de esta
 * página: https://mapanet.eu/index.htm
 * Nota: Poner el código postal sin la letra, solo el numero.
 * • Pedirle al usuario que ingrese 10 códigos postales y sus ciudades.
 * • Muestra por pantalla los datos introducidos
 * • Pide un código postal y muestra la ciudad asociada si existe sino avisa al
 * usuario.
 * • Muestra por pantalla los datos
 * • Agregar una ciudad con su código postal correspondiente más al HashMap.
 * • Elimina 3 ciudades existentes dentro del HashMap, que pida el usuario.
 * • Muestra por pantalla los datos
 */

import java.util.*;

import srv.CodPostSrv;

public class CodPostApp {
    public static void main(String[] args) throws Exception {
        System.out.println("************************************** \n"
                + "*                                    * \n"
                + "*            Codigo Postal App       * \n"
                + "*                                    * \n"
                + "************************************** \n");

        System.out.println("  Bienvenido al portal CodPostApp ");

        try (Scanner leer = new Scanner(System.in)) {
            HashMap<Integer, String> lista = new HashMap<>();
            CodPostSrv cs = new CodPostSrv();
            System.out.println("\nCreando una lista de 10 Códigos postales... Espere por favor.\n");
            lista.put(1708, "Morón");
            lista.put(3000, "Santa Fe");
            lista.put(1655, "Jose Leon Suarez");
            lista.put(1836, "Lomas de Zamora");
            lista.put(2520, "Las Rosas");
            lista.put(1822, "Lanus");
            lista.put(2000, "Rosario");
            lista.put(1876, "Quilmes");
            int i = 1;
            System.out.println("Lista de Códigos Postales: ");
            for (Map.Entry<Integer, String> cod : lista.entrySet()) {
                System.out.println(i + " " + cod.getKey() + " " + cod.getValue());
                i++;
            }
            String op;

            do {
                System.out.println("\n ------ Menú -------- \n"
                        + "[+] A- Agregar Código Postal\n"
                        + "[+] B- Buscar Código Postal\n"
                        + "[+] C- Eliminar Código Postal\n"
                        + "[+] D- Mostrar Lista\n"
                        + "[+] E- Borrado Rápido\n"
                        + "[+] F- Crear Rápido\n"
                        + "[+] S- Salir");
                System.out.print("Seleccione un número del Menú --> ");
                op = leer.next().toUpperCase();
                switch (op) {
                    case "A":
                        cs.agregarCodPost(lista);
                        break;
                    case "B":
                        cs.buscarCodigo(lista);
                        break;
                    case "C":
                        cs.eliminarCodigos(lista);
                        break;
                    case "D":
                        cs.mostrarCodigos(lista);
                        break;
                    case "E":
                        cs.borradoRapido(lista);
                        break;
                    case "F":
                        cs.creadoRapido(lista);;
                        break;
                    case "S":
                        System.out.println("Saliendo del menú...");
                        break;

                    default:
                        System.out.println("No exíste esta opción, vuelva a intentarlo.");
                        break;
                }

            } while (op != "S");

        }

    }
}
