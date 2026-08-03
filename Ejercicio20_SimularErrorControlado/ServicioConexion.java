package Ejercicio20_SimularErrorControlado;

public class ServicioConexion {
    public static void conectar(boolean forzarError) {
        if (forzarError) {
            throw new IllegalStateException("Error 500: Fallo simulado en el establecimiento de conexión.");
        }
        System.out.println("Conexión con el servicio establecida correctamente.");
    }
}