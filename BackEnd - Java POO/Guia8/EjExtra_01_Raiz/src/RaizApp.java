/* Vamos a realizar una clase llamada Raices, donde representaremos los valores 
de una ecuación de 2º grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c. 
Hay que insertar estos 3 valores para construir el objeto a través de un método constructor.
 Luego, en RaicesServicio las operaciones que se podrán realizar son las siguientes:
Método getDiscriminante(): devuelve el valor del discriminante (double). El discriminante tiene la siguiente fórmula: (b^2)-4*a*c
Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para que esto ocurra, el discriminante debe ser mayor o igual que 0.
Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para que esto ocurra, el discriminante debe ser igual que 0.
Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2 posibles soluciones.
Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz. Es en el caso en que se tenga una única solución posible.
Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por pantalla las posibles soluciones que tiene nuestra ecuación con los métodos obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso de no existir solución, se mostrará un mensaje.
Nota: Fórmula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varía el signo delante de -b */

import ent.Raices;
import srv.RaicesServicio;

public class RaizApp {
    public static void main(String[] args) {
        
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*                RaicesAPP           *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        System.out.println("    Bienvenido al portal RaicesAPP");

        
       
        System.out.println("*****************MENU******************");
                System.out.println("1- Crear Raiz");
                System.out.println("2- Discriminante");
                System.out.println("3- ¿Tiene Raices?");
                System.out.println("4- Consultar Saldo");
                System.out.println("5- Consultar Cuenta");
                System.out.println("6- Salir");
                System.out.println("**************************************");
                System.out.print("Ingrese una opción: ");
                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        
                        break;

                    case 2:
                        
                        break;

                    case 3:
                        
                        break;

                    case 4:
                        
                        break;

                    case 5:
                        
                        break;

                    case 6:

                        break;

                }
            }while(opcion!=6);

}
