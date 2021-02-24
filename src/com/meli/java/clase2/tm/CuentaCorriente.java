package com.meli.java.clase2.tm;

public class CuentaCorriente {

    private int dni;
    private double saldo;
    private double ultimoEgreso;

    public CuentaCorriente(int dni) {
        this.dni = dni;
    }

    public CuentaCorriente(CuentaCorriente cuentaCorriente) {
        this.dni = cuentaCorriente.dni;
        this.saldo = cuentaCorriente.saldo;
        this.ultimoEgreso = cuentaCorriente.ultimoEgreso;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setUltimoEgreso(double ultimoEgreso) {
        this.ultimoEgreso = ultimoEgreso;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getUltimoEgreso() {
        return ultimoEgreso;
    }

    public int getDni() {
        return dni;
    }

    public void ingreso(double valor) {
        if(valor > 0) {
            this.saldo += valor;
        }
        System.out.println("Se ingreso a la cuenta $" + valor);
    }

    public void egreso(double valor) {
        if(valor > 0) {
            this.saldo -= valor;
            this.ultimoEgreso = valor;
        }
        System.out.println("Se retiraron de la cuenta $" + valor);
    }

    public void reintegro() {
        System.out.println("Se reintegro a la cuenta $" + ultimoEgreso);
        if(ultimoEgreso != 0) {
           this.ingreso(ultimoEgreso);
            this.ultimoEgreso = 0;
        }
    }

    public void transferencia(CuentaCorriente cuentaCorriente, double valor){
        if(valor > 0) {
            this.saldo -= valor;
            cuentaCorriente.ingreso(valor);
        }
        System.out.println("Se transfirio a " + cuentaCorriente.getDni() + " la suma de $" + valor);
    }

}
