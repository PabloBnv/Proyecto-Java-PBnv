package ent;
/**
 * Crea una clase "Cocina" que tenga una lista de objetos "Entidad.Receta". Luego,
 * crea métodos para agregar nuevas recetas a la lista, para buscar una
 * receta por nombre y para obtener la lista de recetas que se pueden
 * preparar con los ingredientes disponibles en la cocina.
 */
public class Receta {
    private String nombre;
    private String ingredienteUno;
    private String ingredienteDos;
    private String ingredienteTres;
    
    public Receta() {

    }

    public Receta(String nombre, String ingredienteUno, String ingredienteDos, String ingredienteTres) {
        this.nombre = nombre;
        this.ingredienteUno = ingredienteUno;
        this.ingredienteDos = ingredienteDos;
        this.ingredienteTres = ingredienteTres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIngredienteUno() {
        return ingredienteUno;
    }

    public void setIngredienteUno(String ingredienteUno) {
        this.ingredienteUno = ingredienteUno;
    }

    public String getIngredienteDos() {
        return ingredienteDos;
    }

    public void setIngredienteDos(String ingredienteDos) {
        this.ingredienteDos = ingredienteDos;
    }

    public String getIngredienteTres() {
        return ingredienteTres;
    }

    public void setIngredienteTres(String ingredienteTres) {
        this.ingredienteTres = ingredienteTres;
    }

    @Override
    public String toString() {
        return " Receta " + nombre 
        + "\n Ingrediente n°1: " + ingredienteUno 
        + "\n Ingrediente n°2: " + ingredienteDos 
        + "\n Ingrediente n°3: " + ingredienteTres+"\n";

    }

    


}
