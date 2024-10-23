import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class ProcesoB {
    public static void main(String[] args) throws Exception {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        String palabracogida = "";
        int caracteres;
        StringBuilder cadena = new StringBuilder();
        while ((palabracogida = reader.readLine()) != null) {
            caracteres = palabracogida.length();
            cadena.append(palabracogida + ", " + caracteres + " ");
        }
        OutputStream outStream = System.out;
        PrintWriter writer = new PrintWriter(outStream, true);
        writer.println(cadena);
    }
}
