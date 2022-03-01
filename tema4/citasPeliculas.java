import java.util.Scanner;

public class citasPeliculas {
    
    public void citasPelis(Scanner teclado){
        System.out.println("1.- Una cita de Gladiator");
        System.out.println("2.- Una cita de El Padrino");
        System.out.println("3.- Una cita de Pulp Fiction");
        System.out.println("4.- Una cita de E.T. el extraterrestre");
        System.out.println("5.- Una cita de Casablanca");
        System.out.println("6.- Salir de esta maravillosa aplicación");
        int opcion;

        do{
            opcion = teclado.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("La muerte nos sonríe a todos, devolvámosle la sonrisa");
                break;
                case 2:
                    System.out.println("¿De qué sirve confesarme, si no me arrepiento?");
                    break;
                case 3:
                    System.out.println("El que juega con cerillas, se quema");
                break;
                case 4:
                    System.out.println("E.T. teléfono mi casa. Teléfono mi casa. Teléfono mi casa");
                break;
                case 5:
                    System.out.println("Tocala una vez, Sam");
                break;
            }
        }while(opcion != 6);
        System.out.println("Adios");
        
    }
}
