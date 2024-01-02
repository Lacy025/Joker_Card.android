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
    static Button button_tief;
    static Button button_hoch;
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
    MediaPlayer audiokredit;
    MediaPlayer audioulog;
    MediaPlayer audioautohold;
    MediaPlayer audiodeljenje1;
    MediaPlayer audioponistavanje;
    MediaPlayer audiodeljenje2;
    public static MediaPlayer audiokarta1;
    public static MediaPlayer audiokarta2;
    public static MediaPlayer audiokarta3;
    public static MediaPlayer audiokarta4;
    public static MediaPlayer audiokarta5;
    public static MediaPlayer audiokarta12345;
    public static MediaPlayer audiodobitnik;
    public static MediaPlayer audiointro;
    public static MediaPlayer audiocount1;
    public static MediaPlayer audiocount100;
    public static MediaPlayer audiostop;
    public static MediaPlayer audiostop1;
    public static MediaPlayer audiostop2;
    public static MediaPlayer audiostop3;
    public static MediaPlayer audiostop4;
    public static MediaPlayer audiostop5;
    public static MediaPlayer audiotief;
    public static MediaPlayer audiohoch;
    public static MediaPlayer audiobingo;
    public TextView ah1;
    public static ImageView polje1;
    public static ImageView polje2;
    public static ImageView polje3;
    public static ImageView polje4;
    public static ImageView polje5;
    public static ImageView poljej1;
    public static ImageView poljej2;
    public static ImageView poljej3;
    public static ImageView poljej4;
    public static ImageView poljej5;
    public static ImageView rucno1;
    public static ImageView rucno2;
    public static ImageView rucno3;
    public static ImageView rucno4;
    public static ImageView rucno5;
    public static ImageView rucno6;
    public static ImageView rucno7;
    public static ImageView rucno8;
    public static ImageView rucno9;
    public static ImageView rucno10;
    public static ImageView table;
    public static ImageView poljeD1;
    public static ImageView poljeD2;
    public static ImageView poljeD3;
    public static ImageView poljeD4;
    public static ImageView poljeD5;
    public static ImageView poljeD6;
    public static ImageView poljeD7;
    public static ImageView poljeD8;
    public static ImageView poljeD9;
    public static ImageView poljeD10;
    public static ImageView poljeD11;
    public static ImageView poljeD12;
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
    public TextView doubletief;
    public TextView doublehoch;
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

        button_tief = (Button) findViewById(R.id.double_tief);
        button_tief.setOnClickListener(this);
        button_hoch= (Button) findViewById(R.id.double_hoch);
        button_hoch.setOnClickListener(this);

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

        polje1 = findViewById(R.id.polje_1);
        polje2 = findViewById(R.id.polje_2);
        polje3 = findViewById(R.id.polje_3);
        polje4 = findViewById(R.id.polje_4);
        polje5 = findViewById(R.id.polje_5);

        poljej1 = findViewById(R.id.polje_j1);
        poljej2 = findViewById(R.id.polje_j2);
        poljej3 = findViewById(R.id.polje_j3);
        poljej4 = findViewById(R.id.polje_j4);
        poljej5 = findViewById(R.id.polje_j5);

        rucno1 = findViewById(R.id.rucno1);
        rucno2 = findViewById(R.id.rucno2);
        rucno3 = findViewById(R.id.rucno3);
        rucno4 = findViewById(R.id.rucno4);
        rucno5 = findViewById(R.id.rucno5);
        rucno6 = findViewById(R.id.rucno6);
        rucno7 = findViewById(R.id.rucno7);
        rucno8 = findViewById(R.id.rucno8);
        rucno9 = findViewById(R.id.rucno9);
        rucno10 = findViewById(R.id.rucno10);

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

        poljeD1 = findViewById(R.id.polje_d1);
        poljeD2 = findViewById(R.id.polje_d2);
        poljeD3 = findViewById(R.id.polje_d3);
        poljeD4 = findViewById(R.id.polje_d4);
        poljeD5 = findViewById(R.id.polje_d5);
        poljeD6 = findViewById(R.id.polje_d6);
        poljeD7 = findViewById(R.id.polje_d7);
        poljeD8 = findViewById(R.id.polje_d8);
        poljeD9 = findViewById(R.id.polje_d9);
        poljeD10 = findViewById(R.id.polje_d10);
        poljeD11 = findViewById(R.id.polje_d11);
        poljeD12 = findViewById(R.id.polje_d12);

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
        audiointro.start();
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
                c1.setText(Integer.toString(c));
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
                button_tief.setVisibility(View.INVISIBLE);
                button_hoch.setVisibility(View.INVISIBLE);
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
                c1.setText(Integer.toString(c));

                polje1.setVisibility(View.VISIBLE);
                polje2.setVisibility(View.VISIBLE);
                polje3.setVisibility(View.VISIBLE);
                polje4.setVisibility(View.VISIBLE);
                polje5.setVisibility(View.VISIBLE);

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
                rucno1.setVisibility(View.INVISIBLE);
                rucno2.setVisibility(View.INVISIBLE);
                rucno3.setVisibility(View.INVISIBLE);
                rucno4.setVisibility(View.INVISIBLE);
                rucno5.setVisibility(View.INVISIBLE);
                rucno6.setVisibility(View.INVISIBLE);
                rucno7.setVisibility(View.INVISIBLE);
                rucno8.setVisibility(View.INVISIBLE);
                rucno9.setVisibility(View.INVISIBLE);
                rucno10.setVisibility(View.INVISIBLE);

                if(Hand1.hold1 == 0) {
                    polje1.setVisibility(View.INVISIBLE);
                    polje1.setImageResource(R.drawable.k53);
                    polje1.setVisibility(View.VISIBLE);
                    k1 = (int) Math.floor(Math.random() * 53);
                    while (k1 == k2 || k1 == k3 || k1 == k4 || k1 == k5) {
                        k1 = (int) Math.floor(Math.random() * 53);
                    }
                    karta1();
                    delaying = delaying + hold;
                    new Card1();
                }
                if(Hand1.hold2 == 0) {
                    polje2.setVisibility(View.INVISIBLE);
                    polje2.setImageResource(R.drawable.k53);
                    polje2.setVisibility(View.VISIBLE);
                    k2 = (int) Math.floor(Math.random() * 53);
                    while (k2 == k1 || k2 == k3 || k2 == k4 || k2 == k5) {
                        k2 = (int) Math.floor(Math.random() * 53);
                    }
                    karta2();
                    delaying = delaying + hold;
                    new Card2();
                }
                if(Hand1.hold3 == 0) {
                    polje3.setVisibility(View.INVISIBLE);
                    polje3.setImageResource(R.drawable.k53);
                    polje3.setVisibility(View.VISIBLE);
                    k3 = (int) Math.floor(Math.random() * 53);
                    while (k3 == k1 || k3 == k2 || k3 == k4 || k3 == k5) {
                        k3 = (int) Math.floor(Math.random() * 53);
                    }
                    karta3();
                    delaying = delaying + hold;
                    new Card3();
                }
                if(Hand1.hold4 == 0) {
                    polje4.setVisibility(View.INVISIBLE);
                    polje4.setImageResource(R.drawable.k53);
                    polje4.setVisibility(View.VISIBLE);
                    k4 = (int) Math.floor(Math.random() * 53);
                    while (k4 == k1 || k4 == k2 || k4 == k3 || k4 == k5) {
                        k4 = (int) Math.floor(Math.random() * 53);
                    }
                    karta4();
                    delaying = delaying + hold;
                    new Card4();
                }
                if(Hand1.hold5 == 0) {
                    polje5.setVisibility(View.INVISIBLE);
                    polje5.setImageResource(R.drawable.k53);
                    polje5.setVisibility(View.VISIBLE);
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
        button_tief.setVisibility(View.VISIBLE);
        button_hoch.setVisibility(View.VISIBLE);
        intro();
        count1();
        count100();
        bingo();
        polje1.setVisibility(View.INVISIBLE);
        polje2.setVisibility(View.INVISIBLE);
        polje3.setVisibility(View.INVISIBLE);
        polje4.setVisibility(View.INVISIBLE);
        polje5.setVisibility(View.INVISIBLE);
        poljeD1.setImageResource(R.drawable.k53);
        poljeD2.setImageResource(R.drawable.k53);
        poljeD3.setImageResource(R.drawable.k53);
        poljeD4.setImageResource(R.drawable.k53);
        poljeD5.setImageResource(R.drawable.k53);
        poljeD6.setImageResource(R.drawable.k53);
        poljeD7.setImageResource(R.drawable.k53);
        poljeD8.setImageResource(R.drawable.k53);
        poljeD9.setImageResource(R.drawable.k53);
        poljeD10.setImageResource(R.drawable.k53);
        poljeD11.setImageResource(R.drawable.k53);
        poljeD12.setImageResource(R.drawable.k53);
        audiodobitnik.stop();
        interval= 400;
        doubling = 1;
        double_card = 1;
        dk = 0;
        Duplanje();
    }
    public static void Duplanje() {

        if(double_card == 1) {
            poljeD1.setVisibility(View.VISIBLE);
            dk1 = (int) Math.floor(Math.random() * 48) + 1;
            cheat = dk1;
            TiefHoch();
        }
        if(double_card == 2) {
            poljeD2.setVisibility(View.VISIBLE);
            dk2 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk2 == dk1) {
                dk2 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk2;
            TiefHoch();
        }
        if(double_card == 3) {
            poljeD3.setVisibility(View.VISIBLE);
            dk3 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk3 == dk1 || dk3 == dk2) {
                dk3 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk3;
            TiefHoch();
        }
        if(double_card == 4) {
            poljeD4.setVisibility(View.VISIBLE);
            dk4 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk4 == dk1 || dk4 == dk2 || dk4 == dk3) {
                dk4 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk4;
            TiefHoch();
        }
        if(double_card == 5) {
            poljeD5.setVisibility(View.VISIBLE);
            dk5 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk5 == dk1 || dk5 == dk2 ||
                    dk5 == dk3 || dk5 == dk4) {
                dk5 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk5;
            TiefHoch();
        }
        if(double_card == 6) {
            poljeD6.setVisibility(View.VISIBLE);
            dk6 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk6 == dk1 || dk6 == dk2 || dk6 == dk3 ||
                    dk6 == dk4 || dk6 == dk5) {
                dk6 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk6;
            TiefHoch();
        }
        if(double_card == 7) {
            poljeD7.setVisibility(View.VISIBLE);
            dk7 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk7 == dk1 || dk7 == dk2 || dk7 == dk3 ||
                    dk7 == dk4 || dk7 == dk5|| dk7 == dk6) {
                dk7 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk7;
            TiefHoch();
        }
        if(double_card == 8) {
            poljeD8.setVisibility(View.VISIBLE);
            dk8 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk8 == dk1 || dk8 == dk2 || dk8 == dk3 || dk8 == dk4 ||
                    dk8 == dk5 || dk8 == dk6 || dk8 == dk7) {
                dk8 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk8;
            TiefHoch();
        }
        if(double_card == 9) {
            poljeD9.setVisibility(View.VISIBLE);
            dk9 = (int) Math.floor(Math.random() * 48) + 1;
            while(dk9 == dk1 || dk9 == dk2 || dk9 == dk3 || dk9 == dk4 ||
                    dk9 == dk5 || dk9 == dk6 || dk9 == dk7 || dk9 == dk8) {
                dk9 = (int) Math.floor(Math.random() * 48) + 1;
            }
            cheat = dk9;
            TiefHoch();
        }
        if(double_card == 10) {
            poljeD10.setVisibility(View.VISIBLE);
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
            poljeD11.setVisibility(View.VISIBLE);
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
            poljeD12.setVisibility(View.VISIBLE);
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
                            audiohoch.start();
                            tief.setVisibility(View.INVISIBLE);
                            hoch.setVisibility(View.VISIBLE);
                            HochTief[0] = 2;

                        }
                        else {
                            audiotief.start();
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
        if (audiointro != null) {
            audiointro.reset();
            audiointro.release();
            audiointro = null;
        }
        audiointro = MediaPlayer.create(this, R.raw.intro);
    }
    void kredit() {
        if (c == 0 && game == 0) {
            game = 1;
            if(audiointro != null) {
                audiointro.reset();
                audiointro.release();
                audiointro = null;
            }
        }
        if (audiokredit != null) {
            audiokredit.reset();
            audiokredit.release();
            audiokredit = null;

        }
        audiokredit = MediaPlayer.create(this, R.raw.kredit);
        audiokredit.start();
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

        u1.setText(Integer.toString(u));
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

        d_1.setText(Integer.toString(win1));
        d_2.setText(Integer.toString(win2));
        d_3.setText(Integer.toString(win3));
        d_4.setText(Integer.toString(win4));
        d_5.setText(Integer.toString(win5));
        d_6.setText(Integer.toString(win6));
        d_7.setText(Integer.toString(win7));
        d_8.setText(Integer.toString(win8));
        d_9.setText(Integer.toString(win9));
        d_10.setText(Integer.toString(win10));
    }
    void ulog() {
        if (audioulog != null) {
            audioulog.reset();
            audioulog.release();
            audioulog = null;
        }
        audioulog = MediaPlayer.create(this, R.raw.ulog);
        audioulog.start();
    }
    void autohold() {
        if (audioautohold != null) {
            audioautohold.reset();
            audioautohold.release();
            audioautohold = null;
        }
        audioautohold = MediaPlayer.create(this, R.raw.autohold);
        audioautohold.start();
    }
    void deljenje() {
        if (audiodeljenje1 != null) {
            audiodeljenje1.reset();
            audiodeljenje1 = null;
        }
        audiodeljenje1 = MediaPlayer.create(this, R.raw.deljenje1);
        audiodeljenje1.start();
    }
    void deljenje1() {

        k1 = (int) Math.floor(Math.random() * 53);
        k2 = (int) Math.floor(Math.random() * 53);
        k3 = (int) Math.floor(Math.random() * 53);
        k4 = (int) Math.floor(Math.random() * 53);
        k5 = (int) Math.floor(Math.random() * 53);
/**/
        k1=2;

        k2=14;
        k3=1;
        k4=9;
        k5=16;


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
        if (audiokarta12345 != null) {
            audiokarta12345.reset();
            audiokarta12345 = null;
        }
        audiokarta12345 = MediaPlayer.create(this, R.raw.karte12345);
        audiokarta12345.start();
    }
    void stopcard1() {
        if (audiostop1 != null) {
            audiostop1.reset();
            audiostop1 = null;
        }
        audiostop1 = MediaPlayer.create(this, R.raw.stop1);
        audiostop1.start();
        button_stop1.setBackgroundColor(Color.RED);
        Hand1.hold1 = 1;
    }
    void stopcard2() {
        if (audiostop2 != null) {
            audiostop2.reset();
            audiostop2 = null;
        }
        audiostop2 = MediaPlayer.create(this, R.raw.stop2);
        audiostop2.start();
        button_stop2.setBackgroundColor(Color.RED);
        Hand1.hold2 = 1;
    }
    void stopcard3() {
        if (audiostop3 != null) {
            audiostop3.reset();
            audiostop3 = null;
        }
        audiostop3 = MediaPlayer.create(this, R.raw.stop3);
        audiostop3.start();
        button_stop3.setBackgroundColor(Color.RED);
        Hand1.hold3 = 1;
    }
    void stopcard4() {
        if (audiostop4 != null) {
            audiostop4.reset();
            audiostop4 = null;
        }
        audiostop4 = MediaPlayer.create(this, R.raw.stop4);
        audiostop4.start();
        button_stop4.setBackgroundColor(Color.RED);
        Hand1.hold4 = 1;
    }
    void stopcard5() {
        if (audiostop5 != null) {
            audiostop5.reset();
            audiostop5 = null;
        }
        audiostop5 = MediaPlayer.create(this, R.raw.stop5);
        audiostop5.start();
        button_stop5.setBackgroundColor(Color.RED);
        Hand1.hold5 = 1;
    }
    void ponistavanje1() {
        if (audioponistavanje != null) {
            audioponistavanje.reset();
            audioponistavanje = null;
        }
        audioponistavanje = MediaPlayer.create(this, R.raw.ponistavanje);
        audioponistavanje.start();
    }
    public static void ponistavanje2() {
        button_stop1.setBackgroundColor(Color.parseColor("#000000"));
        button_stop2.setBackgroundColor(Color.parseColor("#000000"));
        button_stop3.setBackgroundColor(Color.parseColor("#000000"));
        button_stop4.setBackgroundColor(Color.parseColor("#000000"));
        button_stop5.setBackgroundColor(Color.parseColor("#000000"));
    }
    void deljenje2() {
        if (audiodeljenje2 != null) {
            audiodeljenje2.reset();
            audiodeljenje2 = null;
        }
        audiodeljenje2 = MediaPlayer.create(this, R.raw.deljenje2);
        audiodeljenje2.start();
    }
    void karta1() {
        if (audiokarta1 != null) {
            audiokarta1.reset();
            audiokarta1 = null;
        }
        audiokarta1 = MediaPlayer.create(this, R.raw.karta1);
    }
    void karta2() {
        if (audiokarta2 != null) {
            audiokarta2.reset();
            audiokarta2 = null;
        }
        audiokarta2 = MediaPlayer.create(this, R.raw.karta2);
    }
    void karta3() {
        if (audiokarta3 != null) {
            audiokarta3.reset();
            audiokarta3 = null;
        }
        audiokarta3 = MediaPlayer.create(this, R.raw.karta3);
    }
    void karta4() {
        if (audiokarta4 != null) {
            audiokarta4.reset();
            audiokarta4 = null;
        }
        audiokarta4 = MediaPlayer.create(this, R.raw.karta4);
    }
    void karta5() {
        if (audiokarta5 != null) {
            audiokarta5.reset();
            audiokarta5 = null;
        }
        audiokarta5 = MediaPlayer.create(this, R.raw.karta5);
    }
    void dobitnik() {
        if (audiodobitnik != null) {
            audiodobitnik.reset();
            audiodobitnik = null;
        }
        audiodobitnik = MediaPlayer.create(this, R.raw.dobitnik);
    }

    void count1() {
        if (audiocount1 != null) {
            audiocount1.reset();
            audiocount1 = null;
        }
        audiocount1 = MediaPlayer.create(this,R.raw.isplata1);
    }
    void count100() {
        if (audiocount100 != null) {
            audiocount100.reset();
            audiocount100 = null;
        }
        audiocount100 = MediaPlayer.create(this, R.raw.isplata100);
    }
    void Tief() {
        if(audiotief != null) {
            audiotief.reset();
            audiotief = null;
        }
        audiotief = MediaPlayer.create(this, R.raw.tief);
    }
    void Hoch() {
        if(audiohoch != null) {
            audiohoch.reset();
            audiohoch = null;
        }
        audiohoch = MediaPlayer.create(this, R.raw.hoch);
    }
    public static void Bingo() {
        handler0.removeCallbacks(runnable0);
        cash *= 2;
        dobitakdb.setText(Integer.toString(cash));
        centar2.setText(R.string.win);
        centar2.setVisibility(View.VISIBLE);
        audiobingo.start();
        interval -=25;
    }
    void bingo() {
        if (audiobingo != null) {
            audiobingo .reset();
            audiobingo  = null;
        }
        Hoch();
        Tief();
        audiobingo  = MediaPlayer.create(this, R.raw.bingo);
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