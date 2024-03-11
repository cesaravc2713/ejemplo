//8. Ejercicio de Generación de Números Aleatorios con Suma:
//Escribe un programa en Java que genere dos números enteros aleatorios entre 1 y 10 y luego solicite al usuario ingresar la suma de esos dos números. El programa debe verificar si la respuesta es correcta.


import java.util.Random;
import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {

        Random random = new Random();


        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;


        int suma = num1 + num2;


        Scanner scanner = new Scanner(System.in);
        System.out.print("cual es la suma de" + num1 + " + " + num2 + ": ");
        int sumaUsuario = scanner.nextInt();


        if (sumaUsuario == suma) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto, la suma de " + num1 + " + " + num2 + " es " + suma);
        }

        scanner.close();
    }
}
