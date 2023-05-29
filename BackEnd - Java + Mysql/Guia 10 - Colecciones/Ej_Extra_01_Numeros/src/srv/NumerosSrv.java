package srv;

import java.util.*;


public class NumerosSrv {
    private Scanner leer = new Scanner(System.in);
    private ArrayList<Integer> listaNum = new ArrayList<Integer>();


    public void agregarNum() {
        System.out.println("A continuación ingrese una lista de numeros: > (Digite -99 para finalizar)");
        System.out.print("> ");
        int num = leer.nextInt();
        while (num != -99) {
            listaNum.add(num);
            System.out.print("> ");
            num = leer.nextInt();
        }
        System.out.println("Lista Finalizada");
    }
    public void mostrarNum() {
        System.out.println("La lista de numeros es: " + listaNum);
    }
    public void mostrarSuma() {
        int suma = 0;
        for (int i = 0; i < listaNum.size(); i++) {
            suma += listaNum.get(i);
        }
        System.out.println("La suma de los numeros es: " + suma);
    }

    public void mostrarMedia() {
        int suma = 0;
        for (int i = 0; i < listaNum.size(); i++) {
            suma += listaNum.get(i);
        }
        System.out.println("La media de los numeros es: " + suma / listaNum.size());
    }
}
