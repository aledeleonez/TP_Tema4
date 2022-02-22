import java.util.Scanner;

public class LaNotaMediaV2 {
    
    public void notaMedia(Scanner teclado){
        double nota = 0;
        double suma = 0;
        int contador = 0;
        double media = 0;
        while(nota != -1){
            System.out.println("¿Nota (-1 para terminar)?: ");
            nota = teclado.nextDouble();
            suma += nota;
            contador++;
        }
        media = suma/contador;
        System.out.println(String.format("La media es %.2f", media))
    }
}
