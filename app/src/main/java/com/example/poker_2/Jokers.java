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

public class Jokers extends AppCompatActivity implements View.OnClickListener {
    //public static Object Stop1;
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
    public int c = 0;
    public TextView c1;
    int u = 1;
    int ah = 1;
    int d1 = 1100; int dob1;
    int d2 = 500; int dob2;
    int d3 = 100; int dob3;
    int d4 = 40; int dob4;
    int d5 = 10; int dob5;
    int d6 = 7; int dob6;
    int d7 = 5; int dob7;
    int d8 = 3; int dob8;
    int d9 = 2; int dob9;
    int d10 = 1; int dob10;
    public static int deljenje;
    public static int stop;
    public static int izbor1;
    public static int k1;
    public static int k2;
    public static int k3;
    public static int k4;
    public static int k5;
    MediaPlayer audiokredit;
    MediaPlayer audioulog;
    MediaPlayer audioautohold;
    MediaPlayer audiodeljenje;
    MediaPlayer audioponistavanje;
    public static MediaPlayer audiokarta12345;
    public static MediaPlayer audiostop;
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
    public ImageView poljej1;
    public ImageView poljej2;
    public ImageView poljej3;
    public ImageView poljej4;
    public ImageView poljej5;
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
    public TextView levodole;
    public TextView desnodole;
    public TextView joker;
    public TextView card;
    public TextView centar;
    Timer timer1;
    Timer timer2;
    Timer timer3;
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
        izbor1 = 0;

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

        levodole = findViewById(R.id.levo);
        desnodole = findViewById(R.id.desno);
        joker = findViewById(R.id.joker);
        card = findViewById(R.id.card);
        centar = findViewById(R.id.centar1);

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

        timer1 = new Timer();
        timer2 = new Timer();
        timer3 = new Timer();

