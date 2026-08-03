package Ejercicio59;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio59 {
    public static void main(String[] args) {
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro());
        animales.add(new Gato());

        for (Animal a : animales) {
            a.sonido(); 
        }
    }
}