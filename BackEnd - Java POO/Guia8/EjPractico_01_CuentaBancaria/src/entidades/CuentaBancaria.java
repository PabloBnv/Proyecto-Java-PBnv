package entidades;
//Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos:
//numeroCuenta(entero), dniCliente(entero largo), saldoActual. 
public class CuentaBancaria {
    
    private int numeroCuenta;
    private double saldoActual;
    private long dniCliente;
    
    //Agregar constructor vacío
    public CuentaBancaria() {
    
    
    }
    //Con parámetros
    public CuentaBancaria(int numeroCuenta, int saldoActual, long dniCliente) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.dniCliente = dniCliente;
    }
    
    //getters y setters.
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldoActual() {
        return saldoActual;
    }
    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    public long getDniCliente() {
        return dniCliente;
    }
    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }
    @Override
    public String toString() {
        return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", saldoActual=" + saldoActual + ", dniCliente="
                + dniCliente + "]";
    }
    
    

    

}
