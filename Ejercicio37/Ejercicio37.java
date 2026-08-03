package Ejercicio37;
public class Ejercicio37 {
    public static void main(String[] args) {
        Producto p = new Producto();
        p.setPrecio(100.0);
        // Usamos getPrecio() para que la variable 'precio' sea leída y se quite la advertencia
        System.out.println("Precio encapsulado: Q" + p.getPrecio());
    }
}
