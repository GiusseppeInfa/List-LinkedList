package Actividades;



public class GestorDeTareas<T> {
    private Node<T> head;

    public GestorDeTareas() {
        this.head = null;
    }

    public void agregarTarea(T tarea) {
        Node<T> nuevo = new Node<>(tarea);
        if (head == null) {
            head = nuevo;
        } else {
            Node<T> actual = head;
            while (actual.next != null) {
                actual = actual.next;
            }
            actual.next = nuevo;
        }
    }

    public boolean eliminarTarea(T tarea) {
        if (head == null) 
        	return false;

        if (head.data.equals(tarea)) {
            head = head.next;
            return true;
        }

        Node<T> actual = head;
        while (actual.next != null && !actual.next.data.equals(tarea)) {
            actual = actual.next;
        }

        if (actual.next != null) {
            actual.next = actual.next.next;
            return true;
        }

        return false;
    }

    public boolean contieneTarea(T tarea) {
        Node<T> actual = head;
        while (actual != null) {
            if (actual.data.equals(tarea))
            	return true;
            actual = actual.next;
        }
        return false;
    }

    public void imprimirTareas() {
        Node<T> actual = head;
        while (actual != null) {
            System.out.println(actual.data);
            actual = actual.next;
        }
    }

    public int contarTareas() {
        int contador = 0;
        Node<T> actual = head;
        while (actual != null) {
            contador++;
            actual = actual.next;
        }
        return contador;
    }

    public T obtenerTareaMasPrioritaria() {
        if (head == null) 
        	return null;
        if (!(head.data instanceof Tarea)) 
        	return null;

        Node<T> actual = head;
        Tarea tareaMayor = (Tarea) actual.data;

        while (actual != null) {
            Tarea tareaActual = (Tarea) actual.data;
            if (tareaActual.getPrioridad() > tareaMayor.getPrioridad()) {
                tareaMayor = tareaActual;
            }
            actual = actual.next;
        }

        return (T) tareaMayor;
    }

    public void invertirTareas() {
        Node<T> anterior = null;
        Node<T> actual = head;
        Node<T> siguiente = null;

        while (actual != null) {
            siguiente = actual.next;
            actual.next = anterior;
            anterior = actual;
            actual = siguiente;
        }
        head = anterior;
    }

    public Node<T> getHead() {
        return head;
    }
}

