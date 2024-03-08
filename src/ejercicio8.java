
/*3. Escribir un programa que encuentre el elemento máximo
en un vector de enteros.*/
import java.util.Vector;
public class ejercicio8 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);

        int maximo = vector.get(0);
        for (int num : vector) {
            if (num > maximo) {
                maximo = num;
            }
        }

        System.out.println("El elemento máximo en el vector es: " + maximo);

    }

}
