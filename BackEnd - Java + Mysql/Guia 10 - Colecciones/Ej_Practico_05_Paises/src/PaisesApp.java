/* Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario. */

import java.util.*;

import srv.srvPaises;

public class PaisesApp {
    public static void main(String[] args) throws Exception {
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*                PersonAPP           *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        System.out.println("    Bienvenido al portal PersonAPP");

        srvPaises sp = new srvPaises();
        HashSet<String> p = new HashSet<>();

        sp.crearPaises(p);
        sp.impPaises(p);

        sp.elimPaises(p);
        sp.impPaises(p);







    }
}
