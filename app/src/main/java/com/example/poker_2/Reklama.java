package com.example.poker_2;

import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Reklama extends AppCompatActivity {

    ImageView polje1 = findViewById(R.id.polje_1);
    ImageView polje2 = findViewById(R.id.polje_2);
    ImageView polje3 = findViewById(R.id.polje_3);
    ImageView polje4 = findViewById(R.id.polje_4);
    ImageView polje5 = findViewById(R.id.polje_5);

    ImageView poljej1 = findViewById(R.id.polje_j1);
    ImageView poljej2 = findViewById(R.id.polje_j2);
    ImageView poljej3 = findViewById(R.id.polje_j3);
    ImageView poljej4 = findViewById(R.id.polje_j4);
    ImageView poljej5 = findViewById(R.id.polje_j5);


    Reklama() {
        setContentView(R.layout.activity_main);

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
                        polje1.setVisibility(View.VISIBLE);
                        poljej1.setVisibility(View.INVISIBLE);
                        polje2.setVisibility(View.INVISIBLE);
                        poljej2.setVisibility(View.VISIBLE);
                    }
                }, 8000);

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        polje2.setVisibility(View.VISIBLE);
                        poljej2.setVisibility(View.INVISIBLE);
                        polje3.setVisibility(View.INVISIBLE);
                        poljej3.setVisibility(View.VISIBLE);
                    }
                }, 9000);

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        polje3.setVisibility(View.VISIBLE);
                        poljej3.setVisibility(View.INVISIBLE);
                        polje4.setVisibility(View.INVISIBLE);
                        poljej4.setVisibility(View.VISIBLE);
                    }
                }, 10000);

        new android.os.Handler().postDelayed(
                new Runnable() {
                    public void run() {
                        polje4.setVisibility(View.VISIBLE);
                        poljej4.setVisibility(View.INVISIBLE);
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



}
