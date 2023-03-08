package com.example.poker_2;

import static java.lang.Thread.sleep;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    MaterialButton button_kredit,button_ulog,button_autohold,button_kasa,button_deljenje;

    int c = 0;
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
    int deljenje = 0;

    public Timer timer1;
    public Timer timer2;

    public TextView levodole;
    public TextView desnodole;
    public TextView jokercard;
    public TextView cardjoker;
    public TextView centar1;
    public ImageView polje1;
    public ImageView polje2;
    public ImageView polje3;
    public ImageView polje4;
    public ImageView polje5;
    public ImageView poljej1;
    public ImageView poljej2;
    public ImageView poljej3;
    public ImageView poljej4;
    public ImageView poljej5;
    public Handler handler1;

    MediaPlayer audiokredit;
    MediaPlayer audioulog;
    MediaPlayer audioautohold;
    public TextView ah1;

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

        timer1 = new Timer();
        timer2 = new Timer();

        levodole = findViewById(R.id.levo);
        desnodole = findViewById(R.id.desno);
        jokercard = findViewById(R.id.joker);
        cardjoker = findViewById(R.id.card);
        centar1 = findViewById(R.id.centar1);

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


        timer1.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        new android.os.Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        if(c==0) {
                                            levodole.setVisibility(View.VISIBLE);
                                            desnodole.setVisibility(View.INVISIBLE);
                                        }
                                        else {
                                            levodole.setText("");
                                            desnodole.setText("");
                                            levodole.setVisibility(View.INVISIBLE);
                                            desnodole.setVisibility(View.INVISIBLE);
                                            centar1.setText("BIRAJTE ULOG");
                                            centar1.setVisibility(View.VISIBLE);
                                        }
                                    }
                                }, 1000);
                        new android.os.Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        if(c==0) {
                                            levodole.setVisibility(View.INVISIBLE);
                                            desnodole.setVisibility(View.VISIBLE);
                                        }
                                        else {
                                            levodole.setText("");
                                            desnodole.setText("");
                                            levodole.setVisibility(View.INVISIBLE);
                                            desnodole.setVisibility(View.INVISIBLE);
                                            centar1.setText("PRITISNITE DELJENJE");
                                            centar1.setVisibility(View.VISIBLE);
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
                        new android.os.Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        jokercard.setVisibility(View.VISIBLE);
                                        cardjoker.setVisibility(View.VISIBLE);
                                    }
                                }, 0);
                        new android.os.Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        jokercard.setVisibility(View.INVISIBLE);
                                        cardjoker.setVisibility(View.INVISIBLE);
                                    }
                                }, 6000);
                        new android.os.Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        polje1.setVisibility(View.VISIBLE);
                                        polje2.setVisibility(View.VISIBLE);
                                        polje3.setVisibility(View.VISIBLE);
                                        polje4.setVisibility(View.VISIBLE);
                                        polje5.setVisibility(View.VISIBLE);
                                    }
                                }, 6000);
                        new android.os.Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        polje1.setVisibility(View.INVISIBLE);
                                        poljej1.setVisibility(View.VISIBLE);
                                    }
                                }, 7000);
                        new android.os.Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        poljej1.setVisibility(View.INVISIBLE);
                                        polje1.setVisibility(View.VISIBLE);
                                        polje2.setVisibility(View.INVISIBLE);
                                        poljej2.setVisibility(View.VISIBLE);
                                    }
                                }, 8000);
                        new android.os.Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        poljej2.setVisibility(View.INVISIBLE);
                                        polje2.setVisibility(View.VISIBLE);
                                        polje3.setVisibility(View.INVISIBLE);
                                        poljej3.setVisibility(View.VISIBLE);
                                    }
                                }, 9000);
                        new android.os.Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        poljej3.setVisibility(View.INVISIBLE);
                                        polje3.setVisibility(View.VISIBLE);
                                        polje4.setVisibility(View.INVISIBLE);
                                        poljej4.setVisibility(View.VISIBLE);
                                    }
                                }, 10000);
                        new android.os.Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        poljej4.setVisibility(View.INVISIBLE);
                                        polje4.setVisibility(View.VISIBLE);
                                        polje5.setVisibility(View.INVISIBLE);
                                        poljej5.setVisibility(View.VISIBLE);
                                    }
                                }, 11000);
                        new android.os.Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        polje1.setVisibility(View.INVISIBLE);
                                        polje2.setVisibility(View.INVISIBLE);
                                        polje3.setVisibility(View.INVISIBLE);
                                        polje4.setVisibility(View.INVISIBLE);
                                        poljej5.setVisibility(View.INVISIBLE);
                                    }
                                }, 12000);
                    }
                });
            }
        }, 0,12000);
    }
    private void assignID(MaterialButton button, int id) {
        View btn = findViewById(id);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        MaterialButton button = (MaterialButton) view;
        String buttonText = button.getText().toString();

        if(buttonText.equals("KREDIT")) {
            final TextView c1 = findViewById(R.id.vrednost_c);
            if(c<4901) {
                c+=100;
                c1.setText(Integer.toString(c));
                kredit();
                return;
            }
            else {
                return;
            }
        }
        if(buttonText.equals("ULOG")) {
            if(c > 0) {
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
        }
        if(buttonText.equals("AUTOHOLD")) {

            if(c > 0) {
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
        }
        if(buttonText.equals("BRISANJE KASIRANJE")) {
            return;
        }
        if(buttonText.equals("DELJENJE POLOVINA")) {
            if(c > 0) {

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
                jokercard.setVisibility(View.INVISIBLE);
                cardjoker.setVisibility(View.INVISIBLE);
                centar1.setVisibility(View.INVISIBLE);
                timer1.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        timer1.cancel();
                    }
                },0,1);
                timer2.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        timer2.cancel();
                    }
                },0,1);
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
    public void deljenje1() {

    }
}