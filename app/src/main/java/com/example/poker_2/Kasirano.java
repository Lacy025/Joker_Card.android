package com.example.poker_2;

import android.app.Activity;
import android.os.Handler;
import android.view.View;

public class Kasirano extends Activity {
    public static Handler handler9;
    public static Runnable runnable9;

    Kasirano() {

        handler9 = new Handler();
        runnable9 = () -> {
                if(First.kasiranje == 1) {
                    First.deljenje = 0;
                    First.kasirano = 0;
                    First.kasiranje = 0;
                    First.biodobitak = 0;
                    First.izbor = 0;
                    Jokers.handler1.removeCallbacks(Jokers.runnable1);
                    Jokers.handler2.removeCallbacks(Jokers.runnable2);
                    Jokers.handler3.removeCallbacks(Jokers.runnable3);
                    Jokers.handler4.removeCallbacks(Jokers.runnable4);
                    Jokers.handler5.removeCallbacks(Jokers.runnable5);
                    Jokers.handler6.removeCallbacks(Jokers.runnable6);
                    Jokers.handler7.removeCallbacks(Jokers.runnable7);
                    Jokers.handler8.removeCallbacks(Jokers.runnable8);
                    First.joker.setText("JOKER");
                    First.card.setText("CARD");
                    First.joker.setVisibility(View.VISIBLE);
                    First.card.setVisibility(View.VISIBLE);
                    First.button_take.setText("AUTO HOLD");
                    new Kliring();
                }
        };
        handler9.postDelayed(runnable9,3600);
    }
}
