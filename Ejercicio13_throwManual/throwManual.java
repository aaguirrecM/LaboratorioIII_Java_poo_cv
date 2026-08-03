package Ejercicio13_throwManual;

import java.util.Scanner;

public class throwManual { 
    public static void main(String[] args) {
        Scanner lectorTeclado = new Scanner(System.in);
        System.out.print("Ingresa la temperatura en Celsius (no menor a -273.15 °C): ");
        
        try {
            double temp = Double.parseDouble(lectorTeclado.nextLine());
            
            if (temp < -273.15) {
                throw new IllegalArgumentException("Temperatura físicamente imposible.");
            }
            
            System.out.println("Temperatura registrada correctamente: " + temp + " °C");
            
        } catch (NumberFormatException e) {
            System.out.println("Error. Ingresa un valor numérico válido.");
        } catch (IllegalArgumentException e) { 
            System.out.println("Error de validación: " + e.getMessage());
        } finally {
            lectorTeclado.close();
        }
    }
}
