package srv;

import java.util.*;

public class CodPostSrv {
    private Scanner leer = new Scanner(System.in);

    public void agregarCodPost(HashMap<Integer, String> lista) {
        System.out.print("\n Ingrese el nombre de la ciudad: >");
        String ciudad = leer.next();
        System.out.print("Ingrese Cod Postal; >");
        int cod = leer.nextInt();
        lista.put(cod, ciudad);

    }

    public void buscarCodigo(HashMap<Integer, String> lista) {
        System.out.println("Ingrese un codigo postal:");
        int cod = leer.nextInt();
        if (lista.containsKey(cod)) {
            System.out.println("La ciudad es: " + lista.get(cod));
        } else {
            System.out.println("Codigo no encontrado.");
        }
    }

    public void eliminarCodigos(HashMap<Integer, String> lista) {

        System.out.print("Ingrese un codigo postal a elimar: >");
        int cod = leer.nextInt();
        if (lista.containsKey(cod)) {
            lista.remove(cod);
            System.out.println("Se ha eliminado la ciudad.");
        } else {
            System.out.println("Ciudad no encontrada.");
        }
    }

    public void borradoRapido(HashMap<Integer, String> lista) {
        System.out.print("¿Cuantos desea eliminar? >");

        int op = leer.nextInt();
        for (int i = 0; i < op; i++) {

            System.out.print("Ingrese un codigo postal a elimar: >");
            int cod = leer.nextInt();
            if (lista.containsKey(cod)) {
                lista.remove(cod);
                System.out.println("Se ha eliminado la ciudad.");
            } else {
                System.out.println("Ciudad no encontrada.");
            }

        }

    }

    public void creadoRapido(HashMap<Integer, String> lista) {
        System.out.print("¿Cuantos desea crear? >");

        int op = leer.nextInt();
        for (int i = 0; i < op; i++) {

            System.out.print("\n Ingrese el nombre de la ciudad: >");
            String ciudad = leer.next();
            System.out.print(" Ingrese Cod Postal; >");
            int cod = leer.nextInt();
            lista.put(cod, ciudad);

        }

    }

    public void mostrarCodigos(HashMap<Integer, String> lista) {
        int i = 1;
        System.out.println("Lista de Códigos Postales: >");
        for (Map.Entry<Integer, String> cod : lista.entrySet()) {
            System.out.println(i + " " + cod.getKey() + " " + cod.getValue());
            i++;
        }

    }

}
