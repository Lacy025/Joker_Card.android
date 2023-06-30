package com.example.poker_2;

import static com.example.poker_2.First.audiocount1;
import static com.example.poker_2.First.audiocount100;
import static com.example.poker_2.First.audiodobitnik;
import static com.example.poker_2.First.audiointro;
import static com.example.poker_2.First.button_deal;
import static com.example.poker_2.First.centar2;
import static com.example.poker_2.First.cifra;

import android.app.Activity;
import android.os.Handler;
import android.view.View;

public class Kasiranje extends Activity {
    public static Handler handler9;
    public static Handler handler10;
    public static Runnable runnable9;
    public static Runnable runnable10;
    Kasiranje() throws InterruptedException {
        int pobeda = cifra;
        centar2.setText("YOU WIN !");
        centar2.setVisibility(View.VISIBLE);
        if(First.cifra>9999) {
            First.izbor = 3;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else{
            audiodobitnik.reset();
            audiodobitnik.release();
            audiodobitnik = null;
        }

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

        minusjedan();
        Thread.sleep(40);

        handler10 = new Handler();
        runnable10 = new Runnable() {
            @Override
            public void run() {
                double x1 = cifra;
                if(((int)(x1/100) * 100) != ((x1/100) * 100)) {
                    minusjedan();
                    handler10.postDelayed(this, 40);
                }
                else if((((int)(x1/100) * 100) == ((x1/100) * 100)) && x1 > 0) {
                    minussto();
                    handler10.postDelayed(this, 1000);
                }
                else  {
                    if(pobeda < 101) {
                        audiocount100.start();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    audiointro.start();
                    First.kasirano = 1;
                }
            }
        };
        handler10.post(runnable10);
    }
    void minusjedan() {
        First.c +=1;
        First.c1.setText(Integer.toString(First.c));
        First.cifra -=1;
        First.dobitakdb.setText(Integer.toString(First.cifra));
        audiocount1.start();
        if(First.cifra == 0) {
            pobedio();
            button_deal.setText("DEAL CARDS");
        }
    }
    void minussto() {
        First.c +=100;
        First.c1.setText(Integer.toString(First.c));
        First.cifra -=100;
        First.dobitakdb.setText(Integer.toString(First.cifra));
        audiocount100.start();
        if(First.cifra == 0) {
            pobedio();
            button_deal.setText("DEAL CARDS");
        }
    }
    void pobedio() {
        centar2.setText("YOU WIN !");
        centar2.setVisibility(View.VISIBLE);
    }
}
