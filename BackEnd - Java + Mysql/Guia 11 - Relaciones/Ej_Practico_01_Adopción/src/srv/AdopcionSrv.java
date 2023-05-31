package srv;

import java.util.*;

import ent.Perro;
import ent.Persona;

public class AdopcionSrv {
    private Scanner leer = new Scanner(System.in);

    public void crearPersona(ArrayList<Persona> p) {
        // Datos persona

        System.out.print("Ingrese el nombre de la persona: >");
        String nombre = leer.next();
        System.out.print("Ingrese el apellido de la persona: >");
        String apellido = leer.next();
        System.out.print("Ingrese la edad de la persona: >");
        int edad = leer.nextInt();
        System.out.print("Ingrese el documento de la persona: >");
        String doc = leer.next();
        p.add(new Persona(nombre, apellido, edad, doc, null));
    }

    public void crearPerro(ArrayList<Perro> p) {
        // Datos perro

        System.out.print("Ingrese el nombre del perro: >");
        String nombre = leer.nextLine();
        System.out.print("Ingrese la raza del perro: >");
        String raza = leer.nextLine();
        System.out.print("Ingrese la edad del perro: >");
        int edad = leer.nextInt();
        System.out.print("Ingrese el tamaño del perro: >");
        String tam = leer.next();
        p.add(new Perro(nombre, raza, edad, tam));
    }

    public void mostarLista(ArrayList<Perro> perros, ArrayList<Persona> personas) {
        System.out.println("\nLista de Personas: \n");
        for (Persona aux : personas) {
            System.out.println(aux);
        }
        System.out.println("\nLista de Perros en adopción: \n");
        for (Perro aux1 : perros) {
            System.out.println(aux1);
        }

    }

    public void adoptarMascota(ArrayList<Perro> perros, ArrayList<Persona> personas){

        for (Persona aux : personas) {
            System.out.println("Para la persona " + aux.getNombre() + " " + aux.getApellido() +
                    " \nseleccione el nombre de uno de los siguientes perros en adopción: ");
            for (Perro aux2 : perros) {
                System.out.println("Nombre: " + aux2.getNombre() + " - Raza: " + aux2.getRaza());
            }
            System.out.print("> ");
            String adoptable = leer.next();
            int ctrol = 0;
            for (int i = 0; i < perros.size(); i++) {
                if (adoptable.equalsIgnoreCase(perros.get(i).getNombre())) {
                    aux.setPerro(perros.get(i));
                    ctrol++;
                    perros.remove(i);
                }
            }
            if (ctrol == 0) {
                System.out.println("No se ha adoptado un perro válido");
            }
        }
        System.out.println("");
        System.out.println("Las siguientes personas han adoptado: ");
        for (Persona aux : personas) {
            if (aux.getPerro() == null) {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " no ha adoptado a ningun perro");
            } else {
                System.out.println(aux.getNombre() + " " + aux.getApellido() + " ha adoptado a " + aux.getPerro().getNombre() + " de raza " + aux.getPerro().getRaza());
            }

        }
    }

}
