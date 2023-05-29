/* Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B de 20 números reales. Crear la clase ArregloService, en el paquete servicio, con los siguientes métodos:
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.
 */


import srv.ArregloServicio;

public class ArraysApp {
    public static void main(String[] args) throws Exception {
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*             Arrays APP       *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        System.out.println("Bienvenido al portal ArraysAPP");

        ArregloServicio as = new ArregloServicio();

        //Crear en el Main dos arreglos: 
        //El arreglo A de 50 números reales y el arreglo B de 20 números reales.
        double A[] = new double[50];
        double B[] = new double[20];


       for (int i = 0; i < A.length; i++) {
            A[i] = as.inicializarA();
                        
       }

       for (int i = 0; i < B.length; i++) {
        B[i] = as.inicializarA();
                    
        }

        
       as.mostrar(A);
       System.out.println("ORDENA DE FORMA ASCENDENTE: ");
       as.ordenar(A);
       as.inicializarB(A, B);






    }
}
