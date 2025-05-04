package Actividades;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        GestorDeTareas<Tarea> gestor = new GestorDeTareas<>();

        // 2. Agregar tareas
        System.out.println("Tareas agregadas: ");
        Tarea tarea1 = new Tarea("Estudiar para examen", 3);
        Tarea tarea2 = new Tarea("Completar proyecto", 5);
        Tarea tarea3 = new Tarea("Lavar ropa", 1);
        
        gestor.agregarTarea(tarea1);
        gestor.agregarTarea(tarea2);
        gestor.agregarTarea(tarea3);
        gestor.imprimirTareas();

        // 3. Eliminar alguna
        gestor.eliminarTarea(tarea3); // Aquí pasamos la instancia ya existente
        System.out.println("\nTareas actuales: ");
        gestor.imprimirTareas();

        // 4. Verificar si cierta tarea existe
        boolean existe = gestor.contieneTarea(tarea3);
        System.out.println("¿Existe la tarea 'Lavar ropa'? " + existe);

        // 5. Invertir la lista
        gestor.invertirTareas();
        System.out.println("\nTareas invertidas:");
        gestor.imprimirTareas();

        // 6. Transferir una tarea a lista de tareas completadas
        List<Tarea> tareasCompletadas = new ArrayList<>();
        Tarea tareaCompletada = gestor.obtenerTareaMasPrioritaria();
        if (tareaCompletada != null) {
            tareasCompletadas.add(tareaCompletada);
            gestor.eliminarTarea(tareaCompletada);
        }

        // 7. Mostrar ambas listas
        System.out.println("\nTareas pendientes:");
        gestor.imprimirTareas();

        System.out.println("\nTareas completadas:");
        for (Tarea t : tareasCompletadas) {
            System.out.println(t);
        }
    }
}
