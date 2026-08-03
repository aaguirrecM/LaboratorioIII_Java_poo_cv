package Ejercicio46;
class EmpleadoClase {
    public String nombre;
}

public class Ejercicio46 {
    public static void main(String[] args) {
        EmpleadoClase e = new EmpleadoClase();
        e.nombre = "Spencer";
        System.out.println("Empleado creado: " + e.nombre);
    }
}