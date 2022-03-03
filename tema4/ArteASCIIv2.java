package tema4;

import java.util.Scanner;

public class ArteASCIIv2 {
    //Ejercicio11
    public void figuras(Scanner teclado){
        boolean ejecutado = false;

        System.out.println("\n¿tamaño?\n");
        int t = teclado.nextInt();
        teclado.nextLine();
        System.out.println("\n¿Caracter?\n");
        String c = teclado.nextLine();
        menu();
        int forma = teclado.nextInt();

            switch (forma) {
                case 1:
                    rectanguloRelleno(t,c);
                case 2:
                    rectangulo(t,c);
                case 3:
                    cruz(t,c);
                case 4:
                    triangulo(t,c);
                case 5:
                    rombo(t,c);
                case 6:
                    ajedrezado(t,c);
            }


        }


    public void rectanguloRelleno(int t, String c){
        for(int x=0;x<t;x++){
            for (int y=0;y<t;y++){
                System.out.print(c);
            }
            System.out.println("");
        }
    }

    public void rectangulo(int t, String c){
            for (int x=0;x<t;x++){
                System.out.print(c);
            }
            System.out.println("");
            for (int x=0;x<t-2;x++){
                System.out.print(c);
                for (int y=0;y<t-2;y++){
                    System.out.print(" ");
                }
                System.out.println(c);
            }
            for (int x=0;x<t;x++){
                System.out.print(c);
            }

    }

    public void triangulo(int t, String c){
        for (int x = 0; x < t; x++) {
            for (int y = 0; y < x + 1; y++) {
                System.out.print(c);
            }
            System.out.println("");
        }

    }

    public void cruz(int t, String c){

    }

    public void rombo(int t, String c){

    }

    public void ajedrezado(int t, String c){

    }

    public void menu(){
        System.out.println("\n¿forma?");
        System.out.println("\n1 - rectángulo con relleno");
        System.out.println("\n2 - rectángulo sin relleno");
        System.out.println("\n3 - cruz de San Andrés");
        System.out.println("\n4 - triángulo rectángulo");
        System.out.println("\n5 - rombo");
        System.out.println("\n6 - ajedrezado\n");
    }


}
