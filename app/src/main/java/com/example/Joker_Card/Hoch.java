package com.example.Joker_Card;

import static com.example.Joker_Card.MainClass.Bingo;
import static com.example.Joker_Card.MainClass.Duplanje;
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
import static com.example.Joker_Card.MainClass.hoch1;
import static com.example.Joker_Card.MainClass.hoch2;
import static com.example.Joker_Card.MainClass.hoch3;
import static com.example.Joker_Card.MainClass.hoch4;
import static com.example.Joker_Card.MainClass.hoch5;
import static com.example.Joker_Card.MainClass.hoch6;
import static com.example.Joker_Card.MainClass.hoch7;
import static com.example.Joker_Card.MainClass.hoch8;
import static com.example.Joker_Card.MainClass.hoch9;
import static com.example.Joker_Card.MainClass.hoch10;
import static com.example.Joker_Card.MainClass.hoch11;
import static com.example.Joker_Card.MainClass.tief1;
import static com.example.Joker_Card.MainClass.tief2;
import static com.example.Joker_Card.MainClass.tief3;
import static com.example.Joker_Card.MainClass.tief4;
import static com.example.Joker_Card.MainClass.tief5;
import static com.example.Joker_Card.MainClass.tief6;
import static com.example.Joker_Card.MainClass.tief7;
import static com.example.Joker_Card.MainClass.tief8;
import static com.example.Joker_Card.MainClass.tief9;
import static com.example.Joker_Card.MainClass.tief10;
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
public class Hoch extends Activity {
    public static Handler handler12;
    public static Runnable runnable12;
    Hoch() throws InterruptedException {

        if(double_card == 1) {
            field_win_1.setVisibility(View.INVISIBLE);
            hoch1.setVisibility(View.VISIBLE);
            dk = dk1;
        }
        if(double_card == 2) {
            field_win_2.setVisibility(View.INVISIBLE);
            tief1.setVisibility(View.INVISIBLE);
            hoch1.setVisibility(View.INVISIBLE);
            hoch2.setVisibility(View.VISIBLE);
            dk = dk2;
        }
        if(double_card == 3) {
            field_win_3.setVisibility(View.INVISIBLE);
            tief2.setVisibility(View.INVISIBLE);
            hoch2.setVisibility(View.INVISIBLE);
            hoch3.setVisibility(View.VISIBLE);
            dk = dk3;
        }
        if(double_card == 4) {
            field_win_4.setVisibility(View.INVISIBLE);
            tief3.setVisibility(View.INVISIBLE);
            hoch3.setVisibility(View.INVISIBLE);
            hoch4.setVisibility(View.VISIBLE);
            dk = dk4;
        }
        if(double_card == 5) {
            field_win_5.setVisibility(View.INVISIBLE);
            tief4.setVisibility(View.INVISIBLE);
            hoch4.setVisibility(View.INVISIBLE);
            hoch5.setVisibility(View.VISIBLE);
            dk = dk5;
        }
        if(double_card == 6) {
            field_win_6.setVisibility(View.INVISIBLE);
            tief5.setVisibility(View.INVISIBLE);
            hoch5.setVisibility(View.INVISIBLE);
            hoch6.setVisibility(View.VISIBLE);
            dk = dk6;
        }
        if(double_card == 7) {
            field_win_7.setVisibility(View.INVISIBLE);
            tief6.setVisibility(View.INVISIBLE);
            hoch6.setVisibility(View.INVISIBLE);
            hoch7.setVisibility(View.VISIBLE);
            dk = dk7;
        }
        if(double_card == 8) {
            field_win_8.setVisibility(View.INVISIBLE);
            tief7.setVisibility(View.INVISIBLE);
            hoch7.setVisibility(View.INVISIBLE);
            hoch8.setVisibility(View.VISIBLE);
            dk = dk8;
        }
        if(double_card == 9) {
            field_win_9.setVisibility(View.INVISIBLE);
            tief8.setVisibility(View.INVISIBLE);
            hoch8.setVisibility(View.INVISIBLE);
            hoch9.setVisibility(View.VISIBLE);
            dk = dk9;
        }
        if(double_card == 10) {
            field_win_10.setVisibility(View.INVISIBLE);
            tief9.setVisibility(View.INVISIBLE);
            hoch9.setVisibility(View.INVISIBLE);
            hoch10.setVisibility(View.VISIBLE);
            dk = dk10;
        }
        if(double_card == 11) {
            field_win_11.setVisibility(View.INVISIBLE);
            tief10.setVisibility(View.INVISIBLE);
            hoch10.setVisibility(View.INVISIBLE);
            hoch11.setVisibility(View.VISIBLE);
            dk = dk11;
        }

        new GambleCard();

        if (dk > 24) {
            Bingo();
        }
        handler12 = new Handler();
        runnable12 = new Runnable() {
            @Override
            public void run() {
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
                    Duplanje();
                }
                else {
                    cash = 0;
                    winning_value.setText(Integer.toString(cash));
                    missed = 1;
                    new Cashed();
                }
            }
        };
        handler12.post(runnable12);
    }
}
