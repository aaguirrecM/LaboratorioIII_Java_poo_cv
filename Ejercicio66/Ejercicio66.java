package Ejercicio66;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio66 {
    public static void main(String[] args) {
        List<Figura> figuras = new ArrayList<>();
        figuras.add(new Cuadrado(4.0));
        figuras.add(new Circulo(3.0));

        System.out.println("Lista de figuras creada con éxito. Total elementos: " + figuras.size());
    }
}