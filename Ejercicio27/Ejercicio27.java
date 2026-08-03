public class Ejercicio27 {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta("Sabrina Spellman", 1000.00);
        cuenta.mostrarSaldo();

        cuenta.depositar(500.00);
        cuenta.mostrarSaldo();

        try {
            cuenta.retirar(2000.00); 
        } catch (IllegalArgumentException e) {
            System.out.println("Error en transacción: " + e.getMessage());
        }

        cuenta.retirar(300.00);
        cuenta.mostrarSaldo();
    }
}