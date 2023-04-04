import ent.Rectangulo;

/* 
* Crear una clase Rectángulo que modele rectángulos por medio de un atributo
* privado base y un atributo privado altura. La clase incluirá un método para
* crear el rectángulo con los datos del Rectángulo dados por el usuario. 
* También incluirá un método para calcular la superficie del rectángulo y un 
* método para calcular el perímetro del rectángulo. Por último, tendremos un 
* método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
* Se deberán además definir los métodos getters, setters y constructores correspondientes.
*
* Superficie = base * altura / Perímetro = (base + altura) * 2.
*/

public class RectanguloApp {
    public static void main(String[] args) {

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*            RectanguloApp           *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        Rectangulo r1 =new Rectangulo();

        
        r1.crearRectangulo();

        System.out.println("La superficie del rectángulo es: > "+r1.superficie());
        System.out.println("El perímetro del rectángulo es: > "+r1.perimetro());

        System.out.println("Dibujo :>");
        r1.dibujarRectangulo();

        System.out.println("***************FIN APP****************");

    }
}
