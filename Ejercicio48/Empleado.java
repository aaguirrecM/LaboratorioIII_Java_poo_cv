package Ejercicio48;
public class Empleado {
    private double salario;

    public void setSalario(double salario) { 
        if (salario <= 0) {
            throw new IllegalArgumentException("Salario debe ser positivo");
        }
        this.salario = salario; 
    }
    
    public double getSalario() {
        return salario;
    }
}
