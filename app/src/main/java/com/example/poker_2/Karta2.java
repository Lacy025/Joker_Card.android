package com.example.poker_2;

import static com.example.poker_2.First.k2;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

public class Karta2 extends Activity {

    public static int n2;
    public static int b2;

    public Karta2() {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {

                First.polje2.setVisibility(View.INVISIBLE);

                if (k2 == 0) {
                    First.polje2.setImageResource(R.drawable.k00);
                    n2 = 0;
                    b2 = 0;
                }
                if (k2 == 1) {
                    First.polje2.setImageResource(R.drawable.k01);
                    n2 = 14;
                    b2 = 1;
                }
                if (k2 == 2) {
                    First.polje2.setImageResource(R.drawable.k02);
                    n2 = 2;
                    b2 = 1;
                }
                if (k2 == 3) {
                    First.polje2.setImageResource(R.drawable.k03);
                    n2 = 3;
                    b2 = 1;
                }
                if (k2 == 4) {
                    First.polje2.setImageResource(R.drawable.k04);
                    n2 = 4;
                    b2 = 1;
                }
                if (k2 == 5) {
                    First.polje2.setImageResource(R.drawable.k05);
                    n2 = 5;
                    b2 = 1;
                }
                if (k2 == 6) {
                    First.polje2.setImageResource(R.drawable.k06);
                    n2 = 6;
                    b2 = 1;
                }
                if (k2 == 7) {
                    First.polje2.setImageResource(R.drawable.k07);
                    n2 = 7;
                    b2 = 1;
                }
                if (k2 == 8) {
                    First.polje2.setImageResource(R.drawable.k08);
                    n2 = 8;
                    b2 = 1;
                }
                if (k2 == 9) {
                    First.polje2.setImageResource(R.drawable.k09);
                    n2 = 9;
                    b2 = 1;
                }
                if (k2 == 10) {
                    First.polje2.setImageResource(R.drawable.k10);
                    n2 = 10;
                    b2 = 1;
                }
                if (k2 == 11) {
                    First.polje2.setImageResource(R.drawable.k11);
                    n2 = 11;
                    b2 = 1;
                }
                if (k2 == 12) {
                    First.polje2.setImageResource(R.drawable.k12);
                    n2 = 12;
                    b2 = 1;
                }
                if (k2 == 13) {
                    First.polje2.setImageResource(R.drawable.k13);
                    n2 = 13;
                    b2 = 1;
                }
                if (k2 == 14) {
                    First.polje2.setImageResource(R.drawable.k14);
                    n2 = 14;
                    b2 = 2;
                }
                if (k2 == 15) {
                    First.polje2.setImageResource(R.drawable.k15);
                    n2 = 2;
                    b2 = 2;
                }
                if (k2 == 16) {
                    First.polje2.setImageResource(R.drawable.k16);
                    n2 = 3;
                    b2 = 2;
                }
                if (k2 == 17) {
                    First.polje2.setImageResource(R.drawable.k17);
                    n2 = 4;
                    b2 = 2;
                }
                if (k2 == 18) {
                    First.polje2.setImageResource(R.drawable.k18);
                    n2 = 5;
                    b2 = 2;
                }
                if (k2 == 19) {
                    First.polje2.setImageResource(R.drawable.k19);
                    n2 = 6;
                    b2 = 2;
                }
                if (k2 == 20) {
                    First.polje2.setImageResource(R.drawable.k20);
                    n2 = 7;
                    b2 = 2;
                }
                if (k2 == 21) {
                    First.polje2.setImageResource(R.drawable.k21);
                    n2 = 8;
                    b2 = 2;
                }
                if (k2 == 22) {
                    First.polje2.setImageResource(R.drawable.k22);
                    n2 = 9;
                    b2 = 2;
                }
                if (k2 == 23) {
                    First.polje2.setImageResource(R.drawable.k23);
                    n2 = 10;
                    b2 = 2;
                }
                if (k2 == 24) {
                    First.polje2.setImageResource(R.drawable.k24);
                    n2 = 11;
                    b2 = 2;
                }
                if (k2 == 25) {
                    First.polje2.setImageResource(R.drawable.k25);
                    n2 = 12;
                    b2 = 2;
                }
                if (k2 == 26) {
                    First.polje2.setImageResource(R.drawable.k26);
                    n2 = 13;
                    b2 = 2;
                }
                if (k2 == 27) {
                    First.polje2.setImageResource(R.drawable.k27);
                    n2 = 14;
                    b2 = 3;
                }
                if (k2 == 28) {
                    First.polje2.setImageResource(R.drawable.k28);
                    n2 = 2;
                    b2 = 3;
                }
                if (k2 == 29) {
                    First.polje2.setImageResource(R.drawable.k29);
                    n2 = 3;
                    b2 = 3;
                }
                if (k2 == 30) {
                    First.polje2.setImageResource(R.drawable.k30);
                    n2 = 4;
                    b2 = 3;
                }
                if (k2 == 31) {
                    First.polje2.setImageResource(R.drawable.k31);
                    n2 = 5;
                    b2 = 3;
                }
                if (k2 == 32) {
                    First.polje2.setImageResource(R.drawable.k32);
                    n2 = 6;
                    b2 = 3;
                }
                if (k2 == 33) {
                    First.polje2.setImageResource(R.drawable.k33);
                    n2 = 7;
                    b2 = 3;
                }
                if (k2 == 34) {
                    First.polje2.setImageResource(R.drawable.k34);
                    n2 = 8;
                    b2 = 3;
                }
                if (k2 == 35) {
                    First.polje2.setImageResource(R.drawable.k35);
                    n2 = 9;
                    b2 = 3;
                }
                if (k2 == 36) {
                    First.polje2.setImageResource(R.drawable.k36);
                    n2 = 10;
                    b2 = 3;
                }
                if (k2 == 37) {
                    First.polje2.setImageResource(R.drawable.k37);
                    n2 = 11;
                    b2 = 3;
                }
                if (k2 == 38) {
                    First.polje2.setImageResource(R.drawable.k38);
                    n2 = 12;
                    b2 = 3;
                }
                if (k2 == 39) {
                    First.polje2.setImageResource(R.drawable.k39);
                    n2 = 13;
                    b2 = 3;
                }
                if (k2 == 40) {
                    First.polje2.setImageResource(R.drawable.k40);
                    n2 = 14;
                    b2 = 4;
                }
                if (k2 == 41) {
                    First.polje2.setImageResource(R.drawable.k41);
                    n2 = 2;
                    b2 = 4;
                }
                if (k2 == 42) {
                    First.polje2.setImageResource(R.drawable.k42);
                    n2 = 3;
                    b2 = 4;
                }
                if (k2 == 43) {
                    First.polje2.setImageResource(R.drawable.k43);
                    n2 = 4;
                    b2 = 4;
                }
                if (k2 == 44) {
                    First.polje2.setImageResource(R.drawable.k44);
                    n2 = 5;
                    b2 = 4;
                }
                if (k2 == 45) {
                    First.polje2.setImageResource(R.drawable.k45);
                    n2 = 6;
                    b2 = 4;
                }
                if (k2 == 46) {
                    First.polje2.setImageResource(R.drawable.k46);
                    n2 = 7;
                    b2 = 4;
                }
                if (k2 == 47) {
                    First.polje2.setImageResource(R.drawable.k47);
                    n2 = 8;
                    b2 = 4;
                }
                if (k2 == 48) {
                    First.polje2.setImageResource(R.drawable.k48);
                    n2 = 9;
                    b2 = 4;
                }
                if (k2 == 49) {
                    First.polje2.setImageResource(R.drawable.k49);
                    n2 = 10;
                    b2 = 4;
                }
                if (k2 == 50) {
                    First.polje2.setImageResource(R.drawable.k50);
                    n2 = 11;
                    b2 = 4;
                }
                if (k2 == 51) {
                    First.polje2.setImageResource(R.drawable.k51);
                    n2 = 12;
                    b2 = 4;
                }
                if (k2 == 52) {
                    First.polje2.setImageResource(R.drawable.k52);
                    n2 = 13;
                    b2 = 4;
                }
                First.polje2.setVisibility(View.VISIBLE);
                if (First.deljenje == 3) {
                    First.audiokarta2.start();
                }
            }
        }, First.pauzak);
    }
}
