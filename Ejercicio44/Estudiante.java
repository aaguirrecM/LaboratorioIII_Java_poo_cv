package Ejercicio44;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private String nombre;
    private List<Double> notas = new ArrayList<>();

    public Estudiante(String nombre) { 
        this.nombre = nombre; 
    }
    
    public void agregarNota(double nota) { 
        notas.add(nota); 
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double n : notas) {
            suma += n;
        }
        return notas.isEmpty() ? 0 : suma / notas.size();
    }

    public void mostrarResultado() {
        System.out.println(nombre + " - Promedio: " + calcularPromedio());
    }
}
