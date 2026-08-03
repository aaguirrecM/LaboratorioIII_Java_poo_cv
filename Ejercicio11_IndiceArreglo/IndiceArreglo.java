package Ejercicio11_IndiceArreglo;

import java.util.Scanner;

public class IndiceArreglo {
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        String[] productos = {"Laptop", "Mouse", "Teclado", "Monitor"};

        System.out.println("Índices disponibles: 0 a " + (productos.length - 1));
        System.out.print("Ingresa el índice del producto que deseas consultar: ");

        try {
            int indice = Integer.parseInt(lectorTeclado.nextLine());
            System.out.println("Producto encontrado: " + productos[indice]);

        } catch (NumberFormatException e) {
            System.out.println("Error. Debes ingresar un número entero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error de rango. El índice solicitado no existe en el arreglo.");
        } finally {
            lectorTeclado.close();
        }
    }
}