package entidades;

public class Circulo {
    
    private double radio;
    private double diametro;
    private double area;
    private double perimetro;
    
    
    
    public Circulo() {
        this.radio = 0;
        this.diametro = 0;
        this.area = 0;
        this.perimetro = 0;
    }



    public double getRadio() {
        return radio;
    }


    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        diametro = 2 * radio;
        diametro = Math.round(diametro*100.0)/100.0;
        return diametro;

    }


    public void setDiametro(double diametro) {

        this.diametro = diametro;

    }



    public double getArea() {
        area = 3.1416 * Math.pow(radio,2);
        area = Math.round(area*100.0)/100.0;
        return area;
    }



    public void setArea(double area) {
        this.area = area;
    }



    public double getPerimetro() {
        perimetro = 2 * 3.1416 * radio;
        perimetro = Math.round(perimetro*100.0)/100.0;
        return perimetro;
    }



    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }


    public void crearCincurferencia(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + ", diametro=" + diametro + ", area=" + area + ", perimetro=" + perimetro
                + "]";
    }

    
    
    
    


}
