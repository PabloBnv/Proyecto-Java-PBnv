import java.util.*;

import ent.Perro;
import ent.Persona;
import srv.AdopcionSrv;

/**
 * Realizar un programa para que una Entidad.Persona pueda adoptar un
 * Entidad.Perro. Vamos a contar de dos * clases. Entidad.Perro, que
 * tendrá como atributos: nombre, raza, edad y tamaño; y la clase Entidad.
 * Persona con atributos: nombre, apellido, edad, documento y Entidad.Perro.
 * Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a
 * tener que pensar la lógica necesaria para asignarle a cada Entidad.Persona un
 * Entidad.Perro y por ultimo, mostrar desde la clase Entidad.Persona, la
 * información
 * del Entidad.Perro y de la Entidad.Persona.
 */
public class AdopcionApp {
    public static void main(String[] args) throws Exception {
        System.out.println("************************************** \n"
                + "*                                    * \n"
                + "*              Adopción App          * \n"
                + "*                                    * \n"
                + "************************************** \n"
                + " Bienvenido al portal de Adopción ");

        try (Scanner leer = new Scanner(System.in)) {

            AdopcionSrv as = new AdopcionSrv();
            ArrayList<Persona> persona = new ArrayList<>();
            ArrayList<Perro> perro = new ArrayList<>();

            System.out.println("\nCargando Personas y Perros por defecto...\n");
            persona.add(new Persona("Mokey D.", "Luffy", 20, "504495", null));
            persona.add(new Persona("Zoro", "Roronoa", 25, "400004", null));
            perro.add(new Perro("Dodo", "Dogo", 5, "Grande"));
            perro.add(new Perro("Paco", "Doberman", 3, "Grande"));

            String op;
            do {
                System.out.println("\n ------ Menú -------- \n"
                        + "[+] A- Agregar Personas\n"
                        + "[+] B- Agregar Perros\n"
                        + "[+] C- Mostar Lista\n"
                        + "[+] D- Adoptar\n"
                        + "[+] S- Salir");
                System.out.print("Seleccione un número del Menú --> ");
                op = leer.next().toUpperCase();
                switch (op) {
                    case "A":
                        as.crearPersona(persona);
                        break;
                    case "B":
                        as.crearPerro(perro);
                        break;
                    case "C":
                        as.mostarLista(perro, persona);
                        break;
                    case "D":
                        as.adoptarMascota(perro, persona);
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
