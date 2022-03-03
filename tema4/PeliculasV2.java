package tema4;
import java.util.Scanner;

public class PeliculasV2 {
        //Ejercicio8
    public void carteleraV2(Scanner teclado){
        int pelicula = 0;
        while (pelicula!=5){
            menu();
            pelicula=teclado.nextInt();
            int cita = 1 + (int)(Math.random() * ((3 - 1) + 1));
            switch (pelicula){
                case 1:
                    switch (cita){
                        case 1:
                            System.out.println("\n¿No reconoces a la muerte cuando la ves?");
                            break;
                        case 2:
                            System.out.println("\nLos atajos cortos traen retrasos largos, pero las posadas los alargan todavía más.");
                            break;
                        case 3:
                            System.out.println("\nMe hace feliz que estés aquí conmigo. Aquí al final de todas las cosas, Sam.");
                            break;
                    }
                    break;

                case 2:
                    switch (cita){
                        case 1:
                            System.out.println("\nMe llamo Bond, James Bond");
                            break;
                        case 2:
                            System.out.println("\nUn Martini con hielo, mezclado, no agitado.");
                            break;
                        case 3:
                            System.out.println("\nUn hombre se mide por la fortaleza de sus enemigos.");
                            break;
                    }
                    break;

                case 3:
                    switch (cita){
                        case 1:
                            System.out.println("\nNuestro lema es: más humanos que los humanos.");
                            break;
                        case 2:
                            System.out.println("\nLa luz que brilla con el doble de intensidad dura la mitad de tiempo, y tu has brillado mucho, Roy.");
                            break;
                        case 3:
                            System.out.println("\nYo... he visto cosas que vosotros no creeríais");
                            break;
                    }
                    break;

                case 4:
                    switch (cita){
                        case 1:
                            System.out.println("\nQue la fuerza te acompañe");
                            break;
                        case 2:
                            System.out.println("\nSu carencia de fe resulta molesta");
                            break;
                        case 3:
                            System.out.println("\nTus ojos pueden engañarte, no confíes en ellos");
                            break;
                    }
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
        System.out.println("\nSeleccione la pelicula de la cual desea leer una cita aleatoria:\n ");
        System.out.println("1 El Señor de los Anillos");
        System.out.println("2 James Bond");
        System.out.println("3 Blade Runner");
        System.out.println("4 Star Wars\n");
        System.out.println("5 - Salir de esta magnífica aplicación\n");

    }
}
