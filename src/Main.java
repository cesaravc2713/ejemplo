import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su nombre
        System.out.print("Por favor, ingrese su nombre: ");

        // Leer el nombre ingresado por el usuario
        String nombre = scanner.nextLine();

        // Mostrar el nombre ingresado por el usuario
        System.out.println("¡Hola, " + nombre + "!");

        // Cerrar el objeto Scanner para liberar recursos
        scanner.close();
    }
}