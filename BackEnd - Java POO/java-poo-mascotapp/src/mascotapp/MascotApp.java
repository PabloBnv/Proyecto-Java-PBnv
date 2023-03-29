
package mascotapp;

import java.util.Scanner;

import mascotapp.entidades.Mascota;
import mascotapp.entidades.Usuario;
import mascotapp.servicios.ServicioMascota;

/* @ PBnv */
public class MascotApp {
    public static void main(String[] args) throws Exception {

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*              Mascota App           *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        try (Scanner leer = new Scanner(System.in)) {

            ServicioMascota sm = new ServicioMascota();

            Mascota m1 = sm.crearMascota();
           
            System.out.println(m1);
            
        }

    }
}
