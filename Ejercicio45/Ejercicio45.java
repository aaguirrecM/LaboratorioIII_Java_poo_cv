package Ejercicio45;
public class Ejercicio45 {
    public static void main(String[] args) {
        Estudiante e = new Estudiante();
        try { 
            e.agregarNota(150); 
        } catch (Exception ex) { 
            System.out.println(ex.getMessage()); 
        }
        System.out.println("Total notas válidas: " + e.getTamanio());
    }
}
