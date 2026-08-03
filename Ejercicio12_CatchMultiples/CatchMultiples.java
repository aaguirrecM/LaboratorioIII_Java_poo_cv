package Ejercicio12_CatchMultiples;

import java.util.Scanner;

public class CatchMultiples {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        int[] numeros = {100, 200, 300};

        System.out.print("Ingresa el índice del número: ");
        String entradaIndice = lectorTeclado.nextLine();

        System.out.print("Ingresa el divisor: ");
        String entradaDivisor = lectorTeclado.nextLine();

        try {
            int indice = Integer.parseInt(entradaIndice);
            int divisor = Integer.parseInt(entradaDivisor);

            int resultado = numeros[indice] / divisor;
            System.out.println("Resultado de la operación: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Error 1. Formato inválido. Ingresaste texto en lugar de números.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error 2. El índice indicado está fuera de los límites del arreglo.");
        } catch (ArithmeticException e) {
            System.out.println("Error 3. No es posible dividir entre cero.");
        } finally {
            lectorTeclado.close();
        }
    }
}