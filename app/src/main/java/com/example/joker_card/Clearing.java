package com.example.joker_card;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Clearing extends Activity {
    Context context_table;
    Context context_down_left_2;
    Context context_down_right_2;
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
    Clearing(Context context_table, Context context_down_left_2, Context context_down_right_2,
             Context context_field_card_1, Context context_field_card_2, Context context_field_card_3,
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

        center_2.setVisibility(View.VISIBLE);
        MainClass.button_hold_1.setVisibility(View.VISIBLE);
        MainClass.button_hold_2.setVisibility(View.VISIBLE);
        MainClass.button_hold_3.setVisibility(View.VISIBLE);
        MainClass.button_hold_4.setVisibility(View.VISIBLE);
        MainClass.button_hold_5.setVisibility(View.VISIBLE);
        table.setVisibility(View.INVISIBLE);
        winning.setVisibility(View.INVISIBLE);
        winning_1.setVisibility(View.INVISIBLE);
        winning_2.setVisibility(View.INVISIBLE);
        winning_3.setVisibility(View.INVISIBLE);
        winning_4.setVisibility(View.INVISIBLE);
        winning_5.setVisibility(View.INVISIBLE);
        winning_6.setVisibility(View.INVISIBLE);
        winning_7.setVisibility(View.INVISIBLE);
        winning_8.setVisibility(View.INVISIBLE);
        winning_9.setVisibility(View.INVISIBLE);
        winning_10.setVisibility(View.INVISIBLE);
        winning_value.setVisibility(View.INVISIBLE);
        down_left_2.setVisibility(View.INVISIBLE);
        down_right_2.setVisibility(View.INVISIBLE);
        field_card_1.setVisibility(View.INVISIBLE);
        field_card_2.setVisibility(View.INVISIBLE);
        field_card_3.setVisibility(View.INVISIBLE);
        field_card_4.setVisibility(View.INVISIBLE);
        field_card_5.setVisibility(View.INVISIBLE);
        field_joker_1.setVisibility(View.INVISIBLE);
        field_joker_2.setVisibility(View.INVISIBLE);
        field_joker_3.setVisibility(View.INVISIBLE);
        field_joker_4.setVisibility(View.INVISIBLE);
        field_joker_5.setVisibility(View.INVISIBLE);
        field_win_1.setVisibility(View.INVISIBLE);
        field_win_2.setVisibility(View.INVISIBLE);
        field_win_3.setVisibility(View.INVISIBLE);
        field_win_4.setVisibility(View.INVISIBLE);
        field_win_5.setVisibility(View.INVISIBLE);
        field_win_6.setVisibility(View.INVISIBLE);
        field_win_7.setVisibility(View.INVISIBLE);
        field_win_8.setVisibility(View.INVISIBLE);
        field_win_9.setVisibility(View.INVISIBLE);
        field_win_10.setVisibility(View.INVISIBLE);
        field_win_11.setVisibility(View.INVISIBLE);
        field_win_12.setVisibility(View.INVISIBLE);
        center_2.setText("");
        center_2.setVisibility(View.INVISIBLE);
        center_2.setText("");
        center_2.setVisibility(View.INVISIBLE);
        field_card_1.setImageResource(R.drawable.k53);
        field_card_2.setImageResource(R.drawable.k53);
        field_card_3.setImageResource(R.drawable.k53);
        field_card_4.setImageResource(R.drawable.k53);
        field_card_5.setImageResource(R.drawable.k53);
        MainClass.low_1.setVisibility(View.INVISIBLE);
        MainClass.low_2.setVisibility(View.INVISIBLE);
        MainClass.low_3.setVisibility(View.INVISIBLE);
        MainClass.low_4.setVisibility(View.INVISIBLE);
        MainClass.low_5.setVisibility(View.INVISIBLE);
        MainClass.low_6.setVisibility(View.INVISIBLE);
        MainClass.low_7.setVisibility(View.INVISIBLE);
        MainClass.low_8.setVisibility(View.INVISIBLE);
        MainClass.low_9.setVisibility(View.INVISIBLE);
        MainClass.low_10.setVisibility(View.INVISIBLE);
        MainClass.low_11.setVisibility(View.INVISIBLE);
        MainClass.high_1.setVisibility(View.INVISIBLE);
        MainClass.high_2.setVisibility(View.INVISIBLE);
        MainClass.high_3.setVisibility(View.INVISIBLE);
        MainClass.high_4.setVisibility(View.INVISIBLE);
        MainClass.high_5.setVisibility(View.INVISIBLE);
        MainClass.high_6.setVisibility(View.INVISIBLE);
        MainClass.high_7.setVisibility(View.INVISIBLE);
        MainClass.high_8.setVisibility(View.INVISIBLE);
        MainClass.high_9.setVisibility(View.INVISIBLE);
        MainClass.high_10.setVisibility(View.INVISIBLE);
        MainClass.high_11.setVisibility(View.INVISIBLE);
        MainClass.button_low.setVisibility(View.INVISIBLE);
        MainClass.button_high.setVisibility(View.INVISIBLE);
    }
}
