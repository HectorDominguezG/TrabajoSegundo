public class ProcesoD {
    public static void main(String[] args) throws Exception {
        // instancio la clase run time para ir ejecutando las cadenas
        Runtime runtime = Runtime.getRuntime();

        int veces = Integer.parseInt(args[1]);

        for (int i = 0; i < veces; i++) {
            String orden = "cmd /c start cmd /k \"java -jar ProcesoA.jar | java -jar ProcesoB.jar | java -jar ProcesoC.jar\"";

            runtime.exec(orden.split(" "));
        }
    }
}
