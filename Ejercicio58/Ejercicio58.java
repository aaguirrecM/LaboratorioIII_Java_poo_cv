package Ejercicio58;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio58 {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());

        System.out.println("Lista polimórfica de animales creada con éxito. Elementos: " + animales.size());
    }
}