package Ejercicio45;
import java.util.ArrayList;
import java.util.List;

public class Estudiante {
    private List<Double> notas = new ArrayList<>();

    public void agregarNota(double nota) {
        if (nota < 0 || nota > 100) {
            throw new IllegalArgumentException("Nota fuera de rango");
        }
        notas.add(nota);
    }
    
    public int getTamanio() {
        return notas.size();
    }
}