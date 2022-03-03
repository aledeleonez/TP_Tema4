package tema4;
import java.util.Scanner;

public class PeliculasV1 {
        //Ejercicio7
    public void cartelera(Scanner teclado){
        int pelicula = 0;
        while (pelicula!=5){
            menu();
            pelicula=teclado.nextInt();
            switch (pelicula){
                case 1:
                    System.out.println("\n¿No reconoces a la muerte cuando la ves?");
                    break;
                case 2:
                    System.out.println("\nMe llamo Bond, James Bond");
                    break;
                case 3:
                    System.out.println("\nNuestro lema es: más humanos que los humanos.");
                    break;
                case 4:
                    System.out.println("\nQue la fuerza te acompañe");
                    break;
                case 5:
                    System.out.println("\nAdios");
                    break;
                default:
                    System.out.println("\nOpcion incorrecta\n");
                    break;
            }
        }

    }


    private static void menu(){
        System.out.println("\nSeleccione la pelicula de la cual desea leer una cita:\n ");
        System.out.println("1 El Señor de los Anillos");
        System.out.println("2 James Bond");
        System.out.println("3 Blade Runner");
        System.out.println("4 Star Wars\n");
        System.out.println("5 - Salir de esta magnífica aplicación\n");

    }
}
