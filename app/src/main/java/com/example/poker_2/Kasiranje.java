package com.example.poker_2;

import static com.example.poker_2.First.audiocount100;
import static com.example.poker_2.First.audiointro;
import static com.example.poker_2.First.centar2;

import static java.lang.Thread.sleep;

import android.app.Activity;
import android.os.Handler;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class Kasiranje extends Activity {
    public static Handler handler9;
    public static Handler handler10;
    public static Runnable runnable9;
    public static Runnable runnable10;
    Kasiranje() {
        centar2.setText("POBEDIO !");
        centar2.setVisibility(View.VISIBLE);
        First.audiodobitnik.stop();

        handler9 = new Handler();
        runnable9 = new Runnable() {
            boolean isVisible1 = true;
            @Override
            public void run() {
                isVisible1 = !isVisible1;
                if(First.cifra > 0) {
                    centar2.setVisibility(isVisible1 ? View.INVISIBLE : View.VISIBLE);
                    handler9.postDelayed(this, 400);
                }
            }
        };
        handler9.post(runnable9);

        handler10 = new Handler();
        runnable10 = new Runnable() {
            @Override
            public void run() {
                if(First.cifra > 0) {
                    try {
                        minusjedan();
                        handler10.postDelayed(this, 60);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else {
                    audiocount100.start();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    First.kasiranje = 0;
                    centar2.setVisibility(View.VISIBLE);
                    First.polje1.setImageResource(R.drawable.k53);
                    First.polje2.setImageResource(R.drawable.k53);
                    First.polje3.setImageResource(R.drawable.k53);
                    First.polje4.setImageResource(R.drawable.k53);
                    First.polje5.setImageResource(R.drawable.k53);
                    First.stop1.setVisibility(View.VISIBLE);
                    First.stop2.setVisibility(View.VISIBLE);
                    First.stop3.setVisibility(View.VISIBLE);
                    First.stop4.setVisibility(View.VISIBLE);
                    First.stop5.setVisibility(View.VISIBLE);
                    First.table.setVisibility(View.INVISIBLE);
                    First.dobitak.setVisibility(View.INVISIBLE);
                    First.dobitak1.setVisibility(View.INVISIBLE);
                    First.dobitak2.setVisibility(View.INVISIBLE);
                    First.dobitak3.setVisibility(View.INVISIBLE);
                    First.dobitak4.setVisibility(View.INVISIBLE);
                    First.dobitak5.setVisibility(View.INVISIBLE);
                    First.dobitak6.setVisibility(View.INVISIBLE);
                    First.dobitak7.setVisibility(View.INVISIBLE);
                    First.dobitak8.setVisibility(View.INVISIBLE);
                    First.dobitak9.setVisibility(View.INVISIBLE);
                    First.dobitak10.setVisibility(View.INVISIBLE);
                    First.dobitakdb.setVisibility(View.INVISIBLE);
                    First.levodole2.setVisibility(View.INVISIBLE);
                    First.desnodole2.setVisibility(View.INVISIBLE);
                    handler9.removeCallbacks(runnable9);

                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    centar2.setText("");
                    centar2.setVisibility(View.INVISIBLE);

                    Dobitak2.dobitak = 0;
                    First.izbor = 0;
                    First.deljenje = 0;
                    Jokers.handler1.removeCallbacks(Jokers.runnable1);
                    Jokers.handler2.removeCallbacks(Jokers.runnable2);
                    Jokers.handler3.removeCallbacks(Jokers.runnable3);
                    Jokers.handler4.removeCallbacks(Jokers.runnable4);
                    Jokers.handler5.removeCallbacks(Jokers.runnable5);
                    Jokers.handler6.removeCallbacks(Jokers.runnable6);
                    Jokers.handler7.removeCallbacks(Jokers.runnable7);
                    Jokers.handler8.removeCallbacks(Jokers.runnable8);
                    handler10.removeCallbacks(runnable10);
                    new Jokers();
                }
            }
        };
        handler10.post(runnable10);
    }
    public void minusjedan() throws InterruptedException {
        First.c +=1;
        First.c1.setText(Integer.toString(First.c));
        First.cifra -=1;
        First.dobitakdb.setText(Integer.toString(First.cifra));
        First.audiocount1.start();
        if(First.cifra == 0) {
            centar2.setText("POBEDIO !");
            centar2.setVisibility(View.VISIBLE);
        }
    }
    public void minussto() {
        First.c +=100;
        First.c1.setText(Integer.toString(First.c));
        First.cifra -=100;
        First.dobitakdb.setText(Integer.toString(First.cifra));
        audiocount100.start();
    }
}
