package com.meli.java.clase3.tt;

import java.util.concurrent.TimeUnit;

public class TimerMain {
    public static void main(String[] args) {
        try {
            Timer timer = new Timer();
            timer.start();
            Thread.sleep(1000);
            timer.stop();
            System.out.println(timer.elapsedTime());
        }
        catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }
    }
}
