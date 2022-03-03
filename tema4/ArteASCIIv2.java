package tema4;


import java.util.Scanner;

public class ArteASCIIv2 {
    //Ejercicio11
    public void figuras(Scanner teclado){
        System.out.println("¿tamaño?: ");
        int t = teclado.nextInt();
        teclado.nextLine();
        System.out.println("¿Caracter?: ");
        String c = teclado.nextLine();
        menu();
        int forma = teclado.nextInt();
            switch (forma) {
                case 1:
                    rectanguloRelleno(t,c);
                    break;
                case 2:
                    rectangulo(t,c);
                    break;
                case 3:
                    cruz(t,c);
                    break;
                case 4:
                    triangulo(t,c);
                    break;
                case 5:
                    romboHueco(t,c);
                    break;
                case 6:
                    ajedrezado(t,c);
                    break;
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
        int y = (t-1);
        for(int i = 0; i < t; i++){
            for (int j = 0; j < t; j++) {
                if((i == j)||(i+j)==y){
                    System.out.print(c);
                }
                else{
                    System.out.println("*");
                }
            }
            System.out.println();
        }
    }

    public static void romboHueco(int t, String c) {
        for (int i = 1; i <= 2 * t - 1; i++) {
            int a = t - i;
            int b = 2 * i - 1;
            if (i > t) {
                a = i - t;
                b = 4 * t - 2 * i -1;
            }
            for (int j = 0; j < a; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < b; k++) {
                if (k == 0 || k == b - 1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    public void ajedrezado(int t, String c){
        int filas;
	    int columnas;
	
	  for (columnas=1; columnas<=t; columnas++) {
	    for (filas=1; filas<=t; filas++) {
	        System.out.print(c);
	        System.out.print(" ");
	    }
		
	    System.out.println("");
	    for (filas=1; filas<=t; filas++) {
            System.out.print(" ");
            System.out.print(c);
	    }
		System.out.println("");
		
     }  
    }

    public void menu(){
        System.out.println("¿Forma?");
        System.out.println("1.- Rectángulo con relleno");
        System.out.println("2.- Rectángulo sin relleno");
        System.out.println("3.- Cruz de San Andrés");
        System.out.println("4.- Triángulo rectángulo");
        System.out.println("5.- Rombo");
        System.out.println("6.- Ajedrezado");
    }


}
