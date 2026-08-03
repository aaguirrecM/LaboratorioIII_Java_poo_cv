package Ejercicio10_ContraseniaMinima;

import java.util.Scanner;

public class ContraseniaMinima {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.print("Crea tu contraseña: ");
        String contrasena = lectorTeclado.nextLine();

        try {
            if (contrasena.length() < 8) {
                throw new IllegalArgumentException("La contraseña es muy corta. Tiene " + contrasena.length() + " caracteres y se requieren mínimo 8.");
            }
            System.out.println("Contraseña creada con éxito");

        } catch (IllegalArgumentException e) {
            System.out.println("Error de seguridad: " + e.getMessage());
        } finally {
            lectorTeclado.close();
        }
    }
}