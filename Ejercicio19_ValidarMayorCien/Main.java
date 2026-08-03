package Ejercicio19_ValidarMayorCien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número estrictamente mayor a 100: ");

        try {
            int numero = Integer.parseInt(scanner.nextLine());
            ValidadorRangos.validarMayorQueCien(numero);
            System.out.println("Número aceptado exitosamente: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error de entrada: Debes ingresar un número entero.");
        } catch (IllegalArgumentException e) {
            System.out.println("Regla no valida: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}