package Ejercicio09_ValidarEdad;

import java.util.Scanner;

public class ValidarEdad {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");

        try {
            int edad = Integer.parseInt(lectorTeclado.nextLine());

            if (edad < 0) {
                throw new IllegalArgumentException("La edad no puede ser un número negativo (" + edad + ").");
            }

            System.out.println("Edad registrada correctamente: " + edad + " años.");

        } catch (NumberFormatException e) {
            System.out.println("Error. Debes ingresar un número entero para la edad.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación. " + e.getMessage());
        } finally {
            lectorTeclado.close();
        }
    }
}