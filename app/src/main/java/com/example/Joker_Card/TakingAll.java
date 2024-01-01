package com.example.Joker_Card;

import static com.example.Joker_Card.MainClass.audiocount1;
import static com.example.Joker_Card.MainClass.audiocount100;
import static com.example.Joker_Card.MainClass.audiodobitnik;
import static com.example.Joker_Card.MainClass.audiointro;
import static com.example.Joker_Card.MainClass.button_deal;
import static com.example.Joker_Card.MainClass.button_take;
import static com.example.Joker_Card.MainClass.centar2;
import static com.example.Joker_Card.MainClass.cifra;
import static com.example.Joker_Card.MainClass.duplanje;
import static com.example.Joker_Card.MainClass.kasirano;
import static com.example.Joker_Card.MainClass.dobitakdb;
import static com.example.Joker_Card.MainClass.c;
import static com.example.Joker_Card.MainClass.c1;

import android.app.Activity;
import android.os.Handler;
import android.view.View;

public class TakingAll extends Activity {
    public static Handler handler9;
    public static Handler handler10;
    public static Runnable runnable9;
    public static Runnable runnable10;
    TakingAll() throws InterruptedException {

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
