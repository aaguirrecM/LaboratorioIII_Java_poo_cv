package Ejercicio20_SimularErrorControlado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Deseas simular una falla de conexión? (s/n): ");
        String respuesta = scanner.nextLine();

        try {
            boolean simulacion = respuesta.equalsIgnoreCase("s");
            ServicioConexion.conectar(simulacion);

        } catch (IllegalStateException e) {
            System.out.println("[EXCEPCIÓN CAPTURADA]: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}