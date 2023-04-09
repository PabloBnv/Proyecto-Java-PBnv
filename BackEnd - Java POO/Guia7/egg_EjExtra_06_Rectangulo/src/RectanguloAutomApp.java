import ent.Rectangulo;

/*
 * - Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" 
 * - Método "calcular_area" que calcule y devuelva el área del rectángulo. 
 * - Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 
 * - Imprime el área del rectángulo.

 * 
 */
public class RectanguloAutomApp {
    public static void main(String[] args) {
        


        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*     Rectangulo Automático App      *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        //Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 
        
        
        Rectangulo r1 = new Rectangulo(4,6);

        //Imprime el área del rectángulo.
        System.out.println("El área del rectágnulo es: "+r1.getLado1()+" * "+r1.getLado2()+" = "+r1.calcular_area());

    }
}
