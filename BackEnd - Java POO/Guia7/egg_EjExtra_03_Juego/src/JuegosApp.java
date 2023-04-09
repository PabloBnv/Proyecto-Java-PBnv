import ent.Juegos;

/*

Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores
jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo 
jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y
recibe una pista de "más alto" o "más bajo" después de cada intento. El juego termina 
cuando el segundo jugador adivina el número o se queda sin intentos. Registra el número
de intentos necesarios para adivinar el número y el número de veces que cada jugador ha ganado.

*/


public class JuegosApp {
    public static void main(String[] args) throws Exception {
        
        System.out.println("**************************************");
        System.out.println("*              Juego                 *");
        System.out.println("*       Adivinanza de Numeros        *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        
        Juegos j1 =new Juegos();

        j1.iniciar_juego();
        
        System.out.println("*************FIN APP******************");

    }
}
