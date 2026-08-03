package Ejercicio42;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private List<Double> notas = new ArrayList<>();

    public void agregarNota(double nota) { 
        notas.add(nota); 
    }
    
    public int getCantidadNotas() {
        return notas.size();
    }
}
