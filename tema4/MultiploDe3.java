package tema4;

import java.util.Scanner;

public class MultiploDe3 {
    //Ejercicio9
    public void multiplo(Scanner teclado){
        boolean esMultiplo = false;
        int numero;
        while (!esMultiplo){
            System.out.println("\nEscriba un múltiplo de 3\n");
            numero=teclado.nextInt();
            if(numero%3 == 0){
                System.out.println(String.format("\nOk: %d es un múltiplo de 3",numero));
                esMultiplo = true;
            }else {
                System.out.println(String.format("\nError %d no es un múltiplo de 3",numero));
            }
        }
    }
}
