import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class ProcesoC {
    public static void main(String[] args) throws Exception {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        String cadena = reader.readLine();
        int contadorvocales = 0;
        char[] caracteres = cadena.toCharArray();

        for (char c : caracteres) {
            if (esVocal(c)) {
                contadorvocales ++;
            }
        }

        OutputStream outStream = System.out;
        PrintWriter writer = new PrintWriter(outStream, true);
        writer.print(cadena);
        writer.println("Nº vocales: " + contadorvocales);
    }

    private static boolean esVocal (char c){
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        } else{
            return false;
        }
    }

}
