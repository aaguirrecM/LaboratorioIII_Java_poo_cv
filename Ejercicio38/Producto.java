package Ejercicio38;
public class Producto {
    private double precio;

    public void setPrecio(double precio) {
        if (precio <= 0) {
            throw new IllegalArgumentException("El precio debe ser positivo");
        }
        this.precio = precio;
    }
    
    public double getPrecio() {
        return precio;
    }
}
