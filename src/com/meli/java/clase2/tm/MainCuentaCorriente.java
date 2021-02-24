package com.meli.java.clase2.tm;

public class MainCuentaCorriente {

    public static void main(String[] args) {
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(1);
        CuentaCorriente cuentaCorriente2 = new CuentaCorriente(2);

        cuentaCorriente1.ingreso(10.0);
        cuentaCorriente1.egreso(5.0);
        cuentaCorriente1.reintegro();
        cuentaCorriente1.transferencia(cuentaCorriente2, 2.0);
        System.out.println("El saldo de la cuenta 1 es de: " + cuentaCorriente1.getSaldo());
        System.out.println("El saldo de la cuenta 2 es de: " + cuentaCorriente2.getSaldo());

    }

}
