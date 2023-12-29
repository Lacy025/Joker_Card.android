package com.example.Joker_Card;

import static com.example.Joker_Card.First.k1;
import static com.example.Joker_Card.First.polje1;
import static com.example.Joker_Card.First.pauzak;
import static com.example.Joker_Card.First.deljenje;
import static com.example.Joker_Card.First.audiokarta1;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
public class Karta1 extends Activity {
    public static int n1;
    public static int b1;
    public Karta1() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {

                polje1.setVisibility(View.INVISIBLE);

                if (k1 == 0) {
                    polje1.setImageResource(R.drawable.k00);
                    n1 = 0;
                    b1 = 0;
                }
                if (k1 == 1) {
                    polje1.setImageResource(R.drawable.k01);
                    n1 = 14;
                    b1 = 1;
                }
                if (k1 == 2) {
                    polje1.setImageResource(R.drawable.k02);
                    n1 = 2;
                    b1 = 1;
                }
                if (k1 == 3) {
                    polje1.setImageResource(R.drawable.k03);
                    n1 = 3;
                    b1 = 1;
                }
                if (k1 == 4) {
                    polje1.setImageResource(R.drawable.k04);
                    n1 = 4;
                    b1 = 1;
                }
                if (k1 == 5) {
                    polje1.setImageResource(R.drawable.k05);
                    n1 = 5;
                    b1 = 1;
                }
                if (k1 == 6) {
                    polje1.setImageResource(R.drawable.k06);
                    n1 = 6;
                    b1 = 1;
                }
                if (k1 == 7) {
                    polje1.setImageResource(R.drawable.k07);
                    n1 = 7;
                    b1 = 1;
                }
                if (k1 == 8) {
                    polje1.setImageResource(R.drawable.k08);
                    n1 = 8;
                    b1 = 1;
                }
                if (k1 == 9) {
                    polje1.setImageResource(R.drawable.k09);
                    n1 = 9;
                    b1 = 1;
                }
                if (k1 == 10) {
                    polje1.setImageResource(R.drawable.k10);
                    n1 = 10;
                    b1 = 1;
                }
                if (k1 == 11) {
                    polje1.setImageResource(R.drawable.k11);
                    n1 = 11;
                    b1 = 1;
                }
                if (k1 == 12) {
                    polje1.setImageResource(R.drawable.k12);
                    n1 = 12;
                    b1 = 1;
                }
                if (k1 == 13) {
                    polje1.setImageResource(R.drawable.k13);
                    n1 = 13;
                    b1 = 1;
                }
                if (k1 == 14) {
                    polje1.setImageResource(R.drawable.k14);
                    n1 = 14;
                    b1 = 2;
                }
                if (k1 == 15) {
                    polje1.setImageResource(R.drawable.k15);
                    n1 = 2;
                    b1 = 2;
                }
                if (k1 == 16) {
                    polje1.setImageResource(R.drawable.k16);
                    n1 = 3;
                    b1 = 2;
                }
                if (k1 == 17) {
                    polje1.setImageResource(R.drawable.k17);
                    n1 = 4;
                    b1 = 2;
                }
                if (k1 == 18) {
                    polje1.setImageResource(R.drawable.k18);
                    n1 = 5;
                    b1 = 2;
                }
                if (k1 == 19) {
                    polje1.setImageResource(R.drawable.k19);
                    n1 = 6;
                    b1 = 2;
                }
                if (k1 == 20) {
                    polje1.setImageResource(R.drawable.k20);
                    n1 = 7;
                    b1 = 2;
                }
                if (k1 == 21) {
                    polje1.setImageResource(R.drawable.k21);
                    n1 = 8;
                    b1 = 2;
                }
                if (k1 == 22) {
                    polje1.setImageResource(R.drawable.k22);
                    n1 = 9;
                    b1 = 2;
                }
                if (k1 == 23) {
                    polje1.setImageResource(R.drawable.k23);
                    n1 = 10;
                    b1 = 2;
                }
                if (k1 == 24) {
                    polje1.setImageResource(R.drawable.k24);
                    n1 = 11;
                    b1 = 2;
                }
                if (k1 == 25) {
                    polje1.setImageResource(R.drawable.k25);
                    n1 = 12;
                    b1 = 2;
                }
                if (k1 == 26) {
                    polje1.setImageResource(R.drawable.k26);
                    n1 = 13;
                    b1 = 2;
                }
                if (k1 == 27) {
                    polje1.setImageResource(R.drawable.k27);
                    n1 = 14;
                    b1 = 3;
                }
                if (k1 == 28) {
                    polje1.setImageResource(R.drawable.k28);
                    n1 = 2;
                    b1 = 3;
                }
                if (k1 == 29) {
                    polje1.setImageResource(R.drawable.k29);
                    n1 = 3;
                    b1 = 3;
                }
                if (k1 == 30) {
                    polje1.setImageResource(R.drawable.k30);
                    n1 = 4;
                    b1 = 3;
                }
                if (k1 == 31) {
                    polje1.setImageResource(R.drawable.k31);
                    n1 = 5;
                    b1 = 3;
                }
                if (k1 == 32) {
                    polje1.setImageResource(R.drawable.k32);
                    n1 = 6;
                    b1 = 3;
                }
                if (k1 == 33) {
                    polje1.setImageResource(R.drawable.k33);
                    n1 = 7;
                    b1 = 3;
                }
                if (k1 == 34) {
                    polje1.setImageResource(R.drawable.k34);
                    n1 = 8;
                    b1 = 3;
                }
                if (k1 == 35) {
                    polje1.setImageResource(R.drawable.k35);
                    n1 = 9;
                    b1 = 3;
                }
                if (k1 == 36) {
                    polje1.setImageResource(R.drawable.k36);
                    n1 = 10;
                    b1 = 3;
                }
                if (k1 == 37) {
                    polje1.setImageResource(R.drawable.k37);
                    n1 = 11;
                    b1 = 3;
                }
                if (k1 == 38) {
                    polje1.setImageResource(R.drawable.k38);
                    n1 = 12;
                    b1 = 3;
                }
                if (k1 == 39) {
                    polje1.setImageResource(R.drawable.k39);
                    n1 = 13;
                    b1 = 3;
                }
                if (k1 == 40) {
                    polje1.setImageResource(R.drawable.k40);
                    n1 = 14;
                    b1 = 4;
                }
                if (k1 == 41) {
                    polje1.setImageResource(R.drawable.k41);
                    n1 = 2;
                    b1 = 4;
                }
                if (k1 == 42) {
                    polje1.setImageResource(R.drawable.k42);
                    n1 = 3;
                    b1 = 4;
                }
                if (k1 == 43) {
                    polje1.setImageResource(R.drawable.k43);
                    n1 = 4;
                    b1 = 4;
                }
                if (k1 == 44) {
                    polje1.setImageResource(R.drawable.k44);
                    n1 = 5;
                    b1 = 4;
                }
                if (k1 == 45) {
                    polje1.setImageResource(R.drawable.k45);
                    n1 = 6;
                    b1 = 4;
                }
                if (k1 == 46) {
                    polje1.setImageResource(R.drawable.k46);
                    n1 = 7;
                    b1 = 4;
                }
                if (k1 == 47) {
                    polje1.setImageResource(R.drawable.k47);
                    n1 = 8;
                    b1 = 4;
                }
                if (k1 == 48) {
                    polje1.setImageResource(R.drawable.k48);
                    n1 = 9;
                    b1 = 4;
                }
                if (k1 == 49) {
                    polje1.setImageResource(R.drawable.k49);
                    n1 = 10;
                    b1 = 4;
                }
                if (k1 == 50) {
                    polje1.setImageResource(R.drawable.k50);
                    n1 = 11;
                    b1 = 4;
                }
                if (k1 == 51) {
                    polje1.setImageResource(R.drawable.k51);
                    n1 = 12;
                    b1 = 4;
                }
                if (k1 == 52) {
                    polje1.setImageResource(R.drawable.k52);
                    n1 = 13;
                    b1 = 4;
                }
                polje1.setVisibility(View.VISIBLE);
                if (deljenje == 3) {
                    audiokarta1.start();
                }
            }
        },pauzak);
    }
}
