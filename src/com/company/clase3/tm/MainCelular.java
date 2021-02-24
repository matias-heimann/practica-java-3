package com.company.clase3.tm;

import java.util.Arrays;

public class MainCelular {
    public static void main(String[] args) {
        Celular c1 = new Celular("p1", "+54114343");
        Celular c2 = new Celular("p2", "+11542244");
        Celular c3 = new Celular("p3", "+11145664");
        Celular c4 = new Celular("p4", "+45614685");

        Celular celulares[] = new Celular[4];
        celulares[0] = c1;
        celulares[1] = c2;
        celulares[2] = c3;
        celulares[3] = c4;

        SortUtil.ordenar(celulares);

        Arrays.stream(celulares).forEach(i -> System.out.println(i));
    }
}
