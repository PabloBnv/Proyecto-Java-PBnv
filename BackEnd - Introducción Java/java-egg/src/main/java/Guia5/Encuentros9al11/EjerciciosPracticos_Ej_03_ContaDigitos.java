/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
 * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guia5.Encuentros9al11;

/*
 *
 * @author PabloBnv
 */
public class EjerciciosPracticos_Ej_03_ContaDigitos {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("**************************************");
        System.out.println("*                                    *");
        System.out.println("*   Vector Contador de N Enteros     *");
        System.out.println("*                                    *");
        System.out.println("**************************************");

        //Declara e inicia un contador
        int cont1=0,cont2=0,cont3=0,cont4=0,cont5=0;
              
        //Declara y dimensiona un vector
        int [] vector = new int[100];
        //Bucle para llenar el vector de números random 
        for (int i=0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*10000);
            //Muestra en pantalla el vector 
            System.out.println(" "+vector[i]);
           //Condicional para contabilizar la cantidad de dígitos
            if (vector[i]<10){
                cont1++;
            }
            if (vector[i]<100 && vector[i]>=10){
                cont2++;
            }
            if (vector[i]<1000 && vector[i]>=100){
                cont3++;
            }
            if (vector[i]<10000 && vector[i]>=1000){
                cont4++;
            }
            if (vector[i]>=10000){
                cont5++;
            }

        }
        //Muestra en pantalla los contadores
        System.out.println(" ");
        System.out.println("numeros de 1 digito: " +cont1);
        System.out.println("numeros de 2 digitos: " +cont2);
        System.out.println("numeros de 3 digitos: " +cont3);
        System.out.println("numeros de 4 digitos: " +cont4);
        System.out.println("numeros de 5 digitos: " +cont5);
                   
       }
          
}
    

