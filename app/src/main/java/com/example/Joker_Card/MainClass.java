package com.example.Joker_Card;

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
    public static Button button_stop1;
    public static Button button_stop2;
    public static Button button_stop3;
    public static Button button_stop4;
    public static Button button_stop5;
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
    public static ImageView field_card_1;
    public static ImageView field_card_2;
    public static ImageView field_card_3;
    public static ImageView field_card_4;
    public static ImageView field_card_5;
    public static ImageView field_joker_1;
    public static ImageView field_joker_2;
    public static ImageView field_joker_3;
    public static ImageView field_joker_4;
    public static ImageView field_joker_5;
    public static ImageView hand_1;
    public static ImageView hand_2;
    public static ImageView hand_3;
    public static ImageView hand_4;
    public static ImageView hand_5;
    public static ImageView hand_6;
    public static ImageView hand_7;
    public static ImageView hand_8;
    public static ImageView hand_9;
    public static ImageView hand_10;
    public static ImageView table;
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
    public TextView levodole1;
    public TextView desnodole1;
    public static TextView levodole2;
    public static TextView desnodole2;
    public static TextView joker;
    public static TextView card;
    public TextView centar1;
    public static TextView centar2;
    public static TextView dobitak1;
    public static TextView dobitak2;
    public static TextView dobitak3;
    public static TextView dobitak4;
    public static TextView dobitak5;
    public static TextView dobitak6;
    public static TextView dobitak7;
    public static TextView dobitak8;
    public static TextView dobitak9;
    public static TextView dobitak10;
    public static TextView dobitak;
    public static TextView dobitakdb;
    public static TextView tief;
    public static TextView hoch;
    public static TextView tief1;
    public static TextView tief2;
    public static TextView tief3;
    public static TextView tief4;
    public static TextView tief5;
    public static TextView tief6;
    public static TextView tief7;
    public static TextView tief8;
    public static TextView tief9;
    public static TextView tief10;
    public static TextView tief11;
    public static TextView hoch1;
    public static TextView hoch2;
    public static TextView hoch3;
    public static TextView hoch4;
    public static TextView hoch5;
    public static TextView hoch6;
    public static TextView hoch7;
    public static TextView hoch8;
    public static TextView hoch9;
    public static TextView hoch10;
    public static TextView hoch11;
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

        ah1 = findViewById(R.id.autohold);
        c1 = findViewById(R.id.vrednost_c);

        button_stop1 = (Button) findViewById(R.id.stop1);
        button_stop1.setOnClickListener(this);
        button_stop2 = (Button) findViewById(R.id.stop2);
        button_stop2.setOnClickListener(this);
        button_stop3 = (Button) findViewById(R.id.stop3);
        button_stop3.setOnClickListener(this);
        button_stop4 = (Button) findViewById(R.id.stop4);
        button_stop4.setOnClickListener(this);
        button_stop5 = (Button) findViewById(R.id.stop5);
        button_stop5.setOnClickListener(this);

        button_low = (Button) findViewById(R.id.double_tief);
        button_low.setOnClickListener(this);
        button_high = (Button) findViewById(R.id.double_hoch);
        button_high.setOnClickListener(this);

        levodole1 = findViewById(R.id.levo);
        desnodole1 = findViewById(R.id.desno);
        joker = findViewById(R.id.joker);
        card = findViewById(R.id.card);
        centar1 = findViewById(R.id.centar1);
        centar2 = findViewById(R.id.win);
        levodole2 = findViewById(R.id.gamble);
        desnodole2 = findViewById(R.id.cash);

        tief = findViewById(R.id.tief);
        hoch = findViewById(R.id.hoch);

        field_card_1 = findViewById(R.id.polje_1);
        field_card_2 = findViewById(R.id.polje_2);
        field_card_3 = findViewById(R.id.polje_3);
        field_card_4 = findViewById(R.id.polje_4);
        field_card_5 = findViewById(R.id.polje_5);

        field_joker_1 = findViewById(R.id.polje_j1);
        field_joker_2 = findViewById(R.id.polje_j2);
        field_joker_3 = findViewById(R.id.polje_j3);
        field_joker_4 = findViewById(R.id.polje_j4);
        field_joker_5 = findViewById(R.id.polje_j5);

        hand_1 = findViewById(R.id.rucno1);
        hand_2 = findViewById(R.id.rucno2);
        hand_3 = findViewById(R.id.rucno3);
        hand_4 = findViewById(R.id.rucno4);
        hand_5 = findViewById(R.id.rucno5);
        hand_6 = findViewById(R.id.rucno6);
        hand_7 = findViewById(R.id.rucno7);
        hand_8 = findViewById(R.id.rucno8);
        hand_9 = findViewById(R.id.rucno9);
        hand_10 = findViewById(R.id.rucno10);

        table = findViewById(R.id.table);
        dobitak1 = findViewById(R.id.dobitak1);
        dobitak2 = findViewById(R.id.dobitak2);
        dobitak3 = findViewById(R.id.dobitak3);
        dobitak4 = findViewById(R.id.dobitak4);
        dobitak5 = findViewById(R.id.dobitak5);
        dobitak6 = findViewById(R.id.dobitak6);
        dobitak7 = findViewById(R.id.dobitak7);
        dobitak8 = findViewById(R.id.dobitak8);
        dobitak9 = findViewById(R.id.dobitak9);
        dobitak10 = findViewById(R.id.dobitak10);
        dobitak = findViewById(R.id.dobitak);

        field_win_1 = findViewById(R.id.polje_d1);
        field_win_2 = findViewById(R.id.polje_d2);
        field_win_3 = findViewById(R.id.polje_d3);
        field_win_4 = findViewById(R.id.polje_d4);
        field_win_5 = findViewById(R.id.polje_d5);
        field_win_6 = findViewById(R.id.polje_d6);
        field_win_7 = findViewById(R.id.polje_d7);
        field_win_8 = findViewById(R.id.polje_d8);
        field_win_9 = findViewById(R.id.polje_d9);
        field_win_10 = findViewById(R.id.polje_d10);
        field_win_11 = findViewById(R.id.polje_d11);
        field_win_12 = findViewById(R.id.polje_d12);

        tief1 = findViewById(R.id.tief_1);
        tief2 = findViewById(R.id.tief_2);
        tief3 = findViewById(R.id.tief_3);
        tief4 = findViewById(R.id.tief_4);
        tief5 = findViewById(R.id.tief_5);
        tief6 = findViewById(R.id.tief_6);
        tief7 = findViewById(R.id.tief_7);
        tief8 = findViewById(R.id.tief_8);
        tief9 = findViewById(R.id.tief_9);
        tief10 = findViewById(R.id.tief_10);
        tief11 = findViewById(R.id.tief_11);

        hoch1 = findViewById(R.id.hoch_1);
        hoch2 = findViewById(R.id.hoch_2);
        hoch3 = findViewById(R.id.hoch_3);
        hoch4 = findViewById(R.id.hoch_4);
        hoch5 = findViewById(R.id.hoch_5);
        hoch6 = findViewById(R.id.hoch_6);
        hoch7 = findViewById(R.id.hoch_7);
        hoch8 = findViewById(R.id.hoch_8);
        hoch9 = findViewById(R.id.hoch_9);
        hoch10 = findViewById(R.id.hoch_10);
        hoch11 = findViewById(R.id.hoch_11);

        timer1 = new Timer();
        timer2 = new Timer();
        timer3 = new Timer();

        intro();
        audio_intro.start();
        Ulog();
        new Jokers();
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
                            new Jokers();
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
                                    levodole1.setText(R.string.lacika_baci);
                                    levodole1.setVisibility(View.VISIBLE);
                                    desnodole1.setVisibility(View.INVISIBLE);
                                }
                                if(c > 0 && dealing == 0) {
                                    levodole1.setVisibility(View.INVISIBLE);
                                    desnodole1.setVisibility(View.INVISIBLE);
                                    centar1.setText(R.string.choose_bet);
                                    centar1.setVisibility(View.VISIBLE);
                                    button_take.setText(R.string.auto_hold);
                                    button_deal.setText(R.string.deal_cards);
                                }
                                if(c > 0 && dealing == 2) {
                                    centar1.setText(R.string.pick_cards);
                                    centar1.setVisibility(View.VISIBLE);
                                    button_take.setText(R.string.clear_cards);
                                }
                                if(won == 1) {
                                    levodole2.setVisibility(View.VISIBLE);
                                    desnodole2.setVisibility(View.INVISIBLE);
                                }
                            }, 1000);
                    new Handler(Looper.getMainLooper()).postDelayed(
                            () -> {
                                if(c == 0 && dealing == 0) {
                                    levodole1.setVisibility(View.INVISIBLE);
                                    desnodole1.setText(R.string.serbia_2023);
                                    desnodole1.setVisibility(View.VISIBLE);
                                }
                                if((c > 0 && dealing == 0) || (c > 0 && dealing == 2)) {
                                    levodole1.setText("");
                                    levodole1.setVisibility(View.INVISIBLE);
                                    desnodole1.setVisibility(View.INVISIBLE);
                                    centar1.setText(R.string.press_deal_cards);
                                    centar1.setVisibility(View.VISIBLE);
                                }
                                if(won == 1) {
                                    levodole2.setVisibility(View.INVISIBLE);
                                    desnodole2.setVisibility(View.VISIBLE);
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
                                            Ulog();
                                        }
                                        if(dealing == 0 && c==0 && game==1) {
                                            u = 1;
                                            Ulog();
                                        }
                                        if(dealing == 1) {
                                            dealing = 2;
                                            Deljenje1();
                                            delaying = 500;
                                            new Card1();
                                            delaying = 600;
                                            new Card2();
                                            delaying = 700;
                                            new Card3();
                                            delaying = 800;
                                            new Card4();
                                            delaying = 900;
                                            new Card5();
                                            new Hand1();
                                            if(ah == 1) {
                                                Stop();
                                            }
                                            else {
                                                choice = 1;
                                            }
                                        }
                                        if(block == 1) {
                                            block = 0;
                                            Kasa();
                                        }
                                        if(profit == 1) {
                                            new Cashed();
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
        int id = view.getId();
        if(id == R.id.credit) {
            if (c < 4901 && dealing == 0) {
                intro();
                kredit();
                game = 1;
                c += 100;
                c1.setText(String.format(Locale.getDefault(), "%d", (c)));
            }
        }
        if(id == R.id.bet) {
            if(c > 0 && dealing == 0) {
                ulog();
                u += 1;
                if(u==99 || u > c) {
                    u = 1;
                }
                Ulog();
            }
        }
        if(id == R.id.take) {
            if (c > 0 && dealing == 0) {
                if (ah == 1) {
                    ah1.setTextColor(Color.BLACK);
                    ah = 0;
                }
                else {
                    ah1.setTextColor(Color.BLUE);
                    ah = 1;
                }
                autohold();
            }
            else if(choice == 1) {
                ponistavanje1();
                ponistavanje2();
                Hand1.hold1 = 0;
                Hand1.hold2 = 0;
                Hand1.hold3 = 0;
                Hand1.hold4 = 0;
                Hand1.hold5 = 0;
            }
            else if(choice == 2) {
                Kasa();
            }
            else if (doubling == 1) {
                doubling = 0;
                button_low.setVisibility(View.INVISIBLE);
                button_high.setVisibility(View.INVISIBLE);
                tief.setVisibility(View.INVISIBLE);
                hoch.setVisibility(View.INVISIBLE);
                Kasa();
            }
        }
        if(id == R.id.deal) {
            if((c > 0 && dealing == 0) || (c > 0 && profit == 1)) {
                if(profit == 1) {
                    intro();
                    Cashed.handler9.removeCallbacks(Cashed.runnable9);
                    taking = 0;
                    won = 0;
                    choice = 0;
                    profit = 0;

                    new Clearing();
                }
                Jokers.handler1.removeCallbacks(Jokers.runnable1);
                Jokers.handler2.removeCallbacks(Jokers.runnable2);
                Jokers.handler3.removeCallbacks(Jokers.runnable3);
                Jokers.handler4.removeCallbacks(Jokers.runnable4);
                Jokers.handler5.removeCallbacks(Jokers.runnable5);
                Jokers.handler6.removeCallbacks(Jokers.runnable6);
                Jokers.handler7.removeCallbacks(Jokers.runnable7);
                Jokers.handler8.removeCallbacks(Jokers.runnable8);

                new Clearing();

                joker.setText("");
                joker.setVisibility(View.INVISIBLE);
                card.setText("");
                card.setVisibility(View.INVISIBLE);
                levodole1.setText("");
                levodole1.setVisibility(View.INVISIBLE);
                desnodole1.setText("");
                desnodole1.setVisibility(View.INVISIBLE);
                centar1.setText("");
                centar1.setVisibility(View.INVISIBLE);

                c = c - u;
                c1.setText(String.format(Locale.getDefault(), "%d", (c)));

                field_card_1.setVisibility(View.VISIBLE);
                field_card_2.setVisibility(View.VISIBLE);
                field_card_3.setVisibility(View.VISIBLE);
                field_card_4.setVisibility(View.VISIBLE);
                field_card_5.setVisibility(View.VISIBLE);

                deljenje1();
                deljenje();

                while(k1 == k2 || k1 == k3 || k1 == k4 ||
                        k1 == k5 || k2 == k3 || k2 == k4 ||
                        k2 == k5 || k3 == k4 || k3 == k5 || k4 == k5) {
                    deljenje1();
                }
                dealing = 1;
            }
            else if(choice == 1) {
                deljenje2();
                choice = 0;
                dealing = 3;
                centar1.setText("");
                centar1.setVisibility(View.INVISIBLE);
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

                if(Hand1.hold1 == 0) {
                    field_card_1.setVisibility(View.INVISIBLE);
                    field_card_1.setImageResource(R.drawable.k53);
                    field_card_1.setVisibility(View.VISIBLE);
                    k1 = (int) Math.floor(Math.random() * 53);
                    while (k1 == k2 || k1 == k3 || k1 == k4 || k1 == k5) {
                        k1 = (int) Math.floor(Math.random() * 53);
                    }
                    karta1();
                    delaying = delaying + hold;
                    new Card1();
                }
                if(Hand1.hold2 == 0) {
                    field_card_2.setVisibility(View.INVISIBLE);
                    field_card_2.setImageResource(R.drawable.k53);
                    field_card_2.setVisibility(View.VISIBLE);
                    k2 = (int) Math.floor(Math.random() * 53);
                    while (k2 == k1 || k2 == k3 || k2 == k4 || k2 == k5) {
                        k2 = (int) Math.floor(Math.random() * 53);
                    }
                    karta2();
                    delaying = delaying + hold;
                    new Card2();
                }
                if(Hand1.hold3 == 0) {
                    field_card_3.setVisibility(View.INVISIBLE);
                    field_card_3.setImageResource(R.drawable.k53);
                    field_card_3.setVisibility(View.VISIBLE);
                    k3 = (int) Math.floor(Math.random() * 53);
                    while (k3 == k1 || k3 == k2 || k3 == k4 || k3 == k5) {
                        k3 = (int) Math.floor(Math.random() * 53);
                    }
                    karta3();
                    delaying = delaying + hold;
                    new Card3();
                }
                if(Hand1.hold4 == 0) {
                    field_card_4.setVisibility(View.INVISIBLE);
                    field_card_4.setImageResource(R.drawable.k53);
                    field_card_4.setVisibility(View.VISIBLE);
                    k4 = (int) Math.floor(Math.random() * 53);
                    while (k4 == k1 || k4 == k2 || k4 == k3 || k4 == k5) {
                        k4 = (int) Math.floor(Math.random() * 53);
                    }
                    karta4();
                    delaying = delaying + hold;
                    new Card4();
                }
                if(Hand1.hold5 == 0) {
                    field_card_5.setVisibility(View.INVISIBLE);
                    field_card_5.setImageResource(R.drawable.k53);
                    field_card_5.setVisibility(View.VISIBLE);
                    k5 = (int) Math.floor(Math.random() * 53);
                    while (k5 == k1 || k5 == k2 || k5 == k3 || k5 == k4) {
                        k5 = (int) Math.floor(Math.random() * 53);
                    }
                    karta5();
                    delaying = delaying + hold;
                    new Card5();
                }
                dobitnik();
                new Hand2();
            }
            else if(choice == 2) {
                duplanje();
            }
            else if(doubling == 1 && cash > 1) {
                id = 0;
                handler0.removeCallbacks(runnable0);
                tief.setVisibility(View.INVISIBLE);
                hoch.setVisibility(View.INVISIBLE);
                new TakingHalf();
            }
        }
        if(id == R.id.stop1) {
            if(choice == 1) {
                stopcard1();
            }
        }
        if(id == R.id.stop2) {
            if(choice == 1) {
                stopcard2();
            }
        }
        if(id == R.id.stop3) {
            if(choice == 1) {
                stopcard3();
            }
        }
        if(id == R.id.stop4) {
            if(choice == 1) {
                stopcard4();
            }
        }
        if(id == R.id.stop5) {
            if(choice == 1) {
                stopcard5();
            }
        }
        if(id == R.id.double_tief) {
            if(doubling == 1) {
                doubling = 0;
                tief.setVisibility(View.INVISIBLE);
                hoch.setVisibility(View.INVISIBLE);
                try {
                    new Tief();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        if(id == R.id.double_hoch) {
            if(doubling == 1) {
                doubling = 0;
                tief.setVisibility(View.INVISIBLE);
                hoch.setVisibility(View.INVISIBLE);
                try {
                    new Hoch();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    void duplanje() {
        choice = 3;
        won = 0;
        interval = 400;
        levodole2.setVisibility(View.INVISIBLE);
        desnodole2.setVisibility(View.INVISIBLE);
        button_take.setText(R.string.take_all);
        button_deal.setText(R.string.take_half);
        button_low.setVisibility(View.VISIBLE);
        button_high.setVisibility(View.VISIBLE);
        intro();
        count1();
        count100();
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
        Duplanje();
    }
    public static void Duplanje() {

        if(double_card == 1) {
            field_win_1.setVisibility(View.VISIBLE);
            dk1 = (int) Math.floor(Math.random() * 48) + 1;
            cheat = dk1;
            TiefHoch();
        }
        if(double_card == 2) {
            field_win_2.setVisibility(View.VISIBLE);
            dk2 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk2 == dk1) {
                dk2 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk2;
            TiefHoch();
        }
        if(double_card == 3) {
            field_win_3.setVisibility(View.VISIBLE);
            dk3 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk3 == dk1 || dk3 == dk2) {
                dk3 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk3;
            TiefHoch();
        }
        if(double_card == 4) {
            field_win_4.setVisibility(View.VISIBLE);
            dk4 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk4 == dk1 || dk4 == dk2 || dk4 == dk3) {
                dk4 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk4;
            TiefHoch();
        }
        if(double_card == 5) {
            field_win_5.setVisibility(View.VISIBLE);
            dk5 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk5 == dk1 || dk5 == dk2 ||
                    dk5 == dk3 || dk5 == dk4) {
                dk5 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk5;
            TiefHoch();
        }
        if(double_card == 6) {
            field_win_6.setVisibility(View.VISIBLE);
            dk6 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk6 == dk1 || dk6 == dk2 || dk6 == dk3 ||
                    dk6 == dk4 || dk6 == dk5) {
                dk6 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk6;
            TiefHoch();
        }
        if(double_card == 7) {
            field_win_7.setVisibility(View.VISIBLE);
            dk7 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk7 == dk1 || dk7 == dk2 || dk7 == dk3 ||
                    dk7 == dk4 || dk7 == dk5|| dk7 == dk6) {
                dk7 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk7;
            TiefHoch();
        }
        if(double_card == 8) {
            field_win_8.setVisibility(View.VISIBLE);
            dk8 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk8 == dk1 || dk8 == dk2 || dk8 == dk3 || dk8 == dk4 ||
                    dk8 == dk5 || dk8 == dk6 || dk8 == dk7) {
                dk8 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk8;
            TiefHoch();
        }
        if(double_card == 9) {
            field_win_9.setVisibility(View.VISIBLE);
            dk9 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk9 == dk1 || dk9 == dk2 || dk9 == dk3 || dk9 == dk4 ||
                    dk9 == dk5 || dk9 == dk6 || dk9 == dk7 || dk9 == dk8) {
                dk9 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk9;
            TiefHoch();
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
            TiefHoch();
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
            TiefHoch();
        }
        if(double_card == 12) {
            handler0.removeCallbacks(runnable0);
            field_win_12.setVisibility(View.VISIBLE);
            Blokada();
        }
    }

    static void TiefHoch() {
        /*

        if(cheat < 25) {
            button_stop1.setVisibility(View.VISIBLE);
            button_stop5.setVisibility(View.INVISIBLE);
        }
        else {
            button_stop5.setVisibility(View.VISIBLE);
            button_stop1.setVisibility(View.INVISIBLE);
        }
*/
        if(cash > 9999) {
            Blokada();
        }
        else {
            final int[] HochTief = {1};

            handler0 = new Handler();
            runnable0 = new Runnable() {
                @Override
                public void run() {
                    if(doubling == 1) {
                        if(HochTief[0] == 1) {
                            audio_high.start();
                            tief.setVisibility(View.INVISIBLE);
                            hoch.setVisibility(View.VISIBLE);
                            HochTief[0] = 2;

                        }
                        else {
                            audio_low.start();
                            hoch.setVisibility(View.INVISIBLE);
                            tief.setVisibility(View.VISIBLE);
                            HochTief[0] = 1;
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
    void kredit() {
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
    void Ulog() {
        final TextView u1 = findViewById(R.id.vrednost_u);
        final TextView d_1 = findViewById(R.id.vrednost_1);
        final TextView d_2 = findViewById(R.id.vrednost_2);
        final TextView d_3 = findViewById(R.id.vrednost_3);
        final TextView d_4 = findViewById(R.id.vrednost_4);
        final TextView d_5 = findViewById(R.id.vrednost_5);
        final TextView d_6 = findViewById(R.id.vrednost_6);
        final TextView d_7 = findViewById(R.id.vrednost_7);
        final TextView d_8 = findViewById(R.id.vrednost_8);
        final TextView d_9 = findViewById(R.id.vrednost_9);
        final TextView d_10 = findViewById(R.id.vrednost_10);
        dobitakdb = findViewById(R.id.vrednostdb);

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
    void ulog() {
        if (audio_bet != null) {
            audio_bet.reset();
            audio_bet.release();
            audio_bet = null;
        }
        audio_bet = MediaPlayer.create(this, R.raw.ulog);
        audio_bet.start();
    }
    void autohold() {
        if (audio_auto_hold != null) {
            audio_auto_hold.reset();
            audio_auto_hold.release();
            audio_auto_hold = null;
        }
        audio_auto_hold = MediaPlayer.create(this, R.raw.autohold);
        audio_auto_hold.start();
    }
    void deljenje() {
        if (audio_deal_cards_1 != null) {
            audio_deal_cards_1.reset();
            audio_deal_cards_1.release();
            audio_deal_cards_1 = null;
        }
        audio_deal_cards_1 = MediaPlayer.create(this, R.raw.deljenje1);
        audio_deal_cards_1.start();
    }
    void deljenje1() {

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
    void Deljenje1() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                karta12345();
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
                    if (Hand1.hold1 == 1) {
                        try {
                            Thread.sleep(230);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stopcard1();
                    }
                    if (Hand1.hold2 == 1) {
                        try {
                            Thread.sleep(230);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stopcard2();
                    }
                    if (Hand1.hold3 == 1) {
                        try {
                            Thread.sleep(230);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stopcard3();
                    }
                    if (Hand1.hold4 == 1) {
                        try {
                            Thread.sleep(230);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stopcard4();
                    }
                    if (Hand1.hold5 == 1) {
                        try {
                            Thread.sleep(230);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        stopcard5();
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
    void karta12345() {
        if (audio_cards != null) {
            audio_cards.reset();
            audio_cards = null;
        }
        audio_cards = MediaPlayer.create(this, R.raw.karte12345);
        audio_cards.start();
    }
    void stopcard1() {
        if (audio_stop_1 != null) {
            audio_stop_1.reset();
            audio_stop_1 = null;
        }
        audio_stop_1 = MediaPlayer.create(this, R.raw.stop1);
        audio_stop_1.start();
        button_stop1.setBackgroundColor(Color.RED);
        Hand1.hold1 = 1;
    }
    void stopcard2() {
        if (audio_stop_2 != null) {
            audio_stop_2.reset();
            audio_stop_2 = null;
        }
        audio_stop_2 = MediaPlayer.create(this, R.raw.stop2);
        audio_stop_2.start();
        button_stop2.setBackgroundColor(Color.RED);
        Hand1.hold2 = 1;
    }
    void stopcard3() {
        if (audio_stop_3 != null) {
            audio_stop_3.reset();
            audio_stop_3 = null;
        }
        audio_stop_3 = MediaPlayer.create(this, R.raw.stop3);
        audio_stop_3.start();
        button_stop3.setBackgroundColor(Color.RED);
        Hand1.hold3 = 1;
    }
    void stopcard4() {
        if (audio_stop_4 != null) {
            audio_stop_4.reset();
            audio_stop_4 = null;
        }
        audio_stop_4 = MediaPlayer.create(this, R.raw.stop4);
        audio_stop_4.start();
        button_stop4.setBackgroundColor(Color.RED);
        Hand1.hold4 = 1;
    }
    void stopcard5() {
        if (audio_stop_5 != null) {
            audio_stop_5.reset();
            audio_stop_5 = null;
        }
        audio_stop_5 = MediaPlayer.create(this, R.raw.stop5);
        audio_stop_5.start();
        button_stop5.setBackgroundColor(Color.RED);
        Hand1.hold5 = 1;
    }
    void ponistavanje1() {
        if (audio_clear != null) {
            audio_clear.reset();
            audio_clear = null;
        }
        audio_clear = MediaPlayer.create(this, R.raw.ponistavanje);
        audio_clear.start();
    }
    public static void ponistavanje2() {
        button_stop1.setBackgroundColor(Color.parseColor("#000000"));
        button_stop2.setBackgroundColor(Color.parseColor("#000000"));
        button_stop3.setBackgroundColor(Color.parseColor("#000000"));
        button_stop4.setBackgroundColor(Color.parseColor("#000000"));
        button_stop5.setBackgroundColor(Color.parseColor("#000000"));
    }
    void deljenje2() {
        if (audio_deal_cards_2 != null) {
            audio_deal_cards_2.reset();
            audio_deal_cards_2 = null;
        }
        audio_deal_cards_2 = MediaPlayer.create(this, R.raw.deljenje2);
        audio_deal_cards_2.start();
    }
    void karta1() {
        if (audio_card_1 != null) {
            audio_card_1.reset();
            audio_card_1 = null;
        }
        audio_card_1 = MediaPlayer.create(this, R.raw.karta1);
    }
    void karta2() {
        if (audio_card_2 != null) {
            audio_card_2.reset();
            audio_card_2 = null;
        }
        audio_card_2 = MediaPlayer.create(this, R.raw.karta2);
    }
    void karta3() {
        if (audio_card_3 != null) {
            audio_card_3.reset();
            audio_card_3 = null;
        }
        audio_card_3 = MediaPlayer.create(this, R.raw.karta3);
    }
    void karta4() {
        if (audio_card_4 != null) {
            audio_card_4.reset();
            audio_card_4 = null;
        }
        audio_card_4 = MediaPlayer.create(this, R.raw.karta4);
    }
    void karta5() {
        if (audio_card_5 != null) {
            audio_card_5.reset();
            audio_card_5 = null;
        }
        audio_card_5 = MediaPlayer.create(this, R.raw.karta5);
    }
    void dobitnik() {
        if (audio_winner != null) {
            audio_winner.reset();
            audio_winner = null;
        }
        audio_winner = MediaPlayer.create(this, R.raw.dobitnik);
    }

    void count1() {
        if (audio_count_1 != null) {
            audio_count_1.reset();
            audio_count_1 = null;
        }
        audio_count_1 = MediaPlayer.create(this,R.raw.isplata1);
    }
    void count100() {
        if (audio_count_100 != null) {
            audio_count_100.reset();
            audio_count_100 = null;
        }
        audio_count_100 = MediaPlayer.create(this, R.raw.isplata100);
    }
    void Tief() {
        if(audio_low != null) {
            audio_low.reset();
            audio_low = null;
        }
        audio_low = MediaPlayer.create(this, R.raw.tief);
    }
    void Hoch() {
        if(audio_high != null) {
            audio_high.reset();
            audio_high = null;
        }
        audio_high = MediaPlayer.create(this, R.raw.hoch);
    }
    public static void Bingo() {
        handler0.removeCallbacks(runnable0);
        cash *= 2;
        dobitakdb.setText(String.format(Locale.getDefault(), "%d", (cash)));
        centar2.setText(R.string.win);
        centar2.setVisibility(View.VISIBLE);
        audio_bingo.start();
        interval -=25;
    }
    void bingo() {
        if (audio_bingo != null) {
            audio_bingo .reset();
            audio_bingo  = null;
        }
        Hoch();
        Tief();
        audio_bingo  = MediaPlayer.create(this, R.raw.bingo);
    }
    void Kasa() {
        choice = 3;
        won = 0;
        levodole2.setVisibility(View.INVISIBLE);
        desnodole2.setVisibility(View.INVISIBLE);
        intro();
        count1();
        count100();
        taking = 1;
        try {
            new TakingAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    static void Blokada() {
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