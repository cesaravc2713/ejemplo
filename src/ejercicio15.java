//15. Eliminar elementos impares:
//Escribir un programa que elimine todos los elementos impares de una lista.
import java.util.ArrayList;
import java.util.List;

public class ejercicio15 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);

        System.out.println("la lista completa" + lista);

        eliminarImpares(lista);

        System.out.println("lista sin impares: " + lista);
    }

    public static void eliminarImpares(List<Integer> lista) {
        List<Integer> listaSinImpares = new ArrayList<>();
        for (int numero : lista) {
            if (numero % 2 == 0) {
                listaSinImpares.add(numero);
            }
        }
        lista.clear();
        lista.addAll(listaSinImpares);
    }
}