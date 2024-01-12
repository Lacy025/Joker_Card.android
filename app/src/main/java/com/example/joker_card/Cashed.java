package com.example.joker_card;

import static com.example.joker_card.MainClass.button_deal;
import static com.example.joker_card.MainClass.taking;
import static com.example.joker_card.MainClass.dealing;
import static com.example.joker_card.MainClass.profit;
import static com.example.joker_card.MainClass.won;
import static com.example.joker_card.MainClass.missed;
import static com.example.joker_card.MainClass.choice;
import static com.example.joker_card.MainClass.button_take;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Cashed extends Activity {
    public static Handler handler9;
    public static Runnable runnable9;
    int pause;
    Context context_table;
    Context context_down_left_2;
    Context context_down_right_2;
    Context context_joker;
    Context context_card;
    Context context_field_card_1;
    Context context_field_card_2;
    Context context_field_card_3;
    Context context_field_card_4;
    Context context_field_card_5;
    Context context_field_joker_1;
    Context context_field_joker_2;
    Context context_field_joker_3;
    Context context_field_joker_4;
    Context context_field_joker_5;
    Context context_field_win_1;
    Context context_field_win_2;
    Context context_field_win_3;
    Context context_field_win_4;
    Context context_field_win_5;
    Context context_field_win_6;
    Context context_field_win_7;
    Context context_field_win_8;
    Context context_field_win_9;
    Context context_field_win_10;
    Context context_field_win_11;
    Context context_field_win_12;
    Context context_center_2;
    Context context_winning_1;
    Context context_winning_2;
    Context context_winning_3;
    Context context_winning_4;
    Context context_winning_5;
    Context context_winning_6;
    Context context_winning_7;
    Context context_winning_8;
    Context context_winning_9;
    Context context_winning_10;
    Context context_winning;
    Context context_winning_value;
    Cashed(Context context_table, Context context_down_left_2, Context context_down_right_2,
           Context context_joker, Context context_card, Context context_field_card_1, Context context_field_card_2, Context context_field_card_3,
           Context context_field_card_4, Context context_field_card_5, Context context_field_joker_1,
           Context context_field_joker_2, Context context_field_joker_3, Context context_field_joker_4,
           Context context_field_joker_5, Context context_field_win_1, Context context_field_win_2,
           Context context_field_win_3, Context context_field_win_4, Context context_field_win_5,
           Context context_field_win_6, Context context_field_win_7, Context context_field_win_8,
           Context context_field_win_9, Context context_field_win_10, Context context_field_win_11,
           Context context_field_win_12, Context context_center_2, Context context_winning_1,
           Context context_winning_2, Context context_winning_3, Context context_winning_4,
           Context context_winning_5, Context context_winning_6, Context context_winning_7,
           Context context_winning_8, Context context_winning_9, Context context_winning_10,
           Context context_winning, Context context_winning_value) {

        this.context_table = context_table;
        this.context_down_left_2 = context_down_left_2;
        this.context_down_right_2 = context_down_right_2;
        this.context_joker = context_joker;
        this.context_card = context_card;
        this.context_field_card_1 = context_field_card_1;
        this.context_field_card_2 = context_field_card_2;
        this.context_field_card_3 = context_field_card_3;
        this.context_field_card_4 = context_field_card_4;
        this.context_field_card_5 = context_field_card_5;
        this.context_field_joker_1 = context_field_joker_1;
        this.context_field_joker_2 = context_field_joker_2;
        this.context_field_joker_3 = context_field_joker_3;
        this.context_field_joker_4 = context_field_joker_4;
        this.context_field_joker_5 = context_field_joker_5;
        this.context_field_win_1 = context_field_win_1;
        this.context_field_win_2 = context_field_win_2;
        this.context_field_win_3 = context_field_win_3;
        this.context_field_win_4 = context_field_win_4;
        this.context_field_win_5 = context_field_win_5;
        this.context_field_win_6 = context_field_win_6;
        this.context_field_win_7 = context_field_win_7;
        this.context_field_win_8 = context_field_win_8;
        this.context_field_win_9 = context_field_win_9;
        this.context_field_win_10 = context_field_win_10;
        this.context_field_win_11 = context_field_win_11;
        this.context_field_win_12 = context_field_win_12;
        this.context_center_2 = context_center_2;
        this.context_winning_1 = context_winning_1;
        this.context_winning_2 = context_winning_2;
        this.context_winning_3 = context_winning_3;
        this.context_winning_4 = context_winning_4;
        this.context_winning_5 = context_winning_5;
        this.context_winning_6 = context_winning_6;
        this.context_winning_7 = context_winning_7;
        this.context_winning_8 = context_winning_8;
        this.context_winning_9 = context_winning_9;
        this.context_winning_10 = context_winning_10;
        this.context_winning = context_winning;
        this.context_winning_value = context_winning_value;

        ImageView field_card_1 = (ImageView) ((Activity)context_field_card_1).findViewById(R.id.field_card_1);
        ImageView field_card_2 = (ImageView) ((Activity)context_field_card_2).findViewById(R.id.field_card_2);
        ImageView field_card_3 = (ImageView) ((Activity)context_field_card_3).findViewById(R.id.field_card_3);
        ImageView field_card_4 = (ImageView) ((Activity)context_field_card_4).findViewById(R.id.field_card_4);
        ImageView field_card_5 = (ImageView) ((Activity)context_field_card_5).findViewById(R.id.field_card_5);
        ImageView field_joker_1 = (ImageView) ((Activity)context_field_joker_1).findViewById(R.id.field_joker_1);
        ImageView field_joker_2 = (ImageView) ((Activity)context_field_joker_2).findViewById(R.id.field_joker_2);
        ImageView field_joker_3 = (ImageView) ((Activity)context_field_joker_3).findViewById(R.id.field_joker_3);
        ImageView field_joker_4 = (ImageView) ((Activity)context_field_joker_4).findViewById(R.id.field_joker_4);
        ImageView field_joker_5 = (ImageView) ((Activity)context_field_joker_5).findViewById(R.id.field_joker_5);
        ImageView table = (ImageView) ((Activity)context_table).findViewById(R.id.table);
        ImageView field_win_1 = (ImageView) ((Activity)context_field_win_1).findViewById(R.id.field_win_1);
        ImageView field_win_2 = (ImageView) ((Activity)context_field_win_2).findViewById(R.id.field_win_2);
        ImageView field_win_3 = (ImageView) ((Activity)context_field_win_3).findViewById(R.id.field_win_3);
        ImageView field_win_4 = (ImageView) ((Activity)context_field_win_4).findViewById(R.id.field_win_4);
        ImageView field_win_5 = (ImageView) ((Activity)context_field_win_5).findViewById(R.id.field_win_5);
        ImageView field_win_6 = (ImageView) ((Activity)context_field_win_6).findViewById(R.id.field_win_6);
        ImageView field_win_7 = (ImageView) ((Activity)context_field_win_7).findViewById(R.id.field_win_7);
        ImageView field_win_8 = (ImageView) ((Activity)context_field_win_8).findViewById(R.id.field_win_8);
        ImageView field_win_9 = (ImageView) ((Activity)context_field_win_9).findViewById(R.id.field_win_9);
        ImageView field_win_10 = (ImageView) ((Activity)context_field_win_10).findViewById(R.id.field_win_10);
        ImageView field_win_11 = (ImageView) ((Activity)context_field_win_11).findViewById(R.id.field_win_11);
        ImageView field_win_12 = (ImageView) ((Activity)context_field_win_12).findViewById(R.id.field_win_12);
        TextView down_left_2 = (TextView) ((Activity)context_down_left_2).findViewById(R.id.gamble);
        TextView down_right_2 = (TextView) ((Activity)context_down_right_2).findViewById(R.id.cash);
        TextView joker = (TextView) ((Activity)context_joker).findViewById(R.id.joker);
        TextView card = (TextView) ((Activity)context_card).findViewById(R.id.card);
        TextView center_2 = (TextView) ((Activity)context_center_2).findViewById(R.id.win);
        TextView winning_1 = (TextView) ((Activity)context_winning_1).findViewById(R.id.winning_1);
        TextView winning_2 = (TextView) ((Activity)context_winning_2).findViewById(R.id.winning_2);
        TextView winning_3 = (TextView) ((Activity)context_winning_3).findViewById(R.id.winning_3);
        TextView winning_4 = (TextView) ((Activity)context_winning_4).findViewById(R.id.winning_4);
        TextView winning_5 = (TextView) ((Activity)context_winning_5).findViewById(R.id.winning_5);
        TextView winning_6 = (TextView) ((Activity)context_winning_6).findViewById(R.id.winning_6);
        TextView winning_7 = (TextView) ((Activity)context_winning_7).findViewById(R.id.winning_7);
        TextView winning_8 = (TextView) ((Activity)context_winning_8).findViewById(R.id.winning_8);
        TextView winning_9 = (TextView) ((Activity)context_winning_9).findViewById(R.id.winning_9);
        TextView winning_10 = (TextView) ((Activity)context_winning_10).findViewById(R.id.winning_10);
        TextView winning = (TextView) ((Activity)context_winning).findViewById(R.id.winning);
        TextView winning_value = (TextView) ((Activity)context_winning_value).findViewById(R.id.winning_value);

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
                    new Clearing(table.getContext(), down_left_2.getContext(), down_right_2.getContext(),
                            field_card_1.getContext(), field_card_2.getContext(), field_card_3.getContext(),
                            field_card_4.getContext(), field_card_5.getContext(), field_joker_1.getContext(),
                            field_joker_2.getContext(), field_joker_3.getContext(), field_joker_4.getContext(),
                            field_joker_5.getContext(), field_win_1.getContext(), field_win_2.getContext(),
                            field_win_3.getContext(), field_win_4.getContext(), field_win_5.getContext(),
                            field_win_6.getContext(), field_win_7.getContext(), field_win_8.getContext(),
                            field_win_9.getContext(), field_win_10.getContext(), field_win_11.getContext(),
                            field_win_12.getContext(), center_2.getContext(), winning_1.getContext(),
                            winning_2.getContext(), winning_3.getContext(), winning_4.getContext(),
                            winning_5.getContext(), winning_6.getContext(), winning_7.getContext(),
                            winning_8.getContext(), winning_9.getContext(), winning_10.getContext(),
                            winning.getContext(), winning_value.getContext());
                }
        };
        handler9.postDelayed(runnable9, pause);
    }
}
