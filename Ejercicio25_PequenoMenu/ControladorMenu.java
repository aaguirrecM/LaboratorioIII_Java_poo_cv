package Ejercicio25_PequenoMenu;

public class ControladorMenu {
    public static boolean ejecutarOpcion(int opcion) {
        switch (opcion) {
            case 1:
                System.out.println("-> Estado del sistema: Operativo y sin fallos.");
                return true;
            case 2:
                System.out.println("-> Configuración: Parámetros por defecto cargados.");
                return true;
            case 3:
                System.out.println("-> Saliendo del programa...");
                return false; // Indicador para finalizar el bucle
            default:
                throw new IllegalArgumentException("La opción " + opcion + " no está disponible en el menú.");
        }
    }
}