        Handler handler = new Handler();
        timer1.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        new Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        if(c==0&&deljenje==0) {
                                            levodole.setVisibility(View.VISIBLE);
                                            desnodole.setVisibility(View.INVISIBLE);
                                        }
                                        if(c>0&&deljenje==0) {
                                            levodole.setText("");
                                            desnodole.setText("");
                                            levodole.setVisibility(View.INVISIBLE);
                                            desnodole.setVisibility(View.INVISIBLE);
                                            centar.setText("BIRAJTE ULOG");
                                            centar.setVisibility(View.VISIBLE);
                                        }
                                    }
                                }, 1000);
                        new Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        if(c==0&&deljenje==0) {
                                            levodole.setVisibility(View.INVISIBLE);
                                            desnodole.setVisibility(View.VISIBLE);
                                        }
                                        if(c>0&&deljenje==0) {
                                            levodole.setText("");
                                            desnodole.setText("");
                                            levodole.setVisibility(View.INVISIBLE);
                                            desnodole.setVisibility(View.INVISIBLE);
                                            centar.setText("PRITISNITE DELJENJE");
                                            centar.setVisibility(View.VISIBLE);
                                        }
                                    }
                                    }, 2000);
                    }
                });
            }
        }, 0, 2000);

        timer2.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        new Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        if(deljenje==0) {
                                            joker.setText("JOKER");
                                            joker.setVisibility(View.VISIBLE);
                                            card.setText("CARD");
                                            card.setVisibility(View.VISIBLE);
                                        }
                                    }
                                }, 0);
                        new Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        if(deljenje==0) {
                                            joker.setText("");
                                            joker.setVisibility(View.INVISIBLE);
                                            card.setText("");
                                            card.setVisibility(View.INVISIBLE);
                                        }
                                    }
                                }, 6000);
                            new Handler().postDelayed(
                                    new Runnable() {
                                        public void run() {
                                            if(deljenje==0) {
                                                polje1.setVisibility(View.VISIBLE);
                                                polje2.setVisibility(View.VISIBLE);
                                                polje3.setVisibility(View.VISIBLE);
                                                polje4.setVisibility(View.VISIBLE);
                                                polje5.setVisibility(View.VISIBLE);
                                            }
                                        }
                                    }, 6000);
                            new Handler().postDelayed(
                                    new Runnable() {
                                        public void run() {
                                            if(deljenje==0) {
                                                polje1.setVisibility(View.INVISIBLE);
                                                poljej1.setVisibility(View.VISIBLE);
                                            }
                                        }
                                    }, 7000);
                                new Handler().postDelayed(
                                        new Runnable() {
                                            public void run() {
                                                if(deljenje==0) {
                                                    poljej1.setVisibility(View.INVISIBLE);
                                                    polje1.setVisibility(View.VISIBLE);
                                                    polje2.setVisibility(View.INVISIBLE);
                                                    poljej2.setVisibility(View.VISIBLE);
                                                }
                                            }
                                        }, 8000);
                            new Handler().postDelayed(
                                    new Runnable() {
                                        public void run() {
                                            if(deljenje==0) {
                                                poljej2.setVisibility(View.INVISIBLE);
                                                polje2.setVisibility(View.VISIBLE);
                                                polje3.setVisibility(View.INVISIBLE);
                                                poljej3.setVisibility(View.VISIBLE);
                                            }
                                        }
                                    }, 9000);
                            new Handler().postDelayed(
                                    new Runnable() {
                                        public void run() {
                                            if(deljenje==0) {
                                                poljej3.setVisibility(View.INVISIBLE);
                                                polje3.setVisibility(View.VISIBLE);
                                                polje4.setVisibility(View.INVISIBLE);
                                                poljej4.setVisibility(View.VISIBLE);
                                            }
                                        }
                                    }, 10000);
                            new Handler().postDelayed(
                                    new Runnable() {
                                        public void run() {
                                            if(deljenje==0) {
                                                poljej4.setVisibility(View.INVISIBLE);
                                                polje4.setVisibility(View.VISIBLE);
                                                polje5.setVisibility(View.INVISIBLE);
                                                poljej5.setVisibility(View.VISIBLE);
                                            }
                                        }
                                    }, 11000);
                            new Handler().postDelayed(
                                    new Runnable() {
                                        public void run() {
                                            if(deljenje==0) {
                                                polje1.setVisibility(View.INVISIBLE);
                                                polje2.setVisibility(View.INVISIBLE);
                                                polje3.setVisibility(View.INVISIBLE);
                                                polje4.setVisibility(View.INVISIBLE);
                                                poljej5.setVisibility(View.INVISIBLE);
                                            }
                                        }
                                    }, 12000);
                        }
                });
            }
        }, 0,12000);

        timer3.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        new Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        if(deljenje==1) {
                                            timer3.cancel();
                                            karta12345();
                                            new Deljenje1(this);
                                            new Karta1(this);
                                            new Karta2(this);
                                            new Karta3(this);
                                            new Karta4(this);
                                            new Karta5(this);
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
                    c+=100;
                    c1.setText(Integer.toString(c));
                    kredit();
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
                if(izbor1 == 1) {
                    ponistavanje();
                    stop1.setBackgroundColor(Color.parseColor("#404040"));
                    stop2.setBackgroundColor(Color.parseColor("#404040"));
                    stop3.setBackgroundColor(Color.parseColor("#404040"));
                    stop4.setBackgroundColor(Color.parseColor("#404040"));
                    stop5.setBackgroundColor(Color.parseColor("#404040"));
                    Dobitak1.hold1 = 0;
                    Dobitak1.hold2 = 0;
                    Dobitak1.hold3 = 0;
                    Dobitak1.hold4 = 0;
                    Dobitak1.hold5 = 0;
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
                    levodole.setText("");
                    levodole.setVisibility(View.INVISIBLE);
                    desnodole.setText("");
                    desnodole.setVisibility(View.INVISIBLE);
                    centar.setText("");
                    centar.setVisibility(View.INVISIBLE);

                    timer1.cancel();
                    timer2.cancel();

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
                else {
                    return;
                }
            case R.id.stop1:
                if(izbor1 == 1) {
                    audiostop.start();
                    stop1.setBackgroundColor(Color.RED);
                    Dobitak1.hold1 = 1;
                    return;
                }
                else {
                    return;
                }
            case R.id.stop2:
                if(izbor1 == 1) {
                    audiostop.start();
                    stop2.setBackgroundColor(Color.RED);
                    Dobitak1.hold2 = 1;
                    return;
                }
                else {
                    return;
                }
            case R.id.stop3:
                if(izbor1 == 1) {
                    audiostop.start();
                    stop3.setBackgroundColor(Color.RED);
                    Dobitak1.hold3 = 1;
                    return;
                }
                else {
                    return;
                }
            case R.id.stop4:
                if(izbor1 == 1) {
                    audiostop.start();
                    stop4.setBackgroundColor(Color.RED);
                    Dobitak1.hold4 = 1;
                    return;
                }
                else {
                    return;
                }
            case R.id.stop5:
                if(izbor1 == 1) {
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

    void kredit() {
        if (audiokredit != null) {
            audiokredit.stop();
            audiokredit.release();
        }
        audiokredit = MediaPlayer.create(getApplicationContext(), R.raw.kredit);
        audiokredit.start();
    }
    void ulog() {
        if (audioulog != null) {
            audioulog.stop();
            audioulog.release();
        }
        audioulog = MediaPlayer.create(getApplicationContext(), R.raw.ulog);
        audioulog.start();
    }
    void autohold() {
        if (audioautohold != null) {
            audioautohold.stop();
            audioautohold.release();
        }
        audioautohold = MediaPlayer.create(getApplicationContext(), R.raw.autohold);
        audioautohold.start();
    }
    void deljenje() {
        if (audiodeljenje != null) {
            audiodeljenje.stop();
            audiodeljenje.release();
        }
        audiodeljenje = MediaPlayer.create(getApplicationContext(), R.raw.deljenje1);
        audiodeljenje.start();
    }
    void deljenje1() {

        k1 = (int) Math.floor(Math.random() * 53);
        k2 = (int) Math.floor(Math.random() * 53);
        k3 = (int) Math.floor(Math.random() * 53);
        k4 = (int) Math.floor(Math.random() * 53);
        k5 = (int) Math.floor(Math.random() * 53);


        k1=0;
        k2=2;
        k3=3;
        k4=4;
        k5=5;


    }
    public void karta12345() {
        if (audiokarta12345 != null) {
            audiokarta12345.stop();
            audiokarta12345.release();
        }
        audiokarta12345 = MediaPlayer.create(getApplicationContext(), R.raw.karte12345);
    }
    public void stop12345() {
        if (audiostop != null) {
            audiostop.stop();
            audiostop.release();
        }
        audiostop = MediaPlayer.create(getApplicationContext(), R.raw.stop);
    }
    void ponistavanje() {
        if (audioponistavanje != null) {
            audioponistavanje.stop();
            audioponistavanje.release();
        }
        audioponistavanje = MediaPlayer.create(getApplicationContext(), R.raw.ponistavanje);
        audioponistavanje.start();
    }
}