package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Buscar un elemento en una lista genérica
        List<String> lista = new ArrayList<>();
        lista.add("Manzana");
        lista.add("Banana");
        lista.add("Cereza");

        boolean encontrado = ListasEnlazadas.buscarElemento(lista, "Banana");
        System.out.println("¿Contiene 'Banana'? " + encontrado);

        boolean noEncontrado = ListasEnlazadas.buscarElemento(lista, "Durazno");
        System.out.println("¿Contiene 'Durazno'? " + noEncontrado);

        // 2. Invertir una lista genérica
        List<String> listaInvertida = ListasEnlazadas.invertirLista(lista);
        System.out.println("Lista invertida: " + listaInvertida);

        // 3. Insertar nodos en una lista enlazada
        Node<Integer> head = null;
        head = ListasEnlazadas.insertarAlFinal(head, 1);
        head = ListasEnlazadas.insertarAlFinal(head, 2);
        head = ListasEnlazadas.insertarAlFinal(head, 3);

        System.out.print("Lista enlazada: ");
        ListasEnlazadas.imprimirLista(head);

        // 4. Contar nodos
        int cantidadNodos = ListasEnlazadas.contarNodos(head);
        System.out.println("Cantidad de nodos: " + cantidadNodos);

        // 5. Comparar dos listas
        Node<Integer> head2 = null;
        head2 = ListasEnlazadas.insertarAlFinal(head2, 1);
        head2 = ListasEnlazadas.insertarAlFinal(head2, 2);
        head2 = ListasEnlazadas.insertarAlFinal(head2, 3);

        boolean iguales = ListasEnlazadas.sonIguales(head, head2);
        System.out.println("¿Las dos listas son iguales? " + iguales);

        // 6. Concatenar dos listas
        Node<Integer> head3 = null;
        head3 = ListasEnlazadas.insertarAlFinal(head3, 4);
        head3 = ListasEnlazadas.insertarAlFinal(head3, 5);

        Node<Integer> listaConcatenada = ListasEnlazadas.concatenarListas(head, head3);
        System.out.print("Lista concatenada: ");
        ListasEnlazadas.imprimirLista(listaConcatenada);
    }
}
