package org.example;

public class Main {
    public static void main(String[] args) {
        CuentaAhorro cuenta = new CuentaAhorro(15000, 5);
        cuenta.Imprimir(); //

        cuenta.Consignar(100000);
        cuenta.Imprimir();
        cuenta.Retirar(10000);
        cuenta.Retirar(10000);
        cuenta.Retirar(10000);

        cuenta.Retirar(10000);
        cuenta.Retirar(10000);
        cuenta.Retirar(10000);
        cuenta.Imprimir();

        cuenta.ExtractoMensual();
        cuenta.Imprimir();


        CuentaCorriente cuenta1 = new CuentaCorriente(1000, 5);
        cuenta1.Retirar(2000);
        cuenta1.Consignar(1500);
        cuenta1.Imprimir();
        cuenta1.ExtractoMensual();
        cuenta1.Imprimir();
    }
}