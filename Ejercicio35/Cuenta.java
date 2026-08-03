package Ejercicio35;
public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("Saldo negativo");
        }
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) { 
        this.saldo += monto; 
    }
    
    public void retirar(double monto) {
        if (monto <= saldo) {
            this.saldo -= monto;
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: Q" + this.saldo);
    }
}
