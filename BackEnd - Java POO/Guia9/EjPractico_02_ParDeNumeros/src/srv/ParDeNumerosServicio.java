package srv;

import ent.ParDeNumeros;

/* Crear una clase ParDeNumerosService, en el paquete Servicios,
    que deberá además implementar los siguientes métodos: */
public class ParDeNumerosServicio {

    
    
    
    // Método mostrarValores que muestra cuáles son los dos números guardados.
    public void mostrarValores(ParDeNumeros pn) {
        System.out.println("Numero 1: " + pn.getN1()+" Numero 2: " + pn.getN2());
        
    }

    //-Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor(ParDeNumeros pn){

        return Math.max(pn.getN1(),pn.getN2());
    }

    //-Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado
    // al menor número. Previamente se deben redondear ambos valores.
    public double calcularPotencia(ParDeNumeros pn) {
        double mayor = devolverMayor(pn);
        double menor = (mayor == pn.getN1()) ? pn.getN2() : pn.getN1();
        return Math.pow(Math.round(mayor), Math.round(menor));
    }

    //-Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
    // Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public double calcularRaiz(ParDeNumeros pn) {
        double menor = Math.min(pn.getN1(), pn.getN2());
        return Math.sqrt(Math.abs(menor));
    }


}
