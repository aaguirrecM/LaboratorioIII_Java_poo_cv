package Ejercicio40;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio40 {
    public static void main(String[] args) {
        List<Producto> lista = new ArrayList<>();
        lista.add(new Producto("Laptop", 8000));
        lista.add(new Producto("Mouse", 250));
        
        for (Producto p : lista) {
            p.mostrarProducto();
        }
    }
}