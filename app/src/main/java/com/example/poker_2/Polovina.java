package com.example.poker_2;

import static com.example.poker_2.First.Duplanje;
import static com.example.poker_2.First.audiocount1;
import static com.example.poker_2.First.audiocount100;
import static com.example.poker_2.First.audiodobitnik;
import static com.example.poker_2.First.audiointro;
import static com.example.poker_2.First.button_deal;
import static com.example.poker_2.First.button_take;
import static com.example.poker_2.First.c;
import static com.example.poker_2.First.c1;
import static com.example.poker_2.First.centar2;
import static com.example.poker_2.First.cifra;
import static com.example.poker_2.First.dobitakdb;
import static com.example.poker_2.First.duplanje;
import static com.example.poker_2.First.kasirano;

import android.app.Activity;
import android.os.Handler;
import android.view.View;

public class Polovina extends Activity {
    Handler handler11;
    Handler handler12;
    Handler handler13;
    Runnable runnable11;
    Runnable runnable12;
    Runnable runnable13;
    private double pola;
    private double deo;
    private double pola1;
    private double pola2;
    Polovina() {
        button_take.setText("WIN !");
        button_deal.setText("WIN !");
        pola = (Math.floor(cifra / 2));
        centar2.setText("YOU WIN !");
        centar2.setVisibility(View.VISIBLE);
        duplanje = 0;

        handler11 = new Handler();
        runnable11 = new Runnable() {
            boolean isVisible = true;
            @Override
            public void run() {
                isVisible = !isVisible;
                if(cifra > 0) {
                    centar2.setVisibility(isVisible ? View.INVISIBLE : View.VISIBLE);
                    handler11.postDelayed(this, 400);
                }
            }
        };
        handler11.post(runnable11);

        if(cifra < 200) {
            handler12 = new Handler();
            runnable12 = new Runnable() {
                @Override
                public void run() {
                    if(cifra < 101) {
                        if(cifra != pola) {
                            minusjedan();
                            handler12.postDelayed(this, 40);
                        }
                        else {
                            centar2.setVisibility(View.VISIBLE);
                            handler12.postDelayed(this, 1000);
                            audiocount100.start();
                            pobedio();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            handler12.removeCallbacks(runnable12);
                        }
                    }
                    else if(cifra > 100 && cifra < 200) {
                        pola1 = cifra - 100;
                        prvideo();
                        handler12.postDelayed(this, 1000);
                    }

                }
            };
            handler12.post(runnable12);
        }
        else {
            deo = cifra;
            handler13 = new Handler();
            runnable13 = new Runnable() {
                @Override
                public void run() {
                    if((Math.floor(deo/100)) != (deo/100)) {
                        pola1 = Math.round(((deo/100)-(Math.floor(deo/100))) * 100);
                        prvideo();
                        handler13.postDelayed(this, 1000);
                    }
                    else {
                        if(cifra - pola > 99) {
                            minussto();
                            handler13.postDelayed(this, 1000);
                        }
                        else if(cifra - pola > 0) {
                            pola2 = cifra - pola;
                            drugideo();
                            handler13.postDelayed(this, 1000);
                        }
                        else if(cifra - pola == 0) {
                            handler13.postDelayed(this, 1000);
                            pobedio();
                            handler13.removeCallbacks(runnable13);
                        }
                    }
                }
            };
            handler13.post(runnable13);
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
        handler11.removeCallbacks(runnable11);
        centar2.setVisibility(View.VISIBLE);
        duplanje = 1;
        button_take.setText("TAKE ALL");
        button_deal.setText("TAKE HALF");
        Duplanje();
    }
}
