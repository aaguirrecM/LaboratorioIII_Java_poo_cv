package Ejercicio23_ControlarEntradaUsuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de productos a comprar: ");
        String entrada = scanner.nextLine();

        try {
            int cantidad = Integer.parseInt(entrada);
            ProcesadorPedidos.registrarCantidad(cantidad);

        } catch (NumberFormatException e) {
            System.out.println("Error de entrada: '" + entrada + "' no es un número entero válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error de negocio: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}