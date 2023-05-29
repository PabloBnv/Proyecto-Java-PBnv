package ent;

public class Arreglo {
    
    private double num;

    public Arreglo() {
        
    }

    public Arreglo(double num) {
        this.num = num;
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Arreglo [num=" + num + "]";
    }

    
}
