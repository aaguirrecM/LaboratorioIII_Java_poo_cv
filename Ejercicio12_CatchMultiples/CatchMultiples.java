package Ejercicio12_CatchMultiples;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchMultiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el numerador: ");
            double numerador = scanner.nextDouble();

            System.out.print("Ingrese el denominador: ");
            double denominador = scanner.nextDouble();

            if (denominador == 0) {
                throw new ArithmeticException("No es posible dividir entre cero.");
            }

            double resultado = numerador / denominador;
            System.out.println("El resultado exacto de la división es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error de depuración de tipo aritmético: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error de depuración de tipo formato: Debe ingresar un valor numérico válido.");
        } catch (Exception e) {
            System.out.println("Error general inesperado: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Ejecución finalizada.");
        }
    }
}