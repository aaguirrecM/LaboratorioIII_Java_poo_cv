package Ejercicio27;
public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser mayor a cero.");
        }
        saldo += monto;
        System.out.println("Depósito exitoso de Q" + monto);
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser mayor a cero.");
        }
        if (monto > saldo) {
            throw new IllegalArgumentException("Fondos insuficientes. Saldo actual: Q" + saldo);
        }
        saldo -= monto;
        System.out.println("Retiro exitoso de Q" + monto);
    }

    public void mostrarSaldo() {
        System.out.printf("Titular: %s | Saldo Disponible: Q%.2f%n", titular, saldo);
    }
}