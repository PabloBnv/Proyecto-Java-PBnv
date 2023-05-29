package srv;

import java.util.*;

import ent.Libros;

public class LibreriaSrv {
    private Scanner leer = new Scanner(System.in);

    public void crearLibro(HashSet<Libros> lista) {
        boolean op = true;
        while (op) {
            Libros libro = new Libros();
            System.out.print("\n Ingrese el titulo: >");
            libro.setTitulo(leer.nextLine());
            System.out.print(" Ingrese el autor: >");
            libro.setAutor(leer.nextLine());
            System.out.print(" Ingrese el numero de ejemplares: >");
            libro.setEjemplares(leer.nextInt());
            System.out.print(" Ingrese el numero de ejemplares prestados: >");
            libro.setPrestados(leer.nextInt());
            leer.nextLine();
            lista.add(libro);
            System.out.print(" ¿Desea crear otro libro? (s/n): >");
            String res = leer.next();
            op = res.equalsIgnoreCase("s");
            leer.nextLine();
        }

    }

    /**
     * Método prestamo(): El usuario ingresa el titulo del libro que quiere
     * prestar y se lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto
     * Entidad Libro al método. El método se incrementa de a uno, como un carrito de compras, el
     * atributo ejemplares prestados, del libro que ingresó el usuario. Esto sucederá
     * cada vez que se realice un préstamo del libro. No se podrán prestar libros de los
     * que no queden ejemplares disponibles para prestar. Devuelve true si se ha
     * podido realizar la operación y false en caso contrario.
     */
    public void prestamo(HashSet<Libros> lista) {
        System.out.print("\n Ingrese el titulo del libro que quiere pedir prestado: >");
        String titulo = leer.nextLine();
        boolean prestado = false;
        Iterator<Libros> it = lista.iterator();
        while (it.hasNext()) {
            Libros libro = it.next();
            if (libro.getTitulo().equals(titulo) && libro.getEjemplares() > 0
                    && libro.getPrestados() < libro.getEjemplares()) {
                libro.setPrestados(libro.getPrestados() + 1);
                prestado = true;
            }
        }
        if (prestado) {
            System.out.println("Entidad.Libro prestado");
        } else {
            System.out.println("Entidad.Libro no prestado");
            for (Libros libro : lista) {
                if (libro.getTitulo().equals(titulo)) {
                    System.out.println("Cantidad de ejemplares existentes: " + libro.getEjemplares());
                    System.out.println("Cantidad de ejemplares prestados: " + libro.getPrestados());
                    System.out.println("Cantidad actual disponible para prestar: " + (libro.getEjemplares() -
                            libro.getPrestados()));
                }
            }
        }
    }

    /* Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se
     * lo busca en el conjunto. Si está en el conjunto, se llama con ese objeto al método.
     * El método decrementa de a uno, como un carrito de compras, el atributo
     * ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada
     * vez que se produzca la devolución de un libro. No se podrán devolver libros
     * donde que no tengan ejemplares prestados. Devuelve true si se ha podido
     * realizar la operación y false en caso contrario.
     * • Método toString para mostrar los datos de los libros.
     */
    public void devolucion(HashSet<Libros> lista) {
        System.out.print("\n Ingrese el titulo del libro que va a devolver: >");
        String titulo = leer.nextLine();
        boolean devuelto = false;
        Iterator<Libros> it = lista.iterator();
        while (it.hasNext()) {
            Libros libro = it.next();
            if (libro.getTitulo().equals(titulo) && libro.getPrestados() > 0) {
                libro.setPrestados(libro.getPrestados() - 1);
                devuelto = true;
            }
        }
        if (devuelto) {
            System.out.println("Se pudo devolver el libro");
        } else {
            System.out.println("No se pudo devolver el libro");
        }
    }

    public void mostrarlibros(HashSet<Libros> lista) {
        for (Libros libro : lista) {
            System.out.println("Titulo: " + libro.getTitulo() + " / Autor: " + libro.getAutor());
            int disponibles = libro.getEjemplares() - libro.getPrestados();
            System.out.println("Disponibles para prestar :" + disponibles);
        }
    }

}
