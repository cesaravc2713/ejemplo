//10. Ejercicio de Cálculo de Dígitos Repetidos en un Número:
//Desarrolla un programa en Java que solicite al usuario ingresar un número entero positivo y un dígito, y luego cuente y muestre cuántas veces aparece ese dígito en el número ingresado.

import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("número entero positivo: ");
        int numero = scanner.nextInt();
        System.out.print("ingresa digito ");
        int digito = scanner.nextInt();


        int cantidad = contador(numero, digito);

        System.out.println("El dígito " + digito + " aparece " + cantidad + " veces en el número " + numero);
    }

    public static int contador(int num, int digito) {
        int contador = 0;
        while (num > 0) {
            int ultimoDigito = num % 10;
            if (ultimoDigito == digito) {
                contador++;
            }
            num /= 10;
        }
        return contador;
    }
}
