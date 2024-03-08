
/*2.Producto de elementos pares:
Escribir un programa que encuentre el producto
de todos los números pares en un vector de enteros.*/
import java.util.Vector;
public class ejercicio7 {

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(2);
        vector.add(4);
        vector.add(5);
        vector.add(6);

        int producto = 1;
        for (int num : vector) {
            if (num % 2 == 0) {
                producto *= num;
            }
        }

        System.out.println("el producto de todos los números pares en el vector es: " + producto);
    }
}