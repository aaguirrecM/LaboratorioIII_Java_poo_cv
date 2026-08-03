package Ejercicio12_CatchMultiples;
public class CatchMultiples {
    public static void main(String[] args) {
        try {
            int numerador = 0;
            int denominador = 0;

            System.out.println("Intentando realizar la operación: " + numerador + " / " + denominador);

            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error de depuración: Se detectó una división inválida entre cero. (" + e.getMessage() + ")");
        } catch (NumberFormatException e) {
            System.out.println("Error de depuración: Formato de número inválido. (" + e.getMessage() + ")");
        } catch (Exception e) {
            System.out.println("Error general no esperado: " + e.getMessage());
        }
    }
}