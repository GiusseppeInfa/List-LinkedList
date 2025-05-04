package Actividades;

import java.util.Objects;

public class Tarea {
	
	private String titulo;
	private int prioridad;
	
	public Tarea(String titulo, int prioridad) {
		this.titulo=titulo;
		this.prioridad=prioridad;
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true; // Si son la misma referencia, son iguales
	    if (obj == null || getClass() != obj.getClass()) 
	    	return false;
	    Tarea tarea = (Tarea) obj; // Cast del objeto a Tarea
	    return prioridad == tarea.prioridad && titulo.equals(tarea.titulo); // Compara los valores de nombre y prioridad
	}
	
	@Override
    public int hashCode() {
        return Objects.hash(titulo, prioridad); // Usar los mismos campos que en equals
    }
	
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getPrioridad() {
		return this.prioridad;
	}

	public void setPrioridad(int prioridad) {
		this.prioridad = prioridad;
	}
	
	public String toString() {
		return this.titulo + " (Prioridad: " + this.prioridad + ").";
	}
}
