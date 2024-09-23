import java.io.*;

public class lecturaEscritura {

    public static void leerArquivo(String fileName){
        try(FileInputStream  lecturaArquivos =new FileInputStream(fileName)){
            int finFicheiro = lecturaArquivos.read();
            while(finFicheiro!= -1){
                finFicheiro = lecturaArquivos.read();
                System.out.print((char) finFicheiro);
            }
        }catch(IOException e){
            System.out.println("No se pudo mostrar el contenido del archivo");
        }
    }

    public static void escribirNoArquivo(String texto1, String texto2) throws FileNotFoundException {
        File arquivoEscrito = new File(texto1);
        File arquivoValeiro = new File(texto2);

        FileInputStream leer = new FileInputStream(arquivoEscrito);
        FileOutputStream escribir = new FileOutputStream(arquivoValeiro, true);

        try{
            int leerArquivo;
            while((leerArquivo = leer.read()) != -1){
                escribir.write(leerArquivo);
            }
        }catch (IOException e){
            System.out.println("Error durante la escritura");
        }finally {
            try {
                if (leer != null) leer.close();
                if (escribir != null) escribir.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}