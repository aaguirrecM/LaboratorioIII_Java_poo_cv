package Ejercicio25_PequenoMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n*** MENÚ PRINCIPAL ***");
            System.out.println("1. Consultar estado");
            System.out.println("2. Ver configuración");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");

            String entrada = scanner.nextLine();

            try {
                int opcion = Integer.parseInt(entrada);
                continuar = ControladorMenu.ejecutarOpcion(opcion);

            } catch (NumberFormatException e) {
                System.out.println("Error de formato. Ingrese solo números enteros.");
            } catch (IllegalArgumentException e) {
                System.out.println("Error de opción. " + e.getMessage());
            }
        }

        scanner.close();
    }
}