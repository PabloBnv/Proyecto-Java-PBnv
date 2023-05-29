package srv;
/*Crear una clase CadenaServicio en el paquete servicios
que implemente los siguientes métodos:

-Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.

-Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
 Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".

-Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y contabilizar 
 cuántas veces se repite el carácter en la frase, por ejemplo:Entrada: frase = "casa blanca".
 Salida: El carácter 'a' se repite 4 veces.

-Método compararLongitud(String frase), deberá comparar la longitud de la frase que compone la clase
 con otra nueva frase ingresada por el usuario.

-Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con una nueva 
 frase ingresada por el usuario y mostrar la frase resultante.

-Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase,
 por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.

-Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa
 el usuario y devuelve verdadero si la contiene y falso si no. 
 */

import java.util.Scanner;

import ent.Cadena;

public class CadenaServicio {

        private Scanner leer = new Scanner(System.in);

    // voy a pedir una frase desde acá y no desde el main.
    public Cadena pedirFrase() {
        
        
            System.out.print("Ingrese una frase: >");
            String frase = leer.nextLine();

            int longitud = frase.length();

            return new Cadena(frase, longitud);
        

    }

    // -Método mostrarVocales(), deberá contabilizar la cantidad de vocales que
    // tiene la frase ingresada.

    public void mostrarVocales(Cadena c) {

        int cont = 0;
        for (int i = 0; i < c.getLongitud(); i++) {
            switch (c.getFrase().substring(i, i + 1).toLowerCase()) {
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    cont++;
                    break;

            }
        }
        System.out.println("La cantidad de vocales son: " + cont);

    }

    // -Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por
    // pantalla.
    // Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena c) {

        String cadenaInvertida = "";
        for (int i = c.getLongitud(); i > 0; i--) {

            cadenaInvertida += c.getFrase().charAt(i - 1);

        }

        System.out.println("La frase invertida es: >" + cadenaInvertida);

    }

    // -Método vecesRepetido(String letra), recibirá un carácter ingresado por el
    // usuario y contabilizar
    // cuántas veces se repite el carácter en la frase, por ejemplo:Entrada: frase =
    // "casa blanca".
    // Salida: El carácter 'a' se repite 4 veces.
    public void vecesRepetido(Cadena c) {
        
        System.out.print("Ingrse una letra:>");
        char letra = leer.nextLine().charAt(0);
        int cont = 0;

        for (int i = 0; i < c.getLongitud(); i++) {
            if (letra == c.getFrase().charAt(i)) {
                cont++;
            }
        }
        System.out.println("La cantidad de veces repetidas de la letra es: " + cont);

    }

    // -Método compararLongitud(String frase), deberá comparar la longitud de la
    // frase que
    // compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena c, Cadena nuevaC) {

        
        System.out.println("La pimer frase tiene: >" + c.getLongitud() + " caracteres de largo.");
        System.out.println("La segunda frase tiene: >" + nuevaC.getLongitud() + " caracteres de largo.");

        if (c.getLongitud() > nuevaC.getLongitud()) {
            System.out.println(
                    "La primer frase es más larga por " + (c.getLongitud() - nuevaC.getLongitud()) + " caracteres.");
        }

    }
}
