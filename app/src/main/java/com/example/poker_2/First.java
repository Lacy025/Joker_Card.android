package com.example.poker_2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.Timer;
import java.util.TimerTask;

public class First extends AppCompatActivity implements View.OnClickListener {
    MaterialButton button_kredit;
    MaterialButton button_ulog;
    MaterialButton button_autohold;
    MaterialButton button_kasa;
    MaterialButton button_deljenje;
    public static MaterialButton button_stop1;
    public static MaterialButton button_stop2;
    public static MaterialButton button_stop3;
    public static MaterialButton button_stop4;
    public static MaterialButton button_stop5;
    public static int c = 0;
    public static TextView c1;
    int u = 1;
    static int ah = 1;
    int d1 = 1100;
    public static int dob1;
    int d2 = 500;
    public static int dob2;
    int d3 = 100;
    public static int dob3;
    int d4 = 40;
    public static int dob4;
    int d5 = 10;
    public static int dob5;
    int d6 = 7;
    public static int dob6;
    int d7 = 5;
    public static int dob7;
    int d8 = 3;
    public static int dob8;
    int d9 = 2;
    public static int dob9;
    int d10 = 1;
    public static int dob10;
    public static int deljenje;
    public static int stop;
    public static int izbor;
    public static int k1;
    public static int k2;
    public static int k3;
    public static int k4;
    public static int k5;
    public static int pauzak;
    public static int kasiranje;
    public static int cifra;
    int hold = 0;
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
    public static MediaPlayer audiostop;
    public static MediaPlayer audiodobitnik;
    public static MediaPlayer audiointro;
    public static MediaPlayer audiocount1;
    public static MediaPlayer audiocount100;
    public TextView ah1;
    public static TextView stop1;
    public static TextView stop2;
    public static TextView stop3;
    public static TextView stop4;
    public static TextView stop5;
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
    Timer timer1;
    TimerTask task1;
    Timer timer2;
    TimerTask task2;
    Timer timer3;
    TimerTask task3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        assignID(button_kredit, R.id.kredit);
        assignID(button_ulog, R.id.ulog);
        assignID(button_autohold, R.id.autohold);
        assignID(button_kasa, R.id.kasa);
        assignID(button_deljenje, R.id.deljenje);

        ah1 = findViewById(R.id.autohold);
        c1 = findViewById(R.id.vrednost_c);

        deljenje = 0;
        stop = 0;
        izbor = 0;
        cifra = 0;

        assignID(button_stop1, R.id.stop1);
        assignID(button_stop2, R.id.stop2);
        assignID(button_stop3, R.id.stop3);
        assignID(button_stop4, R.id.stop4);
        assignID(button_stop5, R.id.stop5);

        stop1 = findViewById(R.id.stop1);
        stop2 = findViewById(R.id.stop2);
        stop3 = findViewById(R.id.stop3);
        stop4 = findViewById(R.id.stop4);
        stop5 = findViewById(R.id.stop5);

        levodole1 = findViewById(R.id.levo);
        desnodole1 = findViewById(R.id.desno);
        joker = findViewById(R.id.joker);
        card = findViewById(R.id.card);
        centar1 = findViewById(R.id.centar1);
        centar2 = findViewById(R.id.pobedio);
        levodole2 = findViewById(R.id.dupliranje);
        desnodole2 = findViewById(R.id.kasiranje);

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

        timer1 = new Timer();
        timer2 = new Timer();
        timer3 = new Timer();

