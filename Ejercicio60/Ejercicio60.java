package Ejercicio60;
public class Ejercicio60 {
    public static void emitirSonido(Animal animal) {
        animal.sonido();
    }

    public static void main(String[] args) {
        Animal miPerro = new Perro();
        Animal miGato = new Gato();

        emitirSonido(miPerro);
        emitirSonido(miGato);
    }
}