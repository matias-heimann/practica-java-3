package com.meli.java.clase3.tt;

public class Timer {

    private long lastTimeStarted;
    private long getLastTimeEnded;
    private boolean wasSaved;

    public Timer(){
        this.lastTimeStarted = 0;
        this.getLastTimeEnded = 0;
        this.wasSaved = false;
    }

    public void start(){
        getLastTimeEnded = 0;
        if(!this.wasSaved){
            this.wasSaved = true;
            this.lastTimeStarted = System.currentTimeMillis();
        }
    }

    public void stop(){
        if(this.wasSaved){
            this.wasSaved = false;
            this.getLastTimeEnded = System.currentTimeMillis();
        }
    }

    public long elapsedTime(){
        if(this.getLastTimeEnded != 0 && !this.wasSaved){
            return getLastTimeEnded - lastTimeStarted;
        }
        return 0;
    }

}
