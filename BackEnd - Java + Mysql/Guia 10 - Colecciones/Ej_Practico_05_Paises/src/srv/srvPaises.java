package srv;

import java.util.*;

public class srvPaises {

    private Scanner leer = new Scanner(System.in);

    public void crearPaises(HashSet<String> p) {

        boolean confirm = true;

        while (confirm) {

            System.out.print("Ingrese un País a la Lista: >");
            p.add(leer.nextLine());
            System.out.print("¿Desea agregar otro país? (S/N): > ");
            confirm = leer.nextLine().equalsIgnoreCase("s");

        }

    }

    public void impPaises(HashSet<String> p) {

        List<String> pl = new ArrayList<>(p);
        System.out.println("Lista de Paises:");
        Collections.sort(pl);
        for (String paises : pl) {
            System.out.println(paises);
        }
    }

    public void elimPaises(HashSet<String> p){
        
        Iterator<String> it = p.iterator();
        System.out.println("Ingrese el País que desea Eliminar:");
        String p2 = leer.nextLine();
        boolean eliminado = false;

        while (it.hasNext()) {
            String pEliminado = it.next();
            if (pEliminado.equalsIgnoreCase(p2)) {
                it.remove();
                eliminado=true;
            }
            
        }
        if (eliminado) {
            System.out.println("El País ha sido eliminado de la lista");
        } else {
            System.out.println("No se ha encontrado el País en la lista");
        }


    }

}
