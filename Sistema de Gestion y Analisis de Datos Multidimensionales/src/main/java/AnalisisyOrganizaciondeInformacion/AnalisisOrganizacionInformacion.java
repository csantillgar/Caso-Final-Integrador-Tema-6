package AnalisisyOrganizaciondeInformacion;

import java.util.*;

public class AnalisisOrganizacionInformacion {
    // Método para ordenar una lista de String utilizando el algoritmo de la burbuja
    public static List<String> ordenarLista(List<String> lista) {
        List<String> listaOrdenada = new ArrayList<>(lista); // Crear una copia de la lista para no modificar la original
        int n = listaOrdenada.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (listaOrdenada.get(j).compareTo(listaOrdenada.get(j + 1)) > 0) {
                    // Intercambiar elementos si están en el orden incorrecto
                    String temp = listaOrdenada.get(j);
                    listaOrdenada.set(j, listaOrdenada.get(j + 1));
                    listaOrdenada.set(j + 1, temp);
                }
            }
        }
        return listaOrdenada;
    }

    // Método para buscar un elemento en una lista de String utilizando búsqueda lineal
    public static int buscarElemento(List<String> lista, String elemento) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(elemento)) {
                return i; // Devolver el índice del elemento encontrado
            }
        }
        return -1; // Devolver -1 si el elemento no se encuentra en la lista
    }

    // Método para buscar un elemento en una lista de String ordenada utilizando búsqueda binaria
    public static int buscarElementoOrdenado(List<String> lista, String elemento) {
        int inicio = 0;
        int fin = lista.size() - 1;
        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            int comparacion = elemento.compareTo(lista.get(medio));
            if (comparacion == 0) {
                return medio; // Devolver el índice del elemento encontrado
            } else if (comparacion < 0) {
                fin = medio - 1; // Buscar en la mitad izquierda
            } else {
                inicio = medio + 1; // Buscar en la mitad derecha
            }
        }
        return -1; // Devolver -1 si el elemento no se encuentra en la lista
    }
}
