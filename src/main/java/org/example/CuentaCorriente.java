package org.example;

public class CuentaCorriente extends Cuenta {
    public float sobregiro = 0;

    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    @Override
    public void Retirar(float cantidad) {
        float resultado =getSaldo()-cantidad;
        if (resultado < 0) {
            this.sobregiro = (this.sobregiro + resultado);
            setSaldo(0);
        } else {
            super.Retirar(cantidad);
        }
    }

    @Override
    public void Consignar(float cantidad) {
        float residuo = cantidad - this.sobregiro;
        if (this.sobregiro > 0) {
            if (residuo > 0) {
                this.sobregiro = 0;
                setSaldo(residuo);
            } else {
                this.sobregiro = residuo;
                setSaldo(0);
            }
        } else {
            super.Consignar(cantidad);
        }
    }

    @Override
    public void Imprimir() {
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Sobregiro: " + sobregiro);
        System.out.println("Número de transacciones: " + getNumerodetransacciones());
        System.out.println("Tasa Anual (%): " + getTasaAnual());
    }
}
