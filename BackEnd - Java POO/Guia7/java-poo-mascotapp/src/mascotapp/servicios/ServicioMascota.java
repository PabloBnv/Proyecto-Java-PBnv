package mascotapp.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import mascotapp.entidades.Mascota;

public class ServicioMascota {

    private Scanner leer;
    private List<Mascota> mascotas;

    public ServicioMascota() {
        this.leer = new Scanner(System.in);
        this.mascotas = new ArrayList<Mascota>();
    }

    public Mascota crearMascota() {

        System.out.println("Ingrese nombre: ");
        String nombre = leer.next();

        System.out.println("Ingrese apodo: ");
        String apodo = leer.next();

        System.out.println("Ingrese tipo: ");
        String tipo = leer.next();

        System.out.println("Ingrese color: ");
        String color = leer.next();

        System.out.println("Ingrese raza: ");
        String raza = leer.next();

        System.out.println("Ingrese edad: ");
        String edad = leer.next();

        System.out.println("¿Tiene Cola?: ");
        //String edad = leer.next();
        
        return new Mascota(nombre, apodo, tipo, color, raza, 0, false);

    }

    public void mostrarMascotas() {

        System.out.println("Las mascotas acutales de la lista Mascotas: ");
        /*
         * for (int i = 0; i < mascotas.size(); i++) {
         * System.out.println(mascotas);
         * }
         */

        for (Mascota aux : mascotas) {
            System.out.println(" " + aux);
        }
        System.out.println("La cantidad de mascotas es: " + mascotas.size());

    }

    public void agregaMascota(Mascota a) {

        mascotas.add(a);

    }

    /*
     * @param cantidad = Cantidad Mascotas + add to list
     */
    public void fabricarPepes(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            // mascotas.add(new Mascota("Pepe", "lolo", "Perro"));
        }
    }

    public void fabricarMascotas(int cantidad) {

        for (int i = 0; i < cantidad; i++) {
            Mascota ma = crearMascota();
            agregaMascota(ma);
            System.out.println(ma.toString());
        }

    }
}
