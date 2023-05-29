import java.util.*;

import ent.Receta;
import srv.RecetasSrv;

public class RecetaApp {
    public static void main(String[] args) throws Exception {
        System.out.println("************************************** \n"
                + "*                                    * \n"
                + "*              Recetas App           * \n"
                + "*                                    * \n"
                + "************************************** \n");

        System.out.println("  Bienvenido al portal RecetasApp ");

        try (Scanner leer = new Scanner(System.in)) {

            RecetasSrv rs = new RecetasSrv();
            ArrayList<Receta> r = new ArrayList<>();

            r.add(new Receta("Pomarola", "Tomate", "Cebolla", "Ajo"));
            r.add(new Receta("Lasaña", "Pasta", "Carne", "Salsa"));
            r.add(new Receta("Tarta", "Pascualina", "Jamón", "Queso"));
            r.add(new Receta("Pizza", "Masa", "Jamón", "Queso"));

            String op;

            do {
                System.out.println("\n ------ Menú -------- \n"
                        + "[+] A- Agregar Receta\n"
                        + "[+] B- Buscar Receta\n"
                        + "[+] C- Eliminar Receta\n"
                        + "[+] D- Mostrar Lista de Recetas\n"
                        + "[+] S- Salir");
                System.out.print("Seleccione un número del Menú --> ");
                op = leer.next().toUpperCase();
                switch (op) {
                    case "A":
                        rs.crearReceta(r);
                        break;
                    case "B":
                        rs.buscarReceta(r);
                        break;
                    case "C":
                        rs.eliminarReceta(r);
                        break;
                    case "D":
                        rs.mostrarReceta(r);
                        break;
                    case "E":
                        rs.buscarIngredientes(r);
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
