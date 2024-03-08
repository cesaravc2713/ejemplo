import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("tngrese la cantidad de dinero: ");
        double cantidad = scanner.nextDouble();
        System.out.print("Ingrese la tasa de cambio: ");
        double tasadecambio = scanner.nextDouble();

        double pesos = cantidad * tasadecambio;

        System.out.printf("%f dólares equivalen a %f pesos\n", cantidad, pesos);




    }
}