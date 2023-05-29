package srv;

import java.util.*;
import ent.Alumno;

/**
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno.
 * Se pide
 * toda la información al usuario y ese Alumno se guarda en una lista de tipo
 * Alumno y se le
 * pregunta al usuario si quiere crear otro Alumno o no.
 */
public class srvAlumno {
    private Scanner leer = new Scanner(System.in);

    public void crearAlumno(ArrayList<Alumno> a) {

        String res;

        do {
            System.out.print("Ingrese el nombre del Alumno: > ");
            String nombre = leer.next();
            ArrayList<Integer> notas = new ArrayList<>();
            System.out.println("Ingrese las notas del Alumno: ");
            for (int index = 0; index < 3; index++) {
                System.out.print("" + (index + 1) + "- ");
                notas.add(leer.nextInt());

            }
            Alumno aux = new Alumno(nombre, notas);
            a.add(aux);
            System.out.print("¿Desea agregar otro alumno? (S/N): >");
            res = leer.next();

        } while (res.equalsIgnoreCase("s"));

    }

    public void mostraA(ArrayList<Alumno> a) {

        for (Alumno alumno : a) {
            System.out.println(alumno);

        }

    }

    public void notaFinal(ArrayList<Alumno> a) {

        String res;
        do {
            System.out.print("Ingrese el Nombre del alumno para obtener el promedio: >");
            String nombre = leer.next();
            int promedio = 0;
            boolean confirm = false;

            for (Alumno alumno : a) {
                if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                    confirm = true;
                    for (int nota : alumno.getNotas()) {
                        promedio += nota;
                    }
                    System.out.println("El promedio del Alumno " + alumno.getNombre() + " es: " + (promedio / 3));
                }
            }
            if (!confirm) {
                System.out.println("No se ha encontrado al Alumno.");

            }

            System.out.print("¿Desea verificar el promedio de otro alumno? (S/N): >");
            res = leer.next();

        } while (res.equalsIgnoreCase(res));
    }

    public void elimiA(ArrayList<Alumno> a) {
        
               
        System.out.print("Ingrese el nombre del Alumno que desea eliminar: >");
        String nombre = leer.next();
        boolean confirm = false;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getNombre().equalsIgnoreCase(nombre)) {
                a.remove(i);
                confirm = true;

            }
        }
        if (confirm) {
            System.out.println("El Alumno ha sido Eliminado");
        } else {
            System.out.println("No hemos eencontrado al Alumno.");
        }

    }

    public void modificarA(ArrayList<Alumno> a) {

        System.out.print("Ingrese el nombre del Alumno a modificar: >");
        String nombre = leer.next();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.print("Ingresa el nuevo nombre: >");
                String newNombre = leer.next();
                a.get(i).setNombre(newNombre);
            }
        }

    }

    public void modificarN(ArrayList<Alumno> a) {
        System.out.println("Ingrese el nombre del alumno a modificar: >");
        String nombre = leer.next();

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(i + " " + a.get(i).getNotas());
                System.out.println("Ingrese la posición de las notas a modificar:");
                int pos = leer.nextInt();
                System.out.println("Ingrese la nueva nota:>");
                int nota = leer.nextInt();
                a.get(i).getNotas().add(pos, nota);

            }
        }

    }
}
