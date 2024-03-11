//7. Ejercicio de Ordenamiento de Números (sin utilizar arreglos): Crea un programa en Java que solicite al usuario ingresar tres números enteros. Luego, muestra los números en orden ascendente, utilizando condicionales para determinar cuál es el mayor, el intermedio y el menor.
import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("tres números enteros:");
        System.out.print("numero 1: ");
        int num1 = scanner.nextInt();
        System.out.print("numero 2: ");
        int num2 = scanner.nextInt();
        System.out.print("numero 3: ");
        int num3 = scanner.nextInt();


        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }


        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }


        int intermedio;
        if (num1 != mayor && num1 != menor) {
            intermedio = num1;
        } else if (num2 != mayor && num2 != menor) {
            intermedio = num2;
        } else {
            intermedio = num3;
        }

        System.out.println("los numeros ordenados son " + menor + ", " + intermedio + ", " + mayor);


    }
}
