/*1. Suma de elementos:
 Escribir un programa que calcule la suma de todos
 los elementos en un vector de enteros.*/

import java.util.Vector;

public class ejercicio11 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);

        int suma = 0;

        for (int num : vector) {
            suma += num;
        }

        System.out.println("La suma de todos los elementos en el vector es: " + suma);
    }



}
