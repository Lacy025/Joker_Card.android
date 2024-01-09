package com.example.joker_card;

import static com.example.joker_card.MainClass.button_deal;
import static com.example.joker_card.MainClass.taking;
import static com.example.joker_card.MainClass.dealing;
import static com.example.joker_card.MainClass.profit;
import static com.example.joker_card.MainClass.won;
import static com.example.joker_card.MainClass.missed;
import static com.example.joker_card.MainClass.choice;
import static com.example.joker_card.MainClass.joker;
import static com.example.joker_card.MainClass.card;
import static com.example.joker_card.MainClass.button_take;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class Cashed extends Activity {
    public static Handler handler9;
    public static Runnable runnable9;
    int pause;
    Context context_table;
    Cashed(Context context_table) {

        this.context_table = context_table;

        if(missed == 1) {
            pause = 2000;
        }
        else {
            pause = 3600;
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
                    ImageView table = (ImageView) ((Activity)context_table).findViewById(R.id.table);
                    new Clearing(table.getContext());
                }
        };
        handler9.postDelayed(runnable9, pause);
    }
}
