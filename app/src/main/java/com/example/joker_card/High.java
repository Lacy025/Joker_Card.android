package com.example.joker_card;

import static com.example.joker_card.MainClass.Bingo;
import static com.example.joker_card.MainClass.Doubling;
import static com.example.joker_card.MainClass.cash;
import static com.example.joker_card.MainClass.doubling;
import static com.example.joker_card.MainClass.double_card;
import static com.example.joker_card.MainClass.missed;
import static com.example.joker_card.MainClass.dk;
import static com.example.joker_card.MainClass.dk1;
import static com.example.joker_card.MainClass.dk2;
import static com.example.joker_card.MainClass.dk3;
import static com.example.joker_card.MainClass.dk4;
import static com.example.joker_card.MainClass.dk5;
import static com.example.joker_card.MainClass.dk6;
import static com.example.joker_card.MainClass.dk7;
import static com.example.joker_card.MainClass.dk8;
import static com.example.joker_card.MainClass.dk9;
import static com.example.joker_card.MainClass.dk10;
import static com.example.joker_card.MainClass.dk11;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class High extends Activity {
    public static Handler handler12;
    public static Runnable runnable12;
    final Context context_table;
    final Context context_down_left_2;
    final Context context_down_right_2;
    final Context context_joker;
    final Context context_card;
    final Context context_field_card_1;
    final Context context_field_card_2;
    final Context context_field_card_3;
    final Context context_field_card_4;
    final Context context_field_card_5;
    final Context context_field_joker_1;
    final Context context_field_joker_2;
    final Context context_field_joker_3;
    final Context context_field_joker_4;
    final Context context_field_joker_5;
    final Context context_field_win_1;
    final Context context_field_win_2;
    final Context context_field_win_3;
    final Context context_field_win_4;
    final Context context_field_win_5;
    final Context context_field_win_6;
    final Context context_field_win_7;
    final Context context_field_win_8;
    final Context context_field_win_9;
    final Context context_field_win_10;
    final Context context_field_win_11;
    final Context context_field_win_12;
    final Context context_center_2;
    final Context context_winning_1;
    final Context context_winning_2;
    final Context context_winning_3;
    final Context context_winning_4;
    final Context context_winning_5;
    final Context context_winning_6;
    final Context context_winning_7;
    final Context context_winning_8;
    final Context context_winning_9;
    final Context context_winning_10;
    final Context context_winning;
    final Context context_winning_value;
    final Context context_low_1;
    final Context context_low_2;
    final Context context_low_3;
    final Context context_low_4;
    final Context context_low_5;
    final Context context_low_6;
    final Context context_low_7;
    final Context context_low_8;
    final Context context_low_9;
    final Context context_low_10;
    final Context context_low_11;
    final Context context_high_1;
    final Context context_high_2;
    final Context context_high_3;
    final Context context_high_4;
    final Context context_high_5;
    final Context context_high_6;
    final Context context_high_7;
    final Context context_high_8;
    final Context context_high_9;
    final Context context_high_10;
    final Context context_high_11;
    final Context context_button_take;
    final Context context_button_deal;
    final Context context_button_hold_1;
    final Context context_button_hold_2;
    final Context context_button_hold_3;
    final Context context_button_hold_4;
    final Context context_button_hold_5;
    final Context context_button_low;
    final Context context_button_high;
    final Context context_credit_value;
    final Context context_low;
    final Context context_high;
    High(Context context_table, Context context_down_left_2, Context context_down_right_2,
         Context context_joker, Context context_card, Context context_field_card_1,
         Context context_field_card_2, Context context_field_card_3, Context context_field_card_4,
         Context context_field_card_5, Context context_field_joker_1, Context context_field_joker_2,
         Context context_field_joker_3, Context context_field_joker_4, Context context_field_joker_5,
         Context context_field_win_1, Context context_field_win_2, Context context_field_win_3,
         Context context_field_win_4, Context context_field_win_5, Context context_field_win_6,
         Context context_field_win_7, Context context_field_win_8, Context context_field_win_9,
         Context context_field_win_10, Context context_field_win_11, Context context_field_win_12,
         Context context_center_2, Context context_winning_1, Context context_winning_2,
         Context context_winning_3, Context context_winning_4, Context context_winning_5,
         Context context_winning_6, Context context_winning_7, Context context_winning_8,
         Context context_winning_9, Context context_winning_10, Context context_winning,
         Context context_winning_value, Context context_low_1, Context context_low_2, Context context_low_3,
         Context context_low_4, Context context_low_5, Context context_low_6, Context context_low_7,
         Context context_low_8, Context context_low_9, Context context_low_10, Context context_low_11,
         Context context_high_1, Context context_high_2, Context context_high_3, Context context_high_4,
         Context context_high_5, Context context_high_6, Context context_high_7, Context context_high_8,
         Context context_high_9, Context context_high_10, Context context_high_11, Context context_button_take,
         Context context_button_deal, Context context_button_hold_1, Context context_button_hold_2,
         Context context_button_hold_3, Context context_button_hold_4, Context context_button_hold_5,
         Context context_button_low, Context context_button_high, Context context_credit_value,
         Context context_low, Context context_high) throws InterruptedException {

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
        this.context_button_low = context_button_low;
        this.context_button_high = context_button_high;
        this.context_credit_value = context_credit_value;
        this.context_low = context_low;
        this.context_high = context_high;

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
        TextView low = (TextView) ((Activity)context_low).findViewById(R.id.low);
        TextView high = (TextView) ((Activity)context_high).findViewById(R.id.high);
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
        TextView credit_value = (TextView) ((Activity)context_credit_value).findViewById(R.id.credit_value);
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
        Button button_low = (Button) ((Activity)context_button_low).findViewById(R.id.double_low);
        Button button_high = (Button) ((Activity)context_button_high).findViewById(R.id.double_high);

        if(double_card == 1) {
            field_win_1.setVisibility(View.INVISIBLE);
            high_1.setVisibility(View.VISIBLE);
            dk = dk1;
        }
        if(double_card == 2) {
            field_win_2.setVisibility(View.INVISIBLE);
            low_1.setVisibility(View.INVISIBLE);
            high_1.setVisibility(View.INVISIBLE);
            high_2.setVisibility(View.VISIBLE);
            dk = dk2;
        }
        if(double_card == 3) {
            field_win_3.setVisibility(View.INVISIBLE);
            low_2.setVisibility(View.INVISIBLE);
            high_2.setVisibility(View.INVISIBLE);
            high_3.setVisibility(View.VISIBLE);
            dk = dk3;
        }
        if(double_card == 4) {
            field_win_4.setVisibility(View.INVISIBLE);
            low_3.setVisibility(View.INVISIBLE);
            high_3.setVisibility(View.INVISIBLE);
            high_4.setVisibility(View.VISIBLE);
            dk = dk4;
        }
        if(double_card == 5) {
            field_win_5.setVisibility(View.INVISIBLE);
            low_4.setVisibility(View.INVISIBLE);
            high_4.setVisibility(View.INVISIBLE);
            high_5.setVisibility(View.VISIBLE);
            dk = dk5;
        }
        if(double_card == 6) {
            field_win_6.setVisibility(View.INVISIBLE);
            low_5.setVisibility(View.INVISIBLE);
            high_5.setVisibility(View.INVISIBLE);
            high_6.setVisibility(View.VISIBLE);
            dk = dk6;
        }
        if(double_card == 7) {
            field_win_7.setVisibility(View.INVISIBLE);
            low_6.setVisibility(View.INVISIBLE);
            high_6.setVisibility(View.INVISIBLE);
            high_7.setVisibility(View.VISIBLE);
            dk = dk7;
        }
        if(double_card == 8) {
            field_win_8.setVisibility(View.INVISIBLE);
            low_7.setVisibility(View.INVISIBLE);
            high_7.setVisibility(View.INVISIBLE);
            high_8.setVisibility(View.VISIBLE);
            dk = dk8;
        }
        if(double_card == 9) {
            field_win_9.setVisibility(View.INVISIBLE);
            low_8.setVisibility(View.INVISIBLE);
            high_8.setVisibility(View.INVISIBLE);
            high_9.setVisibility(View.VISIBLE);
            dk = dk9;
        }
        if(double_card == 10) {
            field_win_10.setVisibility(View.INVISIBLE);
            low_9.setVisibility(View.INVISIBLE);
            high_9.setVisibility(View.INVISIBLE);
            high_10.setVisibility(View.VISIBLE);
            dk = dk10;
        }
        if(double_card == 11) {
            field_win_11.setVisibility(View.INVISIBLE);
            low_10.setVisibility(View.INVISIBLE);
            high_10.setVisibility(View.INVISIBLE);
            high_11.setVisibility(View.VISIBLE);
            dk = dk11;
        }

        new GambleCard(field_win_1.getContext(), field_win_2.getContext(), field_win_3.getContext(),
                field_win_4.getContext(), field_win_5.getContext(), field_win_6.getContext(),
                field_win_7.getContext(), field_win_8.getContext(), field_win_9.getContext(),
                field_win_10.getContext(), field_win_11.getContext());

        if (dk > 24) {
            Bingo(center_2.getContext(), winning_value.getContext());
        }
        handler12 = new Handler();
        runnable12 = () -> {
            if (dk > 24) {
                try {
                    Thread.sleep(1600);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                center_2.setVisibility(View.INVISIBLE);
                doubling = 1;
                handler12.removeCallbacks(runnable12);
                double_card++;
                Doubling(field_win_1.getContext(), field_win_2.getContext(), field_win_3.getContext(),
                        field_win_4.getContext(), field_win_5.getContext(), field_win_6.getContext(),
                        field_win_7.getContext(), field_win_8.getContext(), field_win_9.getContext(),
                        field_win_10.getContext(), field_win_11.getContext(), field_win_12.getContext(),
                        center_2.getContext(), winning_value.getContext(), button_take.getContext(),
                        button_deal.getContext(), credit_value.getContext(), low.getContext(), high.getContext());
            }
            else {
                cash = 0;
                winning_value.setText(String.format(Locale.getDefault(), "%d", (cash)));
                missed = 1;
                new Cashed(table.getContext(), down_left_2.getContext(), down_right_2.getContext(),
                        joker.getContext(), card.getContext(), field_card_1.getContext(),
                        field_card_2.getContext(), field_card_3.getContext(), field_card_4.getContext(),
                        field_card_5.getContext(), field_joker_1.getContext(), field_joker_2.getContext(),
                        field_joker_3.getContext(), field_joker_4.getContext(), field_joker_5.getContext(),
                        field_win_1.getContext(), field_win_2.getContext(), field_win_3.getContext(),
                        field_win_4.getContext(), field_win_5.getContext(), field_win_6.getContext(),
                        field_win_7.getContext(), field_win_8.getContext(), field_win_9.getContext(),
                        field_win_10.getContext(), field_win_11.getContext(), field_win_12.getContext(),
                        center_2.getContext(), winning_1.getContext(), winning_2.getContext(),
                        winning_3.getContext(), winning_4.getContext(), winning_5.getContext(),
                        winning_6.getContext(), winning_7.getContext(), winning_8.getContext(),
                        winning_9.getContext(), winning_10.getContext(), winning.getContext(),
                        winning_value.getContext(), low_1.getContext(), low_2.getContext(), low_3.getContext(),
                        low_4.getContext(), low_5.getContext(), low_6.getContext(), low_7.getContext(),
                        low_8.getContext(), low_9.getContext(), low_10.getContext(), low_11.getContext(),
                        high_1.getContext(), high_2.getContext(), high_3.getContext(), high_4.getContext(),
                        high_5.getContext(), high_6.getContext(), high_7.getContext(), high_8.getContext(),
                        high_9.getContext(), high_10.getContext(), high_11.getContext(), button_take.getContext(),
                        button_deal.getContext(), button_hold_1.getContext(), button_hold_2.getContext(),
                        button_hold_3.getContext(), button_hold_4.getContext(), button_hold_5.getContext(),
                        button_low.getContext(), button_high.getContext());
            }
        };
        handler12.post(runnable12);
    }
}
