import java.util.ArrayList;
import java.util.Scanner;

import ent.Cantante;
import srv.CantanteSrv;

/**
 * Crear una clase llamada Entidad.CantanteFamoso. Esta clase guardará cantantes famosos y
 * tendrá como atributos el nombre y discoConMasVentas.
 * Se debe, además, en el main, crear una lista de tipo Entidad.CantanteFamoso y agregar 5
 * objetos de tipo Entidad.CantanteFamoso a la lista. Luego, se debe mostrar los nombres de
 * cada cantante y su disco con más ventas por pantalla.
 * Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de
 * agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el
 * usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los
 * cambios.
 */
public class CantanteApp {
    public static void main(String[] args) throws Exception {
        
        
        try (Scanner leer = new Scanner(System.in)) {

            CantanteSrv cs = new CantanteSrv();
            ArrayList<Cantante> lista = new ArrayList<>();

            lista.add(new Cantante("Nirvana", "Nevermind"));
            lista.add(new Cantante("Pearl Jam", "Ten"));
            lista.add(new Cantante("SoundGarden", "Badmotorfinger"));
            lista.add(new Cantante("Alice in Chains", "Dirt"));
            lista.add(new Cantante("Stone Temple Pilots", "Core"));
            
            String op;

            do {
                System.out.println("\n ------ Menú -------- \n"
                        + "[+] A- Agregar Cantante\n"
                        + "[+] B- Mostrar Cantantes\n"
                        + "[+] C- Eliminar Cantante\n"
                        + "[+] s- Salir");
                System.out.print("Seleccione un número del Menú --> ");
                op = leer.next().toUpperCase();
                switch (op) {
                    case "A":
                        cs.agregarCantante(lista);
                        break;
                    case "B":
                        cs.mostrarCantantes(lista);
                        break;
                    case "C":
                        cs.eliminarCantante(lista);
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
