
package mascotapp;

import mascotapp.servicios.ServicioMascota;

/* @ PBnv */
public class MascotApp {
    public static void main(String[] args) throws Exception {

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*              Mascota App           *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        ServicioMascota sm = new ServicioMascota();

        sm.fabricarMascotas(2);;

        sm.mostrarMascotas();
        

    }
}
