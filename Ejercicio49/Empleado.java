package Ejercicio49;
public class Empleado {
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDatos() {
        System.out.println("Empleado: " + nombre );
        System.out.println("Salario: Q" + salario);
    }
}
