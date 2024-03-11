//5. Ejercicio de Suma de Dígitos:
//Escribe un programa en Java que solicite al usuario ingresar un número entero positivo.
//Luego, suma todos los dígitos del número y muestra el resultado.
//Ejemplo: Usuario ingresa 12 → El programa retorna 3
//SumDigitos = 1+2= 3
import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa un número entero positivo: ");

        int numero = scanner.nextInt();
        scanner.close();

        int sumaDigitos = 0;
        int numeroOriginal = numero;

        while (numero > 0) {
            int digito = numero % 10;
            sumaDigitos += digito;
            numero /= 10;
        }

        System.out.println("la suma de los dígitos de " + numeroOriginal + " es: " + sumaDigitos);




    }
}
