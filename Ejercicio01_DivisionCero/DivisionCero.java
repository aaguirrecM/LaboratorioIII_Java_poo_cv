package Ejercicio01_DivisionCero;

public class DivisionCero {
    public static void main(String[] args) {
        int numerador = 10;
        int denominador = 0;

        try {
            int resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        } catch (ArithmeticException excepcionDivision) {
            System.out.println("Error. No es posible dividir un número entre cero.");
        }
    }
}