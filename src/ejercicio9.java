//9. Ejercicio de Cálculo de Máximo Común Divisor (MCD):
//Desarrolla un programa en Java que solicite al usuario ingresar dos números enteros positivos y luego calcule y muestre su máximo común divisor (MCD).



import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("rimer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("segundo número: ");
        int numero2 = scanner.nextInt();
        scanner.close();

        int mcd = calcularMCD(numero1, numero2);

        System.out.println("el MCD de " + mcd);
    }

    public static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
