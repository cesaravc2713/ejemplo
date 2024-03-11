/*Eliminar duplicados:
Escribir un programa que elimine los elementos duplicados de una lista.*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ejercicio14 {
    public static void main(String[] args) {
        List<Integer> listaConDuplicados = new ArrayList<>();
        listaConDuplicados.add(5);
        listaConDuplicados.add(0);
        listaConDuplicados.add(3);
        listaConDuplicados.add(1);
        listaConDuplicados.add(2);
        listaConDuplicados.add(3);
        listaConDuplicados.add(0);
        listaConDuplicados.add(0);

        List<Integer> listaSinDuplicados = eliminarDuplicados(listaConDuplicados);

        System.out.println("lista : " + listaConDuplicados);
        System.out.println("lista sin duplicados: " + listaSinDuplicados);
    }

    public static List<Integer> eliminarDuplicados(List<Integer> lista) {
        Set<Integer> conjuntoSinDuplicados = new HashSet<>(lista);
        return new ArrayList<>(conjuntoSinDuplicados);
    }
}