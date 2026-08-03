package Ejercicio06_ValidarPositivo;

import java.util.Scanner;

public class ValidarPositivo {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.print("Ingresa un número positivo: ");
        
        try {
            double numero = Double.parseDouble(lectorTeclado.nextLine());

            if (numero <= 0) {
                throw new IllegalArgumentException("El número ingresado debe ser estrictamente mayor que cero.");
            }

            System.out.println("Número válido registrado con éxito: " + numero);

        } catch (NumberFormatException e) {
            System.out.println("Error. Debes ingresar un formato numérico válido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error de validación: " + e.getMessage());
        } finally {
            lectorTeclado.close();
        }
    }
}