import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        LaNotaMediaV2 media = new LaNotaMediaV2();
        media.notaMedia(teclado);
    }
}
