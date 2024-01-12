package com.example.joker_card;

import static com.example.joker_card.MainClass.audio_count_1;
import static com.example.joker_card.MainClass.audio_count_100;
import static com.example.joker_card.MainClass.audio_winner;
import static com.example.joker_card.MainClass.audio_intro;
import static com.example.joker_card.MainClass.button_deal;
import static com.example.joker_card.MainClass.button_take;
import static com.example.joker_card.MainClass.cash;
import static com.example.joker_card.MainClass.doubling;
import static com.example.joker_card.MainClass.profit;
import static com.example.joker_card.MainClass.winning_value;
import static com.example.joker_card.MainClass.c;
import static com.example.joker_card.MainClass.c1;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class TakingAll extends Activity {
    public static Handler handler9;
    public static Handler handler10;
    public static Runnable runnable9;
    public static Runnable runnable10;
    Context context_center_2;
    TakingAll(Context context_center_2) throws InterruptedException {

        this.context_center_2 = context_center_2;

        TextView center_2 = (TextView) ((Activity)context_center_2).findViewById(R.id.win);

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

        minus_1();
        Thread.sleep(40);

        handler10 = new Handler();
        runnable10 = new Runnable() {
            @Override
            public void run() {
                double winn = cash;
                if(((int)(winn/100) * 100) != ((winn/100) * 100)) {
                    minus_1();
                    handler10.postDelayed(this, 40);
                }
                else if((((int)(winn/100) * 100) == ((winn/100) * 100)) && winn > 0) {
                    minus_100();
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
    void minus_1() {
        c += 1;
        c1.setText(String.format(Locale.getDefault(), "%d", (c)));
        cash -= 1;
        winning_value.setText(String.format(Locale.getDefault(), "%d", (cash)));
        audio_count_1.start();
        if(cash == 0) {
            You_Win(context_center_2);
            button_deal.setText(R.string.deal_cards);
        }
    }
    void minus_100() {
        c += 100;
        c1.setText(String.format(Locale.getDefault(), "%d", (c)));
        cash -= 100;
        winning_value.setText(String.format(Locale.getDefault(), "%d", (cash)));
        audio_count_100.start();
        if(cash == 0) {
            You_Win(context_center_2);
            button_deal.setText(R.string.deal_cards);
        }
    }
    void You_Win(Context context_center_2) {

        TextView center_2 = (TextView) ((Activity)context_center_2).findViewById(R.id.win);

        center_2.setText(R.string.win);
        center_2.setVisibility(View.VISIBLE);
    }
}
