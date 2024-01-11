package com.example.joker_card;

import androidx.appcompat.app.AppCompatActivity;

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
    public static Button button_take;
    public static Button button_deal;
    public static Button button_hold_1;
    public static Button button_hold_2;
    public static Button button_hold_3;
    public static Button button_hold_4;
    public static Button button_hold_5;
    static Button button_low;
    static Button button_high;
    public static int c = 0;
    public static TextView c1;
    int game;
    int u = 1;
    static int ah = 1;
    final int d1 = 1100;
    public static int win1;
    final int d2 = 500;
    public static int win2;
    final int d3 = 100;
    public static int win3;
    final int d4 = 40;
    public static int win4;
    final int d5 = 10;
    public static int win5;
    final int d6 = 7;
    public static int win6;
    final int d7 = 5;
    public static int win7;
    final int d8 = 3;
    public static int win8;
    final int d9 = 2;
    public static int win9;
    final int d10 = 1;
    public static int win10;
    public static int dealing;
    public static int stop;
    public static int choice;
    public static int k1;
    public static int k2;
    public static int k3;
    public static int k4;
    public static int k5;
    public static int dk;
    public static int dk1;
    public static int dk2;
    public static int dk3;
    public static int dk4;
    public static int dk5;
    public static int dk6;
    public static int dk7;
    public static int dk8;
    public static int dk9;
    public static int dk10;
    public static int dk11;
    public static int delaying;
    public static int taking;
    public static int cash;
    public static int won;
    public static int profit;
    public static int block;
    public static int doubling;
    public static int double_card;
    public static int missed;
    static int interval;
    static int cheat;
    int hold;
    MediaPlayer audio_credit;
    MediaPlayer audio_bet;
    MediaPlayer audio_auto_hold;
    MediaPlayer audio_deal_cards_1;
    MediaPlayer audio_clear;
    MediaPlayer audio_deal_cards_2;
    public static MediaPlayer audio_card_1;
    public static MediaPlayer audio_card_2;
    public static MediaPlayer audio_card_3;
    public static MediaPlayer audio_card_4;
    public static MediaPlayer audio_card_5;
    MediaPlayer audio_cards;
    public static MediaPlayer audio_winner;
    public static MediaPlayer audio_intro;
    public static MediaPlayer audio_count_1;
    public static MediaPlayer audio_count_100;
    public static MediaPlayer audio_stop_1;
    public static MediaPlayer audio_stop_2;
    public static MediaPlayer audio_stop_3;
    public static MediaPlayer audio_stop_4;
    public static MediaPlayer audio_stop_5;
    public static MediaPlayer audio_low;
    public static MediaPlayer audio_high;
    public static MediaPlayer audio_bingo;
    public TextView ah1;
    public ImageView field_card_1;
    public ImageView field_card_2;
    public ImageView field_card_3;
    public ImageView field_card_4;
    public ImageView field_card_5;
    public static ImageView field_joker_1;
    public static ImageView field_joker_2;
    public static ImageView field_joker_3;
    public static ImageView field_joker_4;
    public static ImageView field_joker_5;
    public ImageView hand_1;
    public ImageView hand_2;
    public ImageView hand_3;
    public ImageView hand_4;
    public ImageView hand_5;
    public ImageView hand_6;
    public ImageView hand_7;
    public ImageView hand_8;
    public ImageView hand_9;
    public ImageView hand_10;
    public ImageView table;
    public static ImageView field_win_1;
    public static ImageView field_win_2;
    public static ImageView field_win_3;
    public static ImageView field_win_4;
    public static ImageView field_win_5;
    public static ImageView field_win_6;
    public static ImageView field_win_7;
    public static ImageView field_win_8;
    public static ImageView field_win_9;
    public static ImageView field_win_10;
    public static ImageView field_win_11;
    public static ImageView field_win_12;
    public TextView down_left_1;
    public TextView down_right_1;
    public TextView down_left_2;
    public TextView down_right_2;
    public TextView joker;
    public TextView card;
    public TextView center_1;
    public static TextView center_2;
    public static TextView winning_1;
    public static TextView winning_2;
    public static TextView winning_3;
    public static TextView winning_4;
    public static TextView winning_5;
    public static TextView winning_6;
    public static TextView winning_7;
    public static TextView winning_8;
    public static TextView winning_9;
    public static TextView winning_10;
    public static TextView winning;
    public static TextView winning_value;
    public static TextView low;
    public static TextView high;
    public static TextView low_1;
    public static TextView low_2;
    public static TextView low_3;
    public static TextView low_4;
    public static TextView low_5;
    public static TextView low_6;
    public static TextView low_7;
    public static TextView low_8;
    public static TextView low_9;
    public static TextView low_10;
    public static TextView low_11;
    public static TextView high_1;
    public static TextView high_2;
    public static TextView high_3;
    public static TextView high_4;
    public static TextView high_5;
    public static TextView high_6;
    public static TextView high_7;
    public static TextView high_8;
    public static TextView high_9;
    public static TextView high_10;
    public static TextView high_11;
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

        dealing = 0;
        stop = 0;
        choice = 0;
        cash = 0;

        button_credit = (Button) findViewById(R.id.credit);
        button_credit.setOnClickListener(this);
        button_bet = (Button) findViewById(R.id.bet);
        button_bet.setOnClickListener(this);
        button_take = (Button) findViewById(R.id.take);
        button_take.setOnClickListener(this);
        button_deal = (Button) findViewById(R.id.deal);
        button_deal.setOnClickListener(this);

        ah1 = findViewById(R.id.auto_hold);
        c1 = findViewById(R.id.credit_value);

        button_hold_1 = (Button) findViewById(R.id.hold_1);
        button_hold_1.setOnClickListener(this);
        button_hold_2 = (Button) findViewById(R.id.hold_2);
        button_hold_2.setOnClickListener(this);
        button_hold_3 = (Button) findViewById(R.id.hold_3);
        button_hold_3.setOnClickListener(this);
        button_hold_4 = (Button) findViewById(R.id.hold_4);
        button_hold_4.setOnClickListener(this);
        button_hold_5 = (Button) findViewById(R.id.hold_5);
        button_hold_5.setOnClickListener(this);

        button_low = (Button) findViewById(R.id.double_low);
        button_low.setOnClickListener(this);
        button_high = (Button) findViewById(R.id.double_high);
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
                field_card_5.getContext());
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
                                    field_card_4.getContext(), field_card_5.getContext());
                        }, 0));
            }
        }, 0, 12000);

        timer2.schedule(task2 = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> {
                    new Handler(Looper.getMainLooper()).postDelayed(
                            () -> {
                                if(c == 0 && dealing == 0) {
                                    down_left_1.setText(R.string.author);
                                    down_left_1.setVisibility(View.VISIBLE);
                                    down_right_1.setVisibility(View.INVISIBLE);
                                }
                                if(c > 0 && dealing == 0) {
                                    down_left_1.setVisibility(View.INVISIBLE);
                                    down_right_1.setVisibility(View.INVISIBLE);
                                    center_1.setText(R.string.choose_bet);
                                    center_1.setVisibility(View.VISIBLE);
                                    button_take.setText(R.string.auto_hold);
                                    button_deal.setText(R.string.deal_cards);
                                }
                                if(c > 0 && dealing == 2) {
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
                                if(c == 0 && dealing == 0) {
                                    down_left_1.setVisibility(View.INVISIBLE);
                                    down_right_1.setText(R.string.serbia_2023);
                                    down_right_1.setVisibility(View.VISIBLE);
                                }
                                if((c > 0 && dealing == 0) || (c > 0 && dealing == 2)) {
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
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        new Handler((Looper.getMainLooper())).postDelayed(
                                new Runnable() {
                                    public void run() {
                                        if(dealing == 0 && c > 0 && u > c) {
                                            u = c;
                                            Bet();
                                        }
                                        if(dealing == 0 && c==0 && game==1) {
                                            u = 1;
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

                                            new Hand_1(hand_1.getContext(), hand_2.getContext(),
                                                    hand_3.getContext(), hand_4.getContext(),
                                                    hand_5.getContext(), hand_6.getContext(),
                                                    hand_7.getContext(),hand_8.getContext(),
                                                    hand_9.getContext(), hand_10.getContext());
                                            if(ah == 1) {
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
                                            new Cashed(table.getContext(), down_left_2.getContext(),
                                                    down_right_2.getContext(), joker.getContext(),
                                                    card.getContext(), field_card_1.getContext(),
                                                    field_card_2.getContext(), field_card_3.getContext(),
                                                    field_card_4.getContext(), field_card_5.getContext());
                                        }
                                    }
                                }, 100);
                    }
                });
            }
        }, 0, 100);
    }
    @Override
    public void onClick(View view) {
        int pressed = view.getId();
        if(pressed == R.id.credit) {
            if (c < 4901 && dealing == 0) {
                intro();
                credit();
                game = 1;
                c += 100;
                c1.setText(String.format(Locale.getDefault(), "%d", (c)));
            }
        }
        if(pressed == R.id.bet) {
            if(c > 0 && dealing == 0) {
                bet();
                u += 1;
                if(u==99 || u > c) {
                    u = 1;
                }
                Bet();
            }
        }
        if(pressed == R.id.take) {
            if (c > 0 && dealing == 0) {
                if (ah == 1) {
                    ah1.setTextColor(Color.BLACK);
                    ah = 0;
                }
                else {
                    ah1.setTextColor(Color.BLUE);
                    ah = 1;
                }
                auto_hold();
            }
            else if(choice == 1) {
                clearing_1();
                clearing_2();
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
            if((c > 0 && dealing == 0) || (c > 0 && profit == 1)) {
                if(profit == 1) {
                    intro();
                    Cashed.handler9.removeCallbacks(Cashed.runnable9);
                    taking = 0;
                    won = 0;
                    choice = 0;
                    profit = 0;

                    new Clearing(table.getContext(), down_left_2.getContext(), down_right_2.getContext(),
                            field_card_1.getContext(), field_card_2.getContext(), field_card_3.getContext(),
                            field_card_4.getContext(), field_card_5.getContext());
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
                        field_card_4.getContext(), field_card_5.getContext());

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

                c = c - u;
                c1.setText(String.format(Locale.getDefault(), "%d", (c)));

                field_card_1.setVisibility(View.VISIBLE);
                field_card_2.setVisibility(View.VISIBLE);
                field_card_3.setVisibility(View.VISIBLE);
                field_card_4.setVisibility(View.VISIBLE);
                field_card_5.setVisibility(View.VISIBLE);

                deal_cards_1();
                deal_cards();

                while(k1 == k2 || k1 == k3 || k1 == k4 ||
                        k1 == k5 || k2 == k3 || k2 == k4 ||
                        k2 == k5 || k3 == k4 || k3 == k5 || k4 == k5) {
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

                hand_1.setVisibility(View.INVISIBLE);
                hand_2.setVisibility(View.INVISIBLE);
                hand_3.setVisibility(View.INVISIBLE);
                hand_4.setVisibility(View.INVISIBLE);
                hand_5.setVisibility(View.INVISIBLE);
                hand_6.setVisibility(View.INVISIBLE);
                hand_7.setVisibility(View.INVISIBLE);
                hand_8.setVisibility(View.INVISIBLE);
                hand_9.setVisibility(View.INVISIBLE);
                hand_10.setVisibility(View.INVISIBLE);

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
                        field_card_4.getContext(), field_card_5.getContext());
            }
            else if(choice == 2) {
                doubling();
            }
            else if(doubling == 1 && cash > 1) {
                pressed = 0;
                handler0.removeCallbacks(runnable0);
                low.setVisibility(View.INVISIBLE);
                high.setVisibility(View.INVISIBLE);
                new TakingHalf();
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
                            field_card_5.getContext());
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
                            field_card_5.getContext());
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
        Doubling();
    }
    public static void Doubling() {

        if(double_card == 1) {
            field_win_1.setVisibility(View.VISIBLE);
            dk1 = (int) Math.floor(Math.random() * 48) + 1;
            cheat = dk1;
            Low_High();
        }
        if(double_card == 2) {
            field_win_2.setVisibility(View.VISIBLE);
            dk2 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk2 == dk1) {
                dk2 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk2;
            Low_High();
        }
        if(double_card == 3) {
            field_win_3.setVisibility(View.VISIBLE);
            dk3 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk3 == dk1 || dk3 == dk2) {
                dk3 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk3;
            Low_High();
        }
        if(double_card == 4) {
            field_win_4.setVisibility(View.VISIBLE);
            dk4 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk4 == dk1 || dk4 == dk2 || dk4 == dk3) {
                dk4 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk4;
            Low_High();
        }
        if(double_card == 5) {
            field_win_5.setVisibility(View.VISIBLE);
            dk5 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk5 == dk1 || dk5 == dk2 ||
                    dk5 == dk3 || dk5 == dk4) {
                dk5 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk5;
            Low_High();
        }
        if(double_card == 6) {
            field_win_6.setVisibility(View.VISIBLE);
            dk6 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk6 == dk1 || dk6 == dk2 || dk6 == dk3 ||
                    dk6 == dk4 || dk6 == dk5) {
                dk6 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk6;
            Low_High();
        }
        if(double_card == 7) {
            field_win_7.setVisibility(View.VISIBLE);
            dk7 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk7 == dk1 || dk7 == dk2 || dk7 == dk3 ||
                    dk7 == dk4 || dk7 == dk5|| dk7 == dk6) {
                dk7 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk7;
            Low_High();
        }
        if(double_card == 8) {
            field_win_8.setVisibility(View.VISIBLE);
            dk8 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk8 == dk1 || dk8 == dk2 || dk8 == dk3 || dk8 == dk4 ||
                    dk8 == dk5 || dk8 == dk6 || dk8 == dk7) {
                dk8 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk8;
            Low_High();
        }
        if(double_card == 9) {
            field_win_9.setVisibility(View.VISIBLE);
            dk9 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk9 == dk1 || dk9 == dk2 || dk9 == dk3 || dk9 == dk4 ||
                    dk9 == dk5 || dk9 == dk6 || dk9 == dk7 || dk9 == dk8) {
                dk9 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk9;
            Low_High();
        }
        if(double_card == 10) {
            field_win_10.setVisibility(View.VISIBLE);
            dk10 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk10 == dk1 || dk10 == dk2 || dk10 == dk3 ||
                    dk10 == dk4 || dk10 == dk5 || dk10 == dk6 ||
                    dk10 == dk7 || dk10 == dk8 || dk10 == dk9) {
                dk10 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk10;
            Low_High();
        }
        if(double_card == 11) {
            field_win_11.setVisibility(View.VISIBLE);
            dk11 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk11 == dk1 || dk11 == dk2 || dk11 == dk3 || dk11 == dk4 ||
                    dk11 == dk5 || dk11 == dk6|| dk11 == dk7 || dk11 == dk8 ||
                    dk11 == dk9 || dk11 == dk10) {
                dk11 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk11;
            Low_High();
        }
        if(double_card == 12) {
            handler0.removeCallbacks(runnable0);
            field_win_12.setVisibility(View.VISIBLE);
            Block();
        }
    }

    static void Low_High() {

/*
        if(cheat < 25) {
            button_hold_1.setVisibility(View.VISIBLE);
            button_hold_5.setVisibility(View.INVISIBLE);
        }
        else {
            button_hold_5.setVisibility(View.VISIBLE);
            button_hold_1.setVisibility(View.INVISIBLE);
        }
*/
        if(cash > 9999) {
            Block();
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
    void intro() {
        if (audio_intro != null) {
            audio_intro.reset();
            audio_intro.release();
            audio_intro = null;
        }
        audio_intro = MediaPlayer.create(this, R.raw.intro);
    }
    void credit() {
        if (c == 0 && game == 0) {
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
        final TextView d_1 = findViewById(R.id.value_1);
        final TextView d_2 = findViewById(R.id.value_2);
        final TextView d_3 = findViewById(R.id.value_3);
        final TextView d_4 = findViewById(R.id.value_4);
        final TextView d_5 = findViewById(R.id.value_5);
        final TextView d_6 = findViewById(R.id.value_6);
        final TextView d_7 = findViewById(R.id.value_7);
        final TextView d_8 = findViewById(R.id.value_8);
        final TextView d_9 = findViewById(R.id.value_9);
        final TextView d_10 = findViewById(R.id.value_10);
        winning_value = findViewById(R.id.winning_value);

        u1.setText(String.format(Locale.getDefault(), "%d", (u)));
        win1 = d1 * u;
        win2 = d2 * u;
        win3 = d3 * u;
        win4 = d4 * u;
        win5 = d5 * u;
        win6 = d6 * u;
        win7 = d7 * u;
        win8 = d8 * u;
        win9 = d9 * u;
        win10 = d10 * u;

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
/*
        k1=2;

        k2=14;
        k3=1;
        k4=9;
        k5=16;
*/

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
    public static void clearing_2() {
        button_hold_1.setBackgroundColor(Color.parseColor("#000000"));
        button_hold_2.setBackgroundColor(Color.parseColor("#000000"));
        button_hold_3.setBackgroundColor(Color.parseColor("#000000"));
        button_hold_4.setBackgroundColor(Color.parseColor("#000000"));
        button_hold_5.setBackgroundColor(Color.parseColor("#000000"));
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
    public static void Bingo() {
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
            new TakingAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    static void Block() {
        choice = 3;
        doubling = 1;
        won = 0;
        taking = 1;
        try {
            new TakingAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}