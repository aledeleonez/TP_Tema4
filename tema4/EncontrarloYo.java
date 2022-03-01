package tema4;
import java.util.Scanner;

public class EncontrarloYo {
    //Ejercicio5
    public void numero (Scanner teclado){

        int min = 1;
        int max = 100;

        int intentos = 0;
        boolean encontrado = false;
        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla.");
        teclado.nextLine();
        String tecla=teclado.nextLine();
        while (!encontrado){
            int n = min + (int)(Math.random() * ((max - min) + 1));
            System.out.println(String.format("Pruebo con %d, ¿es mayor, menor o es el número (+/-/=)?",n));
            tecla=teclado.nextLine();
            if (tecla.equals("+")){
            min = n;
            }else if (tecla.equals("-")){
            max = n;
            }else if (tecla.equals("=")){
                encontrado = true;
            }else{
                System.out.println("Tecla incorrecta");
            }
            intentos++;

        }
        System.out.println(String.format("Fenomenal, lo he encontrado después de %d intentos.", intentos));










    }
}



