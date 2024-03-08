/*Ejercicio de Cálculo de Intereses Compuestos:
Desarrolla un programa en Java que permita calcular el monto final de una inversión después de un cierto número de años,
utilizando la fórmula de interés compuesto. El programa debe pedir al usuario ingresar la cantidad inicial invertida, la tasa
de interés anual y el número de años. Luego, muestra el monto final.*/

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("cantidad inicial invertida:");
        double principal = scanner.nextDouble();
        System.out.println("tasa de interés anual:");
        double tasaInteres = scanner.nextDouble();
        System.out.println("número de años:");
        int anos = scanner.nextInt();

        double montoFinal = principal * Math.pow(1 + tasaInteres / 100, anos);
        System.out.printf("monto final después de %d años es: %.2f\n", anos, montoFinal);
    }
}