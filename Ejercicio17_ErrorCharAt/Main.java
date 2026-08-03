package Ejercicio17_ErrorCharAt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una palabra: ");
        String palabra = scanner.nextLine();

        System.out.print("Ingresa la posición a consultar: ");

        try {
            int indice = Integer.parseInt(scanner.nextLine());
            char caracter = Lector.obtenerCaracterEnPosicion(palabra, indice);
            System.out.println("El carácter en la posición " + indice + " es: '" + caracter + "'");

        } catch (NumberFormatException e) {
            System.out.println("Error de entrada. Debes ingresar un número entero válido.");
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error de índice. La posición ingresada está fuera del rango válido (0 a " + (palabra.length() - 1) + ").");
        } catch (IllegalArgumentException e) {
            System.out.println("Error.  " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}