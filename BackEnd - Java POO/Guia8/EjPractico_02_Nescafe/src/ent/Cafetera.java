/* Desarrolle una clase Cafetera en el paquete Entidades con los atributos
 * capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y cantidadActual
 * (la cantidad actual de café que hay en la cafetera). Agregar constructor vacío y con parámetros
 * así como setters y getters. 
 */

package ent;

public class Cafetera {
    
    private int capacidadMáxima;
    private int cantidadActual;
    
    //Cosntructores
    public Cafetera() {
        
    }

    public Cafetera(int capacidadMáxima, int cantidadActual) {
        this.capacidadMáxima = capacidadMáxima;
        this.cantidadActual = cantidadActual;
    }

    //GETTERS Y SETTERS
    public int getCapacidadMáxima() {
        return capacidadMáxima;
    }

    public void setCapacidadMáxima(int capacidadMáxima) {
        this.capacidadMáxima = capacidadMáxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;

    }


    
    
}
