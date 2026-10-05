import controller.FileContoller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Entrada {

    public static void main(String[] args) {
        FileContoller fileContoller = new FileContoller();

        // lecturas por consola - fichero
        Scanner lector = new Scanner(System.in);

        // lecturas por consola -> solo se pueden leer string
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Proyecto de gestion de ficheros");
        do {
            System.out.println("Ingrese el nombre del fichero");
            String nombreFichero = lector.nextLine();
            try {
                fileContoller.crearFichero(nombreFichero);
                break;
            } catch (IOException e) {
                System.out.println("Error a la hora de crear el fichero");
            }
        }while (true);

        System.out.println("Fichero creado correctamente");
        // terminamos el uso del flujo -> cerrando el flujo
        lector.close();

    }
}
