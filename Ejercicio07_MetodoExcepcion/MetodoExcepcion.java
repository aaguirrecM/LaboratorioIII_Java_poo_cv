package Ejercicio07_MetodoExcepcion;

import java.util.Scanner;

public class MetodoExcepcion {

    public static void verificarNoNegativo(int numero) throws Exception {
        if (numero < 0) {
            throw new Exception("El número " + numero + " es negativo y no está permitido.");
        }
        System.out.println("El número " + numero + " es válido.");
    }

    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.print("Ingresa un número entero para verificar en el método: ");
        
        try {
            int numero = Integer.parseInt(lectorTeclado.nextLine());
            verificarNoNegativo(numero);

        } catch (NumberFormatException e) {
            System.out.println("Error. Ingresa un número entero válido.");
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        } finally {
            lectorTeclado.close();
        }
    }
}