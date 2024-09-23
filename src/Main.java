import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        //lecturaEscritura.leerArquivo("/home/dam/prueba/foto.jpg");
        try {
            lecturaEscritura.escribirNoArquivo("/home/dam/prueba/foto.jpg","/home/dam/prueba/foto2.jpg");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    /*
    b)
     executa por segunda vez a aplicacion para que se engada de novo a imaxe foto.jpg
     á imaxe foto2.jpg. ¿que ocorre se abrimos a imaxe, vese a imaxe repetida? ,
     Canto ocupa agora o arquivo foto2.jpg?

     La imágen aumenta en tamaño pero se sigue viendo la misma imágen de antes, no a cambiado
     */
}