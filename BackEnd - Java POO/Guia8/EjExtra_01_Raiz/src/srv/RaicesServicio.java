package srv;

import java.util.Scanner;

import ent.Raices;

/* Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -
 */

public class RaicesServicio {

    private Scanner leer = new Scanner(System.in);
    Raices r = new Raices();

    public void crearRaiz() {

        System.out.println("Ingrese 3 valores: ");
        System.out.print("1- >");
        r.setA(leer.nextInt());
        System.out.print("2- >");
        r.setB(leer.nextInt());
        System.out.print("3- >");
        r.setC(leer.nextInt());

    }

    // Método getDiscriminante(): devuelve el valor del discriminante (double).
    // El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
    public double getDiscriminante() {
        double discriminante = Math.pow(r.getB(), 2) - 4 * r.getA() * r.getC();

        return discriminante;
    }

    // Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones,
    // para que esto ocurra, el discriminante debe ser mayor o igual que 0.

    public boolean tieneRaices() {

        return getDiscriminante() >= 0;

    }

    // Método tieneRaiz(): devuelve un booleano indicando si tiene una única
    // solución,
    // para que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz() {

        return getDiscriminante() == 0;

    }

    // Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime
    // las 2
    // posibles soluciones.
    // Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el
    // signo delante de -
    public void obtenerRaices() {

        if (tieneRaices() == true) {

            // (-b±√((b^2)-(4*a*c)))/(2*a)
            double auxPOS = (-r.getB() + Math.sqrt(Math.pow(r.getB(), 2)) - (4 * r.getA() * r.getC()) / (2 * r.getA()));
            double auxNEG = (-r.getB() - Math.sqrt(Math.pow(r.getB(), 2)) - (4 * r.getA() * r.getC()) / (2 * r.getA()));

            System.out.println("Los resultados son: ");
            System.out.println("1 > Positivo:" + auxPOS);
            System.out.println("2 > Negativo: " + auxNEG);
        }

    }

    // Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una
    // única raíz.
    // Es en el caso en que se tenga una única solución posible.
    public void obtenerRaices() {

        if (tieneRaiz() == true) {

            // (-b±√((b^2)-(4*a*c)))/(2*a)
            double auxPOS = (-r.getB() + Math.sqrt(Math.pow(r.getB(), 2)) - (4 * r.getA() * r.getC()) / (2 * r.getA()));
            double auxNEG = (-r.getB() - Math.sqrt(Math.pow(r.getB(), 2)) - (4 * r.getA() * r.getC()) / (2 * r.getA()));

            System.out.println("Los resultados son: ");
            System.out.println("1 > Positivo:" + auxPOS);
            System.out.println("2 > Negativo: " + auxNEG);
        }

    }

    // Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(),
    // y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación
    // con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan
    // nuestros
    // métodos y en caso de no existir solución, se mostrará un mensaje.

    public void calcular(){

        if ((Math.pow(r.getB(), 2)-(4*r.getA()*r.getC()))<0){
            System.out.println("Esta raíz no tiene");
        }   else{
            tieneRaices();
            tieneRaiz()
        }


    }
}
