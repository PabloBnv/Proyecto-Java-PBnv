package srv;

import java.util.*;

import ent.Receta;

public class RecetasSrv {
    private Scanner leer = new Scanner(System.in);

    public void crearReceta(ArrayList<Receta> recetas) {
        System.out.print("Ingrese el nombre de la receta");
        String nombre = leer.next();
        System.out.println("Ingrese los ingredientes a continuación: ");
        System.out.print("Ingrese el Primero: >");
        String uno = leer.next();
        System.out.print("Ingrese el Segundo: >");
        String dos = leer.next();
        System.out.print("Ingrese el Tercero: >");
        String tres = leer.next();
        Receta receta = new Receta(nombre, uno, dos, tres);
        recetas.add(receta);

    }

    public void buscarReceta(ArrayList<Receta> recetas) {
        System.out.print("Ingrese el nombre de la receta a buscar: >");
        String nombre = leer.next();
        for (Receta receta : recetas) {
            if (receta.getNombre().equals(nombre)) {
                System.out.println(receta);
            }
        }

    }

    public void eliminarReceta (ArrayList<Receta> recetas){

        System.out.println("Ingrese el nombre de la receta a eliminar:");
        String nombre = leer.next();
        boolean encontrado = false;
        for (int i = 0; i < recetas.size(); i++) {
            if (recetas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                recetas.remove(i);
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("La receta ha sido eliminada!");
        } else {
            System.out.println("La receta no existe!");
        }


    }

    public void mostrarReceta(ArrayList<Receta> recetas){

        for (Receta receta : recetas) {
            System.out.println(receta);
        }


    }
    public void buscarIngredientes(ArrayList<Receta> recetas) {
        System.out.println("Ingrese 3 ingredientes: >");
        System.out.print("-1: >");
        String i1 = leer.next();
        System.out.print("-2: >");
        String i2 = leer.next();
        System.out.print("-3: >");
        String i3 = leer.next();
        System.out.println("Verificaremos si hay alguna receta con esos ingredientes...");
        for (Receta receta : recetas) {
            //verificar si la receta tiene todos los ingredientes
            if (receta.getIngredienteUno().equals(i1) && receta.getIngredienteDos().equals(i2) && receta.getIngredienteTres().equals(i3)) {
                System.out.println("Entidad.Receta disponible:");
                System.out.println(receta);
            }
        }
    }

}
