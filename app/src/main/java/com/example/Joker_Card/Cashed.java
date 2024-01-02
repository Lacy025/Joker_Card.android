package com.example.Joker_Card;

import static com.example.Joker_Card.MainClass.button_deal;
import static com.example.Joker_Card.MainClass.taking;
import static com.example.Joker_Card.MainClass.dealing;
import static com.example.Joker_Card.MainClass.profit;
import static com.example.Joker_Card.MainClass.won;
import static com.example.Joker_Card.MainClass.missed;
import static com.example.Joker_Card.MainClass.choice;
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
        if(missed == 1) {
            pauzap = 2000;
        }
        else {
            pauzap = 3600;
        }
        handler9 = new Handler();
        runnable9 = () -> {
                if(taking == 1 || missed == 1) {
                    if(missed == 1) {
                        button_deal.setText(R.string.deal_cards);
                    }
                    taking = 0;
                    missed = 0;
                    dealing = 0;
                    profit = 0;
                    won = 0;
                    choice = 0;
                    Jokers.handler1.removeCallbacks(Jokers.runnable1);
                    Jokers.handler2.removeCallbacks(Jokers.runnable2);
                    Jokers.handler3.removeCallbacks(Jokers.runnable3);
                    Jokers.handler4.removeCallbacks(Jokers.runnable4);
                    Jokers.handler5.removeCallbacks(Jokers.runnable5);
                    Jokers.handler6.removeCallbacks(Jokers.runnable6);
                    Jokers.handler7.removeCallbacks(Jokers.runnable7);
                    Jokers.handler8.removeCallbacks(Jokers.runnable8);
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
