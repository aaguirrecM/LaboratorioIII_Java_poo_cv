package Ejercicio34;
public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo negativo no permitido");
        }
        this.saldo = saldoInicial;
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
