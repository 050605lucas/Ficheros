package controller;

import java.io.File;
import java.io.IOException;

public class FileContoller {

    private String basePath = "src/resources/";

    public void crearFichero(String path) throws IOException {
        // src/resources/example.txt
        // directorio (carpeta) fichero_final (elemento con extension)
        File file = new File(basePath + path);
        if (file.exists()) {
            System.out.println("El fichero ya existe");
        } else {
            file.createNewFile();
        }


    }


    // System.out.println(basePath+path);
    // System.out.printf("%s%s",basePath,path);
    // los dos syso anteriores son lo mismo
    // %s -> string
    // %d -> int
    // %f -> float (número con decimales) %.2f -> double (número con 2 decimales)


}
