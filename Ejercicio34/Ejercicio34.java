package Ejercicio34;
public class Ejercicio34 {
    public static void main(String[] args) {
        try {
            Cuenta c = new Cuenta(-50.0);
            System.out.println(c); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
