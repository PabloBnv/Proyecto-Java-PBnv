import ent.Persona;
import srv.PersonaServicio;

/*Realizar una clase llamada Persona en el paquete de entidades que tengan los siguientes atributos:
- nombre, edad, sexo (‘H’ para hombre, ‘M’ para mujer, ‘O’ para otro), peso y altura. 
-Si desea añadir algún otro atributo, puede hacerlo. Agregar constructores, getters y setters.

En el paquete Servicios crear PersonaServicio con los siguientes 3 métodos:
Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve un booleano.
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al usuario 
y después se le asignan a sus respectivos atributos para llenar el objeto Persona. Además, comprueba 
que el sexo introducido sea correcto, es decir, H, M o O. 
Si no es correcto se deberá mostrar un mensaje
Método calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2 en mt2)).
Si esta fórmula da por resultado un valor menor que 20, significa que la persona está por debajo
de su peso ideal y la función devuelve un -1. Si la fórmula da por resultado un número entre 20
y 25 (incluidos), significa que la persona está en su peso ideal y la función devuelve un 0. 
Finalmente, si el resultado de la fórmula es un valor mayor que 25 significa que la persona tiene
sobrepeso, y la función devuelve un 1.

A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos los métodos
para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene sobrepeso o está por
debajo de su peso ideal e indicar para cada objeto si la persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en distintas
variables(arrays), para después calcular un porcentaje de esas 4 personas cuantas están por debajo 
de su peso, cuantas en su peso ideal y cuantos, por encima, y también calcularemos un porcentaje de
cuantos son mayores de edad y cuantos menores. Para esto, podemos crear unos métodos adicionales.
 */

public class PersonApp {
    public static void main(String[] args) {

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*                PersonAPP           *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        System.out.println("    Bienvenido al portal PersonAPP");

        PersonaServicio ps = new PersonaServicio();

        Persona[] persona = new Persona[2];
        int[] resIMC = new int[2];
        boolean[] mayorEdad = new boolean[2];

        for (int index = 0; index < persona.length; index++) {

            persona[index] = ps.crearPersona();
            resIMC[index] = ps.calcularIMC(persona[index]);
            mayorEdad[index] = ps.esMayorDeEdad(persona[index]);

        }

        for (int index = 0; index < persona.length; index++) {

            System.out.println(persona[index]);

        }

        int bajoIMC = 0;
        int normalIMC = 0;
        int altoIMC = 0;
        int mayoriaEdad=0;

        for (int i = 0; i < persona.length; i++) {
            if (resIMC[i] == -1) {
                bajoIMC++;

            } else if (resIMC[i] == 0) {
                normalIMC++;
            } else {
                altoIMC++;
            }

            if (mayorEdad[i]) {
                mayoriaEdad++;
            }

        }
        

        System.out.printf("Porcentaje de personas por debajo del peso ideal: %.2f%%\n", (bajoIMC / 4.0) * 100);
        System.out.printf("Porcentaje de personas en su peso ideal: %.2f%%\n", (normalIMC / 4.0) * 100);
        System.out.printf("Porcentaje de personas con sobrepeso: %.2f%%\n", (altoIMC / 4.0) * 100);
        System.out.printf("Porcentaje de personas mayores de edad: %.2f%%\n", (mayoriaEdad / 4.0) * 100);
        System.out.printf("Porcentaje de personas menores de edad: %.2f%%\n", ((4 - mayoriaEdad) / 4.0) * 100);



    }
}
