package org.example;

public class Cuenta {
    private float saldo;
    private int numeroDeRetiros = 0;
    private float tasaAnual;
    private float comisionMensual = 0;
    private int numeroDeConsignaciones = 0;

    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }

    public void Consignar(float cantidad) {
        saldo += cantidad;
        numeroDeConsignaciones++;
    }

    public void Retirar(float cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            numeroDeRetiros++;
        } else {
            throw new IllegalArgumentException("El monto a retirar excede el saldo.");
        }
    }

    public void calcularInteres() {
        float interesMensual = saldo * (tasaAnual / 12) / 100;
        saldo -= interesMensual;
    }
    public void ExtractoMensual() {
        calcularInteres();
        saldo -= comisionMensual;
    }

    public void Imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de Retiros: " + numeroDeRetiros);
        System.out.println("Tasa Anual (%): " + tasaAnual);
        System.out.println("Comisión Mensual: " + comisionMensual);
    }

    public float getSaldo() {
        return saldo;
    }

    public float getComisionmensual() {
        return comisionMensual;
    }

    public void setComisionmensual(float comisionMensual) {
        this.comisionMensual = comisionMensual;
    }

    public int getNumerodetransacciones() {
        return numeroDeConsignaciones + numeroDeRetiros;
    }

    public int getNumeroderetiros() {
        return numeroDeRetiros;
    }
    public void setNumeroDeRetiros(int cantidad){
        numeroDeRetiros+=cantidad;
    }

    public void setNumeroDeConsignaciones(int numeroDeConsignaciones) {
        this.numeroDeConsignaciones = numeroDeConsignaciones;
    }

    public int getNumeroDeConsignaciones() {
        return numeroDeConsignaciones;
    }

    public void setSaldo(float nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }

    public float getTasaAnual() {
        return tasaAnual;
    }
}
