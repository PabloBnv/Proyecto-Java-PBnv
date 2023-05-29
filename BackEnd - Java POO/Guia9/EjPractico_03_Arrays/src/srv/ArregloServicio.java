package srv;

import java.util.Arrays;

/* Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
-Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
-Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
-Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
-Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
 Luego llenar las últimas 10 posiciones del arreglo B con 0.5. */
public class ArregloServicio {

    // -Método inicializarA recibe un arreglo por parámetro y lo inicializa con
    // números aleatorios.
    public double inicializarA() {

        double ran = (double) (Math.random() * 10);
        return ran;

    }

    // -Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
    public void mostrar(double a[]) {

        for (int i = 0; i < a.length; i++) {
            System.out.println(i + ": " + a[i]);
        }

    }

    // -Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
    public void ordenar(double a[]) {

        Arrays.sort(a);

    }

    //-Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B.
    public void inicializarB(double[] a, double[] b){
        System.arraycopy(a, 0, b, 0, b.length / 2);
        Arrays.fill(b, b.length / 2, b.length, 0.5);
    }

}
