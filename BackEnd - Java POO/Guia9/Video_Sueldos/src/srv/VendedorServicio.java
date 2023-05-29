package srv;

import java.util.*;


import ent.Vendedor;

public class VendedorServicio {
    private Scanner leer = new Scanner(System.in);
    private GregorianCalendar calendario = new GregorianCalendar();
    public Vendedor altaVendedor() {

        Vendedor v1 = new Vendedor();

        System.out.print("Ingrese el Nombre del vendedor: >");
        v1.setNombre(leer.next());
        System.out.print("Ingrese el DNI del vendedor: >");
        v1.setDni(leer.nextInt());
        System.out.print("Ingrese el Sueldo Básico del vendedor: >");
        v1.setSueldoBasico(leer.nextDouble());
        System.out.println("Ingrese la Fecha de inicio del vendedor ");
        System.out.print("Dia: >");
        int dia = leer.nextInt();
        System.out.print("Mes: >");
        int mes = leer.nextInt();
        System.out.print("Año: >");
        int año = leer.nextInt();
        //        Date fecha = new Date(año-1900, mes-11, dia-31);
        
        GregorianCalendar calendario = new GregorianCalendar(dia, mes, año);
        v1.setFechaInicio(calendario.getTime());

        return v1;

    }

    public void saldoMensual(Vendedor v1){

        System.out.print("Ingrese las ventas totales del vendedor: >");
        double ventas= leer.nextDouble();
        v1.setComisiones(ventas*0.15);
        v1.setSueldoMensual(v1.getSueldoBasico()+v1.getComisiones());
        System.out.println("El sueldo del Mensual del Vendedor"+v1.getNombre()+"es de: "+v1.getSueldoMensual());




    }

    public void vacaciones(Vendedor v1){
        
        
        //Date hoy = new Date(2023, 5, 19);
        GregorianCalendar hoy =new GregorianCalendar();
        int antiguedad =hoy.compareTo(calendario);
        
        if (antiguedad<5){
            System.out.println("Le corresponden 14 días de vacaciones.");
        }else if (antiguedad<10){
            System.out.println("Le corresponden 21 días de vacaciones.");
        } else if (antiguedad<20){
            System.out.println("Le corresponden 28 días de vacaciones.");
        } else if (antiguedad>20){
            System.out.println("Le corresponden 35 días de vacaciones.");
        } else {
            System.out.println("El empleado tiene vacaciones proporcionales.");
        }



    }

}
