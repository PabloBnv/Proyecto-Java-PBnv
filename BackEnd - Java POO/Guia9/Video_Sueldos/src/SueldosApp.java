import ent.Vendedor;
import srv.VendedorServicio;

public class SueldosApp {
    public static void main(String[] args) {
        
        VendedorServicio vs = new VendedorServicio();
        Vendedor v1 = vs.altaVendedor();
        vs.saldoMensual(v1);
        vs.vacaciones(v1);

        
    }
}
