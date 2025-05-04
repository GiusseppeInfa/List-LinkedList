package Ejercicios;
import java.util.ArrayList;
import java.util.List;

public class ListasEnlazadas<T> {
	
	public static <T> boolean buscarElemento(List<T> lista, T valor) {
	    for (T elemento : lista) {
	        if (elemento.equals(valor)) {
	            return true;
	        }
	    }
	    return false;
	}
	
	
	public static <T> List<T> invertirLista(List<T> lista) {
	    List<T> invertida = new ArrayList<>();
	    for (int i = lista.size() - 1; i >= 0; i--) {
	        invertida.add(lista.get(i));
	    }
	    return invertida;
	}

	public static <T> Node<T> insertarAlFinal(Node<T> head, T valor) {
	    Node<T> nuevoNodo = new Node<>(valor);

	    if (head == null) {
	        return nuevoNodo;
	    }

	    Node<T> actual = head;
	    while (actual.next != null) {
	        actual = actual.next;
	    }
	    actual.next = nuevoNodo;

	    return head;
	}

	
	public static <T> int contarNodos(Node<T> head) {
	    int contador = 0;
	    Node<T> actual = head;
	    while (actual != null) {
	        contador++;
	        actual = actual.next;
	    }
	    return contador;
	}

	public static <T> boolean sonIguales(Node<T> head1, Node<T> head2) {
	    Node<T> actual1 = head1;
	    Node<T> actual2 = head2;

	    while (actual1 != null && actual2 != null) {
	        if (!actual1.data.equals(actual2.data)) {
	            return false;
	        }
	        actual1 = actual1.next;
	        actual2 = actual2.next;
	    }

	    return actual1 == null && actual2 == null;
	}

	public static <T> Node<T> concatenarListas(Node<T> head1, Node<T> head2) {
	    if (head1 == null) return head2;
	    if (head2 == null) return head1;

	    Node<T> actual = head1;
	    while (actual.next != null) {
	        actual = actual.next;
	    }
	    actual.next = head2;

	    return head1;
	}
	
	public static <T> void imprimirLista(Node<T> head) {
	    Node<T> actual = head;
	    while (actual != null) {
	        System.out.print(actual.data + " -> ");
	        actual = actual.next;
	    }
	    System.out.println("null");
	}
}
