package srv;

import java.util.*;

import ent.Pelicula;

/* En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.  */
public class srvPeliculas {

    private Scanner leer = new Scanner(System.in);
    ArrayList<Pelicula> ap = new ArrayList<>();

    public void crearPeli() {

        boolean confirm = true;

        while (confirm) {
            Pelicula p = new Pelicula();
            System.out.println("A continuación ingrese los datos de la Película");
            System.out.print("Ingrese el Título: >");
            p.setTitulo(leer.nextLine());
            System.out.print("Ingrese el Director:");
            p.setDirector(leer.nextLine());
            System.out.print("Ingrese la Duración:");
            p.setDuracion(leer.nextFloat());
            leer.nextLine();// para corregir la escucha del scanner
            ap.add(p); // Añado la pelicula al array
            System.out.println("Desea agregar otra pelicula? S/N");
            confirm = leer.nextLine().equalsIgnoreCase("s");

        }
        System.out.println("  ");
    }

    public void impPeli() {
        System.out.println("Lista de Películas: ");
        for (Pelicula p : ap) {
            System.out.println(p);
        }
        System.out.println("  ");
    }

    public void pelis1hr() {
        
        System.out.println("Lista de Películas de más de 1h de duración: ");
        for (Pelicula p : ap) {
            if (p.getDuracion() > 1) {
                System.out.println(p);
            }
        }
        System.out.println("  ");
    }

    public void ordenarDesc (){
        System.out.println("Lista de Películas en forma Descendente ");
        Collections.sort(ap, (p1, p2)-> Float.compare(p2.getDuracion(), p1.getDuracion()));

        for (Pelicula pelicula : ap) {
            System.out.println(pelicula);
        }
        System.out.println("  ");
    }

    public void ordenarAsc (){
        System.out.println("Lista de Películas en forma Ascendente ");
        Collections.sort(ap, (p1,p2)->Float.compare(p1.getDuracion(), p2.getDuracion()));

        for (Pelicula pelicula : ap) {
            System.out.println(pelicula);
        }
        System.out.println("  ");
    }

    public void ordenarTitulo(){
        System.out.println("Lista de Películas por Título en forma Ascendente ");
        Collections.sort(ap, (p1,p2)->p1.getTitulo().compareTo(p2.getTitulo()));

        for (Pelicula pelicula : ap) {
            System.out.println(pelicula);
        }
        System.out.println("  ");
    }

    public void ordenarDirector(){
        System.out.println("Lista de Películas por Director en forma Ascendente ");
        Collections.sort(ap, (p1,p2)->p1.getDirector().compareTo(p2.getDirector())); 

        for (Pelicula pelicula : ap) {
            System.out.println(pelicula);
        }
        System.out.println("  ");
    }

}
