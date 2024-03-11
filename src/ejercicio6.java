
//6. Ejercicio de Generación de Patrón de Asteriscos: Escribe un programa en Java que solicite al usuario ingresar un número entero positivo. Luego, muestra un patrón de asteriscos como el siguiente ejemplo, donde cada fila tiene el mismo número de asteriscos que el número ingresado:
//Ejemplo: Pista: Pueden usar un ciclo For y el caracter de salto de linea \n Si el usuario ingresa 4:
//*
//**
//***
//****

import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa un número entero positivo: ");

        int numero = scanner.nextInt();

        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
