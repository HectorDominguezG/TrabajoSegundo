import java.io.OutputStream;
import java.io.PrintWriter;

public class ProcesoA {
    public static void main(String[] args) throws Exception {
        int palabras = 15;
        String alfabeto = "abcdefghijklmnñopqrstuvwxyz";
        StringBuilder palabra = new StringBuilder(); 
        for (int i = 0; i < palabras; i++) {
            for (int j = 0; j < (int)(Math.random()*16+5) ; j++) {
                int letra = (int)(Math.random()*27);
                palabra.append(alfabeto.charAt(letra));
            }
            palabra.append("\n");
            
        }
        
        String palabradef = palabra.toString();
        OutputStream outStream = System.out;
        PrintWriter writer = new PrintWriter(outStream, true);
        writer.println(palabradef);
    }
}
