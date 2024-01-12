package com.example.joker_card;

import static com.example.joker_card.MainClass.Bingo;
import static com.example.joker_card.MainClass.Doubling;
import static com.example.joker_card.MainClass.cash;
import static com.example.joker_card.MainClass.winning_value;
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
import static com.example.joker_card.MainClass.high_1;
import static com.example.joker_card.MainClass.high_2;
import static com.example.joker_card.MainClass.high_3;
import static com.example.joker_card.MainClass.high_4;
import static com.example.joker_card.MainClass.high_5;
import static com.example.joker_card.MainClass.high_6;
import static com.example.joker_card.MainClass.high_7;
import static com.example.joker_card.MainClass.high_8;
import static com.example.joker_card.MainClass.high_9;
import static com.example.joker_card.MainClass.high_10;
import static com.example.joker_card.MainClass.high_11;
import static com.example.joker_card.MainClass.low_1;
import static com.example.joker_card.MainClass.low_2;
import static com.example.joker_card.MainClass.low_3;
import static com.example.joker_card.MainClass.low_4;
import static com.example.joker_card.MainClass.low_5;
import static com.example.joker_card.MainClass.low_6;
import static com.example.joker_card.MainClass.low_7;
import static com.example.joker_card.MainClass.low_8;
import static com.example.joker_card.MainClass.low_9;
import static com.example.joker_card.MainClass.low_10;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class High extends Activity {
    public static Handler handler12;
    public static Runnable runnable12;
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
    High(Context context_table, Context context_down_left_2, Context context_down_right_2,
         Context context_joker, Context context_card, Context context_field_card_1,
         Context context_field_card_2, Context context_field_card_3, Context context_field_card_4,
         Context context_field_card_5, Context context_field_joker_1, Context context_field_joker_2,
         Context context_field_joker_3, Context context_field_joker_4, Context context_field_joker_5,
         Context context_field_win_1, Context context_field_win_2, Context context_field_win_3,
         Context context_field_win_4, Context context_field_win_5, Context context_field_win_6,
         Context context_field_win_7, Context context_field_win_8, Context context_field_win_9,
         Context context_field_win_10, Context context_field_win_11, Context context_field_win_12,
         Context context_center_2) throws InterruptedException {

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
            Bingo();
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
                        field_win_10.getContext(), field_win_11.getContext(), field_win_12.getContext());
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
                        center_2.getContext());
            }
        };
        handler12.post(runnable12);
    }
}
