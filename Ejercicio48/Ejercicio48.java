package Ejercicio48;
public class Ejercicio48 {
    public static void main(String[] args) {
        Empleado e = new Empleado();
        try { 
            e.setSalario(-500); 
            System.out.println(e.getSalario());
        } catch (Exception ex) { 
            System.out.println(ex.getMessage()); 
        }
    }
}