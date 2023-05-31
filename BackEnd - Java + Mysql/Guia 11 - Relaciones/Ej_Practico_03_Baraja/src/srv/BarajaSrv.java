package srv;
import java.util.*;

import ent.*;



public class BarajaSrv {
    Scanner leer = new Scanner(System.in);
    

    public void crearPalos(ArrayList<Palo> palos) {
        palos.add(new Palo("Espadas"));
        palos.add(new Palo("Bastos"));
        palos.add(new Palo("Copas"));
        palos.add(new Palo("Oros"));
    }

    public void crearBaraja(ArrayList<Cartas> cartas, ArrayList<Palo> palos) {
        
        if (cartas.size() > 0) {
            System.out.println("Ya existe una baraja");
        } else {
            System.out.println("Creando baraja...");
            String[] numero = {"1", "2", "3", "4", "5", "6", "7", "10", "11", "12"};

            for (int i = 0; i < palos.size(); i++) {
                for (int j = 0; j < numero.length; j++) {
                    cartas.add(new Cartas(numero[j], palos.get(i)));
                }
            }
            System.out.println("Se creó la baraja correctamente!");
        }
    }

    public void barajar(ArrayList<Cartas> cartas) {
        System.out.println("Barajando...");
        Collections.shuffle(cartas); 
        System.out.println("Se mezcló la baraja completamente!");
    }

    public Cartas siguienteCarta(ArrayList<Cartas> cartas) {
        Cartas carta = new Cartas();
        if (cartas.size() == 0) {
            System.out.println("No hay cartas");
        } else {
            carta = cartas.get(0);
        }
        return carta;
    }

    public void cartasDisponibles(ArrayList<Cartas> cartas) {
        System.out.println("Entidad.Cartas disponibles: " + cartas.size());
    }

    public void darCartas(ArrayList<Cartas> cartas,  ArrayList<Cartas> cartasDadas) {
        System.out.println("Ingrese la cantidad de cartas que desea dar:");
        int cantidad = leer.nextInt();
        if (cantidad > cartas.size()) {
            System.out.println("No hay suficientes cartas");
        } else {
            int cont = 0;
            while (cont < cantidad) {
                System.out.println("Se dio la carta: " +    siguienteCarta(cartas) + " al jugador");
                cartasDadas.add(cartas.get(0));
                cartas.remove(0);
                cont++;
            }
        }
    }

    public void cartasMonton( ArrayList<Cartas> cartasDadas) {
        System.out.println("Entidad.Cartas del monton: " + cartasDadas.size());
        for (Cartas carta : cartasDadas) {
            System.out.println(carta);
        }
    }

    public void mostrarBaraja(ArrayList<Cartas> cartas) {
        System.out.println("Entidad.Cartas de la baraja:");
        for (Cartas carta : cartas) {
            System.out.println(carta);
        }
    }
}
