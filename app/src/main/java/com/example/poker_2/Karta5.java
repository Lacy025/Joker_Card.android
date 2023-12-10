package com.example.poker_2;

import static com.example.poker_2.First.k5;
import static com.example.poker_2.First.polje5;
import static com.example.poker_2.First.pauzak;
import static com.example.poker_2.First.deljenje;
import static com.example.poker_2.First.audiokarta5;

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

                polje5.setVisibility(View.INVISIBLE);

                if (k5 == 0) {
                    polje5.setImageResource(R.drawable.k00);
                    n5 = 0;
                    b5 = 0;
                }
                if (k5 == 1) {
                    polje5.setImageResource(R.drawable.k01);
                    n5 = 14;
                    b5 = 1;
                }
                if (k5 == 2) {
                    polje5.setImageResource(R.drawable.k02);
                    n5 = 2;
                    b5 = 1;
                }
                if (k5 == 3) {
                    polje5.setImageResource(R.drawable.k03);
                    n5 = 3;
                    b5 = 1;
                }
                if (k5 == 4) {
                    polje5.setImageResource(R.drawable.k04);
                    n5 = 4;
                    b5 = 1;
                }
                if (k5 == 5) {
                    polje5.setImageResource(R.drawable.k05);
                    n5 = 5;
                    b5 = 1;
                }
                if (k5 == 6) {
                    polje5.setImageResource(R.drawable.k06);
                    n5 = 6;
                    b5 = 1;
                }
                if (k5 == 7) {
                    polje5.setImageResource(R.drawable.k07);
                    n5 = 7;
                    b5 = 1;
                }
                if (k5 == 8) {
                    polje5.setImageResource(R.drawable.k08);
                    n5 = 8;
                    b5 = 1;
                }
                if (k5 == 9) {
                    polje5.setImageResource(R.drawable.k09);
                    n5 = 9;
                    b5 = 1;
                }
                if (k5 == 10) {
                    polje5.setImageResource(R.drawable.k10);
                    n5 = 10;
                    b5 = 1;
                }
                if (k5 == 11) {
                    polje5.setImageResource(R.drawable.k11);
                    n5 = 11;
                    b5 = 1;
                }
                if (k5 == 12) {
                    polje5.setImageResource(R.drawable.k12);
                    n5 = 12;
                    b5 = 1;
                }
                if (k5 == 13) {
                    polje5.setImageResource(R.drawable.k13);
                    n5 = 13;
                    b5 = 1;
                }
                if (k5 == 14) {
                    polje5.setImageResource(R.drawable.k14);
                    n5 = 14;
                    b5 = 2;
                }
                if (k5 == 15) {
                    polje5.setImageResource(R.drawable.k15);
                    n5 = 2;
                    b5 = 2;
                }
                if (k5 == 16) {
                    polje5.setImageResource(R.drawable.k16);
                    n5 = 3;
                    b5 = 2;
                }
                if (k5 == 17) {
                    polje5.setImageResource(R.drawable.k17);
                    n5 = 4;
                    b5 = 2;
                }
                if (k5 == 18) {
                    polje5.setImageResource(R.drawable.k18);
                    n5 = 5;
                    b5 = 2;
                }
                if (k5 == 19) {
                    polje5.setImageResource(R.drawable.k19);
                    n5 = 6;
                    b5 = 2;
                }
                if (k5 == 20) {
                    polje5.setImageResource(R.drawable.k20);
                    n5 = 7;
                    b5 = 2;
                }
                if (k5 == 21) {
                    polje5.setImageResource(R.drawable.k21);
                    n5 = 8;
                    b5 = 2;
                }
                if (k5 == 22) {
                    polje5.setImageResource(R.drawable.k22);
                    n5 = 9;
                    b5 = 2;
                }
                if (k5 == 23) {
                    polje5.setImageResource(R.drawable.k23);
                    n5 = 10;
                    b5 = 2;
                }
                if (k5 == 24) {
                    polje5.setImageResource(R.drawable.k24);
                    n5 = 11;
                    b5 = 2;
                }
                if (k5 == 25) {
                    polje5.setImageResource(R.drawable.k25);
                    n5 = 12;
                    b5 = 2;
                }
                if (k5 == 26) {
                    polje5.setImageResource(R.drawable.k26);
                    n5 = 13;
                    b5 = 2;
                }
                if (k5 == 27) {
                    polje5.setImageResource(R.drawable.k27);
                    n5 = 14;
                    b5 = 3;
                }
                if (k5 == 28) {
                    polje5.setImageResource(R.drawable.k28);
                    n5 = 2;
                    b5 = 3;
                }
                if (k5 == 29) {
                    polje5.setImageResource(R.drawable.k29);
                    n5 = 3;
                    b5 = 3;
                }
                if (k5 == 30) {
                    polje5.setImageResource(R.drawable.k30);
                    n5 = 4;
                    b5 = 3;
                }
                if (k5 == 31) {
                    polje5.setImageResource(R.drawable.k31);
                    n5 = 5;
                    b5 = 3;
                }
                if (k5 == 32) {
                    polje5.setImageResource(R.drawable.k32);
                    n5 = 6;
                    b5 = 3;
                }
                if (k5 == 33) {
                    polje5.setImageResource(R.drawable.k33);
                    n5 = 7;
                    b5 = 3;
                }
                if (k5 == 34) {
                    polje5.setImageResource(R.drawable.k34);
                    n5 = 8;
                    b5 = 3;
                }
                if (k5 == 35) {
                    polje5.setImageResource(R.drawable.k35);
                    n5 = 9;
                    b5 = 3;
                }
                if (k5 == 36) {
                    polje5.setImageResource(R.drawable.k36);
                    n5 = 10;
                    b5 = 3;
                }
                if (k5 == 37) {
                    polje5.setImageResource(R.drawable.k37);
                    n5 = 11;
                    b5 = 3;
                }
                if (k5 == 38) {
                    polje5.setImageResource(R.drawable.k38);
                    n5 = 12;
                    b5 = 3;
                }
                if (k5 == 39) {
                    polje5.setImageResource(R.drawable.k39);
                    n5 = 13;
                    b5 = 3;
                }
                if (k5 == 40) {
                    polje5.setImageResource(R.drawable.k40);
                    n5 = 14;
                    b5 = 4;
                }
                if (k5 == 41) {
                    polje5.setImageResource(R.drawable.k41);
                    n5 = 2;
                    b5 = 4;
                }
                if (k5 == 42) {
                    polje5.setImageResource(R.drawable.k42);
                    n5 = 3;
                    b5 = 4;
                }
                if (k5 == 43) {
                    polje5.setImageResource(R.drawable.k43);
                    n5 = 4;
                    b5 = 4;
                }
                if (k5 == 44) {
                    polje5.setImageResource(R.drawable.k44);
                    n5 = 5;
                    b5 = 4;
                }
                if (k5 == 45) {
                    polje5.setImageResource(R.drawable.k45);
                    n5 = 6;
                    b5 = 4;
                }
                if (k5 == 46) {
                    polje5.setImageResource(R.drawable.k46);
                    n5 = 7;
                    b5 = 4;
                }
                if (k5 == 47) {
                    polje5.setImageResource(R.drawable.k47);
                    n5 = 8;
                    b5 = 4;
                }
                if (k5 == 48) {
                    polje5.setImageResource(R.drawable.k48);
                    n5 = 9;
                    b5 = 4;
                }
                if (k5 == 49) {
                    polje5.setImageResource(R.drawable.k49);
                    n5 = 10;
                    b5 = 4;
                }
                if (k5 == 50) {
                    polje5.setImageResource(R.drawable.k50);
                    n5 = 11;
                    b5 = 4;
                }
                if (k5 == 51) {
                    polje5.setImageResource(R.drawable.k51);
                    n5 = 12;
                    b5 = 4;
                }
                if (k5 == 52) {
                    polje5.setImageResource(R.drawable.k52);
                    n5 = 13;
                    b5 = 4;
                }
                polje5.setVisibility(View.VISIBLE);
                if (deljenje == 3) {
                    audiokarta5.start();
                }
            }
        },pauzak);
    }
}
