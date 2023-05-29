import java.util.HashSet;
import java.util.Scanner;

import ent.Libros;
import srv.LibreriaSrv;

public class LibreriaApp {
    public static void main(String[] args) throws Exception {

        System.out.println("************************************** \n"
                + "*                                    * \n"
                + "*                LibreriaApp         * \n"
                + "*                                    * \n"
                + "************************************** \n");

        System.out.println("    Bienvenido al portal LibreriaApp ");
        try (Scanner leer = new Scanner(System.in)) {

            LibreriaSrv ls = new LibreriaSrv();
            HashSet<Libros> l = new HashSet<>();
            l.add(new Libros("El señor de los anillos", "J.R.R. Tolkien", 5, 2));
            l.add(new Libros("El Quijote", "Miguel de Cervantes", 3, 3));
            l.add(new Libros("Harry Potter", "J.K. Rowling", 4, 1));

            String op;

            do {
                System.out.println("\n ------ Menú -------- \n"
                        + "[+] A- Agregar Libro\n"
                        + "[+] B- Pedir Libro\n"
                        + "[+] C- Devolver Libro\n"
                        + "[+] D- Mostrar Libros\n"
                        + "[+] S- Salir");
                System.out.print("Seleccione un número del Menú --> ");
                op = leer.next().toUpperCase();
                switch (op) {
                    case "A":
                        ls.crearLibro(l);
                        break;
                    case "B":
                        ls.prestamo(l);
                        break;
                    case "C":
                        ls.devolucion(l);
                        break;
                    case "D":
                        ls.mostrarlibros(l);
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
