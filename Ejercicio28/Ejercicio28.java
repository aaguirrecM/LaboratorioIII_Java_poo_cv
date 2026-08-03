package Ejercicio28;
public class Ejercicio28 {
    public static void main(String[] args) {
        Persona p = new Persona();
        try {
            p.setEdad(-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
