package Ejercicio15_LanzarExcepcionPersonalizada;

public class ValidadorFormulario {
    public static void validarCampoNombre(String nombre) throws CampoVacioException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new CampoVacioException("El campo 'Nombre' es obligatorio y no puede estar vacío.");
        }
    }
}