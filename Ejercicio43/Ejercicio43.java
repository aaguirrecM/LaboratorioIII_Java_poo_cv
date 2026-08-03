package Ejercicio43;
public class Ejercicio43 {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        e.agregarNota(90);
        e.agregarNota(80);
        System.out.println("Promedio: " + e.calcularPromedio());
    }
}