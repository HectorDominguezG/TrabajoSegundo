import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;

public class ProcesoB {
    public static void main(String[] args) throws Exception {
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);
        String palabracogida = reader.readLine();
        int caracteres = 0;
        for (int i = 0; i < palabracogida.length(); i++) {
            caracteres ++;
        }
        OutputStream outStream = System.out;
        PrintWriter writer = new PrintWriter(outStream, true);
        writer.println(palabracogida + caracteres);
    }
}
