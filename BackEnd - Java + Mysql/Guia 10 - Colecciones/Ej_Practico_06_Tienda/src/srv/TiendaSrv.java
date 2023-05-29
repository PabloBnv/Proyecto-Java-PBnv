package srv;

import java.util.*;

import ent.Productos;

public class TiendaSrv {

    private Scanner leer = new Scanner(System.in);

    public void agregarProducto(HashMap<String, Double> productos) {
        Productos p = new Productos();

        boolean op = true;
        do {

            System.out.print("\n Ingrese el nombre del nuevo producto: >");
            p.setNombre(leer.next());
            System.out.print(" Ingrese el precio del producto: >");
            p.setPrecio(leer.nextDouble());

            productos.put(p.getNombre(), p.getPrecio());

            System.out.print(" ¿Desea agregar otro Producto? (S/N) >");
            String res = leer.next();
            if (res.equalsIgnoreCase("N")) {
                op = false;
            }
        } while (op);

    }

    public void modificarProducto(HashMap<String, Double> productos) {
        System.out.print("\n Ingrese el nombre del producto que desea modificar: >");
        String nombre = leer.next();
        System.out.print(" Ingrese el nuevo precio del producto: >");

        Double precio = leer.nextDouble();

        if (productos.containsKey(nombre)) {
            productos.put(nombre, precio);
            System.out.println("El producto ha sido modificado con éxito");
        } else {
            System.out.println("El producto no existe, intentelo de nuevo.");
        }
    }

    public void eliminarProducto(HashMap<String, Double> productos) {
        System.out.print("\n Ingrese el producto que desea eliminar: >");
        String nombre = leer.next();

        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
            System.out.println("El producto ha sido eliminado con éxito");
        } else {
            System.out.println("El producto no existe, intentelo de nuevo.");
        }
    }

    public void mostrarProductos(HashMap<String, Double> productos) {

        int i = 1;
        System.out.println("\n Lista de productos: \n");
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            System.out.println(i + " Nombre: " + entry.getKey() + " Precio: " + entry.getValue());
            i++;
        }
        System.out.println("");

    }

    public void promedioProductos(HashMap<String, Double> productos) {
        double suma = 0;
        for (Map.Entry<String, Double> entry : productos.entrySet()) {
            suma += entry.getValue();
        }
        System.out.println("El promedio de los productos es: " + suma / productos.size());
    }
}
