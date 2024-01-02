package com.example.Joker_Card;

import static com.example.Joker_Card.MainClass.Duplanje;
import static com.example.Joker_Card.MainClass.audio_count_1;
import static com.example.Joker_Card.MainClass.audio_count_100;
import static com.example.Joker_Card.MainClass.button_deal;
import static com.example.Joker_Card.MainClass.button_take;
import static com.example.Joker_Card.MainClass.c;
import static com.example.Joker_Card.MainClass.c1;
import static com.example.Joker_Card.MainClass.centar2;
import static com.example.Joker_Card.MainClass.cash;
import static com.example.Joker_Card.MainClass.dobitakdb;
import static com.example.Joker_Card.MainClass.doubling;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

public class TakingHalf extends Activity {
    Handler handler16;
    Handler handler14;
    Handler handler15;
    Runnable runnable16;
    Runnable runnable14;
    Runnable runnable15;
    Timer timer4;
    TimerTask task4;
    private double pola;
    private double deo;
    private double pola1;
    private double pola2;
    int countdown;
    TakingHalf() {
        button_take.setText(R.string.win_win);
        button_deal.setText(R.string.win_win);
        pola = (Math.floor(cash / 2));
        centar2.setText(R.string.win);
        centar2.setVisibility(View.VISIBLE);
        doubling = 0;
        countdown = 1;

        timer4 = new Timer();
        timer4.schedule(task4 = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> new Handler(Looper.getMainLooper()).postDelayed(
                        () -> {
                            if(cash == pola) {
                                handler16.removeCallbacks(runnable16);
                                centar2.setVisibility(View.VISIBLE);
                                timer4.cancel();
                                timer4.purge();
                            }
                        }, 0));
            }
        }, 0, 20);

        handler16 = new Handler();
        runnable16 = new Runnable() {
            boolean isVisible = true;
            @Override
            public void run() {
                isVisible = !isVisible;
                if(cash > 0) {
                    centar2.setVisibility(isVisible ? View.INVISIBLE : View.VISIBLE);
                    handler16.postDelayed(this, 400);
                }
            }
        };
        handler16.post(runnable16);

        if(cash < 200) {
            handler14 = new Handler();
            runnable14 = new Runnable() {
                @Override
                public void run() {
                    if(cash < 101) {
                        if(cash != pola) {
                            minusjedan();
                            handler14.postDelayed(this, 40);
                        }
                        else {
                            countdown = 0;
                            audio_count_100.start();
                            pobedio();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            handler14.removeCallbacks(runnable14);
                        }
                    }
                    else if(cash > 100 && cash < 200) {
                        pola1 = cash - 100;
                        prvideo();
                        handler14.postDelayed(this, 1000);
                    }

                }
            };
            handler14.post(runnable14);
        }
        else {
            deo = cash;
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
                        if(cash - pola > 99) {
                            minussto();
                            handler15.postDelayed(this, 1000);
                        }
                        else if(cash - pola > 0) {
                            pola2 = cash - pola;
                            drugideo();
                            handler15.postDelayed(this, 1000);
                        }
                        else if(cash - pola == 0) {
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
        cash -= 1;
        dobitakdb.setText(Integer.toString(cash));
        audio_count_1.start();
    }
    void minussto() {
        c += 100;
        c1.setText(Integer.toString(c));
        cash -= 100;
        dobitakdb.setText(Integer.toString(cash));
        audio_count_100.start();
    }
    void prvideo() {
        c += pola1;
        c1.setText(Integer.toString(c));
        cash -= pola1;
        deo = cash;
        dobitakdb.setText(Integer.toString(cash));
        audio_count_100.start();
    }
    void drugideo() {
        c += pola2;
        c1.setText(Integer.toString(c));
        cash -= pola2;
        dobitakdb.setText(Integer.toString(cash));
        audio_count_100.start();
    }
    void pobedio() {
        handler16.removeCallbacks(runnable16);
        centar2.setVisibility(View.INVISIBLE);
        doubling = 1;
        button_take.setText(R.string.take_all);
        button_deal.setText(R.string.take_half);
        Duplanje();
    }
}
