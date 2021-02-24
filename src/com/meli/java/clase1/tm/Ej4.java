package com.meli.java.clase1.tm;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese n");
        int n = s.nextInt();

        int count = 0;
        int i = 2;

        while(count < n){
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
            i++;
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
