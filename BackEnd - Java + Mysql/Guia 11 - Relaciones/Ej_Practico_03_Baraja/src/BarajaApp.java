import java.util.*;

import ent.*;
import srv.BarajaSrv;

public class BarajaApp {
    public static void main(String[] args) throws Exception {
        System.out.println("************************************** \n"
                + "*                                    * \n"
                + "*              Juego de Barajas      * \n"
                + "*                                    * \n"
                + "************************************** \n"
                + " Bienvenido al Juego de las Barajas ");

        try (Scanner leer = new Scanner(System.in)) {
            BarajaSrv bs = new BarajaSrv();
            ArrayList<Palo> palos = new ArrayList<>();
            ArrayList<Cartas> cartas = new ArrayList<>();
            ArrayList<Cartas> cartasDadas = new ArrayList<>();

            String op;
            do {
                System.out.println("\n ------ Menú -------- \n"
                        + "[+] A- Crear Baraja \n"
                        + "[+] B- Mezclar Baraja\n"
                        + "[+] C- Dar Cartas\n"
                        + "[+] D- Mostrar Cartas del Montón\n"
                        + "[+] E- Cartas disponibles\n"
                        + "[+] F- Mostrar baraja\n"
                        + "[+] S- Salir");
                System.out.print("Seleccione un número del Menú --> ");
                op = leer.next().toUpperCase();
                switch (op) {
                    case "A":
                        bs.crearPalos(palos);
                        bs.crearBaraja(cartas, palos);
                        break;
                    case "B":
                        bs.barajar(cartas);
                        break;
                    case "C":
                        bs.darCartas(cartas, cartasDadas);
                        break;
                    case "D":
                        bs.cartasMonton(cartasDadas);
                        break;
                    case "E":
                        bs.cartasDisponibles(cartas);
                        break;
                    case "F":
                        bs.mostrarBaraja(cartas);
                        break;
                    case "S":
                        System.out.println("Saliendo del menú...");
                        op="S";
                        break;

                    default:
                        System.out.println("No exíste esta opción, vuelva a intentarlo.");
                        break;
                }

            } while (op != "S");

        }
    }
}
