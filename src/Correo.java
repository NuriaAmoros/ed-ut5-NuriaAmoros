
import java.util.Scanner;
import java.util.regex.Pattern;

public class Correo {


    public static void main(String[] args) {
        boolean esValido;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce una dirección de correo electrónico: ");
        String correo = scanner.nextLine();

        // Expresión regular para validar el correo de alumno
        String regex = "[\\w.]+@alu\\.gva\\.es";

        // Comprobar si el correo cumple con la expresión regular
         esValido = Pattern.matches(regex, correo);

        // Mostrar el resultado
        if (esValido) {
            System.out.println("Dirección correcta.");
        } else {

            System.out.println("Dirección incorrecta.");
        }



    }



}
