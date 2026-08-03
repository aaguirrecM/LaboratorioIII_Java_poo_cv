package Ejercicio15_LanzarExcepcionPersonalizada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre completo: ");
        String nombre = scanner.nextLine();

        try {
            ValidadorFormulario.validarCampoNombre(nombre);
            System.out.println("Formulario enviado con éxito. Te damos la bienvenida ");
        } catch (CampoVacioException e) {
            System.out.println("Error de validación: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}