        intro();
        audiointro.start();
        new Jokers();
        timer1.schedule(task1 = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        new Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        Jokers.handler1.removeCallbacks(Jokers.runnable1);
                                        Jokers.handler2.removeCallbacks(Jokers.runnable2);
                                        Jokers.handler3.removeCallbacks(Jokers.runnable3);
                                        Jokers.handler4.removeCallbacks(Jokers.runnable4);
                                        Jokers.handler5.removeCallbacks(Jokers.runnable5);
                                        Jokers.handler6.removeCallbacks(Jokers.runnable6);
                                        Jokers.handler7.removeCallbacks(Jokers.runnable7);
                                        Jokers.handler8.removeCallbacks(Jokers.runnable8);
                                        new Jokers();
                                    }
                                }, 0);
                    }
                });
            }
        }, 0, 12000);

        timer2.schedule(task2 = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        new Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        if(c==0&&deljenje==0) {
                                            levodole1.setVisibility(View.VISIBLE);
                                            desnodole1.setVisibility(View.INVISIBLE);
                                        }
                                        if(c>0&&deljenje==0) {
                                            levodole1.setVisibility(View.INVISIBLE);
                                            desnodole1.setVisibility(View.INVISIBLE);
                                            centar1.setText("BIRAJTE ULOG");
                                            centar1.setVisibility(View.VISIBLE);
                                        }
                                        if(c>0&&deljenje==2) {
                                            centar1.setText("BIRAJTE KARTE");
                                            centar1.setVisibility(View.VISIBLE);
                                        }
                                        if(Dobitak2.dobitak == 1) {
                                            levodole2.setVisibility(View.VISIBLE);
                                            desnodole2.setVisibility(View.INVISIBLE);
                                        }
                                    }
                                }, 1000);
                        new Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        if(c==0&&deljenje==0) {
                                            levodole1.setVisibility(View.INVISIBLE);
                                            desnodole1.setVisibility(View.VISIBLE);
                                        }
                                        if((c>0&&deljenje==0)||(c>0&&deljenje==2)) {
                                            levodole1.setVisibility(View.INVISIBLE);
                                            desnodole1.setVisibility(View.INVISIBLE);
                                            centar1.setText("PRITISNITE DELJENJE");
                                            centar1.setVisibility(View.VISIBLE);
                                        }
                                        if(Dobitak2.dobitak == 1) {
                                            levodole2.setVisibility(View.INVISIBLE);
                                            desnodole2.setVisibility(View.VISIBLE);
                                        }
                                    }
                                    }, 2000);
                    }
                });
            }
        }, 0, 2000);

        timer3.schedule(task3 = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        new Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        if(deljenje==1) {
                                            deljenje = 2;
                                            karta12345();
                                            new Deljenje1(this);
                                            pauzak = 500;
                                            new Karta1();
                                            pauzak = 600;
                                            new Karta2();
                                            pauzak = 700;
                                            new Karta3();
                                            pauzak = 800;
                                            new Karta4();
                                            pauzak = 900;
                                            new Karta5();
                                            new Dobitak1(this);
                                            stop12345();
                                            new Stop(this);
                                        }
                                    }
                                }, 100);
                    }
                });
            }
        }, 0, 100);
    }
    public Object assignID(MaterialButton button, int id) {
        View btn = findViewById(id);
        btn.setOnClickListener(this);
        return null;
    }
    @Override
    public void onClick(View view) {
        Button pressed = (Button) view;
        switch (pressed.getId()) {

            case R.id.kredit:
                if(c<4901 && deljenje==0) {
                    kredit();
                    c+=100;
                    c1.setText(Integer.toString(c));
                    return;
                }
                else {
                    return;
                }
            case R.id.ulog:
                if(c > 0 && deljenje==0) {
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

                    u+=1;
                    if(u==99) {
                        u=1;
                    }
                    u1.setText(Integer.toString(u));
                    dob1 = d1 * u;
                    dob2 = d2 * u;
                    dob3 = d3 * u;
                    dob4 = d4 * u;
                    dob5 = d5 * u;
                    dob6 = d6 * u;
                    dob7 = d7 * u;
                    dob8 = d8 * u;
                    dob9 = d9 * u;
                    dob10 = d10 * u;

                    d_1.setText(Integer.toString(dob1));
                    d_2.setText(Integer.toString(dob2));
                    d_3.setText(Integer.toString(dob3));
                    d_4.setText(Integer.toString(dob4));
                    d_5.setText(Integer.toString(dob5));
                    d_6.setText(Integer.toString(dob6));
                    d_7.setText(Integer.toString(dob7));
                    d_8.setText(Integer.toString(dob8));
                    d_9.setText(Integer.toString(dob9));
                    d_10.setText(Integer.toString(dob10));

                    ulog();
                    return;
                }
                else {
                    return;
                }
            case R.id.autohold:
                if(c > 0 && deljenje==0) {
                    if(ah==1) {
                        ah1.setTextColor(Color.BLACK);
                        ah=0;
                        autohold();
                        return;
                    }
                    else {
                        ah1.setTextColor(Color.BLUE);
                        ah=1;
                        autohold();
                        return;
                    }
                }
                else {
                    return;
                }
            case R.id.kasa:
                if(izbor == 1) {
                    ponistavanje1();
                    ponistavanje2();
                    Dobitak1.hold1 = 0;
                    Dobitak1.hold2 = 0;
                    Dobitak1.hold3 = 0;
                    Dobitak1.hold4 = 0;
                    Dobitak1.hold5 = 0;
                    return;
                }
                else if(izbor == 2) {
                    Dobitak2.dobitak = 0;
                    levodole2.setVisibility(View.INVISIBLE);
                    desnodole2.setVisibility(View.INVISIBLE);
                    audiointro = MediaPlayer.create(getApplicationContext(), R.raw.intro);
                    count1();
                    count100();

                    kasiranje = 1;
                    new Kasiranje();
                    return;
                }
                else {
                    return;
                }
            case R.id.deljenje:
                if(c > 0 && deljenje==0) {

                    polje1.setVisibility(View.INVISIBLE);
                    polje2.setVisibility(View.INVISIBLE);
                    polje3.setVisibility(View.INVISIBLE);
                    polje4.setVisibility(View.INVISIBLE);
                    polje5.setVisibility(View.INVISIBLE);
                    poljej1.setVisibility(View.INVISIBLE);
                    poljej2.setVisibility(View.INVISIBLE);
                    poljej3.setVisibility(View.INVISIBLE);
                    poljej4.setVisibility(View.INVISIBLE);
                    poljej5.setVisibility(View.INVISIBLE);
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

                    while(k1==k2||k1==k3||k1==k4||k1==k5||k2==k3||k2==k4||k2==k5||k3==k4||k3==k5||k4==k5) {
                        deljenje1();
                    }
                    deljenje = 1;
                    return;
                }
                else if(izbor == 1) {
                    izbor = 0;
                    deljenje = 3;
                    centar1.setText("");
                    centar1.setVisibility(View.INVISIBLE);
                    deljenje2();
                    hold = 300;
                    pauzak = 100;
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

                    if(Dobitak1.hold1 == 0) {
                        polje1.setVisibility(View.INVISIBLE);
                        polje1.setImageResource(R.drawable.k53);
                        polje1.setVisibility(View.VISIBLE);
                        k1 = (int) Math.floor(Math.random() * 53);
                        while (k1==k2||k1==k3||k1==k4||k1==k5) {
                            k1 = (int) Math.floor(Math.random() * 53);
                        }
                        karta1();
                        pauzak = pauzak + hold;
                        new Karta1();
                    }
                    if(Dobitak1.hold2 == 0) {
                        polje2.setVisibility(View.INVISIBLE);
                        polje2.setImageResource(R.drawable.k53);
                        polje2.setVisibility(View.VISIBLE);
                        k2 = (int) Math.floor(Math.random() * 53);
                        while (k2==k1||k2==k3||k2==k4||k2==k5) {
                            k2 = (int) Math.floor(Math.random() * 53);
                        }
                        karta2();
                        pauzak = pauzak + hold;
                        new Karta2();
                    }
                    if(Dobitak1.hold3 == 0) {
                        polje3.setVisibility(View.INVISIBLE);
                        polje3.setImageResource(R.drawable.k53);
                        polje3.setVisibility(View.VISIBLE);
                        k3 = (int) Math.floor(Math.random() * 53);
                        while (k3==k1||k3==k2||k3==k4||k3==k5) {
                            k3 = (int) Math.floor(Math.random() * 53);
                        }
                        karta3();
                        pauzak = pauzak + hold;
                        new Karta3();
                    }
                    if(Dobitak1.hold4 == 0) {
                        polje4.setVisibility(View.INVISIBLE);
                        polje4.setImageResource(R.drawable.k53);
                        polje4.setVisibility(View.VISIBLE);
                        k4 = (int) Math.floor(Math.random() * 53);
                        while (k4==k1||k4==k2||k4==k3||k4==k5) {
                            k4 = (int) Math.floor(Math.random() * 53);
                        }
                        karta4();
                        pauzak = pauzak + hold;
                        new Karta4();
                    }
                    if(Dobitak1.hold5 == 0) {
                        polje5.setVisibility(View.INVISIBLE);
                        polje5.setImageResource(R.drawable.k53);
                        polje5.setVisibility(View.VISIBLE);
                        k5 = (int) Math.floor(Math.random() * 53);
                        while (k5==k1||k5==k2||k5==k3||k5==k4) {
                            k5 = (int) Math.floor(Math.random() * 53);
                        }
                        karta5();
                        pauzak = pauzak + hold;
                        new Karta5();
                    }
                    dobitnik();
                    new Dobitak2();
                    return;
                }
                else {
                    return;
                }
            case R.id.stop1:
                if(izbor == 1) {
                    audiostop.start();
                    stop1.setBackgroundColor(Color.RED);
                    Dobitak1.hold1 = 1;
                    return;
                }
                else {
                    return;
                }
            case R.id.stop2:
                if(izbor == 1) {
                    audiostop.start();
                    stop2.setBackgroundColor(Color.RED);
                    Dobitak1.hold2 = 1;
                    return;
                }
                else {
                    return;
                }
            case R.id.stop3:
                if(izbor == 1) {
                    audiostop.start();
                    stop3.setBackgroundColor(Color.RED);
                    Dobitak1.hold3 = 1;
                    return;
                }
                else {
                    return;
                }
            case R.id.stop4:
                if(izbor == 1) {
                    audiostop.start();
                    stop4.setBackgroundColor(Color.RED);
                    Dobitak1.hold4 = 1;
                    return;
                }
                else {
                    return;
                }
            case R.id.stop5:
                if(izbor == 1) {
                    audiostop.start();
                    stop5.setBackgroundColor(Color.RED);
                    Dobitak1.hold5 = 1;
                    return;
                }
                else {
                    return;
                }
        }
    }
    public void intro() {
        if (audiointro != null) {
            audiointro.stop();
            audiointro.release();
        }
        audiointro = MediaPlayer.create(this, R.raw.intro);
    }
    void kredit() {
        if (c == 0) {
            audiointro.stop();
            audiointro.release();
        }
        if (audiokredit != null) {
            audiokredit.stop();
            audiokredit.release();
        }
        audiokredit = MediaPlayer.create(this, R.raw.kredit);
        audiokredit.start();
    }
    void ulog() {
        if (audioulog != null) {
            audioulog.stop();
            audioulog.release();
        }
        audioulog = MediaPlayer.create(this, R.raw.ulog);
        audioulog.start();
    }
    void autohold() {
        if (audioautohold != null) {
            audioautohold.stop();
            audioautohold.release();
        }
        audioautohold = MediaPlayer.create(this, R.raw.autohold);
        audioautohold.start();
    }
    void deljenje() {
        if (audiodeljenje1 != null) {
            audiodeljenje1.stop();
            audiodeljenje1.release();
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

/*
        k1=0;

        k2=1;
        k3=14;
        k4=27;
        k5=40;
*/

    }
    public void karta12345() {
        if (audiokarta12345 != null) {
            audiokarta12345.stop();
            audiokarta12345.release();
        }
        audiokarta12345 = MediaPlayer.create(this, R.raw.karte12345);
    }
    public void stop12345() {
        if (audiostop != null) {
            audiostop.stop();
            audiostop.release();
        }
        audiostop = MediaPlayer.create(this, R.raw.stop);
    }
    void ponistavanje1() {
        if (audioponistavanje != null) {
            audioponistavanje.stop();
            audioponistavanje.release();
        }
        audioponistavanje = MediaPlayer.create(this, R.raw.ponistavanje);
        audioponistavanje.start();
    }
    public static void ponistavanje2() {
        stop1.setBackgroundColor(Color.parseColor("#404040"));
        stop2.setBackgroundColor(Color.parseColor("#404040"));
        stop3.setBackgroundColor(Color.parseColor("#404040"));
        stop4.setBackgroundColor(Color.parseColor("#404040"));
        stop5.setBackgroundColor(Color.parseColor("#404040"));
    }
    void deljenje2() {
        if (audiodeljenje2 != null) {
            audiodeljenje2.stop();
            audiodeljenje2.release();
        }
        audiodeljenje2 = MediaPlayer.create(this, R.raw.deljenje2);
        audiodeljenje2.start();
    }
    public void karta1() {
        if (audiokarta1 != null) {
            audiokarta1.stop();
            audiokarta1.release();
        }
        audiokarta1 = MediaPlayer.create(this, R.raw.karta1);
    }
    public void karta2() {
        if (audiokarta2 != null) {
            audiokarta2.stop();
            audiokarta2.release();
        }
        audiokarta2 = MediaPlayer.create(this, R.raw.karta2);
    }
    public void karta3() {
        if (audiokarta3 != null) {
            audiokarta3.stop();
            audiokarta3.release();
        }
        audiokarta3 = MediaPlayer.create(this, R.raw.karta3);
    }
    public void karta4() {
        if (audiokarta4 != null) {
            audiokarta4.stop();
            audiokarta4.release();
        }
        audiokarta4 = MediaPlayer.create(this, R.raw.karta4);
    }
    public void karta5() {
        if (audiokarta5 != null) {
            audiokarta5.stop();
            audiokarta5.release();
        }
        audiokarta5 = MediaPlayer.create(this, R.raw.karta5);
    }
    public void dobitnik() {
        if (audiodobitnik != null) {
            audiodobitnik.stop();
            audiodobitnik.release();
        }
        audiodobitnik = MediaPlayer.create(this, R.raw.dobitnik);
    }
    public void count1() {
        if (audiocount1 != null) {
            audiocount1.stop();
            audiocount1.release();
        }
        audiocount1 = MediaPlayer.create(this, R.raw.isplata1);
    }
    public void count100() {
        if (audiocount100 != null) {
            audiocount100.stop();
            audiocount100.release();
        }
        audiocount100 = MediaPlayer.create(this, R.raw.isplata100);
    }
}