package com.example.Joker_Card;

import static com.example.Joker_Card.MainClass.button_deal;
import static com.example.Joker_Card.MainClass.kasiranje;
import static com.example.Joker_Card.MainClass.deljenje;
import static com.example.Joker_Card.MainClass.kasirano;
import static com.example.Joker_Card.MainClass.biodobitak;
import static com.example.Joker_Card.MainClass.promasaj;
import static com.example.Joker_Card.MainClass.izbor;
import static com.example.Joker_Card.MainClass.joker;
import static com.example.Joker_Card.MainClass.card;
import static com.example.Joker_Card.MainClass.button_take;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
public class Cashed extends Activity {
    public static Handler handler9;
    public static Runnable runnable9;
    int pauzap;
    Cashed() {
        if(promasaj == 1) {
            pauzap = 2000;
        }
        else {
            pauzap = 3600;
        }
        handler9 = new Handler();
        runnable9 = () -> {
                if(kasiranje == 1 || promasaj == 1) {
                    if(promasaj == 1) {
                        button_deal.setText(R.string.deal_cards);
                    }
                    kasiranje = 0;
                    promasaj = 0;
                    deljenje = 0;
                    kasirano = 0;
                    biodobitak = 0;
                    izbor = 0;
                    Jokers.handler1.removeCallbacks(Jokers.runnable1);
                    Jokers.handler2.removeCallbacks(Jokers.runnable2);
                    Jokers.handler3.removeCallbacks(Jokers.runnable3);
                    Jokers.handler4.removeCallbacks(Jokers.runnable4);
                    Jokers.handler5.removeCallbacks(Jokers.runnable5);
                    Jokers.handler6.removeCallbacks(Jokers.runnable6);
                    Jokers.handler7.removeCallbacks(Jokers.runnable7);
                    Jokers.handler8.removeCallbacks(Jokers.runnable8);
                    MainClass.handler0.removeCallbacks(MainClass.runnable0);
                    joker.setText(R.string.joker);
                    card.setText(R.string.card);
                    joker.setVisibility(View.VISIBLE);
                    card.setVisibility(View.VISIBLE);
                    button_take.setText(R.string.auto_hold);
                    new Clearing();
                }
        };
        handler9.postDelayed(runnable9, pauzap);
    }
}
