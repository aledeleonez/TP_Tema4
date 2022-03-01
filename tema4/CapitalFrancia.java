package tema4;
import java.util.Scanner;

public class CapitalFrancia  {

    public void capital(Scanner teclado){
        int numIntentos = 1;
        String respuesta;
        final int MAX_INTENTOS = 5;
        teclado.nextLine();
        System.out.println("¿Cuál es la capital de Francia? ");
        respuesta=teclado.nextLine();
        while (!respuesta.equals("Paris") && (MAX_INTENTOS - numIntentos != 0)){
            System.out.println("Respuesta incorrecta");
            System.out.println("Solo quedan " + (MAX_INTENTOS - numIntentos) + " intento(s)");
            System.out.println("¿Cuál es la capital de Francia? ");
            respuesta = teclado.nextLine();
            numIntentos++;
        }
        if (MAX_INTENTOS - numIntentos != 0) {
            System.out.println("Bravo!");
        }else{
            System.out.println("Revise sus conocimientos en geografía");
        }


    }


}
