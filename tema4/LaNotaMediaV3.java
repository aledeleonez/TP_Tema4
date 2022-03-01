import java.util.Scanner;

public class LaNotaMediaV3 {
    //Ejercicio3
    public void notaMedia(Scanner teclado){
        double nota = 0;
        double suma = 0;
        int contador = 0;
        int contador2 = 0;
        double media = 0;
        double porcentaje;
        while(nota != -1){
            System.out.println("¿Nota (-1 para terminar)?: ");
            nota = teclado.nextDouble();
            suma += nota;
            contador++;
            if(nota >= 10){
                contador2 ++;
            }
        }
        media = suma/contador;
        porcentaje = contador2*100/contador;
        System.out.println(String.format("La media es %.2f (%.2f %% >= 10)", media, porcentaje));
    }
}
