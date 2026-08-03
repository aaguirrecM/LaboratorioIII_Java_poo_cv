package Ejercicio14_ExcepcionPersonalizada;

public class PruebaExcepcion {
    public static void main(String[] args) {
        try {
            System.out.println("Iniciando prueba de excepción personalizada...");
            throw new MiExcepcion("Se ha producido un error personalizado de prueba.");

        } catch (MiExcepcion e) {
            System.out.println("Excepción personalizada capturada: " + e.getMessage());
        }
    }
}
