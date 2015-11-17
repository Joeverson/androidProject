package br.edu.ifpb.dup.arrocha;

import android.util.Log;

import java.util.Random;
import java.util.prefs.Preferences;

/**
 * Created by admin on 17/11/15.
 */

public class ProcessingNumber {
    private int limitUp = 0;
    private int limitDown = 0;
    private int its = 0;

    public ProcessingNumber(){
        Random n = new Random();
        int i = 0;

        while(i < 3){
            if(n.nextInt(100) > limitUp)
                limitUp = n.nextInt(100);
            else if(n.nextInt(100) < limitDown)
                limitDown = n.nextInt(100);
            else if(n.nextInt(100) < limitUp & n.nextInt(100) > limitDown){
                its = n.nextInt(100);
            }
        }

    }


    public int getLimitUp() {
        return limitUp;
    }

    public int getIts() {
        return its;
    }

    public int getLimitDown() {
        return limitDown;
    }


    public boolean playing(int number){

       try{
           if(this.verify(number)){
               Log.w("testAPP", "Up: " + this.limitUp);
               Log.w("testAPP", "Down: " + this.limitUp);
               Log.w("testAPP", "ESSE: " + this.limitUp);
               return true;
           }else{
               return false;
           }
       }catch(Exception e){
           e.getMessage();
       }

        return false;
    }


    private boolean verify(int n) throws Exception{
        if(n > this.limitDown && n < this.limitUp && n != this.its){ //quando ele ta na margin mas náo acertou
            alterIntervalo(n);
            return true;
        }else if(n <= this.limitDown || n >= this.limitUp){ // fora das margens
            return false;
        }

        return false;
    }

    private void alterIntervalo(int n){
        if(this.its > n)
            this.limitDown = n;
        else if(this.its < n)
            this.limitUp = n;
    }

}
