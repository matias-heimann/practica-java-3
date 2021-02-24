package com.company.tm;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1970;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public Fecha(Fecha f) {
        this.dia = f.dia;
        this.mes = f.mes;
        this.anio = f.anio;
    }

    public boolean isValid() {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        if(mes > 12 || dia > 31 || anio < 0 || mes < 1 || dia < 1) {
            return false;
        }

        if(dia == 31 && ((mes % 2 == 0 && mes < 7) || (mes % 2 == 1 && mes > 7))) {
            return false;
        }

        if(dia == 30 && mes == 2){
            return false;
        }

        if(dia == 29 && mes == 2 && !gregorianCalendar.isLeapYear(anio)){
            return false;
        }

        return true;
    }

    public void nextDay() {
        if(isValid()){
            GregorianCalendar gregorianCalendar = new GregorianCalendar(anio, mes - 1, dia);
            gregorianCalendar.add(Calendar.DAY_OF_MONTH, 1);
            this.dia = gregorianCalendar.get(Calendar.DAY_OF_MONTH);
            this.mes = gregorianCalendar.get(Calendar.MONTH) + 1;
            this.anio = gregorianCalendar.get(Calendar.YEAR);
        }
    }

    public int getAnio() {
        return anio;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }
}
