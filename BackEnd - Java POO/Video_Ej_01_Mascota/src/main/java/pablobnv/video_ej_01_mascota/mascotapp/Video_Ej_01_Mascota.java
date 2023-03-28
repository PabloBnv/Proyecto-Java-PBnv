/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pablobnv.video_ej_01_mascota.mascotapp;

import pablobnv.video_ej_01_mascota.entidades.Mascota;
import pablobnv.video_ej_01_mascota.entidades.Usuario;

/*
 *
 * @author ViejoHucha
 */
public class Video_Ej_01_Mascota {

    public static void main(String[] args) {
       
        Mascota m1 = new Mascota();

        m1.apodo="Tomy";
        m1.nombre="Tomatela";
        m1.tipo="Perro";
        m1.edad=5;
        m1.raza="Calle";
        m1.color="Marrón";
        m1.cola=true;
        
        System.out.println(m1.apodo);
        
    }
}
