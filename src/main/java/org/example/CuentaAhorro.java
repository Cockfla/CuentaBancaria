package org.example;

public class CuentaAhorro extends Cuenta {
    private boolean activa;

    public CuentaAhorro(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        this.activa = saldo >= 15000;
    }

    @Override
    public void Consignar(float cantidad) {
        if (activa) {
            super.Consignar(cantidad);
        } else {
            throw new IllegalStateException("La cuenta no se encuentra activa.");
        }
    }

    @Override
    public void Retirar(float cantidad) {
        if (activa) {
            super.Retirar(cantidad);
        } else {
            throw new IllegalStateException("La cuenta no se encuentra activa.");
        }
    }

    @Override
    public void Imprimir() {
        System.out.println("Saldo: $" + getSaldo());
        System.out.println("Comisión mensual: " + getComisionmensual());
        System.out.println("Número de transacciones: " + getNumerodetransacciones());
    }

    public void ExtractoMensual() {
        if (getNumeroderetiros() > 4) {
            setComisionmensual(getComisionmensual() + (getNumeroderetiros() - 4) * 1000);
        }
    }
}