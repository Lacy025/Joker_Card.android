package com.example.joker_card;

import static com.example.joker_card.MainClass.audio_count_1;
import static com.example.joker_card.MainClass.audio_count_100;
import static com.example.joker_card.MainClass.audio_winner;
import static com.example.joker_card.MainClass.audio_intro;
import static com.example.joker_card.MainClass.cash;
import static com.example.joker_card.MainClass.doubling;
import static com.example.joker_card.MainClass.profit;
import static com.example.joker_card.MainClass.money;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class TakingAll extends Activity {
    public static Handler handler9;
    public static Handler handler10;
    public static Runnable runnable9;
    public static Runnable runnable10;
    final Context context_center_2;
    final Context context_credit_value;
    TakingAll(Context context_center_2, Context context_winning_value,
              Context context_button_take, Context context_button_deal,
              Context context_credit_value) throws InterruptedException {

        this.context_center_2 = context_center_2;
        this.context_credit_value = context_credit_value;

        TextView center_2 = ((Activity)context_center_2).findViewById(R.id.win);
        Button button_take = ((Activity)context_button_take).findViewById(R.id.take);
        Button button_deal = ((Activity)context_button_deal).findViewById(R.id.deal);

        int winning = cash;

        button_take.setText(R.string.win_win);
        button_deal.setText(R.string.win_win);
        center_2.setText(R.string.win);
        center_2.setVisibility(View.VISIBLE);

        if(cash > 9999 && doubling == 0) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        else {
            audio_winner.reset();
            audio_winner.release();
            audio_winner = null;
        }
        doubling = 0;

        handler9 = new Handler();
        runnable9 = new Runnable() {
            boolean isVisible = true;
            @Override
            public void run() {
                isVisible = !isVisible;
                if(cash > 0) {
                    center_2.setVisibility(isVisible ? View.INVISIBLE : View.VISIBLE);
                    handler9.postDelayed(this, 400);
                }
            }
        };
        handler9.post(runnable9);

        minus_1(context_winning_value, context_button_deal);
        Thread.sleep(40);

        handler10 = new Handler();
        runnable10 = new Runnable() {
            @Override
            public void run() {
                double winn = cash;
                if(((int)(winn/100) * 100) != ((winn/100) * 100)) {
                    minus_1(context_winning_value, context_button_deal);
                    handler10.postDelayed(this, 40);
                }
                else if((((int)(winn/100) * 100) == ((winn/100) * 100)) && winn > 0) {
                    minus_100(context_winning_value, context_button_deal);
                    handler10.postDelayed(this, 1000);
                }
                else  {
                    if(winning < 101) {
                        audio_count_100.start();
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    audio_intro.start();
                    profit = 1;
                }
            }
        };
        handler10.post(runnable10);
    }
    void minus_1(Context context_winning_value, Context context_button_deal) {

        TextView winning_value = ((Activity)context_winning_value).findViewById(R.id.winning_value);
        TextView credit_value = ((Activity)context_credit_value).findViewById(R.id.credit_value);
        Button button_deal = ((Activity)context_button_deal).findViewById(R.id.deal);

        money += 1;
        credit_value.setText(String.format(Locale.getDefault(), "%d", (money)));
        cash -= 1;
        winning_value.setText(String.format(Locale.getDefault(), "%d", (cash)));
        audio_count_1.start();
        if(cash == 0) {
            You_Win(context_center_2);
            button_deal.setText(R.string.deal_cards);
        }
    }
    void minus_100(Context context_winning_value, Context context_button_deal) {

        TextView winning_value = ((Activity)context_winning_value).findViewById(R.id.winning_value);
        TextView credit_value = ((Activity)context_credit_value).findViewById(R.id.credit_value);
        Button button_deal = ((Activity)context_button_deal).findViewById(R.id.deal);

        money += 100;
        credit_value.setText(String.format(Locale.getDefault(), "%d", (money)));
        cash -= 100;
        winning_value.setText(String.format(Locale.getDefault(), "%d", (cash)));
        audio_count_100.start();
        if(cash == 0) {
            You_Win(context_center_2);
            button_deal.setText(R.string.deal_cards);
        }
    }
    void You_Win(Context context_center_2) {

        TextView center_2 = ((Activity)context_center_2).findViewById(R.id.win);
        center_2.setText(R.string.win);
        center_2.setVisibility(View.VISIBLE);
    }
}
