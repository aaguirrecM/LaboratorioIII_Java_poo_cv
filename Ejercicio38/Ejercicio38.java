package Ejercicio38;
public class Ejercicio38 {
    public static void main(String[] args) {
        Producto p = new Producto();
        try { 
            p.setPrecio(-50); 
            System.out.println(p.getPrecio());
        } catch (Exception e) { 
            System.out.println(e.getMessage()); 
        }
    }
}