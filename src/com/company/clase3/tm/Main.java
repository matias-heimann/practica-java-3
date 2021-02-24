package com.company.clase3.tm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Persona p1 = new Persona("nombre 1", 1);
        Persona p2 = new Persona("nombre 2", 3);
        Persona p3 = new Persona("nombre 3", 2);
        Persona p4 = new Persona("nombre 4", 6);
        Persona p5 = new Persona("nombre 5", 4);

        Persona personas[] = new Persona[5];
        personas[0] = p1;
        personas[1] = p2;
        personas[2] = p3;
        personas[3] = p4;
        personas[4] = p5;

        SortUtil.ordenar(personas);
        Arrays.stream(personas).forEach(i -> System.out.println(i));
    }
}
