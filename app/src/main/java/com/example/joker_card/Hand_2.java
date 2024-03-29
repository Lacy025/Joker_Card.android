package com.example.joker_card;

import static com.example.joker_card.MainClass.audio_winner;
import static com.example.joker_card.MainClass.delaying;
import static com.example.joker_card.MainClass.win1;
import static com.example.joker_card.MainClass.win2;
import static com.example.joker_card.MainClass.win3;
import static com.example.joker_card.MainClass.win4;
import static com.example.joker_card.MainClass.win5;
import static com.example.joker_card.MainClass.win6;
import static com.example.joker_card.MainClass.win7;
import static com.example.joker_card.MainClass.win8;
import static com.example.joker_card.MainClass.win9;
import static com.example.joker_card.MainClass.win10;
import static com.example.joker_card.MainClass.won;
import static com.example.joker_card.MainClass.cash;
import static com.example.joker_card.MainClass.choice;
import static com.example.joker_card.MainClass.block;
import static com.example.joker_card.MainClass.dealing;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class Hand_2 extends Activity {
    int n1;
    int n2;
    int n3;
    int n4;
    int n5;
    int b1;
    int b2;
    int b3;
    int b4;
    int b5;
    int Five_of_a_kind;
    int Royal_flush;
    int Street_flush;
    int Poker;
    int Full_house;
    int Flush;
    int Street;
    int Three_of_a_kind;
    int Two_pairs;
    int High_pair;
    int royal;
    int Street_flush_1;
    int Street_flush_2;
    int Street_flush_3;
    int Street_flush_4;
    int Street_flush_5;
    int Street_flush_6;
    int Street_flush_7;
    int Street_flush_8;
    int Street_flush_9;

    Hand_2(Context context_table, Context context_joker, Context context_card,
           Context context_field_card_1, Context context_field_card_2, Context context_field_card_3,
           Context context_field_card_4, Context context_field_card_5, Context context_field_joker_1,
           Context context_field_joker_2, Context context_field_joker_3, Context context_field_joker_4,
           Context context_field_joker_5, Context context_center_2, Context context_winning_1,
           Context context_winning_2, Context context_winning_3, Context context_winning_4,
           Context context_winning_5, Context context_winning_6, Context context_winning_7,
           Context context_winning_8, Context context_winning_9, Context context_winning_10,
           Context context_winning, Context context_winning_value, Context context_button_take,
           Context context_button_deal, Context context_button_hold_1, Context context_button_hold_2,
           Context context_button_hold_3, Context context_button_hold_4, Context context_button_hold_5) {

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
        TextView joker = ((Activity)context_joker).findViewById(R.id.joker);
        TextView card = ((Activity)context_card).findViewById(R.id.card);
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
        Button button_take = ((Activity)context_button_take).findViewById(R.id.take);
        Button button_deal = ((Activity)context_button_deal).findViewById(R.id.deal);
        Button button_hold_1 = ((Activity)context_button_hold_1).findViewById(R.id.hold_1);
        Button button_hold_2 = ((Activity)context_button_hold_2).findViewById(R.id.hold_2);
        Button button_hold_3 = ((Activity)context_button_hold_3).findViewById(R.id.hold_3);
        Button button_hold_4 = ((Activity)context_button_hold_4).findViewById(R.id.hold_4);
        Button button_hold_5 = ((Activity)context_button_hold_5).findViewById(R.id.hold_5);

        button_hold_1.setBackgroundColor(Color.parseColor("#000000"));
        button_hold_2.setBackgroundColor(Color.parseColor("#000000"));
        button_hold_3.setBackgroundColor(Color.parseColor("#000000"));
        button_hold_4.setBackgroundColor(Color.parseColor("#000000"));
        button_hold_5.setBackgroundColor(Color.parseColor("#000000"));

        new Handler(Looper.getMainLooper()).postDelayed(() -> {

            n1 = Card_1.n1;
            n2 = Card_2.n2;
            n3 = Card_3.n3;
            n4 = Card_4.n4;
            n5 = Card_5.n5;
            b1 = Card_1.b1;
            b2 = Card_2.b2;
            b3 = Card_3.b3;
            b4 = Card_4.b4;
            b5 = Card_5.b5;

            won = 0;

            Five_of_a_kind = 0;
            Royal_flush = 0;
            Street_flush = 0;
            Poker = 0;
            Full_house = 0;
            Flush = 0;
            Street = 0;
            Three_of_a_kind = 0;
            Two_pairs = 0;
            High_pair = 0;

            // FIVE OF A KIND

            if (won == 0) {
                if (((n1 == n2) && (n2 == n3) && (n3 == n4) && (n5 == 0)) ||
                        ((n1 == n2) && (n2 == n3) && (n4 == 0) && (n3 == n5)) ||
                        ((n1 == n2) && (n3 == 0) && (n2 == n4) && (n4 == n5)) ||
                        ((n1 == n3) && (n2 == 0) && (n3 == n4) && (n4 == n5)) ||
                        ((n1 == 0) && (n2 == n3) && (n3 == n4) && (n4 == n5))) {

                    won++;
                    Five_of_a_kind = 1;
                }
            }

            // ROYAL FLUSH OR STREET

            royal = 0;
            Street_flush_1 = 0;
            Street_flush_2 = 0;
            Street_flush_3 = 0;
            Street_flush_4 = 0;
            Street_flush_5 = 0;
            Street_flush_6 = 0;
            Street_flush_7 = 0;
            Street_flush_8 = 0;
            Street_flush_9 = 0;

            if (won == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    royal++;
                }
                if (n1 == 10 || n2 == 10 || n3 == 10 || n4 == 10 || n5 == 10) {
                    royal++;
                }
                if (n1 == 11 || n2 == 11 || n3 == 11 || n4 == 11 || n5 == 11) {
                    royal++;
                }
                if (n1 == 12 || n2 == 12 || n3 == 12 || n4 == 12 || n5 == 12) {
                    royal++;
                }
                if (n1 == 13 || n2 == 13 || n3 == 13 || n4 == 13 || n5 == 13) {
                    royal++;
                }
                if (n1 == 14 || n2 == 14 || n3 == 14 || n4 == 14 || n5 == 14) {
                    royal++;
                }
                if (royal == 5) {
                    Color_Check_1();
                }
            }

            // STREET FLUSH OR STREET
            // 9-13

            if (won == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_9++;
                }
                if (n1 == 9 || n2 == 9 || n3 == 9 || n4 == 9 || n5 == 9) {
                    Street_flush_9++;
                }
                if (n1 == 10 || n2 == 10 || n3 == 10 || n4 == 10 || n5 == 10) {
                    Street_flush_9++;
                }
                if (n1 == 11 || n2 == 11 || n3 == 11 || n4 == 11 || n5 == 11) {
                    Street_flush_9++;
                }
                if (n1 == 12 || n2 == 12 || n3 == 12 || n4 == 12 || n5 == 12) {
                    Street_flush_9++;
                }
                if (n1 == 13 || n2 == 13 || n3 == 13 || n4 == 13 || n5 == 13) {
                    Street_flush_9++;
                }
                if (Street_flush_9 == 5) {
                    Color_Check_2();
                }
            }

            // STREET FLUSH OR STREET
            // 8-12

            if (won == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_8++;
                }
                if (n1 == 8 || n2 == 8 || n3 == 8 || n4 == 8 || n5 == 8) {
                    Street_flush_8++;
                }
                if (n1 == 9 || n2 == 9 || n3 == 9 || n4 == 9 || n5 == 9) {
                    Street_flush_8++;
                }
                if (n1 == 10 || n2 == 10 || n3 == 10 || n4 == 10 || n5 == 10) {
                    Street_flush_8++;
                }
                if (n1 == 11 || n2 == 11 || n3 == 11 || n4 == 11 || n5 == 11) {
                    Street_flush_8++;
                }
                if (n1 == 12 || n2 == 12 || n3 == 12 || n4 == 12 || n5 == 12) {
                    Street_flush_8++;
                }
                if (Street_flush_8 == 5) {
                    Color_Check_2();
                }
            }

            // STREET FLUSH OR STREET
            // 7-11

            if (won == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_7++;
                }
                if (n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7) {
                    Street_flush_7++;
                }
                if (n1 == 8 || n2 == 8 || n3 == 8 || n4 == 8 || n5 == 8) {
                    Street_flush_7++;
                }
                if (n1 == 9 || n2 == 9 || n3 == 9 || n4 == 9 || n5 == 9) {
                    Street_flush_7++;
                }
                if (n1 == 10 || n2 == 10 || n3 == 10 || n4 == 10 || n5 == 10) {
                    Street_flush_7++;
                }
                if (n1 == 11 || n2 == 11 || n3 == 11 || n4 == 11 || n5 == 11) {
                    Street_flush_7++;
                }
                if (Street_flush_7 == 5) {
                    Color_Check_2();
                }
            }

            // STREET FLUSH OR STREET
            // 6-10

            if (won == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_6++;
                }
                if (n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6) {
                    Street_flush_6++;
                }
                if (n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7) {
                    Street_flush_6++;
                }
                if (n1 == 8 || n2 == 8 || n3 == 8 || n4 == 8 || n5 == 8) {
                    Street_flush_6++;
                }
                if (n1 == 9 || n2 == 9 || n3 == 9 || n4 == 9 || n5 == 9) {
                    Street_flush_6++;
                }
                if (n1 == 10 || n2 == 10 || n3 == 10 || n4 == 10 || n5 == 10) {
                    Street_flush_6++;
                }
                if (Street_flush_6 == 5) {
                    Color_Check_2();
                }
            }

            // STREET FLUSH OR STREET
            // 5-9

            if (won == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_5++;
                }
                if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5) {
                    Street_flush_5++;
                }
                if (n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6) {
                    Street_flush_5++;
                }
                if (n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7) {
                    Street_flush_5++;
                }
                if (n1 == 8 || n2 == 8 || n3 == 8 || n4 == 8 || n5 == 8) {
                    Street_flush_5++;
                }
                if (n1 == 9 || n2 == 9 || n3 == 9 || n4 == 9 || n5 == 9) {
                    Street_flush_5++;
                }
                if (Street_flush_5 == 5) {
                    Color_Check_2();
                }
            }

            // STREET FLUSH OR STREET
            // 4-8

            if (won == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_4++;
                }
                if (n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4 || n5 == 4) {
                    Street_flush_4++;
                }
                if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5) {
                    Street_flush_4++;
                }
                if (n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6) {
                    Street_flush_4++;
                }
                if (n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7) {
                    Street_flush_4++;
                }
                if (n1 == 8 || n2 == 8 || n3 == 8 || n4 == 8 || n5 == 8) {
                    Street_flush_4++;
                }
                if (Street_flush_4 == 5) {
                    Color_Check_2();
                }
            }

            // STREET FLUSH OR STREET
            // 3-7

            if (won == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_3++;
                }
                if (n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3 || n5 == 3) {
                    Street_flush_3++;
                }
                if (n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4 || n5 == 4) {
                    Street_flush_3++;
                }
                if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5) {
                    Street_flush_3++;
                }
                if (n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6) {
                    Street_flush_3++;
                }
                if (n1 == 7 || n2 == 7 || n3 == 7 || n4 == 7 || n5 == 7) {
                    Street_flush_3++;
                }
                if (Street_flush_3 == 5) {
                    Color_Check_2();
                }
            }

            // STREET FLUSH OR STREET
            // 2-6

            if (won == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_2++;
                }
                if (n1 == 2 || n2 == 2 || n3 == 2 || n4 == 2 || n5 == 2) {
                    Street_flush_2++;
                }
                if (n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3 || n5 == 3) {
                    Street_flush_2++;
                }
                if (n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4 || n5 == 4) {
                    Street_flush_2++;
                }
                if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5) {
                    Street_flush_2++;
                }
                if (n1 == 6 || n2 == 6 || n3 == 6 || n4 == 6 || n5 == 6) {
                    Street_flush_2++;
                }

                if (Street_flush_2 == 5) {
                    Color_Check_2();
                }
            }

            // STREET FLUSH OR STREET
            // 1-5

            if (won == 0) {

                if (n1 == 0 || n2 == 0 || n3 == 0 || n4 == 0 || n5 == 0) {
                    Street_flush_1++;
                }
                if (n1 == 14 || n2 == 14 || n3 == 14 || n4 == 14 || n5 == 14) {
                    Street_flush_1++;
                }
                if (n1 == 2 || n2 == 2 || n3 == 2 || n4 == 2 || n5 == 2) {
                    Street_flush_1++;
                }
                if (n1 == 3 || n2 == 3 || n3 == 3 || n4 == 3 || n5 == 3) {
                    Street_flush_1++;
                }
                if (n1 == 4 || n2 == 4 || n3 == 4 || n4 == 4 || n5 == 4) {
                    Street_flush_1++;
                }
                if (n1 == 5 || n2 == 5 || n3 == 5 || n4 == 5 || n5 == 5) {
                    Street_flush_1++;
                }
                if (Street_flush_1 == 5) {
                    Color_Check_2();
                }
            }

            // POKER

            if (won == 0) {

                if (((n1 == n2) && (n2 == n3) && (n3 == n4)) ||
                        ((n1 == n2) && (n2 == n3) && (n4 == 0)) ||
                        ((n1 == n2) && (n3 == 0) && (n2 == n4)) ||
                        ((n1 == n3) && (n2 == 0) && (n3 == n4)) ||
                        ((n1 == 0) && (n2 == n3) && (n3 == n4))) {

                    won++;
                    Poker = 1;
                }
                if (((n1 == n2) && (n2 == n3) && (n3 == n5)) ||
                        ((n1 == n2) && (n2 == n3) && (n5 == 0)) ||
                        ((n1 == n2) && (n3 == 0) && (n2 == n5)) ||
                        ((n1 == n3) && (n2 == 0) && (n3 == n5)) ||
                        ((n1 == 0) && (n2 == n3) && (n3 == n5))) {

                    won++;
                    Poker = 1;
                }
                if (((n1 == n2) && (n2 == n4) && (n4 == n5)) ||
                        ((n1 == n2) && (n2 == n4) && (n5 == 0)) ||
                        ((n1 == n2) && (n4 == 0) && (n2 == n5)) ||
                        ((n1 == n4) && (n2 == 0) && (n4 == n5)) ||
                        ((n1 == 0) && (n2 == n4) && (n4 == n5))) {

                    won++;
                    Poker = 1;
                }
                if (((n1 == n3) && (n3 == n4) && (n4 == n5)) ||
                        ((n1 == n3) && (n3 == n4) && (n5 == 0)) ||
                        ((n1 == n3) && (n4 == 0) && (n3 == n5)) ||
                        ((n1 == n4) && (n3 == 0) && (n4 == n5)) ||
                        ((n1 == 0) && (n3 == n4) && (n4 == n5))) {

                    won++;
                    Poker = 1;
                }
                if (((n2 == n3) && (n3 == n4) && (n4 == n5)) ||
                        ((n2 == n3) && (n3 == n4) && (n5 == 0)) ||
                        ((n2 == n3) && (n4 == 0) && (n3 == n5)) ||
                        ((n2 == n4) && (n3 == 0) && (n4 == n5)) ||
                        ((n2 == 0) && (n3 == n4) && (n4 == n5))) {

                    won++;
                    Poker = 1;
                }
            }

            //FULL HOUSE

            if (won == 0) {

                if (((n1 == n2) && (n2 == n3) && (n4 == n5)) ||
                        ((n1 == n2) && (n3 == n4) && (n4 == n5)) ||
                        ((n1 == n3) && (n2 == n4) && (n4 == n5)) ||
                        ((n1 == n4) && (n2 == n3) && (n3 == n5)) ||
                        ((n1 == n5) && (n2 == n3) && (n3 == n4)) ||
                        ((n1 == n2) && (n2 == n4) && (n3 == n5)) ||
                        ((n1 == n2) && (n2 == n5) && (n3 == n4)) ||
                        ((n1 == n3) && (n3 == n4) && (n2 == n5)) ||
                        ((n1 == n3) && (n3 == n5) && (n2 == n4)) ||
                        ((n1 == n4) && (n4 == n5) && (n2 == n3)) ||
                        ((n1 == n2) && (n3 == 0) && (n4 == n5)) ||
                        ((n1 == n2) && (n4 == 0) && (n3 == n5)) ||
                        ((n1 == n2) && (n5 == 0) && (n3 == n4)) ||
                        ((n1 == n3) && (n2 == 0) && (n4 == n5)) ||
                        ((n1 == n3) && (n4 == 0) && (n2 == n5)) ||
                        ((n1 == n3) && (n5 == 0) && (n2 == n4)) ||
                        ((n1 == n4) && (n2 == 0) && (n3 == n5)) ||
                        ((n1 == n4) && (n3 == 0) && (n2 == n5)) ||
                        ((n1 == n4) && (n5 == 0) && (n2 == n3)) ||
                        ((n1 == n5) && (n2 == 0) && (n3 == n4)) ||
                        ((n1 == n5) && (n3 == 0) && (n2 == n4)) ||
                        ((n1 == n5) && (n4 == 0) && (n2 == n3)) ||
                        ((n1 == 0) && (n2 == n3) && (n4 == n5)) ||
                        ((n1 == 0) && (n2 == n4) && (n3 == n5)) ||
                        ((n1 == 0) && (n2 == n5) && (n3 == n4))) {

                    won++;
                    Full_house = 1;
                }
            }

            //FLUSH

            if (won == 0) {

                if (((b1 == b2) && (b2 == b3) && (b3 == b4) && (b4 == b5)) ||
                        ((b1 == b2) && (b2 == b3) && (b3 == b4) && (n5 == 0)) ||
                        ((b1 == b2) && (b2 == b3) && (n4 == 0) && (b3 == b5)) ||
                        ((b1 == b2) && (n3 == 0) && (b2 == b4) && (b4 == b5)) ||
                        ((b1 == b3) && (n2 == 0) && (b3 == b4) && (b4 == b5)) ||
                        ((n1 == 0) && (b2 == b3) && (b3 == b4) && (b4 == b5))) {

                    won++;
                    Flush = 1;
                }
            }

            //THREE OF A KIND

            if (won == 0) {

                if (((n1 == n2) && (n2 == n3)) || ((n1 == n2) && (n3 == 0)) || ((n1 == n3) && (n2 == 0)) || ((n2 == n3) && (n1 == 0))) {

                    won++;
                    Three_of_a_kind = 1;
                }
                if (((n1 == n2) && (n2 == n4)) || ((n1 == n2) && (n4 == 0)) || ((n1 == n4) && (n2 == 0)) || ((n2 == n4) && (n1 == 0))) {

                    won++;
                    Three_of_a_kind = 1;
                }
                if (((n1 == n2) && (n2 == n5)) || ((n1 == n2) && (n5 == 0)) || ((n1 == n5) && (n2 == 0)) || ((n2 == n5) && (n1 == 0))) {

                    won++;
                    Three_of_a_kind = 1;
                }
                if (((n1 == n3) && (n3 == n4)) || ((n1 == n3) && (n4 == 0)) || ((n1 == n4) && (n3 == 0)) || ((n3 == n4) && (n1 == 0))) {

                    won++;
                    Three_of_a_kind = 1;
                }
                if (((n1 == n3) && (n3 == n5)) || ((n1 == n3) && (n5 == 0)) || ((n1 == n5) && (n3 == 0)) || ((n3 == n5) && (n1 == 0))) {

                    won++;
                    Three_of_a_kind = 1;
                }
                if (((n1 == n4) && (n4 == n5)) || ((n1 == n4) && (n5 == 0)) || ((n1 == n5) && (n4 == 0)) || ((n4 == n5) && (n1 == 0))) {

                    won++;
                    Three_of_a_kind = 1;
                }
                if (((n2 == n3) && (n3 == n4)) || ((n2 == n3) && (n4 == 0)) || ((n2 == n4) && (n3 == 0)) || ((n3 == n4) && (n2 == 0))) {

                    won++;
                    Three_of_a_kind = 1;
                }
                if (((n2 == n3) && (n3 == n5)) || ((n2 == n3) && (n5 == 0)) || ((n2 == n5) && (n3 == 0)) || ((n3 == n5) && (n2 == 0))) {

                    won++;
                    Three_of_a_kind = 1;
                }
                if (((n2 == n4) && (n4 == n5)) || ((n2 == n4) && (n5 == 0)) || ((n2 == n5) && (n4 == 0)) || ((n4 == n5) && (n2 == 0))) {

                    won++;
                    Three_of_a_kind = 1;
                }
                if (((n3 == n4) && (n4 == n5)) || ((n3 == n4) && (n5 == 0)) || ((n3 == n5) && (n4 == 0)) || ((n4 == n5) && (n3 == 0))) {

                    won++;
                    Three_of_a_kind = 1;
                }
            }

            //2 PAIRS

            if (won == 0) {

                if (((n1 == n2) && (n3 == n4)) || ((n1 == n3) && (n2 == n4)) || ((n1 == n4) && (n2 == n3))) {

                    won++;
                    Two_pairs = 1;
                }
                if (((n1 == n2) && (n3 == n5)) || ((n1 == n3) && (n2 == n5)) || ((n1 == n5) && (n2 == n3))) {

                    won++;
                    Two_pairs = 1;
                }
                if (((n1 == n2) && (n4 == n5)) || ((n1 == n5) && (n2 == n4)) || ((n1 == n4) && (n2 == n5))) {

                    won++;
                    Two_pairs = 1;
                }
                if (((n1 == n3) && (n4 == n5)) || ((n1 == n5) && (n3 == n4)) || ((n1 == n4) && (n3 == n5))) {

                    won++;
                    Two_pairs = 1;
                }
                if (((n2 == n3) && (n4 == n5)) || ((n3 == n5) && (n2 == n4)) || ((n3 == n4) && (n2 == n5))) {

                    won++;
                    Two_pairs = 1;
                }
            }

            //HIGH PAIR

            if (won == 0) {
                if (n1 == n2) {
                    if (n1 > 10) {
                        won++;
                        High_pair = 1;
                    }
                }
                if (n1 == n3) {
                    if (n1 > 10) {
                        won++;
                        High_pair = 1;
                    }
                }
                if (n1 == n4) {
                    if (n1 > 10) {
                        won++;
                        High_pair = 1;
                    }
                }
                if (n1 == n5) {
                    if (n1 > 10) {
                        won++;
                        High_pair = 1;
                    }
                }
                if (n2 == n3) {
                    if (n2 > 10) {
                        won++;
                        High_pair = 1;
                    }
                }
                if (n2 == n4) {
                    if (n2 > 10) {
                        won++;
                        High_pair = 1;
                    }
                }
                if (n2 == n5) {
                    if (n2 > 10) {
                        won++;
                        High_pair = 1;
                    }
                }
                if (n3 == n4) {
                    if (n3 > 10) {
                        won++;
                        High_pair = 1;
                    }
                }
                if (n3 == n5) {
                    if (n3 > 10) {
                        won++;
                        High_pair = 1;
                    }
                }
                if (n4 == n5) {
                    if (n4 > 10) {
                        won++;
                        High_pair = 1;
                    }
                }
            }

            //HIGH PAIR WITH JOKER

            if (won == 0) {

                if (n1 == 0) {
                    if (n2 > 10 || n3 > 10 || n4 > 10 || n5 > 10) {
                        won++;
                        High_pair = 1;
                    }
                }
                if (n2 == 0) {
                    if (n1 > 10 || n3 > 10 || n4 > 10 || n5 > 10) {
                        won++;
                        High_pair = 1;
                    }
                }
                if (n3 == 0) {
                    if (n1 > 10 || n2 > 10 || n4 > 10 || n5 > 10) {
                        won++;
                        High_pair = 1;
                    }
                }
                if (n4 == 0) {
                    if (n1 > 10 || n2 > 10 || n3 > 10 || n5 > 10) {
                        won++;
                        High_pair = 1;
                    }
                }
                if (n5 == 0) {
                    if (n1 > 10 || n2 > 10 || n3 > 10 || n4 > 10) {
                        won++;
                        High_pair = 1;
                    }
                }
            }
            button_hold_1.setBackgroundColor(Color.parseColor("#000000"));
            button_hold_2.setBackgroundColor(Color.parseColor("#000000"));
            button_hold_3.setBackgroundColor(Color.parseColor("#000000"));
            button_hold_4.setBackgroundColor(Color.parseColor("#000000"));
            button_hold_5.setBackgroundColor(Color.parseColor("#000000"));

            if (Five_of_a_kind == 1) {
                table.setVisibility(View.VISIBLE);
                winning_1.setVisibility(View.VISIBLE);
                winning.setVisibility(View.VISIBLE);
                winning_value.setText(String.format(Locale.getDefault(), "%d", (win1)));
                cash = win1;
            }
            if (Royal_flush == 1) {
                table.setVisibility(View.VISIBLE);
                winning_2.setVisibility(View.VISIBLE);
                winning.setVisibility(View.VISIBLE);
                winning_value.setText(String.format(Locale.getDefault(), "%d", (win2)));
                cash = win2;
            }
            if (Street_flush == 1) {
                table.setVisibility(View.VISIBLE);
                winning_3.setVisibility(View.VISIBLE);
                winning.setVisibility(View.VISIBLE);
                winning_value.setText(String.format(Locale.getDefault(), "%d", (win3)));
                cash = win3;
            }
            if (Poker == 1) {
                table.setVisibility(View.VISIBLE);
                winning_4.setVisibility(View.VISIBLE);
                winning.setVisibility(View.VISIBLE);
                winning_value.setText(String.format(Locale.getDefault(), "%d", (win4)));
                cash = win4;
            }
            if (Full_house == 1) {
                table.setVisibility(View.VISIBLE);
                winning_5.setVisibility(View.VISIBLE);
                winning.setVisibility(View.VISIBLE);
                winning_value.setText(String.format(Locale.getDefault(), "%d", (win5)));
                cash = win5;
            }
            if (Flush == 1) {
                table.setVisibility(View.VISIBLE);
                winning_6.setVisibility(View.VISIBLE);
                winning.setVisibility(View.VISIBLE);
                winning_value.setText(String.format(Locale.getDefault(), "%d", (win6)));
                cash = win6;
            }
            if (Street == 1) {
                table.setVisibility(View.VISIBLE);
                winning_7.setVisibility(View.VISIBLE);
                winning.setVisibility(View.VISIBLE);
                winning_value.setText(String.format(Locale.getDefault(), "%d", (win7)));
                cash = win7;
            }
            if (Three_of_a_kind == 1) {
                table.setVisibility(View.VISIBLE);
                winning_8.setVisibility(View.VISIBLE);
                winning.setVisibility(View.VISIBLE);
                winning_value.setText(String.format(Locale.getDefault(), "%d", (win8)));
                cash = win8;
            }
            if (Two_pairs == 1) {
                table.setVisibility(View.VISIBLE);
                winning_9.setVisibility(View.VISIBLE);
                winning.setVisibility(View.VISIBLE);
                winning_value.setText(String.format(Locale.getDefault(), "%d", (win9)));
                cash = win9;
            }
            if (High_pair == 1) {
                table.setVisibility(View.VISIBLE);
                winning_10.setVisibility(View.VISIBLE);
                winning.setVisibility(View.VISIBLE);
                winning_value.setText(String.format(Locale.getDefault(), "%d", (win10)));
                cash = win10;
            }
            if (won == 1) {
                button_take.setText(R.string.cash);
                button_deal.setText(R.string.gamble);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                winning_value.setVisibility(View.VISIBLE);
                audio_winner.start();
                button_hold_1.setVisibility(View.INVISIBLE);
                button_hold_2.setVisibility(View.INVISIBLE);
                button_hold_3.setVisibility(View.INVISIBLE);
                button_hold_4.setVisibility(View.INVISIBLE);
                button_hold_5.setVisibility(View.INVISIBLE);

                choice = 2;

                if(cash > 9999) {
                    block = 1;
                    center_2.setText(R.string.win);
                    center_2.setVisibility(View.VISIBLE);
                    button_take.setText(R.string.win);
                    button_deal.setText(R.string.win);
                }
            }
            else {
                button_take.setText(R.string.auto_hold);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                field_card_1.setImageResource(R.drawable.k53);
                field_card_2.setImageResource(R.drawable.k53);
                field_card_3.setImageResource(R.drawable.k53);
                field_card_4.setImageResource(R.drawable.k53);
                field_card_5.setImageResource(R.drawable.k53);
                field_card_1.setVisibility(View.INVISIBLE);
                field_card_2.setVisibility(View.INVISIBLE);
                field_card_3.setVisibility(View.INVISIBLE);
                field_card_4.setVisibility(View.INVISIBLE);
                field_card_5.setVisibility(View.INVISIBLE);
                dealing = 0;
                Jokers.handler1.removeCallbacks(Jokers.runnable1);
                Jokers.handler2.removeCallbacks(Jokers.runnable2);
                Jokers.handler3.removeCallbacks(Jokers.runnable3);
                Jokers.handler4.removeCallbacks(Jokers.runnable4);
                Jokers.handler5.removeCallbacks(Jokers.runnable5);
                Jokers.handler6.removeCallbacks(Jokers.runnable6);
                Jokers.handler7.removeCallbacks(Jokers.runnable7);
                Jokers.handler8.removeCallbacks(Jokers.runnable8);
                new Jokers(joker.getContext(), card.getContext(),field_card_1.getContext(),
                        field_card_2.getContext(), field_card_3.getContext(), field_card_4.getContext(),
                        field_card_5.getContext(), field_joker_1.getContext(), field_joker_2.getContext(),
                        field_joker_3.getContext(), field_joker_4.getContext(), field_joker_5.getContext());
            }
        }, delaying);
    }
    void Color_Check_1() {

        won++;

        if (((b1 == b2) && (b2 == b3) && (b3 == b4) && (n5 == 0)) ||
                ((b1 == b2) && (b2 == b3) && (n4 == 0) && (b3 == b5)) ||
                ((b1 == b2) && (n3 == 0) && (b2 == b4) && (b4 == b5)) ||
                ((b1 == b3) && (n2 == 0) && (b3 == b4) && (b4 == b5)) ||
                ((n1 == 0) && (b2 == b3) && (b3 == b4) && (b4 == b5)) ||
                (b1 == b2) && (b2 == b3) && (b3 == b4) && (b4 == b5)) {

            Royal_flush = 1;
        }
        else {
            Street = 1;
        }
    }
    void Color_Check_2() {

        won++;

        if (((b1 == b2) && (b2 == b3) && (b3 == b4) && (n5 == 0)) ||
                ((b1 == b2) && (b2 == b3) && (n4 == 0) && (b3 == b5)) ||
                ((b1 == b2) && (n3 == 0) && (b2 == b4) && (b4 == b5)) ||
                ((b1 == b3) && (n2 == 0) && (b3 == b4) && (b4 == b5)) ||
                ((n1 == 0) && (b2 == b3) && (b3 == b4) && (b4 == b5)) ||
                (b1 == b2) && (b2 == b3) && (b3 == b4) && (b4 == b5)) {

            Street_flush = 1;
        }
        else {
            Street = 1;
        }
    }
}
