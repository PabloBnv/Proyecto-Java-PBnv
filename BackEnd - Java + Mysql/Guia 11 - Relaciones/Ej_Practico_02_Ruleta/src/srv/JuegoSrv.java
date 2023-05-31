package srv;

import java.util.*;

import ent.Jugador;
import ent.Revolver;

public class JuegoSrv {
    public void llenarJuego(ArrayList<Jugador> jugadoresList, Revolver revolver) {
        for (int i = 0; i < 6; i++) {
            Jugador playerX = new Jugador();
            playerX.setId((i + 1));
            playerX.setNombre("Entidad.Jugador " + (i + 1));
            jugadoresList.add(playerX);
        }
        llenarRevolver(revolver);
    }

    public boolean mojar(Revolver revolverObj) {
        boolean seMurio = false;
        if (revolverObj.getPosActual() == revolverObj.getPosAgua()) {
            seMurio = true;
        }
        return seMurio;
    }

    public boolean disparo(Jugador jugador, Revolver revolverObj) {
        boolean seMurio = false;
        if (mojar(revolverObj)) {
            jugador.setMojado(true);
            seMurio = true;
        }
        return seMurio;
    }

    public boolean ronda(Jugador jugador, Revolver revolverObj) {
        boolean juegoSigue = true;
        if (disparo(jugador, revolverObj)) {
            juegoSigue = false;
        }
        return juegoSigue;
    }

    public void llenarRevolver(Revolver revolverObj) {
        Random random = new Random();
        revolverObj.setPosActual(random.nextInt(6) + 1);
        revolverObj.setPosAgua(random.nextInt(6) + 1);
    }

    public void siguienteChorro(Revolver revolverObj) {
        if (revolverObj.getPosActual() < 6) {
            revolverObj.setPosActual(revolverObj.getPosActual() + 1);
        } else if (revolverObj.getPosActual() == 6) {
            revolverObj.setPosActual(1);
        }
    }
}
