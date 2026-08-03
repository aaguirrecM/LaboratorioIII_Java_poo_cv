package Ejercicio14_ExcepcionPersonalizada;

public class MiExcepcion extends Exception {
    public MiExcepcion(String mensaje) {
        super(mensaje);
    }
}