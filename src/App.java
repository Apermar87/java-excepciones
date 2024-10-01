public class App {
    public static void main(String[] args) throws Exception {
        
        try {
            System.out.println("Ingresando al primer try");
            double cociente = 10000/0;
            System.out.println("Después de la división");
        } catch (ArithmeticException e) {
            System.out.println("División por cero");
        } finally {
            System.out.println("ingresando al primer finally");
        }

        try {
            System.out.println("Ingresando al segundo try");
            Object objeto = null;
            objeto.toString();
            System.out.println("Imprimiendo objeto");
        } catch (ArithmeticException e){
            System.out.println("División por cero");
        } catch (Exception e){
            System.out.println("Ocurrió una excepción");
        } finally {
            System.out.println("Ingresando al segundo finally");
        }

        try {
            String texto = "Programación";
            char caracter = texto.charAt(14);
            System.out.println(caracter);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Indice de string por fuera del límite");
        }

        try {
            int numero = Integer.parseInt("Número");
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.out.println("Excepción de formato de número");
        } finally {
            System.out.println("Ingresando al finally");
        }
    }
}
