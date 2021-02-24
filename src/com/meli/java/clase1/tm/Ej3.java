package com.meli.java.clase1.tm;

import com.meli.java.clase3.tm.Main;

import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese n");
        int n = s.nextInt();

        if(n == 0 || n == 1){
            System.out.println("No");
        }
        else {
            System.out.println((isPrime(n) ? "Si" : "No"));
        }

    }

    public static boolean isPrime(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }


}
