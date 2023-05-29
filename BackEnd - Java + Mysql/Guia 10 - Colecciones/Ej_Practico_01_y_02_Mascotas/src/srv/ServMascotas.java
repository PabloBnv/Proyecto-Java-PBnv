package srv;

import java.util.*;

public class ServMascotas {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void crearMascotas(ArrayList<String> r) {
        
        boolean op = true;
        while (op) {

            System.out.print("Ingrese la raza del perro: >");
            r.add(leer.nextLine());
            System.out.print("¿Desea Agregar otro? (S/N): >");
            op = leer.nextLine().equalsIgnoreCase("s");
        }
        impR(r);
    }

    public void impR(ArrayList<String> r) {

        System.out.println("Lista de Razas: >");
        int cont = 1;
        for (String raza : r) {

            System.out.println(cont + " " + raza);
            cont++;

        }

    }

    public void elimiR(ArrayList<String> r) {
        
        System.out.println("¿Cual de las siguientes razas de perro quiere eliminar?");
        impR(r);
        System.out.print("Ingrese una raza para eliminar: >");
        String elimiRaza = leer.nextLine();
        Iterator<String> it = r.iterator();
        boolean elimina = true;

        while (it.hasNext()) {
            String index = it.next();
            if (index.equalsIgnoreCase(elimiRaza)) {
                it.remove();
                elimina = true;
            }

        }

        if (elimina) {
            System.out.println("La raza se ha eliminado de la lista con éxito.");
        } else {
            System.out.println("La raza no se encuentra en la lista.");
        }

        r.sort(null);
        impR(r);

    }

}
