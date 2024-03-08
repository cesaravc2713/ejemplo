
/*Ejercicio de Validación de Contraseña:
Crea un programa en Java que pida al usuario ingresar una contraseña. El programa debe verificar si
la contraseña cumple con ciertos criterios de seguridad, como tener al menos 8 caracteres de longitud y contener
 al menos una letra mayúscula, una letra minúscula y un número.*/
import java.util.Scanner;
public class ejercicio4 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, ingresa tu contraseña:");
        String contrasena = scanner.nextLine();

        if (contrasena.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,}")) {
            System.out.println("La contraseña es segura.");
        } else {
            System.out.println("La contraseña no es segura.");
        }





    }
}
