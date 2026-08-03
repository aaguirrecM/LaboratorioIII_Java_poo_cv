package Ejercicio05_UsoFinally;

import java.util.Scanner;

public class UsoFinally {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.println("*** Verificación de Bloque Finally ***");
        System.out.print("Ingresa un número entero: ");
        String entrada = lectorTeclado.nextLine();

        try {
            int numero = Integer.parseInt(entrada);
            System.out.println("Número ingresado correctamente: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error: '" + entrada + "' no es un número válido.");

        } finally {
            System.out.println("FINALLY. Operación finalizada. Este mensaje se muestra siempre.");
            lectorTeclado.close();
        }
    }
}