package ent;

import java.util.Scanner;

//Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores
public class Juegos {

    private int num1;
    private int num2;
    private int intentos;
    private int cantIntentos;
    private int contj1;
    private int contj2;
    private Scanner leer = new Scanner(System.in);

    // Constructor
    public Juegos() {
        intentos= 0;
        cantIntentos=0;
    }

   

    


    public Juegos(int num1, int num2, int intentos, int cantIntentos, int contj1, int contj2) {
        this.num1 = num1;
        this.num2 = num2;
        this.intentos = intentos;
        this.cantIntentos = cantIntentos;
        this.contj1 = contj1;
        this.contj2 = contj2;
    }






    // GET y SET
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    

    // Metodo iniciar_juego

    public int getContj1() {
        return contj1;
    }



    public void setContj1(int contj1) {
        this.contj1 = contj1;
    }



    public int getContj2() {
        return contj2;
    }



    public void setContj2(int contj2) {
        this.contj2 = contj2;
    }



    public void iniciar_juego() {

        boolean res = true;
        do{    
            System.out.print("Ingrese la cantidad de intentos:>");
            intentos = leer.nextInt();

            System.out.print("Jugador 1: Ingrese un número > ");
            num1 = leer.nextInt();
            System.out.println("Numero guardado en secreto.");
            System.out.println("...");
            int contador = 1;

            do {
                System.out.print("Jugador 2: Intente adivinar el número secreto >");
                num2 = leer.nextInt();

                if (num1 < num2) {
                    System.out.println("Más bajo");

                } else if (num1 > num2) {

                    System.out.println("Más alto");

                }
                contador++;
            } while (contador < intentos+1 && num2 != num1);

            if (num1!=num2){
                System.out.println("¡Has perdido, el Jugador 1 ha ganado!");
                System.out.println("Lo siento intentalo de nuevo...");
                this.contj1++;
            }else{
                System.out.println("Felicidades has acertado el número secreto es: " + num1);
                System.out.println("El jugador 2 ha ganado!");
                this.contj2++;
            }

           
            cantIntentos++;
            System.out.println("¿Desea continuar? (SI/NO)");
            String continua=leer.next();
            leer.nextLine();
            continua = continua.toUpperCase();
            if (continua.equalsIgnoreCase("NO")) {

                res =false;

            } else if (continua.equalsIgnoreCase("SI")) {
                res=true;
            }

           
        
        }while (res);


        
        System.out.println("Numero de intentos: >"+cantIntentos);
        System.out.println("Número de veces que ganó Jugador 1: "+contj1);
        System.out.println("Número de veces que ganó Jugador 2: "+contj2);

    }

}
