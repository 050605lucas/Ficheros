import controller.FileContoller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Entrada {

    public static void main(String[] args) {
        FileContoller fileContoller = new FileContoller();

        // lecturas por consola - fichero
        Scanner lector =  new Scanner(System.in);

        // lecturas por consola -> solo se pueden leer string
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Proyecto de gestion de ficheros");
        System.out.println("Ingrese el nombre del fichero");
        String nombreFichero = lector.nextLine();
        fileContoller.crearFichero(nombreFichero);

    }
}
