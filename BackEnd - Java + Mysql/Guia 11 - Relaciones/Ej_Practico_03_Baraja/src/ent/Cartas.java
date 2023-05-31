package ent;

public class Cartas {
    private String numero;
    private Palo palo;

    public Cartas() {
    }

    public Cartas(String numero, Palo palo) {
        this.numero = numero;
        this.palo = palo;
    }


    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
}
