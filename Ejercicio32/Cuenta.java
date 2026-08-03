package Ejercicio32;
public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        this.saldo += monto;
        System.out.println("Saldo actual: " + this.saldo);
    }
}