package Ejercicio42;
public class Ejercicio42 {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.agregarNota(85);
        System.out.println("Nota agregada. Total notas: " + e.getCantidadNotas());
    }
}