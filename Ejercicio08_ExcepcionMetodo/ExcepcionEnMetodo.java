package Ejercicio08_ExcepcionMetodo;

import java.util.Scanner;

public class ExcepcionEnMetodo {

    public static void procesarDivision(String entradaNumerador, String entradaDenominador) {
        try {
            int numerador = Integer.parseInt(entradaNumerador);
            int denominador = Integer.parseInt(entradaDenominador);

            int resultado = numerador / denominador;
            System.out.println("Valido. El resultado de la división es: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Error. Ingresaste texto no válido. Ambos valores deben ser números enteros.");

        } catch (ArithmeticException e) {
            System.out.println("Error. No es posible dividir entre cero.");
        }
    }

    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);

        System.out.print("Ingresa el numerador: ");
        String numerador = lectorTeclado.nextLine();

        System.out.print("Ingresa el denominador: ");
        String denominador = lectorTeclado.nextLine();

        procesarDivision(numerador, denominador);

        lectorTeclado.close();
    }
}