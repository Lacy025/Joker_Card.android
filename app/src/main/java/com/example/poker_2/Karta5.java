package com.example.poker_2;

import static com.example.poker_2.First.k5;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

public class Karta5 extends Activity {

    public static int n5;
    public static int b5;

    public Karta5() {

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {

                First.polje5.setVisibility(View.INVISIBLE);

                if (k5 == 0) {
                    First.polje5.setImageResource(R.drawable.k00);
                    n5 = 0;
                    b5 = 0;
                }
                if (k5 == 1) {
                    First.polje5.setImageResource(R.drawable.k01);
                    n5 = 14;
                    b5 = 1;
                }
                if (k5 == 2) {
                    First.polje5.setImageResource(R.drawable.k02);
                    n5 = 2;
                    b5 = 1;
                }
                if (k5 == 3) {
                    First.polje5.setImageResource(R.drawable.k03);
                    n5 = 3;
                    b5 = 1;
                }
                if (k5 == 4) {
                    First.polje5.setImageResource(R.drawable.k04);
                    n5 = 4;
                    b5 = 1;
                }
                if (k5 == 5) {
                    First.polje5.setImageResource(R.drawable.k05);
                    n5 = 5;
                    b5 = 1;
                }
                if (k5 == 6) {
                    First.polje5.setImageResource(R.drawable.k06);
                    n5 = 6;
                    b5 = 1;
                }
                if (k5 == 7) {
                    First.polje5.setImageResource(R.drawable.k07);
                    n5 = 7;
                    b5 = 1;
                }
                if (k5 == 8) {
                    First.polje5.setImageResource(R.drawable.k08);
                    n5 = 8;
                    b5 = 1;
                }
                if (k5 == 9) {
                    First.polje5.setImageResource(R.drawable.k09);
                    n5 = 9;
                    b5 = 1;
                }
                if (k5 == 10) {
                    First.polje5.setImageResource(R.drawable.k10);
                    n5 = 10;
                    b5 = 1;
                }
                if (k5 == 11) {
                    First.polje5.setImageResource(R.drawable.k11);
                    n5 = 11;
                    b5 = 1;
                }
                if (k5 == 12) {
                    First.polje5.setImageResource(R.drawable.k12);
                    n5 = 12;
                    b5 = 1;
                }
                if (k5 == 13) {
                    First.polje5.setImageResource(R.drawable.k13);
                    n5 = 13;
                    b5 = 1;
                }
                if (k5 == 14) {
                    First.polje5.setImageResource(R.drawable.k14);
                    n5 = 14;
                    b5 = 2;
                }
                if (k5 == 15) {
                    First.polje5.setImageResource(R.drawable.k15);
                    n5 = 2;
                    b5 = 2;
                }
                if (k5 == 16) {
                    First.polje5.setImageResource(R.drawable.k16);
                    n5 = 3;
                    b5 = 2;
                }
                if (k5 == 17) {
                    First.polje5.setImageResource(R.drawable.k17);
                    n5 = 4;
                    b5 = 2;
                }
                if (k5 == 18) {
                    First.polje5.setImageResource(R.drawable.k18);
                    n5 = 5;
                    b5 = 2;
                }
                if (k5 == 19) {
                    First.polje5.setImageResource(R.drawable.k19);
                    n5 = 6;
                    b5 = 2;
                }
                if (k5 == 20) {
                    First.polje5.setImageResource(R.drawable.k20);
                    n5 = 7;
                    b5 = 2;
                }
                if (k5 == 21) {
                    First.polje5.setImageResource(R.drawable.k21);
                    n5 = 8;
                    b5 = 2;
                }
                if (k5 == 22) {
                    First.polje5.setImageResource(R.drawable.k22);
                    n5 = 9;
                    b5 = 2;
                }
                if (k5 == 23) {
                    First.polje5.setImageResource(R.drawable.k23);
                    n5 = 10;
                    b5 = 2;
                }
                if (k5 == 24) {
                    First.polje5.setImageResource(R.drawable.k24);
                    n5 = 11;
                    b5 = 2;
                }
                if (k5 == 25) {
                    First.polje5.setImageResource(R.drawable.k25);
                    n5 = 12;
                    b5 = 2;
                }
                if (k5 == 26) {
                    First.polje5.setImageResource(R.drawable.k26);
                    n5 = 13;
                    b5 = 2;
                }
                if (k5 == 27) {
                    First.polje5.setImageResource(R.drawable.k27);
                    n5 = 14;
                    b5 = 3;
                }
                if (k5 == 28) {
                    First.polje5.setImageResource(R.drawable.k28);
                    n5 = 2;
                    b5 = 3;
                }
                if (k5 == 29) {
                    First.polje5.setImageResource(R.drawable.k29);
                    n5 = 3;
                    b5 = 3;
                }
                if (k5 == 30) {
                    First.polje5.setImageResource(R.drawable.k30);
                    n5 = 4;
                    b5 = 3;
                }
                if (k5 == 31) {
                    First.polje5.setImageResource(R.drawable.k31);
                    n5 = 5;
                    b5 = 3;
                }
                if (k5 == 32) {
                    First.polje5.setImageResource(R.drawable.k32);
                    n5 = 6;
                    b5 = 3;
                }
                if (k5 == 33) {
                    First.polje5.setImageResource(R.drawable.k33);
                    n5 = 7;
                    b5 = 3;
                }
                if (k5 == 34) {
                    First.polje5.setImageResource(R.drawable.k34);
                    n5 = 8;
                    b5 = 3;
                }
                if (k5 == 35) {
                    First.polje5.setImageResource(R.drawable.k35);
                    n5 = 9;
                    b5 = 3;
                }
                if (k5 == 36) {
                    First.polje5.setImageResource(R.drawable.k36);
                    n5 = 10;
                    b5 = 3;
                }
                if (k5 == 37) {
                    First.polje5.setImageResource(R.drawable.k37);
                    n5 = 11;
                    b5 = 3;
                }
                if (k5 == 38) {
                    First.polje5.setImageResource(R.drawable.k38);
                    n5 = 12;
                    b5 = 3;
                }
                if (k5 == 39) {
                    First.polje5.setImageResource(R.drawable.k39);
                    n5 = 13;
                    b5 = 3;
                }
                if (k5 == 40) {
                    First.polje5.setImageResource(R.drawable.k40);
                    n5 = 14;
                    b5 = 4;
                }
                if (k5 == 41) {
                    First.polje5.setImageResource(R.drawable.k41);
                    n5 = 2;
                    b5 = 4;
                }
                if (k5 == 42) {
                    First.polje5.setImageResource(R.drawable.k42);
                    n5 = 3;
                    b5 = 4;
                }
                if (k5 == 43) {
                    First.polje5.setImageResource(R.drawable.k43);
                    n5 = 4;
                    b5 = 4;
                }
                if (k5 == 44) {
                    First.polje5.setImageResource(R.drawable.k44);
                    n5 = 5;
                    b5 = 4;
                }
                if (k5 == 45) {
                    First.polje5.setImageResource(R.drawable.k45);
                    n5 = 6;
                    b5 = 4;
                }
                if (k5 == 46) {
                    First.polje5.setImageResource(R.drawable.k46);
                    n5 = 7;
                    b5 = 4;
                }
                if (k5 == 47) {
                    First.polje5.setImageResource(R.drawable.k47);
                    n5 = 8;
                    b5 = 4;
                }
                if (k5 == 48) {
                    First.polje5.setImageResource(R.drawable.k48);
                    n5 = 9;
                    b5 = 4;
                }
                if (k5 == 49) {
                    First.polje5.setImageResource(R.drawable.k49);
                    n5 = 10;
                    b5 = 4;
                }
                if (k5 == 50) {
                    First.polje5.setImageResource(R.drawable.k50);
                    n5 = 11;
                    b5 = 4;
                }
                if (k5 == 51) {
                    First.polje5.setImageResource(R.drawable.k51);
                    n5 = 12;
                    b5 = 4;
                }
                if (k5 == 52) {
                    First.polje5.setImageResource(R.drawable.k52);
                    n5 = 13;
                    b5 = 4;
                }
                First.polje5.setVisibility(View.VISIBLE);
                if (First.deljenje == 3) {
                    First.audiokarta5.start();
                }
            }
        }, First.pauzak);
    }
}
