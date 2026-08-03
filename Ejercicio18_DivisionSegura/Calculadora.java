package Ejercicio18_DivisionSegura;

public class Calculadora {
    public static double dividir(double dividendo, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("No es posible dividir entre cero.");
        }
        return dividendo / divisor;
    }
}