import java.util.ArrayList;

import ent.Alumno;
import srv.srvAlumno;

/**
 * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
 * alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
 * con sus 3 notas.
 * En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
 * toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
 * pregunta al usuario si quiere crear otro Alumno o no.
 * Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
 * Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
 * final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
 * del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
 * promedio final, devuelto por el método y mostrado en el main.
 */


public class AlumnosApp {
    public static void main(String[] args) throws Exception {
        

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*                AlumnosApp          *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        System.out.println("    Bienvenido al portal AlumnosAPP");

        srvAlumno sa = new srvAlumno();
        ArrayList<Alumno> alumno = new ArrayList<>();
        System.out.println("------------- CREACION DE ALUMNOS ---------");
        sa.crearAlumno(alumno);
        sa.mostraA(alumno);
        System.out.println("---------- FIN CREACION DE ALUMNOS --------");
        System.out.println("-------------     PROMEDIO        ---------");
        sa.notaFinal(alumno);
        System.out.println("-------------   FIN PROMEDIO      ---------");
        System.out.println("-------------  MODIFICAR NOMBRE   ---------");
        sa.modificarA(alumno);
        System.out.println("------------ FIN MODIFICAR NOMBRE ---------");
        System.out.println("--------------  MODIFICAR NOTA   ----------");
        sa.modificarN(alumno);
        System.out.println("------------  FIN MODIFICAR NOTA  ---------");
        System.out.println("-------------  ELIMINAR ALUMNO    ---------");
        sa.elimiA(alumno);
        System.out.println("------------- FIN ELIMINAR ALUMNO ---------");

        System.out.println(" Lista de alumnos: ->");
        sa.mostraA(alumno);
        //Deberia meterlo todo a un switch pero no me da el tiempo.    

    


    }
}
