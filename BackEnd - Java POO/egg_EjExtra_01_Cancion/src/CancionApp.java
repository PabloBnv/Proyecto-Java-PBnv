import java.util.Scanner;

import ent.Cancion;

// Desarrollar una clase Cancion con los siguientes atributos: título y autor.
// Se deberá definir además dos constructores: uno vacío que inicializa el título
// y el autor a cadenas vacías y otro que reciba como parámetros el título y el 
// autor de la canción. Se deberán además definir los métodos getters y setters correspondientes.

public class CancionApp {
    public static void main(String[] args) {


        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*             CancionApp             *");
        System.out.println("*                                    *");
        System.out.println("**************************************");


        try (Scanner leer = new Scanner(System.in)) {
            System.out.println("Ingrese los datos de la canción:");
            System.out.print("Titulo: >");
            String tit =leer.nextLine();
            System.out.print("Autor: >");
            String aut =leer.nextLine();


            Cancion c1 = new Cancion(tit, aut);

            System.out.println(""+c1);
            
        }
        System.out.println("**************FIN APP*****************");
       




    }
}
