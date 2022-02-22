import java.util.Scanner;

public class LaNotaMediaV1 {
    


    public void notaMedia(Scanner teclado){

        int numNotas = 0;
        double auxNota;
        double sumNotas = 0;
        

        System.out.println("Introduzca el numero de notas: ");
        numNotas = teclado.nextInt();
        double[] notas = new double[numNotas];
        for (int i = 0; i < numNotas; i++) {
            System.out.println("Nota: ");
            auxNota = teclado.nextDouble();
            notas[i] = auxNota;
        }
        for (double d : notas) {
            sumNotas += d;
        }
        double media = sumNotas/notas.length;
        System.out.println(String.format("La media es %.2f", media));
    }
}
