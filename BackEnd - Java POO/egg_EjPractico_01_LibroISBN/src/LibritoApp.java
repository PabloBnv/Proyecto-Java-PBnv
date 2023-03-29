import java.util.Scanner;

public class LibritoApp {
   
    public static void main(String[] args) {

        try (Scanner leer = new Scanner(System.in)) {

            libro p1 = new libro(leer.next(), leer.next(), leer.next(), leer.nextInt());

            System.out.println("Nombre: "+p1.nombre+"");


        }

    }
}
