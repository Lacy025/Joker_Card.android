package com.example.joker_card;

import static com.example.joker_card.MainClass.Doubling;
import static com.example.joker_card.MainClass.audio_count_1;
import static com.example.joker_card.MainClass.audio_count_100;
import static com.example.joker_card.MainClass.money;
import static com.example.joker_card.MainClass.cash;
import static com.example.joker_card.MainClass.doubling;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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
    final Timer timer4;
    final TimerTask task4;
    private final double half;
    private double deo;
    private double half_1;
    private double half_2;
    int countdown;
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
    final Context context_winning_value;
    final Context context_button_take;
    final Context context_button_deal;
    final Context context_button_hold_1;
    final Context context_button_hold_5;
    final Context context_credit_value;
    final Context context_low;
    final Context context_high;
    TakingHalf(Context context_field_win_1, Context context_field_win_2, Context context_field_win_3,
               Context context_field_win_4, Context context_field_win_5, Context context_field_win_6,
               Context context_field_win_7, Context context_field_win_8, Context context_field_win_9,
               Context context_field_win_10, Context context_field_win_11, Context context_field_win_12,
               Context context_center_2, Context context_winning_value, Context context_button_take,
               Context context_button_deal, Context context_button_hold_1, Context context_button_hold_5,
               Context context_credit_value, Context context_low, Context context_high) {

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
        this.context_winning_value = context_winning_value;
        this.context_button_take = context_button_take;
        this.context_button_deal = context_button_deal;
        this.context_button_hold_1 = context_button_hold_1;
        this.context_button_hold_5 = context_button_hold_5;
        this.context_credit_value = context_credit_value;
        this.context_low = context_low;
        this.context_high = context_high;

        TextView center_2 = (TextView) ((Activity)context_center_2).findViewById(R.id.win);
        TextView low = (TextView) ((Activity)context_low).findViewById(R.id.low);
        TextView high = (TextView) ((Activity)context_high).findViewById(R.id.high);
        TextView winning_value = (TextView) ((Activity)context_winning_value).findViewById(R.id.winning_value);
        TextView credit_value = (TextView) ((Activity)context_credit_value).findViewById(R.id.credit_value);
        Button button_take = (Button) ((Activity)context_button_take).findViewById(R.id.take);
        Button button_deal = (Button) ((Activity)context_button_deal).findViewById(R.id.deal);

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
                            minus_1(context_winning_value, context_credit_value);
                            handler14.postDelayed(this, 40);
                        }
                        else {
                            countdown = 0;
                            audio_count_100.start();
                            winner(context_field_win_1, context_field_win_2, context_field_win_3,
                                    context_field_win_4, context_field_win_5, context_field_win_6,
                                    context_field_win_7, context_field_win_8, context_field_win_9,
                                    context_field_win_10, context_field_win_11, context_field_win_12,
                                    context_center_2, winning_value.getContext(), button_take.getContext(),
                                    button_deal.getContext(), credit_value.getContext(),
                                    low.getContext(), high.getContext());
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
                        first_part(context_winning_value, context_credit_value);
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
                        first_part(context_winning_value, context_credit_value);
                        handler15.postDelayed(this, 1000);
                    }
                    else {
                        if(cash - half > 99) {
                            minus_100(context_winning_value, context_credit_value);
                            handler15.postDelayed(this, 1000);
                        }
                        else if(cash - half > 0) {
                            half_2 = cash - half;
                            second_part(context_winning_value, context_credit_value);
                            handler15.postDelayed(this, 1000);
                        }
                        else if(cash - half == 0) {
                            handler15.postDelayed(this, 1000);
                            winner(context_field_win_1, context_field_win_2, context_field_win_3,
                                    context_field_win_4, context_field_win_5, context_field_win_6,
                                    context_field_win_7, context_field_win_8, context_field_win_9,
                                    context_field_win_10, context_field_win_11, context_field_win_12,
                                    context_center_2, winning_value.getContext(), button_take.getContext(),
                                    button_deal.getContext(), credit_value.getContext(),
                                    low.getContext(), high.getContext());
                            handler15.removeCallbacks(runnable15);
                        }
                    }
                }
            };
            handler15.post(runnable15);
        }
    }
    void minus_1(Context context_winning_value, Context context_credit_value) {

        TextView winning_value = (TextView) ((Activity)context_winning_value).findViewById(R.id.winning_value);
        TextView credit_value = (TextView) ((Activity)context_credit_value).findViewById(R.id.credit_value);

        money += 1;
        credit_value.setText(String.format(Locale.getDefault(), "%d", (money)));
        cash -= 1;
        winning_value.setText(String.format(Locale.getDefault(), "%d", (cash)));
        audio_count_1.start();
    }
    void minus_100(Context context_winning_value, Context context_credit_value) {

        TextView winning_value = (TextView) ((Activity)context_winning_value).findViewById(R.id.winning_value);
        TextView credit_value = (TextView) ((Activity)context_credit_value).findViewById(R.id.credit_value);

        money += 100;
        credit_value.setText(String.format(Locale.getDefault(), "%d", (money)));
        cash -= 100;
        winning_value.setText(String.format(Locale.getDefault(), "%d", (cash)));
        audio_count_100.start();
    }
    void first_part(Context context_winning_value, Context context_credit_value) {

        TextView winning_value = (TextView) ((Activity)context_winning_value).findViewById(R.id.winning_value);
        TextView credit_value = (TextView) ((Activity)context_credit_value).findViewById(R.id.credit_value);

        money += half_1;
        credit_value.setText(String.format(Locale.getDefault(), "%d", (money)));
        cash -= half_1;
        deo = cash;
        winning_value.setText(String.format(Locale.getDefault(), "%d", (cash)));
        audio_count_100.start();
    }
    void second_part(Context context_winning_value, Context context_credit_value) {

        TextView winning_value = (TextView) ((Activity)context_winning_value).findViewById(R.id.winning_value);
        TextView credit_value = (TextView) ((Activity)context_credit_value).findViewById(R.id.credit_value);

        money += half_2;
        credit_value.setText(String.format(Locale.getDefault(), "%d", (money)));
        cash -= half_2;
        winning_value.setText(String.format(Locale.getDefault(), "%d", (cash)));
        audio_count_100.start();
    }
    void winner(Context context_field_win_1, Context context_field_win_2, Context context_field_win_3,
                Context context_field_win_4, Context context_field_win_5, Context context_field_win_6,
                Context context_field_win_7, Context context_field_win_8, Context context_field_win_9,
                Context context_field_win_10, Context context_field_win_11, Context context_field_win_12,
                Context context_center_2, Context context_winning_value, Context context_button_take,
                Context context_button_deal, Context context_credit_value, Context context_low, Context context_high) {

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
        TextView center_2 = (TextView) ((Activity)context_center_2).findViewById(R.id.win);
        TextView low = (TextView) ((Activity)context_low).findViewById(R.id.low);
        TextView high = (TextView) ((Activity)context_high).findViewById(R.id.high);
        TextView winning_value = (TextView) ((Activity)context_winning_value).findViewById(R.id.winning_value);
        TextView credit_value = (TextView) ((Activity)context_credit_value).findViewById(R.id.credit_value);
        Button button_take = (Button) ((Activity)context_button_take).findViewById(R.id.take);
        Button button_deal = (Button) ((Activity)context_button_deal).findViewById(R.id.deal);

        handler16.removeCallbacks(runnable16);
        center_2.setVisibility(View.INVISIBLE);
        doubling = 1;
        button_take.setText(R.string.take_all);
        button_deal.setText(R.string.take_half);

        Doubling(field_win_1.getContext(), field_win_2.getContext(), field_win_3.getContext(),
                field_win_4.getContext(), field_win_5.getContext(), field_win_6.getContext(),
                field_win_7.getContext(), field_win_8.getContext(), field_win_9.getContext(),
                field_win_10.getContext(), field_win_11.getContext(), field_win_12.getContext(),
                center_2.getContext(), winning_value.getContext(), button_take.getContext(),
                button_deal.getContext(), credit_value.getContext(), low.getContext(), high.getContext());
    }
}
