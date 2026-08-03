package Ejercicio33;
public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        this.saldo += monto;
    }

    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Fondos insuficientes. Saldo disponible: Q" + this.saldo);
        } else {
            this.saldo -= monto;
            System.out.println("Retiro exitoso. Saldo actual: Q" + this.saldo);
        }
    }
}
