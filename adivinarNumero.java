import java.util.Scanner;

public class adivinarNumero {
    
    public void adivinarNum(Scanner teclado){
        int numero = (int) (Math.random()*100)+1;
        System.out.println("¿En qué numero entre 1 y 100 estoy pensando?");
        int entrada = teclado.nextInt();

        while(entrada != numero){
            if(entrada < numero){
                System.out.println("Menor");
                System.out.println("¿En qué numero entre 1 y 100 estoy pensando?");
                entrada = teclado.nextInt();
            }
            else{
                System.out.println("Mayor");
                System.out.println("¿En qué numero entre 1 y 100 estoy pensando?");
                entrada = teclado.nextInt();
            }
        }
        System.out.println("¡Bravo, has acertado!");

    }
}
