package com.example.Joker_Card;

import static com.example.Joker_Card.First.Duplanje;
import static com.example.Joker_Card.First.audiocount1;
import static com.example.Joker_Card.First.audiocount100;
import static com.example.Joker_Card.First.button_deal;
import static com.example.Joker_Card.First.button_take;
import static com.example.Joker_Card.First.c;
import static com.example.Joker_Card.First.c1;
import static com.example.Joker_Card.First.centar2;
import static com.example.Joker_Card.First.cifra;
import static com.example.Joker_Card.First.dobitakdb;
import static com.example.Joker_Card.First.duplanje;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class Polovina extends Activity {
    public static Handler handler0;
    Handler handler14;
    Handler handler15;
    public static Runnable runnable0;
    Runnable runnable14;
    Runnable runnable15;
    Timer timer4;
    TimerTask task4;
    private double pola;
    private double deo;
    private double pola1;
    private double pola2;
    int countdown;
    Polovina() {
        button_take.setText("WIN !");
        button_deal.setText("WIN !");
        pola = (Math.floor(cifra / 2));
        centar2.setText("YOU WIN !");
        centar2.setVisibility(View.VISIBLE);
        duplanje = 0;
        countdown = 1;

        timer4 = new Timer();
        timer4.schedule(task4 = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> new Handler(Looper.getMainLooper()).postDelayed(
                        () -> {
                            if(cifra == pola) {
                                handler0.removeCallbacks(runnable0);
                                centar2.setVisibility(View.VISIBLE);
                                timer4.cancel();
                                timer4.purge();
                            }
                        }, 0));
            }
        }, 0, 20);

        handler0 = new Handler();
        runnable0 = new Runnable() {
            boolean isVisible = true;
            @Override
            public void run() {
                isVisible = !isVisible;
                if(cifra > 0) {
                    centar2.setVisibility(isVisible ? View.INVISIBLE : View.VISIBLE);
                    handler0.postDelayed(this, 400);
                }
            }
        };
        handler0.post(runnable0);

        if(cifra < 200) {
            handler14 = new Handler();
            runnable14 = new Runnable() {
                @Override
                public void run() {
                    if(cifra < 101) {
                        if(cifra != pola) {
                            minusjedan();
                            handler14.postDelayed(this, 40);
                        }
                        else {
                            countdown = 0;
                            //handler14.postDelayed(this, 1000);
                            audiocount100.start();
                            pobedio();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            handler14.removeCallbacks(runnable14);
                        }
                    }
                    else if(cifra > 100 && cifra < 200) {
                        pola1 = cifra - 100;
                        prvideo();
                        handler14.postDelayed(this, 1000);
                    }

                }
            };
            handler14.post(runnable14);
        }
        else {
            deo = cifra;
            handler15 = new Handler();
            runnable15 = new Runnable() {
                @Override
                public void run() {
                    if((Math.floor(deo/100)) != (deo/100)) {
                        pola1 = Math.round(((deo/100)-(Math.floor(deo/100))) * 100);
                        prvideo();
                        handler15.postDelayed(this, 1000);
                    }
                    else {
                        if(cifra - pola > 99) {
                            minussto();
                            handler15.postDelayed(this, 1000);
                        }
                        else if(cifra - pola > 0) {
                            pola2 = cifra - pola;
                            drugideo();
                            handler15.postDelayed(this, 1000);
                        }
                        else if(cifra - pola == 0) {
                            handler15.postDelayed(this, 1000);
                            pobedio();
                            handler15.removeCallbacks(runnable15);
                        }
                    }
                }
            };
            handler15.post(runnable15);
        }
    }
    void minusjedan() {
        c += 1;
        c1.setText(Integer.toString(c));
        cifra -= 1;
        dobitakdb.setText(Integer.toString(cifra));
        audiocount1.start();
    }
    void minussto() {
        c += 100;
        c1.setText(Integer.toString(c));
        cifra -= 100;
        dobitakdb.setText(Integer.toString(cifra));
        audiocount100.start();
    }
    void prvideo() {
        c += pola1;
        c1.setText(Integer.toString(c));
        cifra -= pola1;
        deo = cifra;
        dobitakdb.setText(Integer.toString(cifra));
        audiocount100.start();
    }
    void drugideo() {
        c += pola2;
        c1.setText(Integer.toString(c));
        cifra -= pola2;
        dobitakdb.setText(Integer.toString(cifra));
        audiocount100.start();
    }
    void pobedio() {
        centar2.setVisibility(View.INVISIBLE);
        duplanje = 1;
        button_take.setText("TAKE ALL");
        button_deal.setText("TAKE HALF");
        Duplanje();
    }
}
