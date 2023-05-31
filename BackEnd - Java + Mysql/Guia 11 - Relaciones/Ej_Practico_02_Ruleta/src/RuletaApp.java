import java.util.*;

import ent.Jugador;
import ent.Revolver;
import srv.JuegoSrv;

public class RuletaApp {
    public static void main(String[] args) throws Exception {
        System.out.println("************************************** \n"
                + "*                                    * \n"
                + "*              Ruleta App          * \n"
                + "*                                    * \n"
                + "************************************** \n"
                + " Bienvenido al Juego de Ruleta Rusa de agua ");

        try (Scanner leer = new Scanner(System.in)) {

            JuegoSrv juego = new JuegoSrv();
            ArrayList<Jugador> aj = new ArrayList<>();
            Revolver r = new Revolver();

            juego.llenarJuego(aj, r);
            System.out.println("Disparando: ");
            for (int i = 0; i < aj.size(); i++) {
                System.out.println("Posicion revolver: " + r.getPosActual() + "\nPosicion agua: " + r.getPosAgua());
                boolean muerto = !juego.ronda(aj.get(i), r);
                System.out.println(aj.get(i).getNombre() + " Se dispara!");
                if (juego.disparo(aj.get(i), r)) {
                    System.out.println("El " + aj.get(i).getNombre() + " Murio :/");
                } else {
                    System.out.println("Sigue vivo!");
                    System.out.println();
                    juego.siguienteChorro(r);
                }
                if (muerto) {
                    break;
                }

            }

        }
    }
}
