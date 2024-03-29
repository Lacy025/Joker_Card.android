package com.example.joker_card;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class MainClass extends AppCompatActivity implements View.OnClickListener {
    Button button_credit;
    Button button_bet;
    Button button_take;
    Button button_deal;
    Button button_hold_1;
    Button button_hold_2;
    Button button_hold_3;
    Button button_hold_4;
    Button button_hold_5;
    Button button_low;
    Button button_high;
    static int money;
    TextView credit_value;
    int game;
    int bet_value;
    static int auto_hold_value;
    int d1;
    int d2;
    int d3;
    int d4;
    int d5;
    int d6;
    int d7;
    int d8;
    int d9;
    int d10;
    static int win1;
    static int win2;
    static int win3;
    static int win4;
    static int win5;
    static int win6;
    static int win7;
    static int win8;
    static int win9;
    static int win10;
    static int dealing;
    static int stop;
    static int choice;
    static int k1;
    static int k2;
    static int k3;
    static int k4;
    static int k5;
    static int dk;
    static int dk1;
    static int dk2;
    static int dk3;
    static int dk4;
    static int dk5;
    static int dk6;
    static int dk7;
    static int dk8;
    static int dk9;
    static int dk10;
    static int dk11;
    static int delaying;
    static int taking;
    static int cash;
    static int won;
    static int profit;
    static int block;
    static int doubling;
    static int double_card;
    static int missed;
    static int interval;
    int hold;
    MediaPlayer audio_credit;
    MediaPlayer audio_bet;
    MediaPlayer audio_auto_hold;
    MediaPlayer audio_deal_cards_1;
    MediaPlayer audio_clear;
    MediaPlayer audio_deal_cards_2;
    static MediaPlayer audio_card_1;
    static MediaPlayer audio_card_2;
    static MediaPlayer audio_card_3;
    static MediaPlayer audio_card_4;
    static MediaPlayer audio_card_5;
    MediaPlayer audio_cards;
    static MediaPlayer audio_winner;
    static MediaPlayer audio_intro;
    static MediaPlayer audio_count_1;
    static MediaPlayer audio_count_100;
    static MediaPlayer audio_stop_1;
    static MediaPlayer audio_stop_2;
    static MediaPlayer audio_stop_3;
    static MediaPlayer audio_stop_4;
    static MediaPlayer audio_stop_5;
    static MediaPlayer audio_low;
    static MediaPlayer audio_high;
    static MediaPlayer audio_bingo;
    TextView hand_1;
    TextView hand_2;
    TextView hand_3;
    TextView hand_4;
    TextView hand_5;
    TextView hand_6;
    TextView hand_7;
    TextView hand_8;
    TextView hand_9;
    TextView hand_10;
    TextView d_1;
    TextView d_2;
    TextView d_3;
    TextView d_4;
    TextView d_5;
    TextView d_6;
    TextView d_7;
    TextView d_8;
    TextView d_9;
    TextView d_10;
    TextView auto_hold_view;
    ImageView field_card_1;
    ImageView field_card_2;
    ImageView field_card_3;
    ImageView field_card_4;
    ImageView field_card_5;
    ImageView field_joker_1;
    ImageView field_joker_2;
    ImageView field_joker_3;
    ImageView field_joker_4;
    ImageView field_joker_5;
    ImageView table;
    ImageView field_win_1;
    ImageView field_win_2;
    ImageView field_win_3;
    ImageView field_win_4;
    ImageView field_win_5;
    ImageView field_win_6;
    ImageView field_win_7;
    ImageView field_win_8;
    ImageView field_win_9;
    ImageView field_win_10;
    ImageView field_win_11;
    ImageView field_win_12;
    TextView down_left_1;
    TextView down_right_1;
    TextView down_left_2;
    TextView down_right_2;
    TextView joker;
    TextView card;
    TextView center_1;
    TextView center_2;
    TextView winning_1;
    TextView winning_2;
    TextView winning_3;
    TextView winning_4;
    TextView winning_5;
    TextView winning_6;
    TextView winning_7;
    TextView winning_8;
    TextView winning_9;
    TextView winning_10;
    TextView winning;
    TextView winning_value;
    TextView low;
    TextView high;
    TextView low_1;
    TextView low_2;
    TextView low_3;
    TextView low_4;
    TextView low_5;
    TextView low_6;
    TextView low_7;
    TextView low_8;
    TextView low_9;
    TextView low_10;
    TextView low_11;
    TextView high_1;
    TextView high_2;
    TextView high_3;
    TextView high_4;
    TextView high_5;
    TextView high_6;
    TextView high_7;
    TextView high_8;
    TextView high_9;
    TextView high_10;
    TextView high_11;
    Timer timer1;
    TimerTask task1;
    Timer timer2;
    TimerTask task2;
    Timer timer3;
    TimerTask task3;
    public static Handler handler0;
    public static Runnable runnable0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Configuration config = getResources().getConfiguration();

        if (config.smallestScreenWidthDp >= 600) {
            setContentView(R.layout.activity_tablet);
        } else {
            setContentView(R.layout.activity_main);
        }

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Start();

        button_credit = findViewById(R.id.credit);
        button_credit.setOnClickListener(this);
        button_bet = findViewById(R.id.bet);
        button_bet.setOnClickListener(this);
        button_take = findViewById(R.id.take);
        button_take.setOnClickListener(this);
        button_deal = findViewById(R.id.deal);
        button_deal.setOnClickListener(this);

        auto_hold_view = findViewById(R.id.auto_hold);
        credit_value = findViewById(R.id.credit_value);

        button_hold_1 = findViewById(R.id.hold_1);
        button_hold_1.setOnClickListener(this);
        button_hold_2 = findViewById(R.id.hold_2);
        button_hold_2.setOnClickListener(this);
        button_hold_3 = findViewById(R.id.hold_3);
        button_hold_3.setOnClickListener(this);
        button_hold_4 = findViewById(R.id.hold_4);
        button_hold_4.setOnClickListener(this);
        button_hold_5 = findViewById(R.id.hold_5);
        button_hold_5.setOnClickListener(this);

        button_low = findViewById(R.id.double_low);
        button_low.setOnClickListener(this);
        button_high = findViewById(R.id.double_high);
        button_high.setOnClickListener(this);

        down_left_1 = findViewById(R.id.left);
        down_right_1 = findViewById(R.id.right);
        joker = findViewById(R.id.joker);
        card = findViewById(R.id.card);
        center_1 = findViewById(R.id.center_1);
        center_2 = findViewById(R.id.win);
        down_left_2 = findViewById(R.id.gamble);
        down_right_2 = findViewById(R.id.cash);

        low = findViewById(R.id.low);
        high = findViewById(R.id.high);

        field_card_1 = findViewById(R.id.field_card_1);
        field_card_2 = findViewById(R.id.field_card_2);
        field_card_3 = findViewById(R.id.field_card_3);
        field_card_4 = findViewById(R.id.field_card_4);
        field_card_5 = findViewById(R.id.field_card_5);

        field_joker_1 = findViewById(R.id.field_joker_1);
        field_joker_2 = findViewById(R.id.field_joker_2);
        field_joker_3 = findViewById(R.id.field_joker_3);
        field_joker_4 = findViewById(R.id.field_joker_4);
        field_joker_5 = findViewById(R.id.field_joker_5);

        hand_1 = findViewById(R.id.hand_1);
        hand_2 = findViewById(R.id.hand_2);
        hand_3 = findViewById(R.id.hand_3);
        hand_4 = findViewById(R.id.hand_4);
        hand_5 = findViewById(R.id.hand_5);
        hand_6 = findViewById(R.id.hand_6);
        hand_7 = findViewById(R.id.hand_7);
        hand_8 = findViewById(R.id.hand_8);
        hand_9 = findViewById(R.id.hand_9);
        hand_10 = findViewById(R.id.hand_10);

        d_1 = findViewById(R.id.value_1);
        d_2 = findViewById(R.id.value_2);
        d_3 = findViewById(R.id.value_3);
        d_4 = findViewById(R.id.value_4);
        d_5 = findViewById(R.id.value_5);
        d_6 = findViewById(R.id.value_6);
        d_7 = findViewById(R.id.value_7);
        d_8 = findViewById(R.id.value_8);
        d_9 = findViewById(R.id.value_9);
        d_10 = findViewById(R.id.value_10);

        table = findViewById(R.id.table);
        winning_1 = findViewById(R.id.winning_1);
        winning_2 = findViewById(R.id.winning_2);
        winning_3 = findViewById(R.id.winning_3);
        winning_4 = findViewById(R.id.winning_4);
        winning_5 = findViewById(R.id.winning_5);
        winning_6 = findViewById(R.id.winning_6);
        winning_7 = findViewById(R.id.winning_7);
        winning_8 = findViewById(R.id.winning_8);
        winning_9 = findViewById(R.id.winning_9);
        winning_10 = findViewById(R.id.winning_10);
        winning = findViewById(R.id.winning);

        field_win_1 = findViewById(R.id.field_win_1);
        field_win_2 = findViewById(R.id.field_win_2);
        field_win_3 = findViewById(R.id.field_win_3);
        field_win_4 = findViewById(R.id.field_win_4);
        field_win_5 = findViewById(R.id.field_win_5);
        field_win_6 = findViewById(R.id.field_win_6);
        field_win_7 = findViewById(R.id.field_win_7);
        field_win_8 = findViewById(R.id.field_win_8);
        field_win_9 = findViewById(R.id.field_win_9);
        field_win_10 = findViewById(R.id.field_win_10);
        field_win_11 = findViewById(R.id.field_win_11);
        field_win_12 = findViewById(R.id.field_win_12);

        low_1 = findViewById(R.id.low_1);
        low_2 = findViewById(R.id.low_2);
        low_3 = findViewById(R.id.low_3);
        low_4 = findViewById(R.id.low_4);
        low_5 = findViewById(R.id.low_5);
        low_6 = findViewById(R.id.low_6);
        low_7 = findViewById(R.id.low_7);
        low_8 = findViewById(R.id.low_8);
        low_9 = findViewById(R.id.low_9);
        low_10 = findViewById(R.id.low_10);
        low_11 = findViewById(R.id.low_11);

        high_1 = findViewById(R.id.high_1);
        high_2 = findViewById(R.id.high_2);
        high_3 = findViewById(R.id.high_3);
        high_4 = findViewById(R.id.high_4);
        high_5 = findViewById(R.id.high_5);
        high_6 = findViewById(R.id.high_6);
        high_7 = findViewById(R.id.high_7);
        high_8 = findViewById(R.id.high_8);
        high_9 = findViewById(R.id.high_9);
        high_10 = findViewById(R.id.high_10);
        high_11 = findViewById(R.id.high_11);

        timer1 = new Timer();
        timer2 = new Timer();
        timer3 = new Timer();

        intro();
        audio_intro.start();
        Bet();
        new Jokers(joker.getContext(), card.getContext(),field_card_1.getContext(),
                field_card_2.getContext(), field_card_3.getContext(), field_card_4.getContext(),
                field_card_5.getContext(), field_joker_1.getContext(), field_joker_2.getContext(),
                field_joker_3.getContext(), field_joker_4.getContext(), field_joker_5.getContext());
        timer1.schedule(task1 = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> new Handler(Looper.getMainLooper()).postDelayed(
                        () -> {
                            Jokers.handler1.removeCallbacks(Jokers.runnable1);
                            Jokers.handler2.removeCallbacks(Jokers.runnable2);
                            Jokers.handler3.removeCallbacks(Jokers.runnable3);
                            Jokers.handler4.removeCallbacks(Jokers.runnable4);
                            Jokers.handler5.removeCallbacks(Jokers.runnable5);
                            Jokers.handler6.removeCallbacks(Jokers.runnable6);
                            Jokers.handler7.removeCallbacks(Jokers.runnable7);
                            Jokers.handler8.removeCallbacks(Jokers.runnable8);
                            new Jokers(joker.getContext(), card.getContext(),field_card_1.getContext(),
                                    field_card_2.getContext(), field_card_3.getContext(),
                                    field_card_4.getContext(), field_card_5.getContext(),
                                    field_joker_1.getContext(), field_joker_2.getContext(),
                                    field_joker_3.getContext(), field_joker_4.getContext(),
                                    field_joker_5.getContext());
                        }, 0));
            }
        }, 0, 12000);

        timer2.schedule(task2 = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> {
                    new Handler(Looper.getMainLooper()).postDelayed(
                            () -> {
                                if(money == 0 && dealing == 0) {
                                    down_left_1.setText(R.string.author);
                                    down_left_1.setVisibility(View.VISIBLE);
                                    down_right_1.setVisibility(View.INVISIBLE);
                                    auto_hold_view.setTextColor(Color.BLUE);
                                    auto_hold_value = 1;
                                }
                                if(money > 0 && dealing == 0) {
                                    down_left_1.setVisibility(View.INVISIBLE);
                                    down_right_1.setVisibility(View.INVISIBLE);
                                    center_1.setText(R.string.choose_bet);
                                    center_1.setVisibility(View.VISIBLE);
                                    button_take.setText(R.string.auto_hold);
                                    button_deal.setText(R.string.deal_cards);
                                }
                                if(money > 0 && dealing == 2) {
                                    center_1.setText(R.string.pick_cards);
                                    center_1.setVisibility(View.VISIBLE);
                                    button_take.setText(R.string.clear_cards);
                                }
                                if(won == 1) {
                                    down_left_2.setVisibility(View.VISIBLE);
                                    down_right_2.setVisibility(View.INVISIBLE);
                                }
                            }, 1000);
                    new Handler(Looper.getMainLooper()).postDelayed(
                            () -> {
                                if(money == 0 && dealing == 0) {
                                    down_left_1.setVisibility(View.INVISIBLE);
                                    down_right_1.setText(R.string.serbia_2023);
                                    down_right_1.setVisibility(View.VISIBLE);
                                    auto_hold_view.setTextColor(Color.BLUE);
                                    auto_hold_value = 1;
                                }
                                if((money > 0 && dealing == 0) || (money > 0 && dealing == 2)) {
                                    down_left_1.setText("");
                                    down_left_1.setVisibility(View.INVISIBLE);
                                    down_right_1.setVisibility(View.INVISIBLE);
                                    center_1.setText(R.string.press_deal_cards);
                                    center_1.setVisibility(View.VISIBLE);
                                }
                                if(won == 1) {
                                    down_left_2.setVisibility(View.INVISIBLE);
                                    down_right_2.setVisibility(View.VISIBLE);
                                }
                            }, 2000);
                });
            }
        }, 0, 2000);

        timer3.schedule(task3 = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> new Handler((Looper.getMainLooper())).postDelayed(
                        () -> {
                            if(dealing == 0 && money > 0 && bet_value > money) {
                                bet_value = money;
                                Bet();
                            }
                            if(dealing == 0 && money==0 && game == 1) {
                                bet_value = 1;
                                Bet();
                            }
                            if(dealing == 1) {
                                dealing = 2;
                                Deal_Cards_1();
                                delaying = 500;
                                new Card_1(field_card_1.getContext());
                                delaying = 600;
                                new Card_2(field_card_2.getContext());
                                delaying = 700;
                                new Card_3(field_card_3.getContext());
                                delaying = 800;
                                new Card_4(field_card_4.getContext());
                                delaying = 900;
                                new Card_5(field_card_5.getContext());

                                new Hand_1(hand_1.getContext(), hand_2.getContext(), hand_3.getContext(),
                                        hand_4.getContext(), hand_5.getContext(), hand_6.getContext(),
                                        hand_7.getContext(), hand_8.getContext(), hand_9.getContext(),
                                        hand_10.getContext(), d_1.getContext(), d_2.getContext(), d_3.getContext(),
                                        d_4.getContext(), d_5.getContext(), d_6.getContext(), d_7.getContext(),
                                        d_8.getContext(), d_9.getContext(), d_10.getContext());
                                if(auto_hold_value == 1) {
                                    Stop();
                                }
                                else {
                                    choice = 1;
                                }
                            }
                            if(block == 1) {
                                block = 0;
                                Cash();
                            }
                            if(profit == 1) {
                                new Cashed(table.getContext(), down_left_2.getContext(), down_right_2.getContext(),
                                        joker.getContext(), card.getContext(), field_card_1.getContext(), field_card_2.getContext(),
                                        field_card_3.getContext(), field_card_4.getContext(), field_card_5.getContext(),
                                        field_joker_1.getContext(), field_joker_2.getContext(), field_joker_3.getContext(),
                                        field_joker_4.getContext(), field_joker_5.getContext(), field_win_1.getContext(),
                                        field_win_2.getContext(), field_win_3.getContext(), field_win_4.getContext(),
                                        field_win_5.getContext(), field_win_6.getContext(), field_win_7.getContext(),
                                        field_win_8.getContext(), field_win_9.getContext(), field_win_10.getContext(),
                                        field_win_11.getContext(), field_win_12.getContext(), center_2.getContext(),
                                        winning_1.getContext(), winning_2.getContext(), winning_3.getContext(), winning_4.getContext(),
                                        winning_5.getContext(), winning_6.getContext(), winning_7.getContext(), winning_8.getContext(),
                                        winning_9.getContext(), winning_10.getContext(), winning.getContext(), winning_value.getContext(),
                                        low_1.getContext(), low_2.getContext(), low_3.getContext(), low_4.getContext(), low_5.getContext(),
                                        low_6.getContext(), low_7.getContext(), low_8.getContext(), low_9.getContext(), low_10.getContext(),
                                        low_11.getContext(), high_1.getContext(), high_2.getContext(), high_3.getContext(), high_4.getContext(),
                                        high_5.getContext(), high_6.getContext(), high_7.getContext(), high_8.getContext(), high_9.getContext(),
                                        high_10.getContext(), high_11.getContext(), button_take.getContext(), button_deal.getContext(),
                                        button_hold_1.getContext(), button_hold_2.getContext(), button_hold_3.getContext(),
                                        button_hold_4.getContext(), button_hold_5.getContext(), button_low.getContext(),
                                        button_high.getContext());
                            }
                        }, 100));
            }
        }, 0, 100);
    }
    @Override
    public void onClick(View view) {
        int pressed = view.getId();
        if(pressed == R.id.credit) {
            if (money < 4901 && dealing == 0) {
                intro();
                credit();
                game = 1;
                money += 100;
                credit_value.setText(String.format(Locale.getDefault(), "%d", (money)));
            }
        }
        if(pressed == R.id.bet) {
            if(money > 0 && dealing == 0) {
                bet();
                bet_value += 1;
                if(bet_value == 99 || bet_value > money) {
                    bet_value = 1;
                }
                Bet();
            }
        }
        if(pressed == R.id.take) {
            if (money > 0 && dealing == 0) {
                if (auto_hold_value == 1) {
                    auto_hold_view.setTextColor(Color.BLACK);
                    auto_hold_value = 0;
                }
                else {
                    auto_hold_view.setTextColor(Color.BLUE);
                    auto_hold_value = 1;
                }
                auto_hold();
            }
            else if(choice == 1) {
                clearing_1();
                button_hold_1.setBackgroundColor(Color.parseColor("#000000"));
                button_hold_2.setBackgroundColor(Color.parseColor("#000000"));
                button_hold_3.setBackgroundColor(Color.parseColor("#000000"));
                button_hold_4.setBackgroundColor(Color.parseColor("#000000"));
                button_hold_5.setBackgroundColor(Color.parseColor("#000000"));
                Hand_1.hold1 = 0;
                Hand_1.hold2 = 0;
                Hand_1.hold3 = 0;
                Hand_1.hold4 = 0;
                Hand_1.hold5 = 0;
            }
            else if(choice == 2) {
                Cash();
            }
            else if (doubling == 1) {
                doubling = 0;
                button_low.setVisibility(View.INVISIBLE);
                button_high.setVisibility(View.INVISIBLE);
                low.setVisibility(View.INVISIBLE);
                high.setVisibility(View.INVISIBLE);
                Cash();
            }
        }
        if(pressed == R.id.deal) {
            if((money > 0 && dealing == 0) || (money > 0 && profit == 1)) {
                if(profit == 1) {
                    intro();
                    Cashed.handler9.removeCallbacks(Cashed.runnable9);
                    taking = 0;
                    won = 0;
                    choice = 0;
                    profit = 0;

                    new Clearing(table.getContext(), down_left_2.getContext(), down_right_2.getContext(),
                            field_card_1.getContext(), field_card_2.getContext(), field_card_3.getContext(),
                            field_card_4.getContext(), field_card_5.getContext(), field_joker_1.getContext(),
                            field_joker_2.getContext(), field_joker_3.getContext(), field_joker_4.getContext(),
                            field_joker_5.getContext(), field_win_1.getContext(), field_win_2.getContext(),
                            field_win_3.getContext(), field_win_4.getContext(), field_win_5.getContext(),
                            field_win_6.getContext(), field_win_7.getContext(), field_win_8.getContext(),
                            field_win_9.getContext(), field_win_10.getContext(), field_win_11.getContext(),
                            field_win_12.getContext(), center_2.getContext(), winning_1.getContext(),
                            winning_2.getContext(), winning_3.getContext(), winning_4.getContext(),
                            winning_5.getContext(), winning_6.getContext(), winning_7.getContext(),
                            winning_8.getContext(), winning_9.getContext(), winning_10.getContext(),
                            winning.getContext(), winning_value.getContext(), low_1.getContext(), low_2.getContext(),
                            low_3.getContext(), low_4.getContext(), low_5.getContext(), low_6.getContext(),
                            low_7.getContext(), low_8.getContext(), low_9.getContext(), low_10.getContext(),
                            low_11.getContext(), high_1.getContext(), high_2.getContext(), high_3.getContext(),
                            high_4.getContext(), high_5.getContext(), high_6.getContext(), high_7.getContext(),
                            high_8.getContext(), high_9.getContext(), high_10.getContext(), high_11.getContext(),
                            button_hold_1.getContext(), button_hold_2.getContext(), button_hold_3.getContext(),
                            button_hold_4.getContext(), button_hold_5.getContext(), button_low.getContext(),
                            button_high.getContext());
                }
                Jokers.handler1.removeCallbacks(Jokers.runnable1);
                Jokers.handler2.removeCallbacks(Jokers.runnable2);
                Jokers.handler3.removeCallbacks(Jokers.runnable3);
                Jokers.handler4.removeCallbacks(Jokers.runnable4);
                Jokers.handler5.removeCallbacks(Jokers.runnable5);
                Jokers.handler6.removeCallbacks(Jokers.runnable6);
                Jokers.handler7.removeCallbacks(Jokers.runnable7);
                Jokers.handler8.removeCallbacks(Jokers.runnable8);

                new Clearing(table.getContext(), down_left_2.getContext(), down_right_2.getContext(),
                        field_card_1.getContext(), field_card_2.getContext(), field_card_3.getContext(),
                        field_card_4.getContext(), field_card_5.getContext(), field_joker_1.getContext(),
                        field_joker_2.getContext(), field_joker_3.getContext(), field_joker_4.getContext(),
                        field_joker_5.getContext(), field_win_1.getContext(), field_win_2.getContext(),
                        field_win_3.getContext(), field_win_4.getContext(), field_win_5.getContext(),
                        field_win_6.getContext(), field_win_7.getContext(), field_win_8.getContext(),
                        field_win_9.getContext(), field_win_10.getContext(), field_win_11.getContext(),
                        field_win_12.getContext(), center_2.getContext(), winning_1.getContext(),
                        winning_2.getContext(), winning_3.getContext(), winning_4.getContext(),
                        winning_5.getContext(), winning_6.getContext(), winning_7.getContext(),
                        winning_8.getContext(), winning_9.getContext(), winning_10.getContext(),
                        winning.getContext(), winning_value.getContext(), low_1.getContext(), low_2.getContext(),
                        low_3.getContext(), low_4.getContext(), low_5.getContext(), low_6.getContext(),
                        low_7.getContext(), low_8.getContext(), low_9.getContext(), low_10.getContext(),
                        low_11.getContext(), high_1.getContext(), high_2.getContext(), high_3.getContext(),
                        high_4.getContext(), high_5.getContext(), high_6.getContext(), high_7.getContext(),
                        high_8.getContext(), high_9.getContext(), high_10.getContext(), high_11.getContext(),
                        button_hold_1.getContext(), button_hold_2.getContext(), button_hold_3.getContext(),
                        button_hold_4.getContext(), button_hold_5.getContext(), button_low.getContext(),
                        button_high.getContext());

                joker.setText("");
                joker.setVisibility(View.INVISIBLE);
                card.setText("");
                card.setVisibility(View.INVISIBLE);
                down_left_1.setText("");
                down_left_1.setVisibility(View.INVISIBLE);
                down_right_1.setText("");
                down_right_1.setVisibility(View.INVISIBLE);
                center_1.setText("");
                center_1.setVisibility(View.INVISIBLE);

                money = money - bet_value;
                credit_value.setText(String.format(Locale.getDefault(), "%d", (money)));

                field_card_1.setVisibility(View.VISIBLE);
                field_card_2.setVisibility(View.VISIBLE);
                field_card_3.setVisibility(View.VISIBLE);
                field_card_4.setVisibility(View.VISIBLE);
                field_card_5.setVisibility(View.VISIBLE);

                deal_cards_1();
                deal_cards();

                while(k1 == k2 || k1 == k3 || k1 == k4 || k1 == k5 || k2 == k3 ||
                        k2 == k4 || k2 == k5 || k3 == k4 || k3 == k5 || k4 == k5) {
                    deal_cards_1();
                }
                dealing = 1;
            }
            else if(choice == 1) {
                deal_cards_2();
                choice = 0;
                dealing = 3;
                center_1.setText("");
                center_1.setVisibility(View.INVISIBLE);
                hold = 300;
                delaying = 50;

                hand_1.setBackgroundColor(Color.BLACK);
                hand_2.setBackgroundColor(Color.BLACK);
                hand_3.setBackgroundColor(Color.BLACK);
                hand_4.setBackgroundColor(Color.BLACK);
                hand_5.setBackgroundColor(Color.BLACK);
                hand_6.setBackgroundColor(Color.BLACK);
                hand_7.setBackgroundColor(Color.BLACK);
                hand_8.setBackgroundColor(Color.BLACK);
                hand_9.setBackgroundColor(Color.BLACK);
                hand_10.setBackgroundColor(Color.BLACK);
                d_1.setBackgroundColor(Color.BLACK);
                d_2.setBackgroundColor(Color.BLACK);
                d_3.setBackgroundColor(Color.BLACK);
                d_4.setBackgroundColor(Color.BLACK);
                d_5.setBackgroundColor(Color.BLACK);
                d_6.setBackgroundColor(Color.BLACK);
                d_7.setBackgroundColor(Color.BLACK);
                d_8.setBackgroundColor(Color.BLACK);
                d_9.setBackgroundColor(Color.BLACK);
                d_10.setBackgroundColor(Color.BLACK);

                if(Hand_1.hold1 == 0) {
                    field_card_1.setVisibility(View.INVISIBLE);
                    field_card_1.setImageResource(R.drawable.k53);
                    field_card_1.setVisibility(View.VISIBLE);
                    k1 = (int) Math.floor(Math.random() * 53);
                    while (k1 == k2 || k1 == k3 || k1 == k4 || k1 == k5) {
                        k1 = (int) Math.floor(Math.random() * 53);
                    }
                    card_1();
                    delaying = delaying + hold;
                    new Card_1(field_card_1.getContext());
                }
                if(Hand_1.hold2 == 0) {
                    field_card_2.setVisibility(View.INVISIBLE);
                    field_card_2.setImageResource(R.drawable.k53);
                    field_card_2.setVisibility(View.VISIBLE);
                    k2 = (int) Math.floor(Math.random() * 53);
                    while (k2 == k1 || k2 == k3 || k2 == k4 || k2 == k5) {
                        k2 = (int) Math.floor(Math.random() * 53);
                    }
                    card_2();
                    delaying = delaying + hold;
                    new Card_2(field_card_2.getContext());
                }
                if(Hand_1.hold3 == 0) {
                    field_card_3.setVisibility(View.INVISIBLE);
                    field_card_3.setImageResource(R.drawable.k53);
                    field_card_3.setVisibility(View.VISIBLE);
                    k3 = (int) Math.floor(Math.random() * 53);
                    while (k3 == k1 || k3 == k2 || k3 == k4 || k3 == k5) {
                        k3 = (int) Math.floor(Math.random() * 53);
                    }
                    card_3();
                    delaying = delaying + hold;
                    new Card_3(field_card_3.getContext());
                }
                if(Hand_1.hold4 == 0) {
                    field_card_4.setVisibility(View.INVISIBLE);
                    field_card_4.setImageResource(R.drawable.k53);
                    field_card_4.setVisibility(View.VISIBLE);
                    k4 = (int) Math.floor(Math.random() * 53);
                    while (k4 == k1 || k4 == k2 || k4 == k3 || k4 == k5) {
                        k4 = (int) Math.floor(Math.random() * 53);
                    }
                    card_4();
                    delaying = delaying + hold;
                    new Card_4(field_card_4.getContext());
                }
                if(Hand_1.hold5 == 0) {
                    field_card_5.setVisibility(View.INVISIBLE);
                    field_card_5.setImageResource(R.drawable.k53);
                    field_card_5.setVisibility(View.VISIBLE);
                    k5 = (int) Math.floor(Math.random() * 53);
                    while (k5 == k1 || k5 == k2 || k5 == k3 || k5 == k4) {
                        k5 = (int) Math.floor(Math.random() * 53);
                    }
                    card_5();
                    delaying = delaying + hold;
                    new Card_5(field_card_5.getContext());
                }
                winner();
                new Hand_2(table.getContext(), joker.getContext(), card.getContext(),
                        field_card_1.getContext(), field_card_2.getContext(), field_card_3.getContext(),
                        field_card_4.getContext(), field_card_5.getContext(), field_joker_1.getContext(),
                        field_joker_2.getContext(), field_joker_3.getContext(), field_joker_4.getContext(),
                        field_joker_5.getContext(), center_2.getContext(), winning_1.getContext(),
                        winning_2.getContext(), winning_3.getContext(), winning_4.getContext(),
                        winning_5.getContext(), winning_6.getContext(), winning_7.getContext(),
                        winning_8.getContext(), winning_9.getContext(), winning_10.getContext(),
                        winning.getContext(), winning_value.getContext(), button_take.getContext(),
                        button_deal.getContext(), button_hold_1.getContext(), button_hold_2.getContext(),
                        button_hold_3.getContext(), button_hold_4.getContext(), button_hold_5.getContext());
            }
            else if(choice == 2) {
                doubling();
            }
            else if(doubling == 1 && cash > 1) {
                pressed = 0;
                handler0.removeCallbacks(runnable0);
                low.setVisibility(View.INVISIBLE);
                high.setVisibility(View.INVISIBLE);
                new TakingHalf(field_win_1.getContext(), field_win_2.getContext(), field_win_3.getContext(),
                        field_win_4.getContext(), field_win_5.getContext(), field_win_6.getContext(),
                        field_win_7.getContext(), field_win_8.getContext(), field_win_9.getContext(),
                        field_win_10.getContext(), field_win_11.getContext(), field_win_12.getContext(),
                        center_2.getContext(), winning_value.getContext(), button_take.getContext(),
                        button_deal.getContext(), credit_value.getContext(), low.getContext(), high.getContext());
            }
        }
        if(pressed == R.id.hold_1) {
            if(choice == 1) {
                stop_card_1();
            }
        }
        if(pressed == R.id.hold_2) {
            if(choice == 1) {
                stop_card_2();
            }
        }
        if(pressed == R.id.hold_3) {
            if(choice == 1) {
                stop_card_3();
            }
        }
        if(pressed == R.id.hold_4) {
            if(choice == 1) {
                stop_card_4();
            }
        }
        if(pressed == R.id.hold_5) {
            if(choice == 1) {
                stop_card_5();
            }
        }
        if(pressed == R.id.double_low) {
            if(doubling == 1) {
                doubling = 0;
                low.setVisibility(View.INVISIBLE);
                high.setVisibility(View.INVISIBLE);
                try {
                    new Low(table.getContext(), down_left_2.getContext(), down_right_2.getContext(),
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
                            button_low.getContext(), button_high.getContext(), credit_value.getContext(),
                            low.getContext(), high.getContext());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        if(pressed == R.id.double_high) {
            if(doubling == 1) {
                doubling = 0;
                low.setVisibility(View.INVISIBLE);
                high.setVisibility(View.INVISIBLE);
                try {
                    new High(table.getContext(), down_left_2.getContext(), down_right_2.getContext(),
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
                            button_low.getContext(), button_high.getContext(), credit_value.getContext(),
                            low.getContext(), high.getContext());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    void doubling() {
        choice = 3;
        won = 0;
        interval = 400;
        down_left_2.setVisibility(View.INVISIBLE);
        down_right_2.setVisibility(View.INVISIBLE);
        button_take.setText(R.string.take_all);
        button_deal.setText(R.string.take_half);
        button_low.setVisibility(View.VISIBLE);
        button_high.setVisibility(View.VISIBLE);
        intro();
        count_1();
        count_100();
        bingo();
        field_card_1.setVisibility(View.INVISIBLE);
        field_card_2.setVisibility(View.INVISIBLE);
        field_card_3.setVisibility(View.INVISIBLE);
        field_card_4.setVisibility(View.INVISIBLE);
        field_card_5.setVisibility(View.INVISIBLE);
        field_win_1.setImageResource(R.drawable.k53);
        field_win_2.setImageResource(R.drawable.k53);
        field_win_3.setImageResource(R.drawable.k53);
        field_win_4.setImageResource(R.drawable.k53);
        field_win_5.setImageResource(R.drawable.k53);
        field_win_6.setImageResource(R.drawable.k53);
        field_win_7.setImageResource(R.drawable.k53);
        field_win_8.setImageResource(R.drawable.k53);
        field_win_9.setImageResource(R.drawable.k53);
        field_win_10.setImageResource(R.drawable.k53);
        field_win_11.setImageResource(R.drawable.k53);
        field_win_12.setImageResource(R.drawable.k53);
        audio_winner.stop();
        interval= 400;
        doubling = 1;
        double_card = 1;
        dk = 0;
        Doubling(field_win_1.getContext(), field_win_2.getContext(), field_win_3.getContext(),
                field_win_4.getContext(), field_win_5.getContext(), field_win_6.getContext(),
                field_win_7.getContext(), field_win_8.getContext(), field_win_9.getContext(),
                field_win_10.getContext(), field_win_11.getContext(), field_win_12.getContext(),
                center_2.getContext(), winning_value.getContext(), button_take.getContext(),
                button_deal.getContext(), credit_value.getContext(), low.getContext(), high.getContext());
    }
    public static void Doubling(Context context_field_win_1, Context context_field_win_2, Context context_field_win_3,
                                Context context_field_win_4, Context context_field_win_5, Context context_field_win_6,
                                Context context_field_win_7, Context context_field_win_8, Context context_field_win_9,
                                Context context_field_win_10, Context context_field_win_11, Context context_field_win_12,
                                Context context_center_2, Context context_winning_value, Context context_button_take,
                                Context context_button_deal, Context context_credit_value,
                                Context context_low, Context context_high) {

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
        TextView center_2 = ((Activity)context_center_2).findViewById(R.id.win);
        TextView low = ((Activity)context_low).findViewById(R.id.low);
        TextView high = ((Activity)context_high).findViewById(R.id.high);
        TextView winning_value = ((Activity)context_winning_value).findViewById(R.id.winning_value);
        TextView credit_value = ((Activity)context_credit_value).findViewById(R.id.credit_value);
        Button button_take = ((Activity)context_button_take).findViewById(R.id.take);
        Button button_deal = ((Activity)context_button_deal).findViewById(R.id.deal);

        if(double_card == 1) {
            field_win_1.setVisibility(View.VISIBLE);
            dk1 = (int) Math.floor(Math.random() * 48) + 1;
            Low_High(center_2.getContext(), winning_value.getContext(), button_take.getContext(),
                    button_deal.getContext(), credit_value.getContext(), low.getContext(), high.getContext());
        }
        if(double_card == 2) {
            field_win_2.setVisibility(View.VISIBLE);
            dk2 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk2 == dk1) {
                dk2 = (int) Math.floor(Math.random() * 48) + 1;
            }
            Low_High(center_2.getContext(), winning_value.getContext(), button_take.getContext(),
                    button_deal.getContext(), credit_value.getContext(), low.getContext(), high.getContext());
        }
        if(double_card == 3) {
            field_win_3.setVisibility(View.VISIBLE);
            dk3 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk3 == dk1 || dk3 == dk2) {
                dk3 = (int) Math.floor(Math.random() * 48) + 1;
            }
            Low_High(center_2.getContext(), winning_value.getContext(), button_take.getContext(),
                    button_deal.getContext(), credit_value.getContext(), low.getContext(), high.getContext());
        }
        if(double_card == 4) {
            field_win_4.setVisibility(View.VISIBLE);
            dk4 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk4 == dk1 || dk4 == dk2 || dk4 == dk3) {
                dk4 = (int) Math.floor(Math.random() * 48) + 1;
            }
            Low_High(center_2.getContext(), winning_value.getContext(), button_take.getContext(),
                    button_deal.getContext(), credit_value.getContext(), low.getContext(), high.getContext());
        }
        if(double_card == 5) {
            field_win_5.setVisibility(View.VISIBLE);
            dk5 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk5 == dk1 || dk5 == dk2 ||
                    dk5 == dk3 || dk5 == dk4) {
                dk5 = (int) Math.floor(Math.random() * 48) + 1;
            }
            Low_High(center_2.getContext(), winning_value.getContext(), button_take.getContext(),
                    button_deal.getContext(), credit_value.getContext(), low.getContext(), high.getContext());
        }
        if(double_card == 6) {
            field_win_6.setVisibility(View.VISIBLE);
            dk6 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk6 == dk1 || dk6 == dk2 || dk6 == dk3 ||
                    dk6 == dk4 || dk6 == dk5) {
                dk6 = (int) Math.floor(Math.random() * 48) + 1;
            }
            Low_High(center_2.getContext(), winning_value.getContext(), button_take.getContext(),
                    button_deal.getContext(), credit_value.getContext(), low.getContext(), high.getContext());
        }
        if(double_card == 7) {
            field_win_7.setVisibility(View.VISIBLE);
            dk7 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk7 == dk1 || dk7 == dk2 || dk7 == dk3 ||
                    dk7 == dk4 || dk7 == dk5|| dk7 == dk6) {
                dk7 = (int) Math.floor(Math.random() * 48) + 1;
            }
            Low_High(center_2.getContext(), winning_value.getContext(), button_take.getContext(),
                    button_deal.getContext(), credit_value.getContext(), low.getContext(), high.getContext());
        }
        if(double_card == 8) {
            field_win_8.setVisibility(View.VISIBLE);
            dk8 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk8 == dk1 || dk8 == dk2 || dk8 == dk3 || dk8 == dk4 ||
                    dk8 == dk5 || dk8 == dk6 || dk8 == dk7) {
                dk8 = (int) Math.floor(Math.random() * 48) + 1;
            }
            Low_High(center_2.getContext(), winning_value.getContext(), button_take.getContext(),
                    button_deal.getContext(), credit_value.getContext(), low.getContext(), high.getContext());
        }
        if(double_card == 9) {
            field_win_9.setVisibility(View.VISIBLE);
            dk9 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk9 == dk1 || dk9 == dk2 || dk9 == dk3 || dk9 == dk4 ||
                    dk9 == dk5 || dk9 == dk6 || dk9 == dk7 || dk9 == dk8) {
                dk9 = (int) Math.floor(Math.random() * 48) + 1;
            }
            Low_High(center_2.getContext(), winning_value.getContext(), button_take.getContext(),
                    button_deal.getContext(), credit_value.getContext(), low.getContext(), high.getContext());
        }
        if(double_card == 10) {
            field_win_10.setVisibility(View.VISIBLE);
            dk10 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk10 == dk1 || dk10 == dk2 || dk10 == dk3 ||
                    dk10 == dk4 || dk10 == dk5 || dk10 == dk6 ||
                    dk10 == dk7 || dk10 == dk8 || dk10 == dk9) {
                dk10 = (int) Math.floor(Math.random() * 48) + 1;
            }
            Low_High(center_2.getContext(), winning_value.getContext(), button_take.getContext(),
                    button_deal.getContext(), credit_value.getContext(), low.getContext(), high.getContext());
        }
        if(double_card == 11) {
            field_win_11.setVisibility(View.VISIBLE);
            dk11 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk11 == dk1 || dk11 == dk2 || dk11 == dk3 || dk11 == dk4 ||
                    dk11 == dk5 || dk11 == dk6|| dk11 == dk7 || dk11 == dk8 ||
                    dk11 == dk9 || dk11 == dk10) {
                dk11 = (int) Math.floor(Math.random() * 48) + 1;
            }
            Low_High(center_2.getContext(), winning_value.getContext(), button_take.getContext(),
                    button_deal.getContext(), credit_value.getContext(), low.getContext(), high.getContext());
        }
        if(double_card == 12) {
            handler0.removeCallbacks(runnable0);
            field_win_12.setVisibility(View.VISIBLE);
            Block(center_2.getContext(), winning_value.getContext(),
                    button_take.getContext(), button_deal.getContext(),
                    credit_value.getContext());
        }
    }

    static void Low_High(Context context_center_2, Context context_winning_value, Context context_button_take,
                         Context context_button_deal, Context context_credit_value, Context context_low,
                         Context context_high) {

        TextView center_2 = ((Activity)context_center_2).findViewById(R.id.win);
        TextView low = ((Activity)context_low).findViewById(R.id.low);
        TextView high = ((Activity)context_high).findViewById(R.id.high);
        TextView winning_value = ((Activity)context_winning_value).findViewById(R.id.winning_value);
        TextView credit_value = ((Activity)context_credit_value).findViewById(R.id.credit_value);
        Button button_take = ((Activity)context_button_take).findViewById(R.id.take);
        Button button_deal = ((Activity)context_button_deal).findViewById(R.id.deal);

        if(cash > 9999) {
            Block(center_2.getContext(), winning_value.getContext(),
                    button_take.getContext(), button_deal.getContext(),
                    credit_value.getContext());
        }
        else {
            final int[] high_low = {1};

            handler0 = new Handler();
            runnable0 = new Runnable() {
                @Override
                public void run() {
                    if(doubling == 1) {
                        if(high_low[0] == 1) {
                            audio_high.start();
                            low.setVisibility(View.INVISIBLE);
                            high.setVisibility(View.VISIBLE);
                            high_low[0] = 2;

                        }
                        else {
                            audio_low.start();
                            high.setVisibility(View.INVISIBLE);
                            low.setVisibility(View.VISIBLE);
                            high_low[0] = 1;
                        }
                        handler0.postDelayed(this, interval);
                    }
                }
            };
            handler0.post(runnable0);
        }
    }
    void Start() {
        money = 0;
        bet_value = 1;
        auto_hold_value = 1;
        dealing = 0;
        stop = 0;
        choice = 0;
        cash = 0;

        d1 = 1100;
        d2 = 500;
        d3 = 100;
        d4 = 40;
        d5 = 10;
        d6 = 7;
        d7 = 5;
        d8 = 3;
        d9 = 2;
        d10 = 1;
    }
    void intro() {
        if (audio_intro != null) {
            audio_intro.reset();
            audio_intro.release();
            audio_intro = null;
        }
        audio_intro = MediaPlayer.create(this, R.raw.intro);
    }
    void credit() {
        if (money == 0 && game == 0) {
            game = 1;
            if(audio_intro != null) {
                audio_intro.reset();
                audio_intro.release();
                audio_intro = null;
            }
        }
        if (audio_credit != null) {
            audio_credit.reset();
            audio_credit.release();
            audio_credit = null;

        }
        audio_credit = MediaPlayer.create(this, R.raw.kredit);
        audio_credit.start();
    }
    void Bet() {
        final TextView u1 = findViewById(R.id.bet_value);
        winning_value = findViewById(R.id.winning_value);

        u1.setText(String.format(Locale.getDefault(), "%d", (bet_value)));
        win1 = d1 * bet_value;
        win2 = d2 * bet_value;
        win3 = d3 * bet_value;
        win4 = d4 * bet_value;
        win5 = d5 * bet_value;
        win6 = d6 * bet_value;
        win7 = d7 * bet_value;
        win8 = d8 * bet_value;
        win9 = d9 * bet_value;
        win10 = d10 * bet_value;

        d_1.setText(String.format(Locale.getDefault(), "%d", (win1)));
        d_2.setText(String.format(Locale.getDefault(), "%d", (win2)));
        d_3.setText(String.format(Locale.getDefault(), "%d", (win3)));
        d_4.setText(String.format(Locale.getDefault(), "%d", (win4)));
        d_5.setText(String.format(Locale.getDefault(), "%d", (win5)));
        d_6.setText(String.format(Locale.getDefault(), "%d", (win6)));
        d_7.setText(String.format(Locale.getDefault(), "%d", (win7)));
        d_8.setText(String.format(Locale.getDefault(), "%d", (win8)));
        d_9.setText(String.format(Locale.getDefault(), "%d", (win9)));
        d_10.setText(String.format(Locale.getDefault(), "%d", (win10)));
    }
    void bet() {
        if (audio_bet != null) {
            audio_bet.reset();
            audio_bet.release();
            audio_bet = null;
        }
        audio_bet = MediaPlayer.create(this, R.raw.ulog);
        audio_bet.start();
    }
    void auto_hold() {
        if (audio_auto_hold != null) {
            audio_auto_hold.reset();
            audio_auto_hold.release();
            audio_auto_hold = null;
        }
        audio_auto_hold = MediaPlayer.create(this, R.raw.autohold);
        audio_auto_hold.start();
    }
    void deal_cards() {
        if (audio_deal_cards_1 != null) {
            audio_deal_cards_1.reset();
            audio_deal_cards_1.release();
            audio_deal_cards_1 = null;
        }
        audio_deal_cards_1 = MediaPlayer.create(this, R.raw.deljenje1);
        audio_deal_cards_1.start();
    }
    void deal_cards_1() {

        k1 = (int) Math.floor(Math.random() * 53);
        k2 = (int) Math.floor(Math.random() * 53);
        k3 = (int) Math.floor(Math.random() * 53);
        k4 = (int) Math.floor(Math.random() * 53);
        k5 = (int) Math.floor(Math.random() * 53);

    }
    void Deal_Cards_1() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                cards12345();
            }
        }, 500);
    }
    void Stop() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                if (stop == 1) {
                    stop = 0;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (Hand_1.hold1 == 1) {
                        try {
                            Thread.sleep(230);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stop_card_1();
                    }
                    if (Hand_1.hold2 == 1) {
                        try {
                            Thread.sleep(230);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stop_card_2();
                    }
                    if (Hand_1.hold3 == 1) {
                        try {
                            Thread.sleep(230);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stop_card_3();
                    }
                    if (Hand_1.hold4 == 1) {
                        try {
                            Thread.sleep(230);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stop_card_4();
                    }
                    if (Hand_1.hold5 == 1) {
                        try {
                            Thread.sleep(230);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stop_card_5();
                    }
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    choice = 1;
                }
            }
        }, 0,200);
    }
    void cards12345() {
        if (audio_cards != null) {
            audio_cards.reset();
            audio_cards = null;
        }
        audio_cards = MediaPlayer.create(this, R.raw.karte12345);
        audio_cards.start();
    }
    void stop_card_1() {
        if (audio_stop_1 != null) {
            audio_stop_1.reset();
            audio_stop_1 = null;
        }
        audio_stop_1 = MediaPlayer.create(this, R.raw.stop1);
        audio_stop_1.start();
        button_hold_1.setBackgroundColor(Color.RED);
        Hand_1.hold1 = 1;
    }
    void stop_card_2() {
        if (audio_stop_2 != null) {
            audio_stop_2.reset();
            audio_stop_2 = null;
        }
        audio_stop_2 = MediaPlayer.create(this, R.raw.stop2);
        audio_stop_2.start();
        button_hold_2.setBackgroundColor(Color.RED);
        Hand_1.hold2 = 1;
    }
    void stop_card_3() {
        if (audio_stop_3 != null) {
            audio_stop_3.reset();
            audio_stop_3 = null;
        }
        audio_stop_3 = MediaPlayer.create(this, R.raw.stop3);
        audio_stop_3.start();
        button_hold_3.setBackgroundColor(Color.RED);
        Hand_1.hold3 = 1;
    }
    void stop_card_4() {
        if (audio_stop_4 != null) {
            audio_stop_4.reset();
            audio_stop_4 = null;
        }
        audio_stop_4 = MediaPlayer.create(this, R.raw.stop4);
        audio_stop_4.start();
        button_hold_4.setBackgroundColor(Color.RED);
        Hand_1.hold4 = 1;
    }
    void stop_card_5() {
        if (audio_stop_5 != null) {
            audio_stop_5.reset();
            audio_stop_5 = null;
        }
        audio_stop_5 = MediaPlayer.create(this, R.raw.stop5);
        audio_stop_5.start();
        button_hold_5.setBackgroundColor(Color.RED);
        Hand_1.hold5 = 1;
    }
    void clearing_1() {
        if (audio_clear != null) {
            audio_clear.reset();
            audio_clear = null;
        }
        audio_clear = MediaPlayer.create(this, R.raw.ponistavanje);
        audio_clear.start();
    }
    void deal_cards_2() {
        if (audio_deal_cards_2 != null) {
            audio_deal_cards_2.reset();
            audio_deal_cards_2 = null;
        }
        audio_deal_cards_2 = MediaPlayer.create(this, R.raw.deljenje2);
        audio_deal_cards_2.start();
    }
    void card_1() {
        if (audio_card_1 != null) {
            audio_card_1.reset();
            audio_card_1 = null;
        }
        audio_card_1 = MediaPlayer.create(this, R.raw.karta1);
    }
    void card_2() {
        if (audio_card_2 != null) {
            audio_card_2.reset();
            audio_card_2 = null;
        }
        audio_card_2 = MediaPlayer.create(this, R.raw.karta2);
    }
    void card_3() {
        if (audio_card_3 != null) {
            audio_card_3.reset();
            audio_card_3 = null;
        }
        audio_card_3 = MediaPlayer.create(this, R.raw.karta3);
    }
    void card_4() {
        if (audio_card_4 != null) {
            audio_card_4.reset();
            audio_card_4 = null;
        }
        audio_card_4 = MediaPlayer.create(this, R.raw.karta4);
    }
    void card_5() {
        if (audio_card_5 != null) {
            audio_card_5.reset();
            audio_card_5 = null;
        }
        audio_card_5 = MediaPlayer.create(this, R.raw.karta5);
    }
    void winner() {
        if (audio_winner != null) {
            audio_winner.reset();
            audio_winner = null;
        }
        audio_winner = MediaPlayer.create(this, R.raw.dobitnik);
    }

    void count_1() {
        if (audio_count_1 != null) {
            audio_count_1.reset();
            audio_count_1 = null;
        }
        audio_count_1 = MediaPlayer.create(this,R.raw.isplata1);
    }
    void count_100() {
        if (audio_count_100 != null) {
            audio_count_100.reset();
            audio_count_100 = null;
        }
        audio_count_100 = MediaPlayer.create(this, R.raw.isplata100);
    }
    void Low() {
        if(audio_low != null) {
            audio_low.reset();
            audio_low = null;
        }
        audio_low = MediaPlayer.create(this, R.raw.tief);
    }
    void High() {
        if(audio_high != null) {
            audio_high.reset();
            audio_high = null;
        }
        audio_high = MediaPlayer.create(this, R.raw.hoch);
    }
    public static void Bingo(Context context_center_2, Context context_winning_value) {

        TextView center_2 = ((Activity)context_center_2).findViewById(R.id.win);
        TextView winning_value = ((Activity)context_winning_value).findViewById(R.id.winning_value);

        handler0.removeCallbacks(runnable0);
        cash *= 2;
        winning_value.setText(String.format(Locale.getDefault(), "%d", (cash)));
        center_2.setText(R.string.win);
        center_2.setVisibility(View.VISIBLE);
        audio_bingo.start();
        interval -= 25;
    }
    void bingo() {
        if (audio_bingo != null) {
            audio_bingo .reset();
            audio_bingo  = null;
        }
        High();
        Low();
        audio_bingo  = MediaPlayer.create(this, R.raw.bingo);
    }
    void Cash() {
        choice = 3;
        won = 0;
        down_left_2.setVisibility(View.INVISIBLE);
        down_right_2.setVisibility(View.INVISIBLE);
        intro();
        count_1();
        count_100();
        taking = 1;
        try {
            new TakingAll(center_2.getContext(), winning_value.getContext(),
                    button_take.getContext(), button_deal.getContext(), credit_value.getContext());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static void Block(Context context_center_2, Context context_winning_value,
                             Context context_button_take, Context context_button_deal,
                             Context context_credit_value) {

        TextView center_2 = ((Activity)context_center_2).findViewById(R.id.win);
        TextView winning_value = ((Activity)context_winning_value).findViewById(R.id.winning_value);
        TextView credit_value = ((Activity)context_credit_value).findViewById(R.id.credit_value);
        Button button_take = ((Activity)context_button_take).findViewById(R.id.take);
        Button button_deal = ((Activity)context_button_deal).findViewById(R.id.deal);

        choice = 3;
        doubling = 1;
        won = 0;
        taking = 1;
        try {
            new TakingAll(center_2.getContext(), winning_value.getContext(),
                    button_take.getContext(), button_deal.getContext(),
                    credit_value.getContext());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}