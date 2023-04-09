import ent.Empleado;

/* 

    
    Crea una clase  "Empleado" que tenga atributos como "nombre", "edad" y "salario". 
    Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un empleado
    en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado 
    tiene más de 30 años o del 5% si tiene menos de 30 años.



*/
public class EmpleadosApp {
  
    public static void main(String[] args) throws Exception {
        

        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*             Empleados              *");
        System.out.println("*                                    *");
        System.out.println("**************************************");


        Empleado e1 = new Empleado();

        e1.calcular_aumento();



        

    }
}
