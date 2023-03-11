package com.example.poker_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class Jokers extends AppCompatActivity {

    public ImageView polje1;
    public ImageView polje2;
    public ImageView polje3;
    public ImageView polje4;
    public ImageView polje5;
    public TextView levodole;
    public TextView desnodole;
    public TextView jokercard;
    public TextView cardjoker;
    public TextView centar1;
    public ImageView poljej1;
    public ImageView poljej2;
    public ImageView poljej3;
    public ImageView poljej4;
    public ImageView poljej5;

    Timer timer1;
    Timer timer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

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

        levodole = findViewById(R.id.levo);
        desnodole = findViewById(R.id.desno);
        jokercard = findViewById(R.id.joker);
        cardjoker = findViewById(R.id.card);
        centar1 = findViewById(R.id.centar1);

        timer1 = new Timer();
        timer2 = new Timer();

        timer1.schedule(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        new android.os.Handler().postDelayed(
                                new Runnable() {
                                    public void run() {
                                        if(MainActivity.c==0) {
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
                                        if(MainActivity.c==0) {
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
}