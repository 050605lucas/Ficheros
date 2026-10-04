import controller.FileContoller;



public class Entrada {

    public static void main(String[] args) {
        FileContoller fileContoller = new FileContoller();
        System.out.println("Proyecto de gestion de ficheros");
        fileContoller.createFile("src/resources/");
        System.out.println("Terminando");


    }
}
