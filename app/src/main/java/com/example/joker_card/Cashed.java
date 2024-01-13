package com.example.joker_card;

import static com.example.joker_card.MainClass.taking;
import static com.example.joker_card.MainClass.dealing;
import static com.example.joker_card.MainClass.profit;
import static com.example.joker_card.MainClass.won;
import static com.example.joker_card.MainClass.missed;
import static com.example.joker_card.MainClass.choice;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
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
    Context context_low_1;
    Context context_low_2;
    Context context_low_3;
    Context context_low_4;
    Context context_low_5;
    Context context_low_6;
    Context context_low_7;
    Context context_low_8;
    Context context_low_9;
    Context context_low_10;
    Context context_low_11;
    Context context_high_1;
    Context context_high_2;
    Context context_high_3;
    Context context_high_4;
    Context context_high_5;
    Context context_high_6;
    Context context_high_7;
    Context context_high_8;
    Context context_high_9;
    Context context_high_10;
    Context context_high_11;
    Context context_button_take;
    Context context_button_deal;
    Context context_button_hold_1;
    Context context_button_hold_2;
    Context context_button_hold_3;
    Context context_button_hold_4;
    Context context_button_hold_5;
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
           Context context_winning, Context context_winning_value, Context context_low_1,
           Context context_low_2, Context context_low_3, Context context_low_4, Context context_low_5,
           Context context_low_6, Context context_low_7, Context context_low_8, Context context_low_9,
           Context context_low_10, Context context_low_11, Context context_high_1, Context context_high_2,
           Context context_high_3, Context context_high_4, Context context_high_5, Context context_high_6,
           Context context_high_7, Context context_high_8, Context context_high_9, Context context_high_10,
           Context context_high_11, Context context_button_take, Context context_button_deal,
           Context context_button_hold_1, Context context_button_hold_2, Context context_button_hold_3,
           Context context_button_hold_4, Context context_button_hold_5) {

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
        this.context_low_1 = context_low_1;
        this.context_low_2 = context_low_2;
        this.context_low_3 = context_low_3;
        this.context_low_4 = context_low_4;
        this.context_low_5 = context_low_5;
        this.context_low_6 = context_low_6;
        this.context_low_7 = context_low_7;
        this.context_low_8 = context_low_8;
        this.context_low_9 = context_low_9;
        this.context_low_10 = context_low_10;
        this.context_low_11 = context_low_11;
        this.context_high_1 = context_high_1;
        this.context_high_2 = context_high_2;
        this.context_high_3 = context_high_3;
        this.context_high_4 = context_high_4;
        this.context_high_5 = context_high_5;
        this.context_high_6 = context_high_6;
        this.context_high_7 = context_high_7;
        this.context_high_8 = context_high_8;
        this.context_high_9 = context_high_9;
        this.context_high_10 = context_high_10;
        this.context_high_11 = context_high_11;
        this.context_button_take = context_button_take;
        this.context_button_deal = context_button_deal;
        this.context_button_hold_1 = context_button_hold_1;
        this.context_button_hold_2 = context_button_hold_2;
        this.context_button_hold_3 = context_button_hold_3;
        this.context_button_hold_4 = context_button_hold_4;
        this.context_button_hold_5 = context_button_hold_5;

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
        TextView low_1 = (TextView) ((Activity)context_low_1).findViewById(R.id.low_1);
        TextView low_2 = (TextView) ((Activity)context_low_2).findViewById(R.id.low_2);
        TextView low_3 = (TextView) ((Activity)context_low_3).findViewById(R.id.low_3);
        TextView low_4 = (TextView) ((Activity)context_low_4).findViewById(R.id.low_4);
        TextView low_5 = (TextView) ((Activity)context_low_5).findViewById(R.id.low_5);
        TextView low_6 = (TextView) ((Activity)context_low_6).findViewById(R.id.low_6);
        TextView low_7 = (TextView) ((Activity)context_low_7).findViewById(R.id.low_7);
        TextView low_8 = (TextView) ((Activity)context_low_8).findViewById(R.id.low_8);
        TextView low_9 = (TextView) ((Activity)context_low_9).findViewById(R.id.low_9);
        TextView low_10 = (TextView) ((Activity)context_low_10).findViewById(R.id.low_10);
        TextView low_11 = (TextView) ((Activity)context_low_11).findViewById(R.id.low_11);
        TextView high_1 = (TextView) ((Activity)context_high_1).findViewById(R.id.high_1);
        TextView high_2 = (TextView) ((Activity)context_high_2).findViewById(R.id.high_2);
        TextView high_3 = (TextView) ((Activity)context_high_3).findViewById(R.id.high_3);
        TextView high_4 = (TextView) ((Activity)context_high_4).findViewById(R.id.high_4);
        TextView high_5 = (TextView) ((Activity)context_high_5).findViewById(R.id.high_5);
        TextView high_6 = (TextView) ((Activity)context_high_6).findViewById(R.id.high_6);
        TextView high_7 = (TextView) ((Activity)context_high_7).findViewById(R.id.high_7);
        TextView high_8 = (TextView) ((Activity)context_high_8).findViewById(R.id.high_8);
        TextView high_9 = (TextView) ((Activity)context_high_9).findViewById(R.id.high_9);
        TextView high_10 = (TextView) ((Activity)context_high_10).findViewById(R.id.high_10);
        TextView high_11 = (TextView) ((Activity)context_high_11).findViewById(R.id.high_11);
        Button button_take = (Button) ((Activity)context_button_take).findViewById(R.id.take);
        Button button_deal = (Button) ((Activity)context_button_deal).findViewById(R.id.deal);
        Button button_hold_1 = (Button) ((Activity)context_button_hold_1).findViewById(R.id.hold_1);
        Button button_hold_2 = (Button) ((Activity)context_button_hold_2).findViewById(R.id.hold_2);
        Button button_hold_3 = (Button) ((Activity)context_button_hold_3).findViewById(R.id.hold_3);
        Button button_hold_4 = (Button) ((Activity)context_button_hold_4).findViewById(R.id.hold_4);
        Button button_hold_5 = (Button) ((Activity)context_button_hold_5).findViewById(R.id.hold_5);

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
                            winning.getContext(), winning_value.getContext(), low_1.getContext(), low_2.getContext(),
                            low_3.getContext(), low_4.getContext(), low_5.getContext(), low_6.getContext(),
                            low_7.getContext(), low_8.getContext(), low_9.getContext(), low_10.getContext(),
                            low_11.getContext(), high_1.getContext(), high_2.getContext(), high_3.getContext(),
                            high_4.getContext(), high_5.getContext(), high_6.getContext(), high_7.getContext(),
                            high_8.getContext(), high_9.getContext(), high_10.getContext(), high_11.getContext(),
                            button_hold_1.getContext(), button_hold_2.getContext(), button_hold_3.getContext(),
                            button_hold_4.getContext(), button_hold_5.getContext());
                }
        };
        handler9.postDelayed(runnable9, pause);
    }
}
