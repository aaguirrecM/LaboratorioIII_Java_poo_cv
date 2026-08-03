package Ejercicio16_ValidarTextoNoVacio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe un comentario: ");
        String comentario = scanner.nextLine();

        try {
            ValidarTexto.asegurarTextoNoVacio(comentario);
            System.out.println("Comentario publicado exitosamente: '" + comentario + "'");
        } catch (IllegalArgumentException e) {
            System.out.println("Validación fallida: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}