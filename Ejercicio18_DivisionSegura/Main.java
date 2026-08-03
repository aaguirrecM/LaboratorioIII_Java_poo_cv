package Ejercicio18_DivisionSegura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa el dividendo: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingresa el divisor: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            double resultado = Calculadora.dividir(num1, num2);
            System.out.println("Resultado de la división: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Error de entrada: Por favor ingresa un número válido.");
        } catch (ArithmeticException e) {
            System.out.println("Error matemático: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}