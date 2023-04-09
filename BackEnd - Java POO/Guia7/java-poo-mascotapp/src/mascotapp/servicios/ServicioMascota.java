package mascotapp.servicios;

import java.util.Scanner;

import mascotapp.entidades.Mascota;

public class ServicioMascota {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Mascota crearMascota() {

        System.out.println("Ingrese nombre: ");
        String nombre = leer.next();

        System.out.println("Ingrese apodo: ");
        String apodo = leer.next();

        System.out.println("Ingrese tipo: ");
        String tipo = leer.next();

        return new Mascota(nombre, apodo, tipo);

    }
}
