package srv;
import java.util.*;

import ent.Cantante;
public class CantanteSrv {
    private Scanner leer = new Scanner (System.in);

    public void agregarCantante(ArrayList<Cantante> lista){

            String res;
            do {
               Cantante c = new Cantante();
                System.out.print("\n Ingrese el nombre del cantante: > ");
                c.setNombre(leer.nextLine());
                System.out.print(" Ingrese el disco con mas ventas: > ");
                c.setDisco(leer.nextLine());
                lista.add(c);
                System.out.print(" Desea agregar otro cantante? s/n: > ");
                res = leer.nextLine();
            } while (res.equalsIgnoreCase("s"));

    
    }
    public void mostrarCantantes(ArrayList<Cantante> lista) {
        System.out.println("\nLista de Artistas:");
        int i=1;
        for (Cantante c : lista) {
            System.out.println(i+" "+c);
            i++;
        }
    }
    public void eliminarCantante(ArrayList<Cantante> lista) {
        System.out.print(" Ingrese el nombre del cantante a eliminar: >");
        String nombre = leer.nextLine();
       
        for (Cantante cantante : lista) {
            if (cantante.getNombre().equalsIgnoreCase(nombre)) {
                lista.remove(cantante);
                break;
            }
        }


    }

}
