package Ejercicio02_ValidarEntrada;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidarEntrada {
    public static void main(String[] args) {
        Scanner lectorEntrada = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número entero: ");
            // Si el usuario ingresa letras en lugar de números, se dispara el catch
            int numeroIngresado = lectorEntrada.nextInt();
            System.out.println("Validación exitosa. Ingresaste el número: " + numeroIngresado);
            
        } catch (InputMismatchException excepcionTipoFormato) {
            System.out.println("Error de entrada: Debes ingresar únicamente números enteros, no texto.");
            
        } finally {
            // Cerramos el recurso Scanner de forma segura
            lectorEntrada.close();
        }
    }
}