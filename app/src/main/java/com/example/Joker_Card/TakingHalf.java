package com.example.Joker_Card;

import static com.example.Joker_Card.MainClass.Doubling;
import static com.example.Joker_Card.MainClass.audio_count_1;
import static com.example.Joker_Card.MainClass.audio_count_100;
import static com.example.Joker_Card.MainClass.button_deal;
import static com.example.Joker_Card.MainClass.button_take;
import static com.example.Joker_Card.MainClass.c;
import static com.example.Joker_Card.MainClass.c1;
import static com.example.Joker_Card.MainClass.center_2;
import static com.example.Joker_Card.MainClass.cash;
import static com.example.Joker_Card.MainClass.winning_value;
import static com.example.Joker_Card.MainClass.doubling;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

import java.util.Locale;
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
    private final double half;
    private double deo;
    private double half_1;
    private double half_2;
    int countdown;
    TakingHalf() {
        button_take.setText(R.string.win_win);
        button_deal.setText(R.string.win_win);
        half = Math.floor(cash / 2);  //DON'T CHANGE !
        center_2.setText(R.string.win);
        center_2.setVisibility(View.VISIBLE);
        doubling = 0;
        countdown = 1;

        timer4 = new Timer();
        timer4.schedule(task4 = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> new Handler(Looper.getMainLooper()).postDelayed(
                        () -> {
                            if(cash == half) {
                                handler16.removeCallbacks(runnable16);
                                center_2.setVisibility(View.VISIBLE);
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
                    center_2.setVisibility(isVisible ? View.INVISIBLE : View.VISIBLE);
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
                        if(cash != half) {
                            minus_1();
                            handler14.postDelayed(this, 40);
                        }
                        else {
                            countdown = 0;
                            audio_count_100.start();
                            winner();
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }
                            handler14.removeCallbacks(runnable14);
                        }
                    }
                    else if(cash < 200) {
                        half_1 = cash - 100;
                        first_part();
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
                        half_1 = Math.round(((deo/100)-(Math.floor(deo/100))) * 100);
                        first_part();
                        handler15.postDelayed(this, 1000);
                    }
                    else {
                        if(cash - half > 99) {
                            minus_100();
                            handler15.postDelayed(this, 1000);
                        }
                        else if(cash - half > 0) {
                            half_2 = cash - half;
                            second_part();
                            handler15.postDelayed(this, 1000);
                        }
                        else if(cash - half == 0) {
                            handler15.postDelayed(this, 1000);
                            winner();
                            handler15.removeCallbacks(runnable15);
                        }
                    }
                }
            };
            handler15.post(runnable15);
        }
    }
    void minus_1() {
        c += 1;
        c1.setText(String.format(Locale.getDefault(), "%d", (c)));
        cash -= 1;
        winning_value.setText(String.format(Locale.getDefault(), "%d", (cash)));
        audio_count_1.start();
    }
    void minus_100() {
        c += 100;
        c1.setText(String.format(Locale.getDefault(), "%d", (c)));
        cash -= 100;
        winning_value.setText(String.format(Locale.getDefault(), "%d", (cash)));
        audio_count_100.start();
    }
    void first_part() {
        c += half_1;
        c1.setText(String.format(Locale.getDefault(), "%d", (c)));
        cash -= half_1;
        deo = cash;
        winning_value.setText(String.format(Locale.getDefault(), "%d", (cash)));
        audio_count_100.start();
    }
    void second_part() {
        c += half_2;
        c1.setText(String.format(Locale.getDefault(), "%d", (c)));
        cash -= half_2;
        winning_value.setText(String.format(Locale.getDefault(), "%d", (cash)));
        audio_count_100.start();
    }
    void winner() {
        handler16.removeCallbacks(runnable16);
        center_2.setVisibility(View.INVISIBLE);
        doubling = 1;
        button_take.setText(R.string.take_all);
        button_deal.setText(R.string.take_half);
        Doubling();
    }
}
