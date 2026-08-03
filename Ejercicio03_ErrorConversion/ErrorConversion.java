package Ejercicio03_ErrorConversion;

import java.util.Scanner;

public class ErrorConversion {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.print("Ingresa un texto para convertirlo a número entero: ");
        String entradaUsuario = lectorTeclado.nextLine();

        try {
            int numeroConvertido = Integer.parseInt(entradaUsuario);
            System.out.println("¡Éxito! El número convertido es: " + numeroConvertido);

        } catch (NumberFormatException excepcionConversion) {
            System.out.println("Error de conversión. '" + entradaUsuario + "' no es un formato de número entero válido.");

        } finally {
            lectorTeclado.close();
        }
    }
}