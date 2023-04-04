package srv;

import java.util.Scanner;
import ent.libro;

public class ServicioLibro {

    private Scanner leer = new Scanner(System.in);

    public libro crearLibro() {

        System.out.print("Ingrese el numero ISBN: >");
        String iSBN = leer.next();
        System.out.print("Ingrese el Titulo: >");
        String titulo = leer.next();
        System.out.print("Ingrese el Autor: >");
        String autor = leer.next();
        System.out.print("Ingrese el número de páginas: >");
        int numeroPag = leer.nextInt();

        return new libro(iSBN,titulo,autor,numeroPag);
    }
}
