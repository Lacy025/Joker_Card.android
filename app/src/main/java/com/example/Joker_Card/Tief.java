package com.example.Joker_Card;

import static com.example.Joker_Card.MainClass.Bingo;
import static com.example.Joker_Card.MainClass.Doubling;
import static com.example.Joker_Card.MainClass.center_2;
import static com.example.Joker_Card.MainClass.cash;
import static com.example.Joker_Card.MainClass.winning_value;
import static com.example.Joker_Card.MainClass.doubling;
import static com.example.Joker_Card.MainClass.double_card;
import static com.example.Joker_Card.MainClass.missed;
import static com.example.Joker_Card.MainClass.dk;
import static com.example.Joker_Card.MainClass.dk1;
import static com.example.Joker_Card.MainClass.dk2;
import static com.example.Joker_Card.MainClass.dk3;
import static com.example.Joker_Card.MainClass.dk4;
import static com.example.Joker_Card.MainClass.dk5;
import static com.example.Joker_Card.MainClass.dk6;
import static com.example.Joker_Card.MainClass.dk7;
import static com.example.Joker_Card.MainClass.dk8;
import static com.example.Joker_Card.MainClass.dk9;
import static com.example.Joker_Card.MainClass.dk10;
import static com.example.Joker_Card.MainClass.dk11;
import static com.example.Joker_Card.MainClass.high_1;
import static com.example.Joker_Card.MainClass.high_2;
import static com.example.Joker_Card.MainClass.high_3;
import static com.example.Joker_Card.MainClass.high_4;
import static com.example.Joker_Card.MainClass.high_5;
import static com.example.Joker_Card.MainClass.high_6;
import static com.example.Joker_Card.MainClass.high_7;
import static com.example.Joker_Card.MainClass.high_8;
import static com.example.Joker_Card.MainClass.high_9;
import static com.example.Joker_Card.MainClass.high_10;
import static com.example.Joker_Card.MainClass.low_1;
import static com.example.Joker_Card.MainClass.low_2;
import static com.example.Joker_Card.MainClass.low_3;
import static com.example.Joker_Card.MainClass.low_4;
import static com.example.Joker_Card.MainClass.low_5;
import static com.example.Joker_Card.MainClass.low_6;
import static com.example.Joker_Card.MainClass.low_7;
import static com.example.Joker_Card.MainClass.low_8;
import static com.example.Joker_Card.MainClass.low_9;
import static com.example.Joker_Card.MainClass.low_10;
import static com.example.Joker_Card.MainClass.low_11;
import static com.example.Joker_Card.MainClass.field_win_1;
import static com.example.Joker_Card.MainClass.field_win_2;
import static com.example.Joker_Card.MainClass.field_win_3;
import static com.example.Joker_Card.MainClass.field_win_4;
import static com.example.Joker_Card.MainClass.field_win_5;
import static com.example.Joker_Card.MainClass.field_win_6;
import static com.example.Joker_Card.MainClass.field_win_7;
import static com.example.Joker_Card.MainClass.field_win_8;
import static com.example.Joker_Card.MainClass.field_win_9;
import static com.example.Joker_Card.MainClass.field_win_10;
import static com.example.Joker_Card.MainClass.field_win_11;

import android.app.Activity;
import android.os.Handler;
import android.view.View;
public class Tief extends Activity {
    public static Handler handler11;
    public static Runnable runnable11;
    Tief() throws InterruptedException {

        if(double_card == 1) {
            field_win_1.setVisibility(View.INVISIBLE);
            low_1.setVisibility(View.VISIBLE);
            dk = dk1;
        }
        if(double_card == 2) {
            field_win_2.setVisibility(View.INVISIBLE);
            low_1.setVisibility(View.INVISIBLE);
            high_1.setVisibility(View.INVISIBLE);
            low_2.setVisibility(View.VISIBLE);
            dk = dk2;
        }
        if(double_card == 3) {
            field_win_3.setVisibility(View.INVISIBLE);
            low_2.setVisibility(View.INVISIBLE);
            high_2.setVisibility(View.INVISIBLE);
            low_3.setVisibility(View.VISIBLE);
            dk = dk3;
        }
        if(double_card == 4) {
            field_win_4.setVisibility(View.INVISIBLE);
            low_3.setVisibility(View.INVISIBLE);
            high_3.setVisibility(View.INVISIBLE);
            low_4.setVisibility(View.VISIBLE);
            dk = dk4;
        }
        if(double_card == 5) {
            field_win_5.setVisibility(View.INVISIBLE);
            low_4.setVisibility(View.INVISIBLE);
            high_4.setVisibility(View.INVISIBLE);
            low_5.setVisibility(View.VISIBLE);
            dk = dk5;
        }
        if(double_card == 6) {
            field_win_6.setVisibility(View.INVISIBLE);
            low_5.setVisibility(View.INVISIBLE);
            high_5.setVisibility(View.INVISIBLE);
            low_6.setVisibility(View.VISIBLE);
            dk = dk6;
        }
        if(double_card == 7) {
            field_win_7.setVisibility(View.INVISIBLE);
            low_6.setVisibility(View.INVISIBLE);
            high_6.setVisibility(View.INVISIBLE);
            low_7.setVisibility(View.VISIBLE);
            dk = dk7;
        }
        if(double_card == 8) {
            field_win_8.setVisibility(View.INVISIBLE);
            low_7.setVisibility(View.INVISIBLE);
            high_7.setVisibility(View.INVISIBLE);
            low_8.setVisibility(View.VISIBLE);
            dk = dk8;
        }
        if(double_card == 9) {
            field_win_9.setVisibility(View.INVISIBLE);
            low_8.setVisibility(View.INVISIBLE);
            high_8.setVisibility(View.INVISIBLE);
            low_9.setVisibility(View.VISIBLE);
            dk = dk9;
        }
        if(double_card == 10) {
            field_win_10.setVisibility(View.INVISIBLE);
            low_9.setVisibility(View.INVISIBLE);
            high_9.setVisibility(View.INVISIBLE);
            low_10.setVisibility(View.VISIBLE);
            dk = dk10;
        }
        if(double_card == 11) {
            field_win_11.setVisibility(View.INVISIBLE);
            low_10.setVisibility(View.INVISIBLE);
            high_10.setVisibility(View.INVISIBLE);
            low_11.setVisibility(View.VISIBLE);
            dk = dk11;
        }

        new GambleCard();

        if (dk < 25) {
            Bingo();
        }
        handler11 = new Handler();
        runnable11 = new Runnable() {
            @Override
            public void run() {
                if (dk < 25) {
                    try {
                        Thread.sleep(1600);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    center_2.setVisibility(View.INVISIBLE);
                    doubling = 1;
                    handler11.removeCallbacks(runnable11);
                    double_card++;
                    Doubling();
                }
                else {
                    cash = 0;
                    winning_value.setText(Integer.toString(cash));
                    missed = 1;
                    new Cashed();
                }
            }
        };
        handler11.post(runnable11);
    }
}
