package com.example.joker_card;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Clearing extends Activity {

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
             Context context_winning, Context context_winning_value, Context context_low_1,
             Context context_low_2, Context context_low_3, Context context_low_4, Context context_low_5,
             Context context_low_6, Context context_low_7, Context context_low_8, Context context_low_9,
             Context context_low_10, Context context_low_11, Context context_high_1, Context context_high_2,
             Context context_high_3, Context context_high_4, Context context_high_5, Context context_high_6,
             Context context_high_7, Context context_high_8, Context context_high_9, Context context_high_10,
             Context context_high_11, Context context_button_hold_1, Context context_button_hold_2,
             Context context_button_hold_3, Context context_button_hold_4, Context context_button_hold_5,
             Context context_button_low, Context context_button_high) {

        ImageView field_card_1 = ((Activity)context_field_card_1).findViewById(R.id.field_card_1);
        ImageView field_card_2 = ((Activity)context_field_card_2).findViewById(R.id.field_card_2);
        ImageView field_card_3 = ((Activity)context_field_card_3).findViewById(R.id.field_card_3);
        ImageView field_card_4 = ((Activity)context_field_card_4).findViewById(R.id.field_card_4);
        ImageView field_card_5 = ((Activity)context_field_card_5).findViewById(R.id.field_card_5);
        ImageView field_joker_1 = ((Activity)context_field_joker_1).findViewById(R.id.field_joker_1);
        ImageView field_joker_2 = ((Activity)context_field_joker_2).findViewById(R.id.field_joker_2);
        ImageView field_joker_3 = ((Activity)context_field_joker_3).findViewById(R.id.field_joker_3);
        ImageView field_joker_4 = ((Activity)context_field_joker_4).findViewById(R.id.field_joker_4);
        ImageView field_joker_5 = ((Activity)context_field_joker_5).findViewById(R.id.field_joker_5);
        ImageView table = ((Activity)context_table).findViewById(R.id.table);
        ImageView field_win_1 = ((Activity)context_field_win_1).findViewById(R.id.field_win_1);
        ImageView field_win_2 = ((Activity)context_field_win_2).findViewById(R.id.field_win_2);
        ImageView field_win_3 = ((Activity)context_field_win_3).findViewById(R.id.field_win_3);
        ImageView field_win_4 = ((Activity)context_field_win_4).findViewById(R.id.field_win_4);
        ImageView field_win_5 = ((Activity)context_field_win_5).findViewById(R.id.field_win_5);
        ImageView field_win_6 = ((Activity)context_field_win_6).findViewById(R.id.field_win_6);
        ImageView field_win_7 = ((Activity)context_field_win_7).findViewById(R.id.field_win_7);
        ImageView field_win_8 = ((Activity)context_field_win_8).findViewById(R.id.field_win_8);
        ImageView field_win_9 = ((Activity)context_field_win_9).findViewById(R.id.field_win_9);
        ImageView field_win_10 = ((Activity)context_field_win_10).findViewById(R.id.field_win_10);
        ImageView field_win_11 = ((Activity)context_field_win_11).findViewById(R.id.field_win_11);
        ImageView field_win_12 = ((Activity)context_field_win_12).findViewById(R.id.field_win_12);
        TextView down_left_2 = ((Activity)context_down_left_2).findViewById(R.id.gamble);
        TextView down_right_2 = ((Activity)context_down_right_2).findViewById(R.id.cash);
        TextView center_2 = ((Activity)context_center_2).findViewById(R.id.win);
        TextView winning_1 = ((Activity)context_winning_1).findViewById(R.id.winning_1);
        TextView winning_2 = ((Activity)context_winning_2).findViewById(R.id.winning_2);
        TextView winning_3 = ((Activity)context_winning_3).findViewById(R.id.winning_3);
        TextView winning_4 = ((Activity)context_winning_4).findViewById(R.id.winning_4);
        TextView winning_5 = ((Activity)context_winning_5).findViewById(R.id.winning_5);
        TextView winning_6 = ((Activity)context_winning_6).findViewById(R.id.winning_6);
        TextView winning_7 = ((Activity)context_winning_7).findViewById(R.id.winning_7);
        TextView winning_8 = ((Activity)context_winning_8).findViewById(R.id.winning_8);
        TextView winning_9 = ((Activity)context_winning_9).findViewById(R.id.winning_9);
        TextView winning_10 = ((Activity)context_winning_10).findViewById(R.id.winning_10);
        TextView winning = ((Activity)context_winning).findViewById(R.id.winning);
        TextView winning_value = ((Activity)context_winning_value).findViewById(R.id.winning_value);
        TextView low_1 = ((Activity)context_low_1).findViewById(R.id.low_1);
        TextView low_2 = ((Activity)context_low_2).findViewById(R.id.low_2);
        TextView low_3 = ((Activity)context_low_3).findViewById(R.id.low_3);
        TextView low_4 = ((Activity)context_low_4).findViewById(R.id.low_4);
        TextView low_5 = ((Activity)context_low_5).findViewById(R.id.low_5);
        TextView low_6 = ((Activity)context_low_6).findViewById(R.id.low_6);
        TextView low_7 = ((Activity)context_low_7).findViewById(R.id.low_7);
        TextView low_8 = ((Activity)context_low_8).findViewById(R.id.low_8);
        TextView low_9 = ((Activity)context_low_9).findViewById(R.id.low_9);
        TextView low_10 = ((Activity)context_low_10).findViewById(R.id.low_10);
        TextView low_11 = ((Activity)context_low_11).findViewById(R.id.low_11);
        TextView high_1 = ((Activity)context_high_1).findViewById(R.id.high_1);
        TextView high_2 = ((Activity)context_high_2).findViewById(R.id.high_2);
        TextView high_3 = ((Activity)context_high_3).findViewById(R.id.high_3);
        TextView high_4 = ((Activity)context_high_4).findViewById(R.id.high_4);
        TextView high_5 = ((Activity)context_high_5).findViewById(R.id.high_5);
        TextView high_6 = ((Activity)context_high_6).findViewById(R.id.high_6);
        TextView high_7 = ((Activity)context_high_7).findViewById(R.id.high_7);
        TextView high_8 = ((Activity)context_high_8).findViewById(R.id.high_8);
        TextView high_9 = ((Activity)context_high_9).findViewById(R.id.high_9);
        TextView high_10 = ((Activity)context_high_10).findViewById(R.id.high_10);
        TextView high_11 = ((Activity)context_high_11).findViewById(R.id.high_11);
        Button button_hold_1 = ((Activity)context_button_hold_1).findViewById(R.id.hold_1);
        Button button_hold_2 = ((Activity)context_button_hold_2).findViewById(R.id.hold_2);
        Button button_hold_3 = ((Activity)context_button_hold_3).findViewById(R.id.hold_3);
        Button button_hold_4 = ((Activity)context_button_hold_4).findViewById(R.id.hold_4);
        Button button_hold_5 = ((Activity)context_button_hold_5).findViewById(R.id.hold_5);
        Button button_low = ((Activity)context_button_low).findViewById(R.id.double_low);
        Button button_high = ((Activity)context_button_high).findViewById(R.id.double_high);

        center_2.setVisibility(View.VISIBLE);
        button_hold_1.setVisibility(View.VISIBLE);
        button_hold_2.setVisibility(View.VISIBLE);
        button_hold_3.setVisibility(View.VISIBLE);
        button_hold_4.setVisibility(View.VISIBLE);
        button_hold_5.setVisibility(View.VISIBLE);
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
        low_1.setVisibility(View.INVISIBLE);
        low_2.setVisibility(View.INVISIBLE);
        low_3.setVisibility(View.INVISIBLE);
        low_4.setVisibility(View.INVISIBLE);
        low_5.setVisibility(View.INVISIBLE);
        low_6.setVisibility(View.INVISIBLE);
        low_7.setVisibility(View.INVISIBLE);
        low_8.setVisibility(View.INVISIBLE);
        low_9.setVisibility(View.INVISIBLE);
        low_10.setVisibility(View.INVISIBLE);
        low_11.setVisibility(View.INVISIBLE);
        high_1.setVisibility(View.INVISIBLE);
        high_2.setVisibility(View.INVISIBLE);
        high_3.setVisibility(View.INVISIBLE);
        high_4.setVisibility(View.INVISIBLE);
        high_5.setVisibility(View.INVISIBLE);
        high_6.setVisibility(View.INVISIBLE);
        high_7.setVisibility(View.INVISIBLE);
        high_8.setVisibility(View.INVISIBLE);
        high_9.setVisibility(View.INVISIBLE);
        high_10.setVisibility(View.INVISIBLE);
        high_11.setVisibility(View.INVISIBLE);
        button_low.setVisibility(View.INVISIBLE);
        button_high.setVisibility(View.INVISIBLE);
    }
}
