package com.example.poker_2;

import static com.example.poker_2.First.audiocount1;
import static com.example.poker_2.First.audiocount100;
import static com.example.poker_2.First.audiodobitnik;
import static com.example.poker_2.First.audiointro;
import static com.example.poker_2.First.biodobitak;
import static com.example.poker_2.First.blokada;
import static com.example.poker_2.First.button_deal;
import static com.example.poker_2.First.button_take;
import static com.example.poker_2.First.centar2;
import static com.example.poker_2.First.cifra;
import static com.example.poker_2.First.duplanje;
import static com.example.poker_2.First.izbor;
import static com.example.poker_2.First.kasirano;
import static com.example.poker_2.First.dobitakdb;
import static com.example.poker_2.First.c;
import static com.example.poker_2.First.c1;

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

        button_take.setText("WIN !");
        button_deal.setText("WIN !");
        centar2.setText("YOU WIN !");
        centar2.setVisibility(View.VISIBLE);

        if(cifra > 9999 && duplanje == 0) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            audiodobitnik.reset();
            audiodobitnik.release();
            audiodobitnik = null;
        }
        duplanje = 0;

        handler9 = new Handler();
        runnable9 = new Runnable() {
            boolean isVisible = true;
            @Override
            public void run() {
                isVisible = !isVisible;
                if(cifra > 0) {
                    centar2.setVisibility(isVisible ? View.INVISIBLE : View.VISIBLE);
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
                double kasa = cifra;
                if(((int)(kasa/100) * 100) != ((kasa/100) * 100)) {
                    minusjedan();
                    handler10.postDelayed(this, 40);
                }
                else if((((int)(kasa/100) * 100) == ((kasa/100) * 100)) && kasa > 0) {
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
                    kasirano = 1;
                }
            }
        };
        handler10.post(runnable10);
    }
    void minusjedan() {
        c += 1;
        c1.setText(Integer.toString(c));
        cifra -= 1;
        dobitakdb.setText(Integer.toString(cifra));
        audiocount1.start();
        if(cifra == 0) {
            pobedio();
            button_deal.setText("DEAL CARDS");
        }
    }
    void minussto() {
        c += 100;
        c1.setText(Integer.toString(c));
        cifra -= 100;
        dobitakdb.setText(Integer.toString(cifra));
        audiocount100.start();
        if(cifra == 0) {
            pobedio();
            button_deal.setText("DEAL CARDS");
        }
    }
    void pobedio() {
        centar2.setText("YOU WIN !");
        centar2.setVisibility(View.VISIBLE);
    }
}
