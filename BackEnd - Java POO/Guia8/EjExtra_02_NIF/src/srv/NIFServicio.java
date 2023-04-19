package srv;

import java.util.Scanner;

import ent.NIF;

public class NIFServicio {

    private Scanner leer = new Scanner(System.in);

    // Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra
    // que le corresponderá.
    // Una vez calculado, le asigna la letra que le corresponde según
    // La letra correspondiente al dígito verificador se calculará a traves de un
    // método
    // que funciona de la siguiente manera: Para calcular la letra se toma el resto
    // de dividir
    // el número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El
    // método debe
    // buscar en un array (vector) de caracteres la posición que corresponda al
    // resto de la
    // división para obtener la letra correspondiente. La tabla de caracteres es la
    // siguiente:

    public NIF crearNIF() {

        System.out.print("Ingrese el DNI: >");
        int dni = leer.nextInt();

        int resultado = (dni % 23);

        char[] Vec = new char[23];

        String frase = "TRWAGMYFPDXBNJZSQVHLCKE";

        for (int i = 0; i < Vec.length; i++) {
            Vec[i]= frase.charAt(i);
        }

        char letra = Vec[resultado];

        return new NIF(dni, letra);

    }

    //Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra en
    //mayúscula; por ejemplo: 00395469-F).
    public void mostrar(NIF r){

        System.out.println("El código NIF es: "+r.getDni()+"-"+r.getLetra());


    }


}
