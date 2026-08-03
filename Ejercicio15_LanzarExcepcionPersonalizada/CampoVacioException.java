package Ejercicio15_LanzarExcepcionPersonalizada;

public class CampoVacioException extends Exception {
    public CampoVacioException(String mensaje) {
        super(mensaje);
    }
}