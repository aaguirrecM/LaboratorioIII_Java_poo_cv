package Ejercicio30;
public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        setEdad(edad);
    }

    public void setEdad(int edad) { 
        if (edad < 0) throw new IllegalArgumentException("Edad inválida");
        this.edad = edad; 
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad);
    }
}
