package Ejercicio26;
public class Ejercicio26 {
    public static void main(String[] args) {
        System.out.println("--- Prueba Clase Persona ---");
        
        Persona persona = new Persona("Ana", 25);
        persona.mostrarDatos();

        System.out.println("\nActualizando edad...");
        persona.setEdad(26);
        persona.mostrarDatos();

        System.out.println("\nIntentando asignar edad negativa...");
        try {
            persona.setEdad(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Error capturado: " + e.getMessage());
        }
    }
}